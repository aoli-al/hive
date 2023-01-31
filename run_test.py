#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import os
import subprocess
import sys
import click
import requests
import glob
import time
from typing import List
DIR = os.path.dirname(os.path.realpath(__file__))
sys.path.append(os.path.join(DIR, ".."))
from commons import *

JAR_NAME = "hive-it-unit-4.0.0-SNAPSHOT-tests.jar"
ORIGIN_JAR_PATH = "itests/hive-unit/target/lib"
TEST_CLASS = "org.apache.hive.jdbc.miniHS2.TestHs2Metrics"
APPLICATION_NAMESPACE = "Lorg/apache/hive:Lorg/apache/hadoop"
@click.group(name="mode")
def main():
    pass

ARGS = "-Dbuild.dir=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target -Dbuild.test.dir=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp -Dderby.version=10.14.2.0 -Dderby.stream.error.file=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp/derby.log -Dhadoop.bin.path=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/../../testutils/hadoop -Dhadoop.log.dir=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp -Dhive.root=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/../../ -Dhive.version=4.0.0-SNAPSHOT -Dmaven.local.repository=/home/aoli/.m2/repository -Dmapred.job.tracker=local -Dlog4j.configurationFile=file:///home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/testconf/hive-log4j2.properties -Dhive.test.console.log.level=INFO -Dlog4j.debug=true -Djava.io.tmpdir=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp -Dtest.build.data=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp -Dtest.data.files=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/../../data/files -Dtest.data.dir=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/../../data/files -Dtest.tmp.dir=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp -Dtest.tmp.dir.uri=file:///home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/tmp -Dtest.warehouse.dir=pfile:///home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/warehouse -Dtest.local.warehouse.dir=pfile:///home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/localfs/warehouse -Djava.net.preferIPv4Stack=true -Dtest.src.tables -Djava.security.krb5.conf=/home/aoli/repos/exchain/applications/hive-13410/itests/hive-unit/target/testconf/krb5.conf -Dhadoop.version=3.3.1 -Xmx2048m -DJETTY_AVAILABLE_PROCESSORS=4 -Didea.test.cyclic.buffer.size=1048576".split(" ")

@main.command(name="build")
def build():
    subprocess.call("jenv local 11", shell=True)
    subprocess.call(["mvn", "install", "-DskipTests", 
        "-Dmaven.javadoc.skip=true", "-Drat.skip=true"], cwd=DIR)
    subprocess.call("mvn dependency:copy-dependencies -DoutputDirectory=target/lib", shell=True, 
            cwd=os.path.join(DIR, "itests", "hive-unit"))


def find_deps(base_path: str):
    result = []
    for f in glob.glob(f"{ORIGIN_JAR_PATH}/*.jar"):
        name = f.split("/")[-1]
        result.append(os.path.join(base_path, name))
    return result
        


def post():
    time.sleep(10)
    

@main.command(name="instrument")
def instrument():
    subprocess.call("jenv local 16", shell=True)
    subprocess.call(["java",
        f"-DPhosphor.INSTRUMENTATION_CLASSPATH={INSTRUMENTATION_CLASSPATH}",
        f"-DPhosphor.ORIGIN_CLASSPATH={ORIGIN_CLASSPATH}",
        "-cp", PHOSPHOR_JAR_PATH, "edu.columbia.cs.psl.phosphor.Instrumenter",
        f"{ORIGIN_JAR_PATH}", INSTRUMENTATION_FOLDER_NAME,
        "-taintTagFactory", "al.aoli.exchain.phosphor.instrumenter.DynamicSwitchTaintTagFactory",
        "-postClassVisitor", "al.aoli.exchain.phosphor.instrumenter.splitter.MethodSplitPostCV",
        "-priorClassVisitor", "al.aoli.exchain.phosphor.instrumenter.splitter.MethodSplitPreCV"
        ], cwd=DIR)
    subprocess.call(["java",
                     f"-DPhosphor.INSTRUMENTATION_CLASSPATH={HYBRID_CLASSPATH}",
                     "-cp", PHOSPHOR_JAR_PATH, "edu.columbia.cs.psl.phosphor.Instrumenter",
                     f"{ORIGIN_JAR_PATH}", HYBRID_FOLDER_NAME,
                     "-taintTagFactory", "al.aoli.exchain.phosphor.instrumenter.FieldOnlyTaintTagFactory",
                     "-postClassVisitor", "al.aoli.exchain.phosphor.instrumenter.UninstrumentedOriginPostCV"
                     ], cwd=DIR)

def run_command(cmd: List[str]):
    cmd[1:1] = ARGS
    print(" ".join(cmd))
    return subprocess.call(cmd)


@main.command(name="origin")
@click.option('--debug', default=False, help='Enable debugging.')
def origin(debug: bool):
    command = [
            "--add-opens", "java.base/java.net=ALL-UNNAMED",
            "--add-opens", "java.base/java.lang=ALL-UNNAMED",
            "--add-opens", "java.base/java.nio=ALL-UNNAMED",
            "-cp", 
            f"itests/hive-unit/target/testconf:conf:" + ":".join(find_deps(ORIGIN_JAR_PATH)), 
            TEST_CLASS]
    if debug:
        command.insert(0, "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005")
    cmd = run_command(["java"] + command)
    post()

@main.command(name="static")
def static():
    subprocess.call(["java",
                     "-cp",
                     f"{ORIGIN_JAR_PATH}/{JAR_NAME}",
                     f"-javaagent:{RUNTIME_JAR_PATH}=static:{INSTRUMENTATION_CLASSPATH}",
                     f"-agentpath:{NATIVE_LIB_PATH}=exchain:L{APPLICATION_NAMESPACE}",
                     TEST_CLASS])
    args = ["./gradlew", "static-analyzer:run", f"--args={ORIGIN_CLASSPATH} {DIR}/static-results {ORIGIN_CLASSPATH}"]
    print(args)
    cmd = run_command(args, cwd=os.path.join(DIR, "../.."))
    post()


@main.command(name="hybrid")
@click.option('--debug', is_flag=True, default=False, help='Enable debugging.')
def hybrid(debug: bool):
    cmd = [HYBRID_JAVA_EXEC,
           "-DPhosphor.DEBUG=true",
           f"-DPhosphor.INSTRUMENTATION_CLASSPATH={HYBRID_CLASSPATH}",
           f"-DPhosphor.ORIGIN_CLASSPATH={ORIGIN_CLASSPATH}",
           "-cp", f"{HYBRID_FOLDER_NAME}/{JAR_NAME}",
           f"-javaagent:{PHOSPHOR_AGENT_PATH}=taintTagFactory=al.aoli.exchain.phosphor.instrumenter.FieldOnlyTaintTagFactory,postClassVisitor=al.aoli.exchain.phosphor.instrumenter.UninstrumentedOriginPostCV",
           f"-javaagent:{RUNTIME_JAR_PATH}=hybrid:{HYBRID_CLASSPATH}",
           f"-agentpath:{NATIVE_LIB_PATH}=exchain:Lorg/apache/hadoop/fs",
           TEST_CLASS]
    if debug:
        cmd.insert(
            1, "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005")
    cmd = run_command(cmd)
    post()

@main.command(name="dynamic")
@click.option('--debug', is_flag=True, default=False, help='Enable debugging.')
def dynamic(debug: bool):
    cmd = [INSTRUMENTED_JAVA_EXEC,
            "-noverify",
            "--add-opens", "java.base/java.net=ALL-UNNAMED",
            "--add-opens", "java.base/java.lang=ALL-UNNAMED",
            "--add-opens", "java.base/java.nio=ALL-UNNAMED",
            f"-DPhosphor.INSTRUMENTATION_CLASSPATH={INSTRUMENTATION_CLASSPATH}",
            f"-DPhosphor.ORIGIN_CLASSPATH={ORIGIN_CLASSPATH}",
            "-cp",
            f"itests/hive-unit/target/testconf:conf:" + ":".join(find_deps(INSTRUMENTATION_FOLDER_NAME)),
            f"-javaagent:{PHOSPHOR_AGENT_PATH}=taintTagFactory=al.aoli.exchain.phosphor.instrumenter.DynamicSwitchTaintTagFactory"
            ",postClassVisitor=al.aoli.exchain.phosphor.instrumenter.splitter.MethodSplitPostCV"
            ",priorClassVisitor=al.aoli.exchain.phosphor.instrumenter.splitter.MethodSplitPreCV",
            f"-javaagent:{RUNTIME_JAR_PATH}=dynamic:{INSTRUMENTATION_CLASSPATH}",
            f"-agentpath:{NATIVE_LIB_PATH}=exchain:{APPLICATION_NAMESPACE}",
            TEST_CLASS]
    if debug:
        cmd.insert(1, "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005")
    cmd = run_command(cmd)
    post()


if __name__ == '__main__':
    main()
