#!/usr/bin/env python3
# -*- coding: utf-8 -*-


decls = ""
processed = 0
fun_index = 0
calls = "static {\n"
calls += f"initBitSet{fun_index}();" + "\n"
inits = f"public static void initBitSet{fun_index}() " + "{\n"
with open("bitset_data.java") as f:
    for line in f:
        decl, init = line.split("=");
        decl = decl.replace("final ", "")
        decls += decl + ";\n"
        name = decl.split(" ")[-2]
        inits += "    " + f"{name} = {init}"
        processed += 1
        if processed > 100:
            processed = 0
            fun_index += 1
            inits += "}\n"
            inits += f"public static void initBitSet{fun_index}() " + "{\n"
            calls += f"initBitSet{fun_index}();" + "\n"

    inits += "}\n"
    calls += "}\n"
    print(decls)
    print(inits)
    print(calls)
        

