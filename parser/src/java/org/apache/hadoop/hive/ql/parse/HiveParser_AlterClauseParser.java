// $ANTLR 3.5.2 AlterClauseParser.g 2023-02-08 15:38:04

package org.apache.hadoop.hive.ql.parse;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings("all")
public class HiveParser_AlterClauseParser extends Parser {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int ByteLengthLiteral=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int CONCATENATE=10;
	public static final int CharSetLiteral=11;
	public static final int CharSetName=12;
	public static final int DIV=13;
	public static final int DIVIDE=14;
	public static final int DOLLAR=15;
	public static final int DOT=16;
	public static final int Digit=17;
	public static final int EQUAL=18;
	public static final int EQUAL_NS=19;
	public static final int Exponent=20;
	public static final int GREATERTHAN=21;
	public static final int GREATERTHANOREQUALTO=22;
	public static final int HexDigit=23;
	public static final int Identifier=24;
	public static final int IntegralLiteral=25;
	public static final int KW_ABORT=26;
	public static final int KW_ACTIVATE=27;
	public static final int KW_ACTIVE=28;
	public static final int KW_ADD=29;
	public static final int KW_ADMIN=30;
	public static final int KW_AFTER=31;
	public static final int KW_ALL=32;
	public static final int KW_ALLOC_FRACTION=33;
	public static final int KW_ALTER=34;
	public static final int KW_ANALYZE=35;
	public static final int KW_AND=36;
	public static final int KW_ANY=37;
	public static final int KW_APPLICATION=38;
	public static final int KW_ARCHIVE=39;
	public static final int KW_ARRAY=40;
	public static final int KW_AS=41;
	public static final int KW_ASC=42;
	public static final int KW_AST=43;
	public static final int KW_AT=44;
	public static final int KW_AUTHORIZATION=45;
	public static final int KW_AUTOCOMMIT=46;
	public static final int KW_BEFORE=47;
	public static final int KW_BETWEEN=48;
	public static final int KW_BIGINT=49;
	public static final int KW_BINARY=50;
	public static final int KW_BOOLEAN=51;
	public static final int KW_BOTH=52;
	public static final int KW_BUCKET=53;
	public static final int KW_BUCKETS=54;
	public static final int KW_BY=55;
	public static final int KW_CACHE=56;
	public static final int KW_CASCADE=57;
	public static final int KW_CASE=58;
	public static final int KW_CAST=59;
	public static final int KW_CBO=60;
	public static final int KW_CHANGE=61;
	public static final int KW_CHAR=62;
	public static final int KW_CHECK=63;
	public static final int KW_CLUSTER=64;
	public static final int KW_CLUSTERED=65;
	public static final int KW_CLUSTERSTATUS=66;
	public static final int KW_COLLECTION=67;
	public static final int KW_COLUMN=68;
	public static final int KW_COLUMNS=69;
	public static final int KW_COMMENT=70;
	public static final int KW_COMMIT=71;
	public static final int KW_COMPACT=72;
	public static final int KW_COMPACTIONS=73;
	public static final int KW_COMPUTE=74;
	public static final int KW_CONCATENATE=75;
	public static final int KW_CONF=76;
	public static final int KW_CONSTRAINT=77;
	public static final int KW_CONTINUE=78;
	public static final int KW_COST=79;
	public static final int KW_CREATE=80;
	public static final int KW_CRON=81;
	public static final int KW_CROSS=82;
	public static final int KW_CUBE=83;
	public static final int KW_CURRENT=84;
	public static final int KW_CURRENT_DATE=85;
	public static final int KW_CURRENT_TIMESTAMP=86;
	public static final int KW_CURSOR=87;
	public static final int KW_DATA=88;
	public static final int KW_DATABASE=89;
	public static final int KW_DATABASES=90;
	public static final int KW_DATACONNECTOR=91;
	public static final int KW_DATACONNECTORS=92;
	public static final int KW_DATE=93;
	public static final int KW_DATETIME=94;
	public static final int KW_DAY=95;
	public static final int KW_DBPROPERTIES=96;
	public static final int KW_DCPROPERTIES=97;
	public static final int KW_DDL=98;
	public static final int KW_DEBUG=99;
	public static final int KW_DECIMAL=100;
	public static final int KW_DEFAULT=101;
	public static final int KW_DEFERRED=102;
	public static final int KW_DEFINED=103;
	public static final int KW_DELETE=104;
	public static final int KW_DELIMITED=105;
	public static final int KW_DEPENDENCY=106;
	public static final int KW_DESC=107;
	public static final int KW_DESCRIBE=108;
	public static final int KW_DETAIL=109;
	public static final int KW_DIRECTORIES=110;
	public static final int KW_DIRECTORY=111;
	public static final int KW_DISABLE=112;
	public static final int KW_DISTINCT=113;
	public static final int KW_DISTRIBUTE=114;
	public static final int KW_DISTRIBUTED=115;
	public static final int KW_DO=116;
	public static final int KW_DOUBLE=117;
	public static final int KW_DOW=118;
	public static final int KW_DROP=119;
	public static final int KW_DUMP=120;
	public static final int KW_ELEM_TYPE=121;
	public static final int KW_ELSE=122;
	public static final int KW_ENABLE=123;
	public static final int KW_END=124;
	public static final int KW_ENFORCED=125;
	public static final int KW_ESCAPED=126;
	public static final int KW_EVERY=127;
	public static final int KW_EXCEPT=128;
	public static final int KW_EXCHANGE=129;
	public static final int KW_EXCLUSIVE=130;
	public static final int KW_EXECUTE=131;
	public static final int KW_EXECUTED=132;
	public static final int KW_EXISTS=133;
	public static final int KW_EXPIRE_SNAPSHOTS=134;
	public static final int KW_EXPLAIN=135;
	public static final int KW_EXPORT=136;
	public static final int KW_EXPRESSION=137;
	public static final int KW_EXTENDED=138;
	public static final int KW_EXTERNAL=139;
	public static final int KW_EXTRACT=140;
	public static final int KW_FALSE=141;
	public static final int KW_FETCH=142;
	public static final int KW_FIELDS=143;
	public static final int KW_FILE=144;
	public static final int KW_FILEFORMAT=145;
	public static final int KW_FIRST=146;
	public static final int KW_FLOAT=147;
	public static final int KW_FLOOR=148;
	public static final int KW_FOLLOWING=149;
	public static final int KW_FOR=150;
	public static final int KW_FORCE=151;
	public static final int KW_FOREIGN=152;
	public static final int KW_FORMAT=153;
	public static final int KW_FORMATTED=154;
	public static final int KW_FROM=155;
	public static final int KW_FULL=156;
	public static final int KW_FUNCTION=157;
	public static final int KW_FUNCTIONS=158;
	public static final int KW_GRANT=159;
	public static final int KW_GROUP=160;
	public static final int KW_GROUPING=161;
	public static final int KW_HAVING=162;
	public static final int KW_HOUR=163;
	public static final int KW_ID=164;
	public static final int KW_IDXPROPERTIES=165;
	public static final int KW_IF=166;
	public static final int KW_IGNORE=167;
	public static final int KW_IMPORT=168;
	public static final int KW_IN=169;
	public static final int KW_INDEX=170;
	public static final int KW_INDEXES=171;
	public static final int KW_INNER=172;
	public static final int KW_INPATH=173;
	public static final int KW_INPUTDRIVER=174;
	public static final int KW_INPUTFORMAT=175;
	public static final int KW_INSERT=176;
	public static final int KW_INT=177;
	public static final int KW_INTERSECT=178;
	public static final int KW_INTERVAL=179;
	public static final int KW_INTO=180;
	public static final int KW_IS=181;
	public static final int KW_ISOLATION=182;
	public static final int KW_ITEMS=183;
	public static final int KW_JAR=184;
	public static final int KW_JOIN=185;
	public static final int KW_JOINCOST=186;
	public static final int KW_KEY=187;
	public static final int KW_KEYS=188;
	public static final int KW_KEY_TYPE=189;
	public static final int KW_KILL=190;
	public static final int KW_LAST=191;
	public static final int KW_LATERAL=192;
	public static final int KW_LEADING=193;
	public static final int KW_LEFT=194;
	public static final int KW_LESS=195;
	public static final int KW_LEVEL=196;
	public static final int KW_LIKE=197;
	public static final int KW_LIMIT=198;
	public static final int KW_LINES=199;
	public static final int KW_LOAD=200;
	public static final int KW_LOCAL=201;
	public static final int KW_LOCATION=202;
	public static final int KW_LOCK=203;
	public static final int KW_LOCKS=204;
	public static final int KW_LOGICAL=205;
	public static final int KW_LONG=206;
	public static final int KW_MACRO=207;
	public static final int KW_MANAGED=208;
	public static final int KW_MANAGEDLOCATION=209;
	public static final int KW_MANAGEMENT=210;
	public static final int KW_MAP=211;
	public static final int KW_MAPJOIN=212;
	public static final int KW_MAPPING=213;
	public static final int KW_MATCHED=214;
	public static final int KW_MATERIALIZED=215;
	public static final int KW_MERGE=216;
	public static final int KW_METADATA=217;
	public static final int KW_MINUS=218;
	public static final int KW_MINUTE=219;
	public static final int KW_MONTH=220;
	public static final int KW_MORE=221;
	public static final int KW_MOVE=222;
	public static final int KW_MSCK=223;
	public static final int KW_NONE=224;
	public static final int KW_NORELY=225;
	public static final int KW_NOSCAN=226;
	public static final int KW_NOT=227;
	public static final int KW_NOVALIDATE=228;
	public static final int KW_NULL=229;
	public static final int KW_NULLS=230;
	public static final int KW_OF=231;
	public static final int KW_OFFSET=232;
	public static final int KW_ON=233;
	public static final int KW_ONLY=234;
	public static final int KW_OPERATOR=235;
	public static final int KW_OPTION=236;
	public static final int KW_OR=237;
	public static final int KW_ORDER=238;
	public static final int KW_OUT=239;
	public static final int KW_OUTER=240;
	public static final int KW_OUTPUTDRIVER=241;
	public static final int KW_OUTPUTFORMAT=242;
	public static final int KW_OVER=243;
	public static final int KW_OVERWRITE=244;
	public static final int KW_OWNER=245;
	public static final int KW_PARTITION=246;
	public static final int KW_PARTITIONED=247;
	public static final int KW_PARTITIONS=248;
	public static final int KW_PATH=249;
	public static final int KW_PERCENT=250;
	public static final int KW_PKFK_JOIN=251;
	public static final int KW_PLAN=252;
	public static final int KW_PLANS=253;
	public static final int KW_PLUS=254;
	public static final int KW_POOL=255;
	public static final int KW_PRECEDING=256;
	public static final int KW_PRECISION=257;
	public static final int KW_PREPARE=258;
	public static final int KW_PRESERVE=259;
	public static final int KW_PRIMARY=260;
	public static final int KW_PRINCIPALS=261;
	public static final int KW_PROCEDURE=262;
	public static final int KW_PURGE=263;
	public static final int KW_QUALIFY=264;
	public static final int KW_QUARTER=265;
	public static final int KW_QUERY=266;
	public static final int KW_QUERY_PARALLELISM=267;
	public static final int KW_RANGE=268;
	public static final int KW_READ=269;
	public static final int KW_READS=270;
	public static final int KW_REAL=271;
	public static final int KW_REBUILD=272;
	public static final int KW_RECORDREADER=273;
	public static final int KW_RECORDWRITER=274;
	public static final int KW_REDUCE=275;
	public static final int KW_REFERENCES=276;
	public static final int KW_REGEXP=277;
	public static final int KW_RELOAD=278;
	public static final int KW_RELY=279;
	public static final int KW_REMOTE=280;
	public static final int KW_RENAME=281;
	public static final int KW_REOPTIMIZATION=282;
	public static final int KW_REPAIR=283;
	public static final int KW_REPL=284;
	public static final int KW_REPLACE=285;
	public static final int KW_REPLICATION=286;
	public static final int KW_RESOURCE=287;
	public static final int KW_RESPECT=288;
	public static final int KW_RESTRICT=289;
	public static final int KW_REVOKE=290;
	public static final int KW_REWRITE=291;
	public static final int KW_RIGHT=292;
	public static final int KW_RLIKE=293;
	public static final int KW_ROLE=294;
	public static final int KW_ROLES=295;
	public static final int KW_ROLLBACK=296;
	public static final int KW_ROLLUP=297;
	public static final int KW_ROW=298;
	public static final int KW_ROWS=299;
	public static final int KW_SCHEDULED=300;
	public static final int KW_SCHEDULING_POLICY=301;
	public static final int KW_SCHEMA=302;
	public static final int KW_SCHEMAS=303;
	public static final int KW_SECOND=304;
	public static final int KW_SELECT=305;
	public static final int KW_SEMI=306;
	public static final int KW_SERDE=307;
	public static final int KW_SERDEPROPERTIES=308;
	public static final int KW_SERVER=309;
	public static final int KW_SET=310;
	public static final int KW_SETS=311;
	public static final int KW_SHARED=312;
	public static final int KW_SHOW=313;
	public static final int KW_SHOW_DATABASE=314;
	public static final int KW_SKEWED=315;
	public static final int KW_SMALLINT=316;
	public static final int KW_SNAPSHOT=317;
	public static final int KW_SOME=318;
	public static final int KW_SORT=319;
	public static final int KW_SORTED=320;
	public static final int KW_SPEC=321;
	public static final int KW_SSL=322;
	public static final int KW_START=323;
	public static final int KW_STATISTICS=324;
	public static final int KW_STATUS=325;
	public static final int KW_STORED=326;
	public static final int KW_STREAMTABLE=327;
	public static final int KW_STRING=328;
	public static final int KW_STRUCT=329;
	public static final int KW_SUMMARY=330;
	public static final int KW_SYNC=331;
	public static final int KW_SYSTEM_TIME=332;
	public static final int KW_SYSTEM_VERSION=333;
	public static final int KW_TABLE=334;
	public static final int KW_TABLES=335;
	public static final int KW_TABLESAMPLE=336;
	public static final int KW_TBLPROPERTIES=337;
	public static final int KW_TEMPORARY=338;
	public static final int KW_TERMINATED=339;
	public static final int KW_THEN=340;
	public static final int KW_TIME=341;
	public static final int KW_TIMESTAMP=342;
	public static final int KW_TIMESTAMPLOCALTZ=343;
	public static final int KW_TINYINT=344;
	public static final int KW_TO=345;
	public static final int KW_TOUCH=346;
	public static final int KW_TRAILING=347;
	public static final int KW_TRANSACTION=348;
	public static final int KW_TRANSACTIONAL=349;
	public static final int KW_TRANSACTIONS=350;
	public static final int KW_TRANSFORM=351;
	public static final int KW_TRIGGER=352;
	public static final int KW_TRIM=353;
	public static final int KW_TRUE=354;
	public static final int KW_TRUNCATE=355;
	public static final int KW_TYPE=356;
	public static final int KW_UNARCHIVE=357;
	public static final int KW_UNBOUNDED=358;
	public static final int KW_UNDO=359;
	public static final int KW_UNION=360;
	public static final int KW_UNIONTYPE=361;
	public static final int KW_UNIQUE=362;
	public static final int KW_UNIQUEJOIN=363;
	public static final int KW_UNKNOWN=364;
	public static final int KW_UNLOCK=365;
	public static final int KW_UNMANAGED=366;
	public static final int KW_UNSET=367;
	public static final int KW_UNSIGNED=368;
	public static final int KW_UPDATE=369;
	public static final int KW_URI=370;
	public static final int KW_URL=371;
	public static final int KW_USE=372;
	public static final int KW_USER=373;
	public static final int KW_USING=374;
	public static final int KW_UTC=375;
	public static final int KW_UTCTIMESTAMP=376;
	public static final int KW_VALIDATE=377;
	public static final int KW_VALUES=378;
	public static final int KW_VALUE_TYPE=379;
	public static final int KW_VARCHAR=380;
	public static final int KW_VECTORIZATION=381;
	public static final int KW_VIEW=382;
	public static final int KW_VIEWS=383;
	public static final int KW_WAIT=384;
	public static final int KW_WEEK=385;
	public static final int KW_WHEN=386;
	public static final int KW_WHERE=387;
	public static final int KW_WHILE=388;
	public static final int KW_WINDOW=389;
	public static final int KW_WITH=390;
	public static final int KW_WITHIN=391;
	public static final int KW_WORK=392;
	public static final int KW_WORKLOAD=393;
	public static final int KW_WRITE=394;
	public static final int KW_YEAR=395;
	public static final int KW_ZONE=396;
	public static final int LCURLY=397;
	public static final int LESSTHAN=398;
	public static final int LESSTHANOREQUALTO=399;
	public static final int LINE_COMMENT=400;
	public static final int LPAREN=401;
	public static final int LSQUARE=402;
	public static final int Letter=403;
	public static final int MINUS=404;
	public static final int MOD=405;
	public static final int NOTEQUAL=406;
	public static final int Number=407;
	public static final int NumberLiteral=408;
	public static final int PLUS=409;
	public static final int QUERY_HINT=410;
	public static final int QUESTION=411;
	public static final int QuotedIdentifier=412;
	public static final int RCURLY=413;
	public static final int RPAREN=414;
	public static final int RSQUARE=415;
	public static final int RegexComponent=416;
	public static final int SEMICOLON=417;
	public static final int STAR=418;
	public static final int StringLiteral=419;
	public static final int TILDE=420;
	public static final int Tokens=421;
	public static final int WS=422;
	public static final int KW_ANTI=451;
	public static final int KW_BATCH=461;
	public static final int KW_DAYOFWEEK=506;
	public static final int KW_HOLD_DDLTIME=563;
	public static final int KW_NO_DROP=620;
	public static final int KW_OFFLINE=624;
	public static final int KW_PROTECTION=651;
	public static final int KW_READONLY=659;
	public static final int KW_TIMESTAMPTZ=728;
	public static final int TOK_ABORT_TRANSACTIONS=796;
	public static final int TOK_ACTIVATE=797;
	public static final int TOK_ADD_TRIGGER=798;
	public static final int TOK_ADMIN_OPTION_FOR=799;
	public static final int TOK_ALIAS=800;
	public static final int TOK_ALIASLIST=801;
	public static final int TOK_ALLCOLREF=802;
	public static final int TOK_ALLOC_FRACTION=803;
	public static final int TOK_ALTERDATABASE_LOCATION=804;
	public static final int TOK_ALTERDATABASE_MANAGEDLOCATION=805;
	public static final int TOK_ALTERDATABASE_OWNER=806;
	public static final int TOK_ALTERDATABASE_PROPERTIES=807;
	public static final int TOK_ALTERDATACONNECTOR_OWNER=808;
	public static final int TOK_ALTERDATACONNECTOR_PROPERTIES=809;
	public static final int TOK_ALTERDATACONNECTOR_URL=810;
	public static final int TOK_ALTERPARTITION_BUCKETS=811;
	public static final int TOK_ALTERPARTITION_FILEFORMAT=812;
	public static final int TOK_ALTERPARTITION_LOCATION=813;
	public static final int TOK_ALTERPARTITION_MERGEFILES=814;
	public static final int TOK_ALTERPARTITION_SERIALIZER=815;
	public static final int TOK_ALTERPARTITION_SETSERDEPROPERTIES=816;
	public static final int TOK_ALTERPARTITION_UNSETSERDEPROPERTIES=817;
	public static final int TOK_ALTERPARTITION_UPDATECOLSTATS=818;
	public static final int TOK_ALTERPARTITION_UPDATESTATS=819;
	public static final int TOK_ALTERTABLE=820;
	public static final int TOK_ALTERTABLE_ADDCOLS=821;
	public static final int TOK_ALTERTABLE_ADDCONSTRAINT=822;
	public static final int TOK_ALTERTABLE_ADDPARTS=823;
	public static final int TOK_ALTERTABLE_ARCHIVE=824;
	public static final int TOK_ALTERTABLE_BUCKETS=825;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=826;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=827;
	public static final int TOK_ALTERTABLE_COMPACT=828;
	public static final int TOK_ALTERTABLE_DROPCONSTRAINT=829;
	public static final int TOK_ALTERTABLE_DROPPARTS=830;
	public static final int TOK_ALTERTABLE_DROPPROPERTIES=831;
	public static final int TOK_ALTERTABLE_EXCHANGEPARTITION=832;
	public static final int TOK_ALTERTABLE_EXECUTE=833;
	public static final int TOK_ALTERTABLE_FILEFORMAT=834;
	public static final int TOK_ALTERTABLE_LOCATION=835;
	public static final int TOK_ALTERTABLE_MERGEFILES=836;
	public static final int TOK_ALTERTABLE_OWNER=837;
	public static final int TOK_ALTERTABLE_PARTCOLTYPE=838;
	public static final int TOK_ALTERTABLE_PROPERTIES=839;
	public static final int TOK_ALTERTABLE_RENAME=840;
	public static final int TOK_ALTERTABLE_RENAMECOL=841;
	public static final int TOK_ALTERTABLE_RENAMEPART=842;
	public static final int TOK_ALTERTABLE_REPLACECOLS=843;
	public static final int TOK_ALTERTABLE_SERIALIZER=844;
	public static final int TOK_ALTERTABLE_SETPARTSPEC=845;
	public static final int TOK_ALTERTABLE_SETSERDEPROPERTIES=846;
	public static final int TOK_ALTERTABLE_SKEWED=847;
	public static final int TOK_ALTERTABLE_SKEWED_LOCATION=848;
	public static final int TOK_ALTERTABLE_TOUCH=849;
	public static final int TOK_ALTERTABLE_UNARCHIVE=850;
	public static final int TOK_ALTERTABLE_UNSETSERDEPROPERTIES=851;
	public static final int TOK_ALTERTABLE_UPDATECOLSTATS=852;
	public static final int TOK_ALTERTABLE_UPDATECOLUMNS=853;
	public static final int TOK_ALTERTABLE_UPDATESTATS=854;
	public static final int TOK_ALTERVIEW=855;
	public static final int TOK_ALTERVIEW_ADDPARTS=856;
	public static final int TOK_ALTERVIEW_AS=857;
	public static final int TOK_ALTERVIEW_DROPPARTS=858;
	public static final int TOK_ALTERVIEW_DROPPROPERTIES=859;
	public static final int TOK_ALTERVIEW_PROPERTIES=860;
	public static final int TOK_ALTERVIEW_RENAME=861;
	public static final int TOK_ALTER_MAPPING=862;
	public static final int TOK_ALTER_MATERIALIZED_VIEW=863;
	public static final int TOK_ALTER_MATERIALIZED_VIEW_REBUILD=864;
	public static final int TOK_ALTER_MATERIALIZED_VIEW_REWRITE=865;
	public static final int TOK_ALTER_POOL=866;
	public static final int TOK_ALTER_POOL_ADD_TRIGGER=867;
	public static final int TOK_ALTER_POOL_DROP_TRIGGER=868;
	public static final int TOK_ALTER_RP_DISABLE=869;
	public static final int TOK_ALTER_RP_ENABLE=870;
	public static final int TOK_ALTER_RP_RENAME=871;
	public static final int TOK_ALTER_RP_REPLACE=872;
	public static final int TOK_ALTER_RP_SET=873;
	public static final int TOK_ALTER_RP_UNSET=874;
	public static final int TOK_ALTER_RP_VALIDATE=875;
	public static final int TOK_ALTER_SCHEDULED_QUERY=876;
	public static final int TOK_ALTER_TRIGGER=877;
	public static final int TOK_ANALYZE=878;
	public static final int TOK_ARCHIVE=879;
	public static final int TOK_AS_OF_TIME=880;
	public static final int TOK_AS_OF_VERSION=881;
	public static final int TOK_BIGINT=882;
	public static final int TOK_BINARY=883;
	public static final int TOK_BLOCKING=884;
	public static final int TOK_BOOLEAN=885;
	public static final int TOK_BUCKET=886;
	public static final int TOK_CACHE_METADATA=887;
	public static final int TOK_CASCADE=888;
	public static final int TOK_CHAR=889;
	public static final int TOK_CHARSETLITERAL=890;
	public static final int TOK_CHECK_CONSTRAINT=891;
	public static final int TOK_CLUSTERBY=892;
	public static final int TOK_COLTYPELIST=893;
	public static final int TOK_COL_NAME=894;
	public static final int TOK_COMMIT=895;
	public static final int TOK_COMPACTION_STATUS=896;
	public static final int TOK_COMPACTION_TYPE=897;
	public static final int TOK_COMPACT_ID=898;
	public static final int TOK_COMPACT_POOL=899;
	public static final int TOK_CONSTRAINT_NAME=900;
	public static final int TOK_CREATEDATABASE=901;
	public static final int TOK_CREATEDATACONNECTOR=902;
	public static final int TOK_CREATEFUNCTION=903;
	public static final int TOK_CREATEMACRO=904;
	public static final int TOK_CREATEROLE=905;
	public static final int TOK_CREATETABLE=906;
	public static final int TOK_CREATEVIEW=907;
	public static final int TOK_CREATE_MAPPING=908;
	public static final int TOK_CREATE_MATERIALIZED_VIEW=909;
	public static final int TOK_CREATE_POOL=910;
	public static final int TOK_CREATE_RP=911;
	public static final int TOK_CREATE_SCHEDULED_QUERY=912;
	public static final int TOK_CREATE_TRIGGER=913;
	public static final int TOK_CRON=914;
	public static final int TOK_CROSSJOIN=915;
	public static final int TOK_CTE=916;
	public static final int TOK_CUBE_GROUPBY=917;
	public static final int TOK_DATABASECOMMENT=918;
	public static final int TOK_DATABASELOCATION=919;
	public static final int TOK_DATABASEPROPERTIES=920;
	public static final int TOK_DATABASE_MANAGEDLOCATION=921;
	public static final int TOK_DATACONNECTOR=922;
	public static final int TOK_DATACONNECTORCOMMENT=923;
	public static final int TOK_DATACONNECTOROWNER=924;
	public static final int TOK_DATACONNECTORPROPERTIES=925;
	public static final int TOK_DATACONNECTORTYPE=926;
	public static final int TOK_DATACONNECTORURL=927;
	public static final int TOK_DATE=928;
	public static final int TOK_DATELITERAL=929;
	public static final int TOK_DATETIME=930;
	public static final int TOK_DAY=931;
	public static final int TOK_DBNAME=932;
	public static final int TOK_DBPROPLIST=933;
	public static final int TOK_DB_TYPE=934;
	public static final int TOK_DDL=935;
	public static final int TOK_DECIMAL=936;
	public static final int TOK_DEFAULT_POOL=937;
	public static final int TOK_DEFAULT_VALUE=938;
	public static final int TOK_DELETE=939;
	public static final int TOK_DELETE_FROM=940;
	public static final int TOK_DESCDATABASE=941;
	public static final int TOK_DESCDATACONNECTOR=942;
	public static final int TOK_DESCFUNCTION=943;
	public static final int TOK_DESCTABLE=944;
	public static final int TOK_DESTINATION=945;
	public static final int TOK_DETAIL=946;
	public static final int TOK_DIR=947;
	public static final int TOK_DISABLE=948;
	public static final int TOK_DISTRIBUTEBY=949;
	public static final int TOK_DOUBLE=950;
	public static final int TOK_DROPDATABASE=951;
	public static final int TOK_DROPDATACONNECTOR=952;
	public static final int TOK_DROPFUNCTION=953;
	public static final int TOK_DROPMACRO=954;
	public static final int TOK_DROPROLE=955;
	public static final int TOK_DROPTABLE=956;
	public static final int TOK_DROPVIEW=957;
	public static final int TOK_DROP_MAPPING=958;
	public static final int TOK_DROP_MATERIALIZED_VIEW=959;
	public static final int TOK_DROP_POOL=960;
	public static final int TOK_DROP_RP=961;
	public static final int TOK_DROP_SCHEDULED_QUERY=962;
	public static final int TOK_DROP_TRIGGER=963;
	public static final int TOK_ENABLE=964;
	public static final int TOK_EVERY=965;
	public static final int TOK_EXCEPTALL=966;
	public static final int TOK_EXCEPTDISTINCT=967;
	public static final int TOK_EXECUTE=968;
	public static final int TOK_EXECUTED_AS=969;
	public static final int TOK_EXECUTE_PARAM_LIST=970;
	public static final int TOK_EXPLAIN=971;
	public static final int TOK_EXPLAIN_SQ_REWRITE=972;
	public static final int TOK_EXPLIST=973;
	public static final int TOK_EXPORT=974;
	public static final int TOK_EXPRESSION=975;
	public static final int TOK_FALSE=976;
	public static final int TOK_FILE=977;
	public static final int TOK_FILEFORMAT_GENERIC=978;
	public static final int TOK_FLOAT=979;
	public static final int TOK_FORCE=980;
	public static final int TOK_FOREIGN_KEY=981;
	public static final int TOK_FROM=982;
	public static final int TOK_FULLOUTERJOIN=983;
	public static final int TOK_FUNCTION=984;
	public static final int TOK_FUNCTIONDI=985;
	public static final int TOK_FUNCTIONSTAR=986;
	public static final int TOK_GRANT=987;
	public static final int TOK_GRANT_OPTION_FOR=988;
	public static final int TOK_GRANT_ROLE=989;
	public static final int TOK_GRANT_WITH_ADMIN_OPTION=990;
	public static final int TOK_GRANT_WITH_OPTION=991;
	public static final int TOK_GROUP=992;
	public static final int TOK_GROUPBY=993;
	public static final int TOK_GROUPING_SETS=994;
	public static final int TOK_GROUPING_SETS_EXPRESSION=995;
	public static final int TOK_HAVING=996;
	public static final int TOK_HOUR=997;
	public static final int TOK_IDENTITY=998;
	public static final int TOK_IFEXISTS=999;
	public static final int TOK_IFNOTEXISTS=1000;
	public static final int TOK_IGNORE_NULLS=1001;
	public static final int TOK_IMPORT=1002;
	public static final int TOK_INPUTFORMAT=1003;
	public static final int TOK_INSERT=1004;
	public static final int TOK_INSERT_INTO=1005;
	public static final int TOK_INT=1006;
	public static final int TOK_INTERSECTALL=1007;
	public static final int TOK_INTERSECTDISTINCT=1008;
	public static final int TOK_INTERVAL_DAY_LITERAL=1009;
	public static final int TOK_INTERVAL_DAY_TIME=1010;
	public static final int TOK_INTERVAL_DAY_TIME_LITERAL=1011;
	public static final int TOK_INTERVAL_HOUR_LITERAL=1012;
	public static final int TOK_INTERVAL_MINUTE_LITERAL=1013;
	public static final int TOK_INTERVAL_MONTH_LITERAL=1014;
	public static final int TOK_INTERVAL_SECOND_LITERAL=1015;
	public static final int TOK_INTERVAL_YEAR_LITERAL=1016;
	public static final int TOK_INTERVAL_YEAR_MONTH=1017;
	public static final int TOK_INTERVAL_YEAR_MONTH_LITERAL=1018;
	public static final int TOK_ISOLATION_LEVEL=1019;
	public static final int TOK_ISOLATION_SNAPSHOT=1020;
	public static final int TOK_JAR=1021;
	public static final int TOK_JOIN=1022;
	public static final int TOK_KILL_QUERY=1023;
	public static final int TOK_LATERAL_VIEW=1024;
	public static final int TOK_LATERAL_VIEW_OUTER=1025;
	public static final int TOK_LEFTANTISEMIJOIN=1026;
	public static final int TOK_LEFTOUTERJOIN=1027;
	public static final int TOK_LEFTSEMIJOIN=1028;
	public static final int TOK_LENGTH=1029;
	public static final int TOK_LIKEFILE=1030;
	public static final int TOK_LIKERP=1031;
	public static final int TOK_LIKETABLE=1032;
	public static final int TOK_LIMIT=1033;
	public static final int TOK_LIST=1034;
	public static final int TOK_LOAD=1035;
	public static final int TOK_LOCKDB=1036;
	public static final int TOK_LOCKTABLE=1037;
	public static final int TOK_MAP=1038;
	public static final int TOK_MATCHED=1039;
	public static final int TOK_MERGE=1040;
	public static final int TOK_METADATA=1041;
	public static final int TOK_MONTH=1042;
	public static final int TOK_MSCK=1043;
	public static final int TOK_NORELY=1044;
	public static final int TOK_NOT_CLUSTERED=1045;
	public static final int TOK_NOT_MATCHED=1046;
	public static final int TOK_NOT_NULL=1047;
	public static final int TOK_NOT_SORTED=1048;
	public static final int TOK_NOVALIDATE=1049;
	public static final int TOK_NO_DROP=1050;
	public static final int TOK_NULL=1051;
	public static final int TOK_NULLS_FIRST=1052;
	public static final int TOK_NULLS_LAST=1053;
	public static final int TOK_OFFLINE=1054;
	public static final int TOK_OFFSET=1055;
	public static final int TOK_ONLY=1056;
	public static final int TOK_OPERATOR=1057;
	public static final int TOK_OP_ADD=1058;
	public static final int TOK_OP_AND=1059;
	public static final int TOK_OP_BITAND=1060;
	public static final int TOK_OP_BITNOT=1061;
	public static final int TOK_OP_BITOR=1062;
	public static final int TOK_OP_BITXOR=1063;
	public static final int TOK_OP_DIV=1064;
	public static final int TOK_OP_EQ=1065;
	public static final int TOK_OP_GE=1066;
	public static final int TOK_OP_GT=1067;
	public static final int TOK_OP_LE=1068;
	public static final int TOK_OP_LIKE=1069;
	public static final int TOK_OP_LT=1070;
	public static final int TOK_OP_MOD=1071;
	public static final int TOK_OP_MUL=1072;
	public static final int TOK_OP_NE=1073;
	public static final int TOK_OP_NOT=1074;
	public static final int TOK_OP_OR=1075;
	public static final int TOK_OP_SUB=1076;
	public static final int TOK_ORDERBY=1077;
	public static final int TOK_ORREPLACE=1078;
	public static final int TOK_PARAMETER=1079;
	public static final int TOK_PARAMETER_IDX=1080;
	public static final int TOK_PARTITIONINGSPEC=1081;
	public static final int TOK_PARTITIONLOCATION=1082;
	public static final int TOK_PARTSPEC=1083;
	public static final int TOK_PARTVAL=1084;
	public static final int TOK_PATH=1085;
	public static final int TOK_PERCENT=1086;
	public static final int TOK_PREPARE=1087;
	public static final int TOK_PRIMARY_KEY=1088;
	public static final int TOK_PRINCIPAL_NAME=1089;
	public static final int TOK_PRIVILEGE=1090;
	public static final int TOK_PRIVILEGE_LIST=1091;
	public static final int TOK_PRIV_ALL=1092;
	public static final int TOK_PRIV_ALTER_DATA=1093;
	public static final int TOK_PRIV_ALTER_METADATA=1094;
	public static final int TOK_PRIV_CREATE=1095;
	public static final int TOK_PRIV_DELETE=1096;
	public static final int TOK_PRIV_DROP=1097;
	public static final int TOK_PRIV_INSERT=1098;
	public static final int TOK_PRIV_LOCK=1099;
	public static final int TOK_PRIV_OBJECT=1100;
	public static final int TOK_PRIV_OBJECT_COL=1101;
	public static final int TOK_PRIV_SELECT=1102;
	public static final int TOK_PRIV_SHOW_DATABASE=1103;
	public static final int TOK_PTBLFUNCTION=1104;
	public static final int TOK_QUALIFY=1105;
	public static final int TOK_QUERY=1106;
	public static final int TOK_QUERY_PARALLELISM=1107;
	public static final int TOK_READONLY=1108;
	public static final int TOK_REAL=1109;
	public static final int TOK_RECORDREADER=1110;
	public static final int TOK_RECORDWRITER=1111;
	public static final int TOK_RELOADFUNCTIONS=1112;
	public static final int TOK_RELY=1113;
	public static final int TOK_REMOTE=1114;
	public static final int TOK_RENAME=1115;
	public static final int TOK_REPLACE=1116;
	public static final int TOK_REPLICATION=1117;
	public static final int TOK_REPL_CONFIG=1118;
	public static final int TOK_REPL_CONFIG_LIST=1119;
	public static final int TOK_REPL_DUMP=1120;
	public static final int TOK_REPL_LOAD=1121;
	public static final int TOK_REPL_STATUS=1122;
	public static final int TOK_REPL_TABLES=1123;
	public static final int TOK_REPL_TABLES_LIST=1124;
	public static final int TOK_RESOURCE_ALL=1125;
	public static final int TOK_RESOURCE_LIST=1126;
	public static final int TOK_RESOURCE_URI=1127;
	public static final int TOK_RESPECT_NULLS=1128;
	public static final int TOK_RESTRICT=1129;
	public static final int TOK_REVOKE=1130;
	public static final int TOK_REVOKE_ROLE=1131;
	public static final int TOK_REWRITE_DISABLED=1132;
	public static final int TOK_REWRITE_ENABLED=1133;
	public static final int TOK_RIGHTOUTERJOIN=1134;
	public static final int TOK_ROLE=1135;
	public static final int TOK_ROLLBACK=1136;
	public static final int TOK_ROLLUP_GROUPBY=1137;
	public static final int TOK_ROWCOUNT=1138;
	public static final int TOK_SCHEDULE=1139;
	public static final int TOK_SCHEDULING_POLICY=1140;
	public static final int TOK_SELECT=1141;
	public static final int TOK_SELECTDI=1142;
	public static final int TOK_SELEXPR=1143;
	public static final int TOK_SERDE=1144;
	public static final int TOK_SERDENAME=1145;
	public static final int TOK_SERDEPROPS=1146;
	public static final int TOK_SERVER_TYPE=1147;
	public static final int TOK_SETCOLREF=1148;
	public static final int TOK_SET_AUTOCOMMIT=1149;
	public static final int TOK_SET_COLUMNS_CLAUSE=1150;
	public static final int TOK_SET_ROLE=1151;
	public static final int TOK_SHOWCOLUMNS=1152;
	public static final int TOK_SHOWCONF=1153;
	public static final int TOK_SHOWDATABASES=1154;
	public static final int TOK_SHOWDATACONNECTORS=1155;
	public static final int TOK_SHOWDBLOCKS=1156;
	public static final int TOK_SHOWFUNCTIONS=1157;
	public static final int TOK_SHOWLOCKS=1158;
	public static final int TOK_SHOWMATERIALIZEDVIEWS=1159;
	public static final int TOK_SHOWPARTITIONS=1160;
	public static final int TOK_SHOWTABLES=1161;
	public static final int TOK_SHOWVIEWS=1162;
	public static final int TOK_SHOW_COMPACTIONS=1163;
	public static final int TOK_SHOW_CREATEDATABASE=1164;
	public static final int TOK_SHOW_CREATETABLE=1165;
	public static final int TOK_SHOW_CURRENT_ROLE=1166;
	public static final int TOK_SHOW_GRANT=1167;
	public static final int TOK_SHOW_ROLES=1168;
	public static final int TOK_SHOW_ROLE_GRANT=1169;
	public static final int TOK_SHOW_ROLE_PRINCIPALS=1170;
	public static final int TOK_SHOW_RP=1171;
	public static final int TOK_SHOW_TABLESTATUS=1172;
	public static final int TOK_SHOW_TBLPROPERTIES=1173;
	public static final int TOK_SHOW_TRANSACTIONS=1174;
	public static final int TOK_SKEWED_LOCATIONS=1175;
	public static final int TOK_SKEWED_LOCATION_LIST=1176;
	public static final int TOK_SKEWED_LOCATION_MAP=1177;
	public static final int TOK_SMALLINT=1178;
	public static final int TOK_SORTBY=1179;
	public static final int TOK_START_TRANSACTION=1180;
	public static final int TOK_STORAGEHANDLER=1181;
	public static final int TOK_STOREDASDIRS=1182;
	public static final int TOK_STRING=1183;
	public static final int TOK_STRINGLITERALSEQUENCE=1184;
	public static final int TOK_STRUCT=1185;
	public static final int TOK_SUBQUERY=1186;
	public static final int TOK_SUBQUERY_EXPR=1187;
	public static final int TOK_SUBQUERY_OP=1188;
	public static final int TOK_SUBQUERY_OP_NOTEXISTS=1189;
	public static final int TOK_SUBQUERY_OP_NOTIN=1190;
	public static final int TOK_SUMMARY=1191;
	public static final int TOK_SWITCHDATABASE=1192;
	public static final int TOK_TAB=1193;
	public static final int TOK_TABALIAS=1194;
	public static final int TOK_TABCOL=1195;
	public static final int TOK_TABCOLLIST=1196;
	public static final int TOK_TABCOLNAME=1197;
	public static final int TOK_TABCOLVALUE=1198;
	public static final int TOK_TABCOLVALUES=1199;
	public static final int TOK_TABCOLVALUE_PAIR=1200;
	public static final int TOK_TABLEBUCKETSAMPLE=1201;
	public static final int TOK_TABLECOMMENT=1202;
	public static final int TOK_TABLEFILEFORMAT=1203;
	public static final int TOK_TABLELOCATION=1204;
	public static final int TOK_TABLEPARTCOLNAMES=1205;
	public static final int TOK_TABLEPARTCOLS=1206;
	public static final int TOK_TABLEPARTCOLSBYSPEC=1207;
	public static final int TOK_TABLEPROPERTIES=1208;
	public static final int TOK_TABLEPROPERTY=1209;
	public static final int TOK_TABLEPROPLIST=1210;
	public static final int TOK_TABLEROWFORMAT=1211;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=1212;
	public static final int TOK_TABLEROWFORMATFIELD=1213;
	public static final int TOK_TABLEROWFORMATLINES=1214;
	public static final int TOK_TABLEROWFORMATMAPKEYS=1215;
	public static final int TOK_TABLEROWFORMATNULL=1216;
	public static final int TOK_TABLESERIALIZER=1217;
	public static final int TOK_TABLESKEWED=1218;
	public static final int TOK_TABLESPLITSAMPLE=1219;
	public static final int TOK_TABLE_OR_COL=1220;
	public static final int TOK_TABLE_PARTITION=1221;
	public static final int TOK_TABLE_TYPE=1222;
	public static final int TOK_TABNAME=1223;
	public static final int TOK_TABREF=1224;
	public static final int TOK_TABSORTCOLNAMEASC=1225;
	public static final int TOK_TABSORTCOLNAMEDESC=1226;
	public static final int TOK_TABSRC=1227;
	public static final int TOK_TABTYPE=1228;
	public static final int TOK_TEMPORARY=1229;
	public static final int TOK_TIMESTAMP=1230;
	public static final int TOK_TIMESTAMPLITERAL=1231;
	public static final int TOK_TIMESTAMPLOCALTZ=1232;
	public static final int TOK_TIMESTAMPLOCALTZLITERAL=1233;
	public static final int TOK_TINYINT=1234;
	public static final int TOK_TMP_FILE=1235;
	public static final int TOK_TO=1236;
	public static final int TOK_TRANSFORM=1237;
	public static final int TOK_TRIGGER_EXPRESSION=1238;
	public static final int TOK_TRUE=1239;
	public static final int TOK_TRUNCATE=1240;
	public static final int TOK_TRUNCATETABLE=1241;
	public static final int TOK_TXN_ACCESS_MODE=1242;
	public static final int TOK_TXN_READ_ONLY=1243;
	public static final int TOK_TXN_READ_WRITE=1244;
	public static final int TOK_UNIONALL=1245;
	public static final int TOK_UNIONDISTINCT=1246;
	public static final int TOK_UNIONTYPE=1247;
	public static final int TOK_UNIQUE=1248;
	public static final int TOK_UNIQUEJOIN=1249;
	public static final int TOK_UNKNOWN=1250;
	public static final int TOK_UNLOCKDB=1251;
	public static final int TOK_UNLOCKTABLE=1252;
	public static final int TOK_UNMANAGED=1253;
	public static final int TOK_UPDATE=1254;
	public static final int TOK_UPDATE_TABLE=1255;
	public static final int TOK_URI_TYPE=1256;
	public static final int TOK_USER=1257;
	public static final int TOK_USERSCRIPTCOLNAMES=1258;
	public static final int TOK_USERSCRIPTCOLSCHEMA=1259;
	public static final int TOK_VALIDATE=1260;
	public static final int TOK_VARCHAR=1261;
	public static final int TOK_VIEWCLUSTERCOLS=1262;
	public static final int TOK_VIEWDISTRIBUTECOLS=1263;
	public static final int TOK_VIEWPARTCOLS=1264;
	public static final int TOK_VIEWSORTCOLS=1265;
	public static final int TOK_WHERE=1266;
	public static final int TOK_WINDOWDEF=1267;
	public static final int TOK_WINDOWRANGE=1268;
	public static final int TOK_WINDOWSPEC=1269;
	public static final int TOK_WINDOWVALUES=1270;
	public static final int TOK_WITHIN_GROUP=1271;
	public static final int TOK_YEAR=1272;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public HiveParser gHiveParser;
	public HiveParser gParent;


	public HiveParser_AlterClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_AlterClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
		super(input, state);
		this.gHiveParser = gHiveParser;
		gParent = gHiveParser;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HiveParser.tokenNames; }
	@Override public String getGrammarFileName() { return "AlterClauseParser.g"; }


	  @Override
	  public Object recoverFromMismatchedSet(IntStream input,
	      RecognitionException re, BitSet follow) throws RecognitionException {
	    throw re;
	  }
	  @Override
	  public void displayRecognitionError(String[] tokenNames,
	      RecognitionException e) {
	    gParent.errors.add(new ParseError(gParent, e, tokenNames));
	  }


	public static class alterStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatement"
	// AlterClauseParser.g:47:1: alterStatement : ( KW_ALTER KW_TABLE tableName alterTableStatementSuffix -> ^( TOK_ALTERTABLE tableName alterTableStatementSuffix ) | KW_ALTER KW_VIEW tableName ( KW_AS )? alterViewStatementSuffix -> ^( TOK_ALTERVIEW tableName alterViewStatementSuffix ) | KW_ALTER KW_MATERIALIZED KW_VIEW tableNameTree= tableName alterMaterializedViewStatementSuffix[$tableNameTree.tree] -> alterMaterializedViewStatementSuffix | KW_ALTER ( KW_DATABASE | KW_SCHEMA ) alterDatabaseStatementSuffix -> alterDatabaseStatementSuffix | KW_ALTER KW_DATACONNECTOR alterDataConnectorStatementSuffix -> alterDataConnectorStatementSuffix );
	public final HiveParser_AlterClauseParser.alterStatement_return alterStatement() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatement_return retval = new HiveParser_AlterClauseParser.alterStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ALTER1=null;
		Token KW_TABLE2=null;
		Token KW_ALTER5=null;
		Token KW_VIEW6=null;
		Token KW_AS8=null;
		Token KW_ALTER10=null;
		Token KW_MATERIALIZED11=null;
		Token KW_VIEW12=null;
		Token KW_ALTER14=null;
		Token KW_DATABASE15=null;
		Token KW_SCHEMA16=null;
		Token KW_ALTER18=null;
		Token KW_DATACONNECTOR19=null;
		ParserRuleReturnScope tableNameTree =null;
		ParserRuleReturnScope tableName3 =null;
		ParserRuleReturnScope alterTableStatementSuffix4 =null;
		ParserRuleReturnScope tableName7 =null;
		ParserRuleReturnScope alterViewStatementSuffix9 =null;
		ParserRuleReturnScope alterMaterializedViewStatementSuffix13 =null;
		ParserRuleReturnScope alterDatabaseStatementSuffix17 =null;
		ParserRuleReturnScope alterDataConnectorStatementSuffix20 =null;

		ASTNode KW_ALTER1_tree=null;
		ASTNode KW_TABLE2_tree=null;
		ASTNode KW_ALTER5_tree=null;
		ASTNode KW_VIEW6_tree=null;
		ASTNode KW_AS8_tree=null;
		ASTNode KW_ALTER10_tree=null;
		ASTNode KW_MATERIALIZED11_tree=null;
		ASTNode KW_VIEW12_tree=null;
		ASTNode KW_ALTER14_tree=null;
		ASTNode KW_DATABASE15_tree=null;
		ASTNode KW_SCHEMA16_tree=null;
		ASTNode KW_ALTER18_tree=null;
		ASTNode KW_DATACONNECTOR19_tree=null;
		RewriteRuleTokenStream stream_KW_SCHEMA=new RewriteRuleTokenStream(adaptor,"token KW_SCHEMA");
		RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
		RewriteRuleTokenStream stream_KW_DATABASE=new RewriteRuleTokenStream(adaptor,"token KW_DATABASE");
		RewriteRuleTokenStream stream_KW_DATACONNECTOR=new RewriteRuleTokenStream(adaptor,"token KW_DATACONNECTOR");
		RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
		RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_KW_MATERIALIZED=new RewriteRuleTokenStream(adaptor,"token KW_MATERIALIZED");
		RewriteRuleSubtreeStream stream_alterDataConnectorStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterDataConnectorStatementSuffix");
		RewriteRuleSubtreeStream stream_alterMaterializedViewStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterMaterializedViewStatementSuffix");
		RewriteRuleSubtreeStream stream_alterTableStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterTableStatementSuffix");
		RewriteRuleSubtreeStream stream_alterViewStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterViewStatementSuffix");
		RewriteRuleSubtreeStream stream_alterDatabaseStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterDatabaseStatementSuffix");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		 gParent.pushMsg("alter statement", state); 
		try {
			// AlterClauseParser.g:50:5: ( KW_ALTER KW_TABLE tableName alterTableStatementSuffix -> ^( TOK_ALTERTABLE tableName alterTableStatementSuffix ) | KW_ALTER KW_VIEW tableName ( KW_AS )? alterViewStatementSuffix -> ^( TOK_ALTERVIEW tableName alterViewStatementSuffix ) | KW_ALTER KW_MATERIALIZED KW_VIEW tableNameTree= tableName alterMaterializedViewStatementSuffix[$tableNameTree.tree] -> alterMaterializedViewStatementSuffix | KW_ALTER ( KW_DATABASE | KW_SCHEMA ) alterDatabaseStatementSuffix -> alterDatabaseStatementSuffix | KW_ALTER KW_DATACONNECTOR alterDataConnectorStatementSuffix -> alterDataConnectorStatementSuffix )
			int alt3=5;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==KW_ALTER) ) {
				switch ( input.LA(2) ) {
				case KW_TABLE:
					{
					alt3=1;
					}
					break;
				case KW_VIEW:
					{
					alt3=2;
					}
					break;
				case KW_MATERIALIZED:
					{
					alt3=3;
					}
					break;
				case KW_DATACONNECTOR:
					{
					alt3=5;
					}
					break;
				case KW_DATABASE:
				case KW_SCHEMA:
					{
					alt3=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// AlterClauseParser.g:50:7: KW_ALTER KW_TABLE tableName alterTableStatementSuffix
					{
					KW_ALTER1=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement66); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER1);

					KW_TABLE2=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_alterStatement68); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE2);

					pushFollow(FOLLOW_tableName_in_alterStatement70);
					tableName3=gHiveParser.tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(tableName3.getTree());
					pushFollow(FOLLOW_alterTableStatementSuffix_in_alterStatement72);
					alterTableStatementSuffix4=alterTableStatementSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterTableStatementSuffix.add(alterTableStatementSuffix4.getTree());
					// AST REWRITE
					// elements: alterTableStatementSuffix, tableName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 50:61: -> ^( TOK_ALTERTABLE tableName alterTableStatementSuffix )
					{
						// AlterClauseParser.g:50:64: ^( TOK_ALTERTABLE tableName alterTableStatementSuffix )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE, "TOK_ALTERTABLE"), root_1);
						adaptor.addChild(root_1, stream_tableName.nextTree());
						adaptor.addChild(root_1, stream_alterTableStatementSuffix.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:51:7: KW_ALTER KW_VIEW tableName ( KW_AS )? alterViewStatementSuffix
					{
					KW_ALTER5=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement90); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER5);

					KW_VIEW6=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_alterStatement92); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW6);

					pushFollow(FOLLOW_tableName_in_alterStatement94);
					tableName7=gHiveParser.tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(tableName7.getTree());
					// AlterClauseParser.g:51:34: ( KW_AS )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==KW_AS) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// AlterClauseParser.g:51:34: KW_AS
							{
							KW_AS8=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_alterStatement96); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS8);

							}
							break;

					}

					pushFollow(FOLLOW_alterViewStatementSuffix_in_alterStatement99);
					alterViewStatementSuffix9=alterViewStatementSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterViewStatementSuffix.add(alterViewStatementSuffix9.getTree());
					// AST REWRITE
					// elements: alterViewStatementSuffix, tableName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 51:66: -> ^( TOK_ALTERVIEW tableName alterViewStatementSuffix )
					{
						// AlterClauseParser.g:51:69: ^( TOK_ALTERVIEW tableName alterViewStatementSuffix )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW, "TOK_ALTERVIEW"), root_1);
						adaptor.addChild(root_1, stream_tableName.nextTree());
						adaptor.addChild(root_1, stream_alterViewStatementSuffix.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AlterClauseParser.g:52:7: KW_ALTER KW_MATERIALIZED KW_VIEW tableNameTree= tableName alterMaterializedViewStatementSuffix[$tableNameTree.tree]
					{
					KW_ALTER10=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement117); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER10);

					KW_MATERIALIZED11=(Token)match(input,KW_MATERIALIZED,FOLLOW_KW_MATERIALIZED_in_alterStatement119); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_MATERIALIZED.add(KW_MATERIALIZED11);

					KW_VIEW12=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_alterStatement121); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW12);

					pushFollow(FOLLOW_tableName_in_alterStatement125);
					tableNameTree=gHiveParser.tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(tableNameTree.getTree());
					pushFollow(FOLLOW_alterMaterializedViewStatementSuffix_in_alterStatement127);
					alterMaterializedViewStatementSuffix13=alterMaterializedViewStatementSuffix((tableNameTree!=null?((ASTNode)tableNameTree.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterMaterializedViewStatementSuffix.add(alterMaterializedViewStatementSuffix13.getTree());
					// AST REWRITE
					// elements: alterMaterializedViewStatementSuffix
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 52:122: -> alterMaterializedViewStatementSuffix
					{
						adaptor.addChild(root_0, stream_alterMaterializedViewStatementSuffix.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AlterClauseParser.g:53:7: KW_ALTER ( KW_DATABASE | KW_SCHEMA ) alterDatabaseStatementSuffix
					{
					KW_ALTER14=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement140); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER14);

					// AlterClauseParser.g:53:16: ( KW_DATABASE | KW_SCHEMA )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==KW_DATABASE) ) {
						alt2=1;
					}
					else if ( (LA2_0==KW_SCHEMA) ) {
						alt2=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// AlterClauseParser.g:53:17: KW_DATABASE
							{
							KW_DATABASE15=(Token)match(input,KW_DATABASE,FOLLOW_KW_DATABASE_in_alterStatement143); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_DATABASE.add(KW_DATABASE15);

							}
							break;
						case 2 :
							// AlterClauseParser.g:53:29: KW_SCHEMA
							{
							KW_SCHEMA16=(Token)match(input,KW_SCHEMA,FOLLOW_KW_SCHEMA_in_alterStatement145); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_SCHEMA.add(KW_SCHEMA16);

							}
							break;

					}

					pushFollow(FOLLOW_alterDatabaseStatementSuffix_in_alterStatement148);
					alterDatabaseStatementSuffix17=alterDatabaseStatementSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterDatabaseStatementSuffix.add(alterDatabaseStatementSuffix17.getTree());
					// AST REWRITE
					// elements: alterDatabaseStatementSuffix
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 53:69: -> alterDatabaseStatementSuffix
					{
						adaptor.addChild(root_0, stream_alterDatabaseStatementSuffix.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AlterClauseParser.g:54:7: KW_ALTER KW_DATACONNECTOR alterDataConnectorStatementSuffix
					{
					KW_ALTER18=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement160); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER18);

					KW_DATACONNECTOR19=(Token)match(input,KW_DATACONNECTOR,FOLLOW_KW_DATACONNECTOR_in_alterStatement162); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_DATACONNECTOR.add(KW_DATACONNECTOR19);

					pushFollow(FOLLOW_alterDataConnectorStatementSuffix_in_alterStatement164);
					alterDataConnectorStatementSuffix20=alterDataConnectorStatementSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterDataConnectorStatementSuffix.add(alterDataConnectorStatementSuffix20.getTree());
					// AST REWRITE
					// elements: alterDataConnectorStatementSuffix
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 54:67: -> alterDataConnectorStatementSuffix
					{
						adaptor.addChild(root_0, stream_alterDataConnectorStatementSuffix.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatement"


	public static class alterTableStatementSuffix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterTableStatementSuffix"
	// AlterClauseParser.g:57:1: alterTableStatementSuffix : ( ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true] | alterStatementSuffixDropPartitions[true] | alterStatementSuffixAddPartitions[true] | alterStatementSuffixTouch | alterStatementSuffixArchive | alterStatementSuffixUnArchive | alterStatementSuffixProperties | alterStatementSuffixSkewedby | alterStatementSuffixExchangePartition | alterStatementPartitionKeyType | alterStatementSuffixDropConstraint | alterStatementSuffixAddConstraint | alterTblPartitionStatementSuffix[false] | partitionSpec alterTblPartitionStatementSuffix[true] -> alterTblPartitionStatementSuffix partitionSpec | alterStatementSuffixSetOwner | alterStatementSuffixSetPartSpec | alterStatementSuffixExecute );
	public final HiveParser_AlterClauseParser.alterTableStatementSuffix_return alterTableStatementSuffix() throws RecognitionException {
		HiveParser_AlterClauseParser.alterTableStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterTableStatementSuffix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope alterStatementSuffixRename21 =null;
		ParserRuleReturnScope alterStatementSuffixDropPartitions22 =null;
		ParserRuleReturnScope alterStatementSuffixAddPartitions23 =null;
		ParserRuleReturnScope alterStatementSuffixTouch24 =null;
		ParserRuleReturnScope alterStatementSuffixArchive25 =null;
		ParserRuleReturnScope alterStatementSuffixUnArchive26 =null;
		ParserRuleReturnScope alterStatementSuffixProperties27 =null;
		ParserRuleReturnScope alterStatementSuffixSkewedby28 =null;
		ParserRuleReturnScope alterStatementSuffixExchangePartition29 =null;
		ParserRuleReturnScope alterStatementPartitionKeyType30 =null;
		ParserRuleReturnScope alterStatementSuffixDropConstraint31 =null;
		ParserRuleReturnScope alterStatementSuffixAddConstraint32 =null;
		ParserRuleReturnScope alterTblPartitionStatementSuffix33 =null;
		ParserRuleReturnScope partitionSpec34 =null;
		ParserRuleReturnScope alterTblPartitionStatementSuffix35 =null;
		ParserRuleReturnScope alterStatementSuffixSetOwner36 =null;
		ParserRuleReturnScope alterStatementSuffixSetPartSpec37 =null;
		ParserRuleReturnScope alterStatementSuffixExecute38 =null;

		RewriteRuleSubtreeStream stream_alterTblPartitionStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterTblPartitionStatementSuffix");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		 gParent.pushMsg("alter table statement", state); 
		try {
			// AlterClauseParser.g:60:5: ( ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true] | alterStatementSuffixDropPartitions[true] | alterStatementSuffixAddPartitions[true] | alterStatementSuffixTouch | alterStatementSuffixArchive | alterStatementSuffixUnArchive | alterStatementSuffixProperties | alterStatementSuffixSkewedby | alterStatementSuffixExchangePartition | alterStatementPartitionKeyType | alterStatementSuffixDropConstraint | alterStatementSuffixAddConstraint | alterTblPartitionStatementSuffix[false] | partitionSpec alterTblPartitionStatementSuffix[true] -> alterTblPartitionStatementSuffix partitionSpec | alterStatementSuffixSetOwner | alterStatementSuffixSetPartSpec | alterStatementSuffixExecute )
			int alt4=17;
			switch ( input.LA(1) ) {
			case KW_RENAME:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==KW_TO) ) {
					int LA4_21 = input.LA(3);
					if ( (LA4_21==Identifier) && (synpred1_AlterClauseParser())) {
						alt4=1;
					}
					else if ( ((LA4_21 >= KW_ABORT && LA4_21 <= KW_AFTER)||LA4_21==KW_ALLOC_FRACTION||LA4_21==KW_ANALYZE||LA4_21==KW_ARCHIVE||(LA4_21 >= KW_ASC && LA4_21 <= KW_AT)||(LA4_21 >= KW_AUTOCOMMIT && LA4_21 <= KW_BEFORE)||(LA4_21 >= KW_BUCKET && LA4_21 <= KW_BUCKETS)||(LA4_21 >= KW_CACHE && LA4_21 <= KW_CASCADE)||(LA4_21 >= KW_CBO && LA4_21 <= KW_CHANGE)||(LA4_21 >= KW_CHECK && LA4_21 <= KW_COLLECTION)||(LA4_21 >= KW_COLUMNS && LA4_21 <= KW_COMMENT)||(LA4_21 >= KW_COMPACT && LA4_21 <= KW_CONCATENATE)||(LA4_21 >= KW_CONTINUE && LA4_21 <= KW_COST)||LA4_21==KW_CRON||LA4_21==KW_DATA||LA4_21==KW_DATABASES||(LA4_21 >= KW_DATETIME && LA4_21 <= KW_DCPROPERTIES)||LA4_21==KW_DEBUG||(LA4_21 >= KW_DEFAULT && LA4_21 <= KW_DEFINED)||(LA4_21 >= KW_DELIMITED && LA4_21 <= KW_DESC)||(LA4_21 >= KW_DETAIL && LA4_21 <= KW_DISABLE)||(LA4_21 >= KW_DISTRIBUTE && LA4_21 <= KW_DO)||LA4_21==KW_DOW||(LA4_21 >= KW_DUMP && LA4_21 <= KW_ELEM_TYPE)||LA4_21==KW_ENABLE||(LA4_21 >= KW_ENFORCED && LA4_21 <= KW_EVERY)||(LA4_21 >= KW_EXCLUSIVE && LA4_21 <= KW_EXECUTED)||(LA4_21 >= KW_EXPIRE_SNAPSHOTS && LA4_21 <= KW_EXPRESSION)||(LA4_21 >= KW_FIELDS && LA4_21 <= KW_FIRST)||(LA4_21 >= KW_FORMAT && LA4_21 <= KW_FORMATTED)||LA4_21==KW_FUNCTIONS||(LA4_21 >= KW_HOUR && LA4_21 <= KW_IDXPROPERTIES)||LA4_21==KW_IGNORE||(LA4_21 >= KW_INDEX && LA4_21 <= KW_INDEXES)||(LA4_21 >= KW_INPATH && LA4_21 <= KW_INPUTFORMAT)||(LA4_21 >= KW_ISOLATION && LA4_21 <= KW_JAR)||(LA4_21 >= KW_JOINCOST && LA4_21 <= KW_LAST)||LA4_21==KW_LEVEL||(LA4_21 >= KW_LIMIT && LA4_21 <= KW_LOAD)||(LA4_21 >= KW_LOCATION && LA4_21 <= KW_LONG)||(LA4_21 >= KW_MANAGED && LA4_21 <= KW_MANAGEMENT)||(LA4_21 >= KW_MAPJOIN && LA4_21 <= KW_MATERIALIZED)||LA4_21==KW_METADATA||(LA4_21 >= KW_MINUTE && LA4_21 <= KW_MONTH)||(LA4_21 >= KW_MOVE && LA4_21 <= KW_MSCK)||(LA4_21 >= KW_NORELY && LA4_21 <= KW_NOSCAN)||LA4_21==KW_NOVALIDATE||LA4_21==KW_NULLS||LA4_21==KW_OFFSET||(LA4_21 >= KW_OPERATOR && LA4_21 <= KW_OPTION)||(LA4_21 >= KW_OUTPUTDRIVER && LA4_21 <= KW_OUTPUTFORMAT)||(LA4_21 >= KW_OVERWRITE && LA4_21 <= KW_OWNER)||(LA4_21 >= KW_PARTITIONED && LA4_21 <= KW_PATH)||(LA4_21 >= KW_PLAN && LA4_21 <= KW_POOL)||LA4_21==KW_PRINCIPALS||LA4_21==KW_PURGE||(LA4_21 >= KW_QUARTER && LA4_21 <= KW_QUERY_PARALLELISM)||LA4_21==KW_READ||(LA4_21 >= KW_REBUILD && LA4_21 <= KW_RECORDWRITER)||(LA4_21 >= KW_RELOAD && LA4_21 <= KW_RESTRICT)||LA4_21==KW_REWRITE||(LA4_21 >= KW_ROLE && LA4_21 <= KW_ROLES)||(LA4_21 >= KW_SCHEDULED && LA4_21 <= KW_SECOND)||(LA4_21 >= KW_SEMI && LA4_21 <= KW_SERVER)||(LA4_21 >= KW_SETS && LA4_21 <= KW_SKEWED)||LA4_21==KW_SNAPSHOT||(LA4_21 >= KW_SORT && LA4_21 <= KW_SSL)||(LA4_21 >= KW_STATISTICS && LA4_21 <= KW_SUMMARY)||(LA4_21 >= KW_SYSTEM_TIME && LA4_21 <= KW_SYSTEM_VERSION)||LA4_21==KW_TABLES||(LA4_21 >= KW_TBLPROPERTIES && LA4_21 <= KW_TERMINATED)||LA4_21==KW_TINYINT||LA4_21==KW_TOUCH||(LA4_21 >= KW_TRANSACTION && LA4_21 <= KW_TRANSACTIONS)||LA4_21==KW_TRIM||(LA4_21 >= KW_TYPE && LA4_21 <= KW_UNARCHIVE)||LA4_21==KW_UNDO||LA4_21==KW_UNIONTYPE||(LA4_21 >= KW_UNKNOWN && LA4_21 <= KW_UNSIGNED)||(LA4_21 >= KW_URI && LA4_21 <= KW_USE)||(LA4_21 >= KW_UTC && LA4_21 <= KW_VALIDATE)||LA4_21==KW_VALUE_TYPE||(LA4_21 >= KW_VECTORIZATION && LA4_21 <= KW_WEEK)||LA4_21==KW_WHILE||(LA4_21 >= KW_WITHIN && LA4_21 <= KW_ZONE)||LA4_21==KW_BATCH||LA4_21==KW_DAYOFWEEK||LA4_21==KW_HOLD_DDLTIME||LA4_21==KW_NO_DROP||LA4_21==KW_OFFLINE||LA4_21==KW_PROTECTION||LA4_21==KW_READONLY||LA4_21==KW_TIMESTAMPTZ) && (synpred1_AlterClauseParser())) {
						alt4=1;
					}
					else if ( (LA4_21==KW_PARTITION) ) {
						alt4=13;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_DROP:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==KW_CONSTRAINT) ) {
					alt4=11;
				}
				else if ( (LA4_2==KW_IF||LA4_2==KW_PARTITION) ) {
					alt4=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_ADD:
				{
				switch ( input.LA(2) ) {
				case KW_IF:
				case KW_PARTITION:
					{
					alt4=3;
					}
					break;
				case KW_CONSTRAINT:
					{
					alt4=12;
					}
					break;
				case KW_COLUMNS:
					{
					alt4=13;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KW_TOUCH:
				{
				alt4=4;
				}
				break;
			case KW_ARCHIVE:
				{
				alt4=5;
				}
				break;
			case KW_UNARCHIVE:
				{
				alt4=6;
				}
				break;
			case KW_SET:
				{
				switch ( input.LA(2) ) {
				case KW_TBLPROPERTIES:
					{
					alt4=7;
					}
					break;
				case KW_FILEFORMAT:
				case KW_LOCATION:
				case KW_SERDE:
				case KW_SERDEPROPERTIES:
				case KW_SKEWED:
					{
					alt4=13;
					}
					break;
				case KW_OWNER:
					{
					alt4=15;
					}
					break;
				case KW_PARTITION:
					{
					alt4=16;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KW_UNSET:
				{
				int LA4_8 = input.LA(2);
				if ( (LA4_8==KW_TBLPROPERTIES) ) {
					alt4=7;
				}
				else if ( (LA4_8==KW_SERDEPROPERTIES) ) {
					alt4=13;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_SKEWED:
				{
				alt4=8;
				}
				break;
			case KW_NOT:
				{
				int LA4_10 = input.LA(2);
				if ( (LA4_10==KW_SKEWED||LA4_10==KW_STORED) ) {
					alt4=8;
				}
				else if ( (LA4_10==KW_CLUSTERED||LA4_10==KW_SORTED) ) {
					alt4=13;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_EXCHANGE:
				{
				alt4=9;
				}
				break;
			case KW_PARTITION:
				{
				int LA4_12 = input.LA(2);
				if ( (LA4_12==KW_COLUMN) ) {
					alt4=10;
				}
				else if ( (LA4_12==LPAREN) ) {
					alt4=14;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_CHANGE:
			case KW_CLUSTERED:
			case KW_COMPACT:
			case KW_CONCATENATE:
			case KW_INTO:
			case KW_REPLACE:
			case KW_UPDATE:
				{
				alt4=13;
				}
				break;
			case KW_EXECUTE:
				{
				alt4=17;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// AlterClauseParser.g:60:7: ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixRename_in_alterTableStatementSuffix202);
					alterStatementSuffixRename21=alterStatementSuffixRename(true);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRename21.getTree());

					}
					break;
				case 2 :
					// AlterClauseParser.g:61:7: alterStatementSuffixDropPartitions[true]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixDropPartitions_in_alterTableStatementSuffix211);
					alterStatementSuffixDropPartitions22=alterStatementSuffixDropPartitions(true);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropPartitions22.getTree());

					}
					break;
				case 3 :
					// AlterClauseParser.g:62:7: alterStatementSuffixAddPartitions[true]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixAddPartitions_in_alterTableStatementSuffix220);
					alterStatementSuffixAddPartitions23=alterStatementSuffixAddPartitions(true);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddPartitions23.getTree());

					}
					break;
				case 4 :
					// AlterClauseParser.g:63:7: alterStatementSuffixTouch
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixTouch_in_alterTableStatementSuffix229);
					alterStatementSuffixTouch24=alterStatementSuffixTouch();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixTouch24.getTree());

					}
					break;
				case 5 :
					// AlterClauseParser.g:64:7: alterStatementSuffixArchive
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixArchive_in_alterTableStatementSuffix237);
					alterStatementSuffixArchive25=alterStatementSuffixArchive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixArchive25.getTree());

					}
					break;
				case 6 :
					// AlterClauseParser.g:65:7: alterStatementSuffixUnArchive
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixUnArchive_in_alterTableStatementSuffix245);
					alterStatementSuffixUnArchive26=alterStatementSuffixUnArchive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUnArchive26.getTree());

					}
					break;
				case 7 :
					// AlterClauseParser.g:66:7: alterStatementSuffixProperties
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixProperties_in_alterTableStatementSuffix253);
					alterStatementSuffixProperties27=alterStatementSuffixProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixProperties27.getTree());

					}
					break;
				case 8 :
					// AlterClauseParser.g:67:7: alterStatementSuffixSkewedby
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixSkewedby_in_alterTableStatementSuffix261);
					alterStatementSuffixSkewedby28=alterStatementSuffixSkewedby();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSkewedby28.getTree());

					}
					break;
				case 9 :
					// AlterClauseParser.g:68:7: alterStatementSuffixExchangePartition
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixExchangePartition_in_alterTableStatementSuffix269);
					alterStatementSuffixExchangePartition29=alterStatementSuffixExchangePartition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixExchangePartition29.getTree());

					}
					break;
				case 10 :
					// AlterClauseParser.g:69:7: alterStatementPartitionKeyType
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementPartitionKeyType_in_alterTableStatementSuffix277);
					alterStatementPartitionKeyType30=alterStatementPartitionKeyType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementPartitionKeyType30.getTree());

					}
					break;
				case 11 :
					// AlterClauseParser.g:70:7: alterStatementSuffixDropConstraint
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixDropConstraint_in_alterTableStatementSuffix285);
					alterStatementSuffixDropConstraint31=alterStatementSuffixDropConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropConstraint31.getTree());

					}
					break;
				case 12 :
					// AlterClauseParser.g:71:7: alterStatementSuffixAddConstraint
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixAddConstraint_in_alterTableStatementSuffix293);
					alterStatementSuffixAddConstraint32=alterStatementSuffixAddConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddConstraint32.getTree());

					}
					break;
				case 13 :
					// AlterClauseParser.g:72:7: alterTblPartitionStatementSuffix[false]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix301);
					alterTblPartitionStatementSuffix33=alterTblPartitionStatementSuffix(false);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterTblPartitionStatementSuffix33.getTree());

					}
					break;
				case 14 :
					// AlterClauseParser.g:73:7: partitionSpec alterTblPartitionStatementSuffix[true]
					{
					pushFollow(FOLLOW_partitionSpec_in_alterTableStatementSuffix310);
					partitionSpec34=gHiveParser.partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec34.getTree());
					pushFollow(FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix312);
					alterTblPartitionStatementSuffix35=alterTblPartitionStatementSuffix(true);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterTblPartitionStatementSuffix.add(alterTblPartitionStatementSuffix35.getTree());
					// AST REWRITE
					// elements: alterTblPartitionStatementSuffix, partitionSpec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 73:60: -> alterTblPartitionStatementSuffix partitionSpec
					{
						adaptor.addChild(root_0, stream_alterTblPartitionStatementSuffix.nextTree());
						adaptor.addChild(root_0, stream_partitionSpec.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 15 :
					// AlterClauseParser.g:74:7: alterStatementSuffixSetOwner
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixSetOwner_in_alterTableStatementSuffix327);
					alterStatementSuffixSetOwner36=alterStatementSuffixSetOwner();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSetOwner36.getTree());

					}
					break;
				case 16 :
					// AlterClauseParser.g:75:7: alterStatementSuffixSetPartSpec
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixSetPartSpec_in_alterTableStatementSuffix335);
					alterStatementSuffixSetPartSpec37=alterStatementSuffixSetPartSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSetPartSpec37.getTree());

					}
					break;
				case 17 :
					// AlterClauseParser.g:76:7: alterStatementSuffixExecute
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixExecute_in_alterTableStatementSuffix343);
					alterStatementSuffixExecute38=alterStatementSuffixExecute();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixExecute38.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterTableStatementSuffix"


	public static class alterTblPartitionStatementSuffix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterTblPartitionStatementSuffix"
	// AlterClauseParser.g:79:1: alterTblPartitionStatementSuffix[boolean partition] : ( alterStatementSuffixFileFormat[partition] | alterStatementSuffixLocation[partition] | alterStatementSuffixMergeFiles[partition] | alterStatementSuffixSerdeProperties[partition] | alterStatementSuffixRenamePart | alterStatementSuffixBucketNum[partition] | alterTblPartitionStatementSuffixSkewedLocation | alterStatementSuffixClusterbySortby | alterStatementSuffixCompact | alterStatementSuffixUpdateStatsCol[partition] | alterStatementSuffixUpdateStats[partition] | alterStatementSuffixRenameCol | alterStatementSuffixAddCol | alterStatementSuffixUpdateColumns );
	public final HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return alterTblPartitionStatementSuffix(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope alterStatementSuffixFileFormat39 =null;
		ParserRuleReturnScope alterStatementSuffixLocation40 =null;
		ParserRuleReturnScope alterStatementSuffixMergeFiles41 =null;
		ParserRuleReturnScope alterStatementSuffixSerdeProperties42 =null;
		ParserRuleReturnScope alterStatementSuffixRenamePart43 =null;
		ParserRuleReturnScope alterStatementSuffixBucketNum44 =null;
		ParserRuleReturnScope alterTblPartitionStatementSuffixSkewedLocation45 =null;
		ParserRuleReturnScope alterStatementSuffixClusterbySortby46 =null;
		ParserRuleReturnScope alterStatementSuffixCompact47 =null;
		ParserRuleReturnScope alterStatementSuffixUpdateStatsCol48 =null;
		ParserRuleReturnScope alterStatementSuffixUpdateStats49 =null;
		ParserRuleReturnScope alterStatementSuffixRenameCol50 =null;
		ParserRuleReturnScope alterStatementSuffixAddCol51 =null;
		ParserRuleReturnScope alterStatementSuffixUpdateColumns52 =null;


		gParent.pushMsg("alter table partition statement suffix", state);
		try {
			// AlterClauseParser.g:82:3: ( alterStatementSuffixFileFormat[partition] | alterStatementSuffixLocation[partition] | alterStatementSuffixMergeFiles[partition] | alterStatementSuffixSerdeProperties[partition] | alterStatementSuffixRenamePart | alterStatementSuffixBucketNum[partition] | alterTblPartitionStatementSuffixSkewedLocation | alterStatementSuffixClusterbySortby | alterStatementSuffixCompact | alterStatementSuffixUpdateStatsCol[partition] | alterStatementSuffixUpdateStats[partition] | alterStatementSuffixRenameCol | alterStatementSuffixAddCol | alterStatementSuffixUpdateColumns )
			int alt5=14;
			switch ( input.LA(1) ) {
			case KW_SET:
				{
				switch ( input.LA(2) ) {
				case KW_FILEFORMAT:
					{
					alt5=1;
					}
					break;
				case KW_LOCATION:
					{
					alt5=2;
					}
					break;
				case KW_SERDE:
				case KW_SERDEPROPERTIES:
					{
					alt5=4;
					}
					break;
				case KW_SKEWED:
					{
					alt5=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KW_CONCATENATE:
				{
				alt5=3;
				}
				break;
			case KW_UNSET:
				{
				alt5=4;
				}
				break;
			case KW_RENAME:
				{
				alt5=5;
				}
				break;
			case KW_INTO:
				{
				alt5=6;
				}
				break;
			case KW_CLUSTERED:
			case KW_NOT:
				{
				alt5=8;
				}
				break;
			case KW_COMPACT:
				{
				alt5=9;
				}
				break;
			case KW_UPDATE:
				{
				int LA5_9 = input.LA(2);
				if ( (LA5_9==KW_STATISTICS) ) {
					int LA5_18 = input.LA(3);
					if ( (LA5_18==KW_FOR) ) {
						alt5=10;
					}
					else if ( (LA5_18==KW_SET) ) {
						alt5=11;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA5_9==KW_COLUMNS) ) {
					alt5=14;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_CHANGE:
				{
				alt5=12;
				}
				break;
			case KW_ADD:
			case KW_REPLACE:
				{
				alt5=13;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// AlterClauseParser.g:82:5: alterStatementSuffixFileFormat[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixFileFormat_in_alterTblPartitionStatementSuffix369);
					alterStatementSuffixFileFormat39=alterStatementSuffixFileFormat(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixFileFormat39.getTree());

					}
					break;
				case 2 :
					// AlterClauseParser.g:83:5: alterStatementSuffixLocation[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixLocation_in_alterTblPartitionStatementSuffix376);
					alterStatementSuffixLocation40=alterStatementSuffixLocation(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixLocation40.getTree());

					}
					break;
				case 3 :
					// AlterClauseParser.g:84:5: alterStatementSuffixMergeFiles[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixMergeFiles_in_alterTblPartitionStatementSuffix383);
					alterStatementSuffixMergeFiles41=alterStatementSuffixMergeFiles(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixMergeFiles41.getTree());

					}
					break;
				case 4 :
					// AlterClauseParser.g:85:5: alterStatementSuffixSerdeProperties[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixSerdeProperties_in_alterTblPartitionStatementSuffix390);
					alterStatementSuffixSerdeProperties42=alterStatementSuffixSerdeProperties(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSerdeProperties42.getTree());

					}
					break;
				case 5 :
					// AlterClauseParser.g:86:5: alterStatementSuffixRenamePart
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixRenamePart_in_alterTblPartitionStatementSuffix397);
					alterStatementSuffixRenamePart43=alterStatementSuffixRenamePart();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRenamePart43.getTree());

					}
					break;
				case 6 :
					// AlterClauseParser.g:87:5: alterStatementSuffixBucketNum[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixBucketNum_in_alterTblPartitionStatementSuffix403);
					alterStatementSuffixBucketNum44=alterStatementSuffixBucketNum(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixBucketNum44.getTree());

					}
					break;
				case 7 :
					// AlterClauseParser.g:88:5: alterTblPartitionStatementSuffixSkewedLocation
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterTblPartitionStatementSuffixSkewedLocation_in_alterTblPartitionStatementSuffix410);
					alterTblPartitionStatementSuffixSkewedLocation45=alterTblPartitionStatementSuffixSkewedLocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterTblPartitionStatementSuffixSkewedLocation45.getTree());

					}
					break;
				case 8 :
					// AlterClauseParser.g:89:5: alterStatementSuffixClusterbySortby
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixClusterbySortby_in_alterTblPartitionStatementSuffix416);
					alterStatementSuffixClusterbySortby46=alterStatementSuffixClusterbySortby();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixClusterbySortby46.getTree());

					}
					break;
				case 9 :
					// AlterClauseParser.g:90:5: alterStatementSuffixCompact
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixCompact_in_alterTblPartitionStatementSuffix422);
					alterStatementSuffixCompact47=alterStatementSuffixCompact();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixCompact47.getTree());

					}
					break;
				case 10 :
					// AlterClauseParser.g:91:5: alterStatementSuffixUpdateStatsCol[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixUpdateStatsCol_in_alterTblPartitionStatementSuffix428);
					alterStatementSuffixUpdateStatsCol48=alterStatementSuffixUpdateStatsCol(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUpdateStatsCol48.getTree());

					}
					break;
				case 11 :
					// AlterClauseParser.g:92:5: alterStatementSuffixUpdateStats[partition]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixUpdateStats_in_alterTblPartitionStatementSuffix435);
					alterStatementSuffixUpdateStats49=alterStatementSuffixUpdateStats(partition);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUpdateStats49.getTree());

					}
					break;
				case 12 :
					// AlterClauseParser.g:93:5: alterStatementSuffixRenameCol
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixRenameCol_in_alterTblPartitionStatementSuffix442);
					alterStatementSuffixRenameCol50=alterStatementSuffixRenameCol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRenameCol50.getTree());

					}
					break;
				case 13 :
					// AlterClauseParser.g:94:5: alterStatementSuffixAddCol
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixAddCol_in_alterTblPartitionStatementSuffix448);
					alterStatementSuffixAddCol51=alterStatementSuffixAddCol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddCol51.getTree());

					}
					break;
				case 14 :
					// AlterClauseParser.g:95:5: alterStatementSuffixUpdateColumns
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixUpdateColumns_in_alterTblPartitionStatementSuffix454);
					alterStatementSuffixUpdateColumns52=alterStatementSuffixUpdateColumns();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUpdateColumns52.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterTblPartitionStatementSuffix"


	public static class alterStatementPartitionKeyType_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementPartitionKeyType"
	// AlterClauseParser.g:98:1: alterStatementPartitionKeyType : KW_PARTITION KW_COLUMN LPAREN columnNameType RPAREN -> ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType ) ;
	public final HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return alterStatementPartitionKeyType() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return retval = new HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_PARTITION53=null;
		Token KW_COLUMN54=null;
		Token LPAREN55=null;
		Token RPAREN57=null;
		ParserRuleReturnScope columnNameType56 =null;

		ASTNode KW_PARTITION53_tree=null;
		ASTNode KW_COLUMN54_tree=null;
		ASTNode LPAREN55_tree=null;
		ASTNode RPAREN57_tree=null;
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
		RewriteRuleSubtreeStream stream_columnNameType=new RewriteRuleSubtreeStream(adaptor,"rule columnNameType");

		gParent.msgs.push("alter partition key type"); 
		try {
			// AlterClauseParser.g:101:2: ( KW_PARTITION KW_COLUMN LPAREN columnNameType RPAREN -> ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType ) )
			// AlterClauseParser.g:101:4: KW_PARTITION KW_COLUMN LPAREN columnNameType RPAREN
			{
			KW_PARTITION53=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementPartitionKeyType476); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION53);

			KW_COLUMN54=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementPartitionKeyType478); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN54);

			LPAREN55=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementPartitionKeyType480); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN55);

			pushFollow(FOLLOW_columnNameType_in_alterStatementPartitionKeyType482);
			columnNameType56=gHiveParser.columnNameType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_columnNameType.add(columnNameType56.getTree());
			RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementPartitionKeyType484); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN57);

			// AST REWRITE
			// elements: columnNameType
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 102:2: -> ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType )
			{
				// AlterClauseParser.g:102:5: ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_PARTCOLTYPE, "TOK_ALTERTABLE_PARTCOLTYPE"), root_1);
				adaptor.addChild(root_1, stream_columnNameType.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.msgs.pop();}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementPartitionKeyType"


	public static class alterViewStatementSuffix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterViewStatementSuffix"
	// AlterClauseParser.g:105:1: alterViewStatementSuffix : ( alterViewSuffixProperties | alterStatementSuffixRename[false] | alterStatementSuffixAddPartitions[false] | alterStatementSuffixDropPartitions[false] | selectStatementWithCTE -> ^( TOK_ALTERVIEW_AS selectStatementWithCTE ) );
	public final HiveParser_AlterClauseParser.alterViewStatementSuffix_return alterViewStatementSuffix() throws RecognitionException {
		HiveParser_AlterClauseParser.alterViewStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterViewStatementSuffix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope alterViewSuffixProperties58 =null;
		ParserRuleReturnScope alterStatementSuffixRename59 =null;
		ParserRuleReturnScope alterStatementSuffixAddPartitions60 =null;
		ParserRuleReturnScope alterStatementSuffixDropPartitions61 =null;
		ParserRuleReturnScope selectStatementWithCTE62 =null;

		RewriteRuleSubtreeStream stream_selectStatementWithCTE=new RewriteRuleSubtreeStream(adaptor,"rule selectStatementWithCTE");

		 gParent.pushMsg("alter view statement", state); 
		try {
			// AlterClauseParser.g:108:5: ( alterViewSuffixProperties | alterStatementSuffixRename[false] | alterStatementSuffixAddPartitions[false] | alterStatementSuffixDropPartitions[false] | selectStatementWithCTE -> ^( TOK_ALTERVIEW_AS selectStatementWithCTE ) )
			int alt6=5;
			switch ( input.LA(1) ) {
			case KW_SET:
			case KW_UNSET:
				{
				alt6=1;
				}
				break;
			case KW_RENAME:
				{
				alt6=2;
				}
				break;
			case KW_ADD:
				{
				alt6=3;
				}
				break;
			case KW_DROP:
				{
				alt6=4;
				}
				break;
			case KW_MAP:
			case KW_REDUCE:
			case KW_SELECT:
			case KW_VALUES:
			case KW_WITH:
			case LPAREN:
				{
				alt6=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// AlterClauseParser.g:108:7: alterViewSuffixProperties
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterViewSuffixProperties_in_alterViewStatementSuffix517);
					alterViewSuffixProperties58=alterViewSuffixProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterViewSuffixProperties58.getTree());

					}
					break;
				case 2 :
					// AlterClauseParser.g:109:7: alterStatementSuffixRename[false]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixRename_in_alterViewStatementSuffix525);
					alterStatementSuffixRename59=alterStatementSuffixRename(false);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRename59.getTree());

					}
					break;
				case 3 :
					// AlterClauseParser.g:110:7: alterStatementSuffixAddPartitions[false]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixAddPartitions_in_alterViewStatementSuffix534);
					alterStatementSuffixAddPartitions60=alterStatementSuffixAddPartitions(false);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddPartitions60.getTree());

					}
					break;
				case 4 :
					// AlterClauseParser.g:111:7: alterStatementSuffixDropPartitions[false]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterStatementSuffixDropPartitions_in_alterViewStatementSuffix543);
					alterStatementSuffixDropPartitions61=alterStatementSuffixDropPartitions(false);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropPartitions61.getTree());

					}
					break;
				case 5 :
					// AlterClauseParser.g:112:7: selectStatementWithCTE
					{
					pushFollow(FOLLOW_selectStatementWithCTE_in_alterViewStatementSuffix552);
					selectStatementWithCTE62=gHiveParser.selectStatementWithCTE();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectStatementWithCTE.add(selectStatementWithCTE62.getTree());
					// AST REWRITE
					// elements: selectStatementWithCTE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 112:30: -> ^( TOK_ALTERVIEW_AS selectStatementWithCTE )
					{
						// AlterClauseParser.g:112:33: ^( TOK_ALTERVIEW_AS selectStatementWithCTE )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW_AS, "TOK_ALTERVIEW_AS"), root_1);
						adaptor.addChild(root_1, stream_selectStatementWithCTE.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterViewStatementSuffix"


	public static class alterMaterializedViewStatementSuffix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterMaterializedViewStatementSuffix"
	// AlterClauseParser.g:115:1: alterMaterializedViewStatementSuffix[CommonTree tableNameTree] : ( alterMaterializedViewSuffixRewrite[tableNameTree] | alterMaterializedViewSuffixRebuild[tableNameTree] );
	public final HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return alterMaterializedViewStatementSuffix(CommonTree tableNameTree) throws RecognitionException {
		HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope alterMaterializedViewSuffixRewrite63 =null;
		ParserRuleReturnScope alterMaterializedViewSuffixRebuild64 =null;


		 gParent.pushMsg("alter materialized view statement", state); 
		try {
			// AlterClauseParser.g:118:5: ( alterMaterializedViewSuffixRewrite[tableNameTree] | alterMaterializedViewSuffixRebuild[tableNameTree] )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==KW_DISABLE||LA7_0==KW_ENABLE) ) {
				alt7=1;
			}
			else if ( (LA7_0==KW_REBUILD) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// AlterClauseParser.g:118:7: alterMaterializedViewSuffixRewrite[tableNameTree]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterMaterializedViewSuffixRewrite_in_alterMaterializedViewStatementSuffix588);
					alterMaterializedViewSuffixRewrite63=alterMaterializedViewSuffixRewrite(tableNameTree);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterMaterializedViewSuffixRewrite63.getTree());

					}
					break;
				case 2 :
					// AlterClauseParser.g:119:7: alterMaterializedViewSuffixRebuild[tableNameTree]
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterMaterializedViewSuffixRebuild_in_alterMaterializedViewStatementSuffix597);
					alterMaterializedViewSuffixRebuild64=alterMaterializedViewSuffixRebuild(tableNameTree);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterMaterializedViewSuffixRebuild64.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterMaterializedViewStatementSuffix"


	public static class alterMaterializedViewSuffixRewrite_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterMaterializedViewSuffixRewrite"
	// AlterClauseParser.g:122:1: alterMaterializedViewSuffixRewrite[CommonTree tableNameTree] : (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled ) -> ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag) ;
	public final HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return alterMaterializedViewSuffixRewrite(CommonTree tableNameTree) throws RecognitionException {
		HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return retval = new HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope mvRewriteFlag =null;

		RewriteRuleSubtreeStream stream_rewriteEnabled=new RewriteRuleSubtreeStream(adaptor,"rule rewriteEnabled");
		RewriteRuleSubtreeStream stream_rewriteDisabled=new RewriteRuleSubtreeStream(adaptor,"rule rewriteDisabled");

		 gParent.pushMsg("alter materialized view rewrite statement", state); 
		try {
			// AlterClauseParser.g:125:5: ( (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled ) -> ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag) )
			// AlterClauseParser.g:125:7: (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled )
			{
			// AlterClauseParser.g:125:7: (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==KW_ENABLE) ) {
				alt8=1;
			}
			else if ( (LA8_0==KW_DISABLE) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// AlterClauseParser.g:125:8: mvRewriteFlag= rewriteEnabled
					{
					pushFollow(FOLLOW_rewriteEnabled_in_alterMaterializedViewSuffixRewrite629);
					mvRewriteFlag=gHiveParser.rewriteEnabled();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewriteEnabled.add(mvRewriteFlag.getTree());
					}
					break;
				case 2 :
					// AlterClauseParser.g:125:39: mvRewriteFlag= rewriteDisabled
					{
					pushFollow(FOLLOW_rewriteDisabled_in_alterMaterializedViewSuffixRewrite635);
					mvRewriteFlag=gHiveParser.rewriteDisabled();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewriteDisabled.add(mvRewriteFlag.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: mvRewriteFlag
			// token labels: 
			// rule labels: mvRewriteFlag, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_mvRewriteFlag=new RewriteRuleSubtreeStream(adaptor,"rule mvRewriteFlag",mvRewriteFlag!=null?mvRewriteFlag.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 126:5: -> ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag)
			{
				// AlterClauseParser.g:126:8: ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_MATERIALIZED_VIEW_REWRITE, "TOK_ALTER_MATERIALIZED_VIEW_REWRITE"), root_1);
				adaptor.addChild(root_1, tableNameTree);
				adaptor.addChild(root_1, stream_mvRewriteFlag.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterMaterializedViewSuffixRewrite"


	public static class alterMaterializedViewSuffixRebuild_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterMaterializedViewSuffixRebuild"
	// AlterClauseParser.g:129:1: alterMaterializedViewSuffixRebuild[CommonTree tableNameTree] : KW_REBUILD -> ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD ) ;
	public final HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return alterMaterializedViewSuffixRebuild(CommonTree tableNameTree) throws RecognitionException {
		HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return retval = new HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_REBUILD65=null;

		ASTNode KW_REBUILD65_tree=null;
		RewriteRuleTokenStream stream_KW_REBUILD=new RewriteRuleTokenStream(adaptor,"token KW_REBUILD");

		 gParent.pushMsg("alter materialized view rebuild statement", state); 
		try {
			// AlterClauseParser.g:132:5: ( KW_REBUILD -> ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD ) )
			// AlterClauseParser.g:132:7: KW_REBUILD
			{
			KW_REBUILD65=(Token)match(input,KW_REBUILD,FOLLOW_KW_REBUILD_in_alterMaterializedViewSuffixRebuild679); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_REBUILD.add(KW_REBUILD65);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 132:18: -> ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD )
			{
				// AlterClauseParser.g:132:21: ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_MATERIALIZED_VIEW_REBUILD, "TOK_ALTER_MATERIALIZED_VIEW_REBUILD"), root_1);
				adaptor.addChild(root_1, tableNameTree);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterMaterializedViewSuffixRebuild"


	public static class alterDatabaseStatementSuffix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDatabaseStatementSuffix"
	// AlterClauseParser.g:135:1: alterDatabaseStatementSuffix : ( alterDatabaseSuffixProperties | alterDatabaseSuffixSetOwner | alterDatabaseSuffixSetLocation );
	public final HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return alterDatabaseStatementSuffix() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope alterDatabaseSuffixProperties66 =null;
		ParserRuleReturnScope alterDatabaseSuffixSetOwner67 =null;
		ParserRuleReturnScope alterDatabaseSuffixSetLocation68 =null;


		 gParent.pushMsg("alter database statement", state); 
		try {
			// AlterClauseParser.g:138:5: ( alterDatabaseSuffixProperties | alterDatabaseSuffixSetOwner | alterDatabaseSuffixSetLocation )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Identifier) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==KW_SET) ) {
					switch ( input.LA(3) ) {
					case KW_DBPROPERTIES:
						{
						alt9=1;
						}
						break;
					case KW_OWNER:
						{
						alt9=2;
						}
						break;
					case KW_LOCATION:
					case KW_MANAGEDLOCATION:
						{
						alt9=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA9_0 >= KW_ABORT && LA9_0 <= KW_AFTER)||LA9_0==KW_ALLOC_FRACTION||LA9_0==KW_ANALYZE||LA9_0==KW_ARCHIVE||(LA9_0 >= KW_ASC && LA9_0 <= KW_AT)||(LA9_0 >= KW_AUTOCOMMIT && LA9_0 <= KW_BEFORE)||(LA9_0 >= KW_BUCKET && LA9_0 <= KW_BUCKETS)||(LA9_0 >= KW_CACHE && LA9_0 <= KW_CASCADE)||(LA9_0 >= KW_CBO && LA9_0 <= KW_CHANGE)||(LA9_0 >= KW_CHECK && LA9_0 <= KW_COLLECTION)||(LA9_0 >= KW_COLUMNS && LA9_0 <= KW_COMMENT)||(LA9_0 >= KW_COMPACT && LA9_0 <= KW_CONCATENATE)||(LA9_0 >= KW_CONTINUE && LA9_0 <= KW_COST)||LA9_0==KW_CRON||LA9_0==KW_DATA||LA9_0==KW_DATABASES||(LA9_0 >= KW_DATETIME && LA9_0 <= KW_DCPROPERTIES)||LA9_0==KW_DEBUG||(LA9_0 >= KW_DEFAULT && LA9_0 <= KW_DEFINED)||(LA9_0 >= KW_DELIMITED && LA9_0 <= KW_DESC)||(LA9_0 >= KW_DETAIL && LA9_0 <= KW_DISABLE)||(LA9_0 >= KW_DISTRIBUTE && LA9_0 <= KW_DO)||LA9_0==KW_DOW||(LA9_0 >= KW_DUMP && LA9_0 <= KW_ELEM_TYPE)||LA9_0==KW_ENABLE||(LA9_0 >= KW_ENFORCED && LA9_0 <= KW_EVERY)||(LA9_0 >= KW_EXCLUSIVE && LA9_0 <= KW_EXECUTED)||(LA9_0 >= KW_EXPIRE_SNAPSHOTS && LA9_0 <= KW_EXPRESSION)||(LA9_0 >= KW_FIELDS && LA9_0 <= KW_FIRST)||(LA9_0 >= KW_FORMAT && LA9_0 <= KW_FORMATTED)||LA9_0==KW_FUNCTIONS||(LA9_0 >= KW_HOUR && LA9_0 <= KW_IDXPROPERTIES)||LA9_0==KW_IGNORE||(LA9_0 >= KW_INDEX && LA9_0 <= KW_INDEXES)||(LA9_0 >= KW_INPATH && LA9_0 <= KW_INPUTFORMAT)||(LA9_0 >= KW_ISOLATION && LA9_0 <= KW_JAR)||(LA9_0 >= KW_JOINCOST && LA9_0 <= KW_LAST)||LA9_0==KW_LEVEL||(LA9_0 >= KW_LIMIT && LA9_0 <= KW_LOAD)||(LA9_0 >= KW_LOCATION && LA9_0 <= KW_LONG)||(LA9_0 >= KW_MANAGED && LA9_0 <= KW_MANAGEMENT)||(LA9_0 >= KW_MAPJOIN && LA9_0 <= KW_MATERIALIZED)||LA9_0==KW_METADATA||(LA9_0 >= KW_MINUTE && LA9_0 <= KW_MONTH)||(LA9_0 >= KW_MOVE && LA9_0 <= KW_MSCK)||(LA9_0 >= KW_NORELY && LA9_0 <= KW_NOSCAN)||LA9_0==KW_NOVALIDATE||LA9_0==KW_NULLS||LA9_0==KW_OFFSET||(LA9_0 >= KW_OPERATOR && LA9_0 <= KW_OPTION)||(LA9_0 >= KW_OUTPUTDRIVER && LA9_0 <= KW_OUTPUTFORMAT)||(LA9_0 >= KW_OVERWRITE && LA9_0 <= KW_OWNER)||(LA9_0 >= KW_PARTITIONED && LA9_0 <= KW_PATH)||(LA9_0 >= KW_PLAN && LA9_0 <= KW_POOL)||LA9_0==KW_PRINCIPALS||LA9_0==KW_PURGE||(LA9_0 >= KW_QUARTER && LA9_0 <= KW_QUERY_PARALLELISM)||LA9_0==KW_READ||(LA9_0 >= KW_REBUILD && LA9_0 <= KW_RECORDWRITER)||(LA9_0 >= KW_RELOAD && LA9_0 <= KW_RESTRICT)||LA9_0==KW_REWRITE||(LA9_0 >= KW_ROLE && LA9_0 <= KW_ROLES)||(LA9_0 >= KW_SCHEDULED && LA9_0 <= KW_SECOND)||(LA9_0 >= KW_SEMI && LA9_0 <= KW_SERVER)||(LA9_0 >= KW_SETS && LA9_0 <= KW_SKEWED)||LA9_0==KW_SNAPSHOT||(LA9_0 >= KW_SORT && LA9_0 <= KW_SSL)||(LA9_0 >= KW_STATISTICS && LA9_0 <= KW_SUMMARY)||(LA9_0 >= KW_SYSTEM_TIME && LA9_0 <= KW_SYSTEM_VERSION)||LA9_0==KW_TABLES||(LA9_0 >= KW_TBLPROPERTIES && LA9_0 <= KW_TERMINATED)||LA9_0==KW_TINYINT||LA9_0==KW_TOUCH||(LA9_0 >= KW_TRANSACTION && LA9_0 <= KW_TRANSACTIONS)||LA9_0==KW_TRIM||(LA9_0 >= KW_TYPE && LA9_0 <= KW_UNARCHIVE)||LA9_0==KW_UNDO||LA9_0==KW_UNIONTYPE||(LA9_0 >= KW_UNKNOWN && LA9_0 <= KW_UNSIGNED)||(LA9_0 >= KW_URI && LA9_0 <= KW_USE)||(LA9_0 >= KW_UTC && LA9_0 <= KW_VALIDATE)||LA9_0==KW_VALUE_TYPE||(LA9_0 >= KW_VECTORIZATION && LA9_0 <= KW_WEEK)||LA9_0==KW_WHILE||(LA9_0 >= KW_WITHIN && LA9_0 <= KW_ZONE)||LA9_0==KW_BATCH||LA9_0==KW_DAYOFWEEK||LA9_0==KW_HOLD_DDLTIME||LA9_0==KW_NO_DROP||LA9_0==KW_OFFLINE||LA9_0==KW_PROTECTION||LA9_0==KW_READONLY||LA9_0==KW_TIMESTAMPTZ) ) {
				int LA9_2 = input.LA(2);
				if ( (LA9_2==KW_SET) ) {
					switch ( input.LA(3) ) {
					case KW_DBPROPERTIES:
						{
						alt9=1;
						}
						break;
					case KW_OWNER:
						{
						alt9=2;
						}
						break;
					case KW_LOCATION:
					case KW_MANAGEDLOCATION:
						{
						alt9=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// AlterClauseParser.g:138:7: alterDatabaseSuffixProperties
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterDatabaseSuffixProperties_in_alterDatabaseStatementSuffix714);
					alterDatabaseSuffixProperties66=alterDatabaseSuffixProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDatabaseSuffixProperties66.getTree());

					}
					break;
				case 2 :
					// AlterClauseParser.g:139:7: alterDatabaseSuffixSetOwner
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterDatabaseSuffixSetOwner_in_alterDatabaseStatementSuffix722);
					alterDatabaseSuffixSetOwner67=alterDatabaseSuffixSetOwner();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDatabaseSuffixSetOwner67.getTree());

					}
					break;
				case 3 :
					// AlterClauseParser.g:140:7: alterDatabaseSuffixSetLocation
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterDatabaseSuffixSetLocation_in_alterDatabaseStatementSuffix730);
					alterDatabaseSuffixSetLocation68=alterDatabaseSuffixSetLocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDatabaseSuffixSetLocation68.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDatabaseStatementSuffix"


	public static class alterDatabaseSuffixProperties_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDatabaseSuffixProperties"
	// AlterClauseParser.g:143:1: alterDatabaseSuffixProperties : name= identifier KW_SET KW_DBPROPERTIES dbProperties -> ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties ) ;
	public final HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return alterDatabaseSuffixProperties() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET69=null;
		Token KW_DBPROPERTIES70=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope dbProperties71 =null;

		ASTNode KW_SET69_tree=null;
		ASTNode KW_DBPROPERTIES70_tree=null;
		RewriteRuleTokenStream stream_KW_DBPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_DBPROPERTIES");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_dbProperties=new RewriteRuleSubtreeStream(adaptor,"rule dbProperties");

		 gParent.pushMsg("alter database properties statement", state); 
		try {
			// AlterClauseParser.g:146:5: (name= identifier KW_SET KW_DBPROPERTIES dbProperties -> ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties ) )
			// AlterClauseParser.g:146:7: name= identifier KW_SET KW_DBPROPERTIES dbProperties
			{
			pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixProperties759);
			name=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(name.getTree());
			KW_SET69=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixProperties761); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET69);

			KW_DBPROPERTIES70=(Token)match(input,KW_DBPROPERTIES,FOLLOW_KW_DBPROPERTIES_in_alterDatabaseSuffixProperties763); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DBPROPERTIES.add(KW_DBPROPERTIES70);

			pushFollow(FOLLOW_dbProperties_in_alterDatabaseSuffixProperties765);
			dbProperties71=gHiveParser.dbProperties();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dbProperties.add(dbProperties71.getTree());
			// AST REWRITE
			// elements: dbProperties, name
			// token labels: 
			// rule labels: name, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 147:5: -> ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties )
			{
				// AlterClauseParser.g:147:8: ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATABASE_PROPERTIES, "TOK_ALTERDATABASE_PROPERTIES"), root_1);
				adaptor.addChild(root_1, stream_name.nextTree());
				adaptor.addChild(root_1, stream_dbProperties.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDatabaseSuffixProperties"


	public static class alterDatabaseSuffixSetOwner_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDatabaseSuffixSetOwner"
	// AlterClauseParser.g:150:1: alterDatabaseSuffixSetOwner : dbName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATABASE_OWNER $dbName principalName ) ;
	public final HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return alterDatabaseSuffixSetOwner() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET72=null;
		Token KW_OWNER73=null;
		ParserRuleReturnScope dbName =null;
		ParserRuleReturnScope principalName74 =null;

		ASTNode KW_SET72_tree=null;
		ASTNode KW_OWNER73_tree=null;
		RewriteRuleTokenStream stream_KW_OWNER=new RewriteRuleTokenStream(adaptor,"token KW_OWNER");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_principalName=new RewriteRuleSubtreeStream(adaptor,"rule principalName");

		 gParent.pushMsg("alter database set owner", state); 
		try {
			// AlterClauseParser.g:153:5: (dbName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATABASE_OWNER $dbName principalName ) )
			// AlterClauseParser.g:153:7: dbName= identifier KW_SET KW_OWNER principalName
			{
			pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetOwner809);
			dbName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());
			KW_SET72=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetOwner811); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET72);

			KW_OWNER73=(Token)match(input,KW_OWNER,FOLLOW_KW_OWNER_in_alterDatabaseSuffixSetOwner813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OWNER.add(KW_OWNER73);

			pushFollow(FOLLOW_principalName_in_alterDatabaseSuffixSetOwner815);
			principalName74=gHiveParser.principalName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_principalName.add(principalName74.getTree());
			// AST REWRITE
			// elements: principalName, dbName
			// token labels: 
			// rule labels: dbName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 154:5: -> ^( TOK_ALTERDATABASE_OWNER $dbName principalName )
			{
				// AlterClauseParser.g:154:8: ^( TOK_ALTERDATABASE_OWNER $dbName principalName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATABASE_OWNER, "TOK_ALTERDATABASE_OWNER"), root_1);
				adaptor.addChild(root_1, stream_dbName.nextTree());
				adaptor.addChild(root_1, stream_principalName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDatabaseSuffixSetOwner"


	public static class alterDatabaseSuffixSetLocation_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDatabaseSuffixSetLocation"
	// AlterClauseParser.g:157:1: alterDatabaseSuffixSetLocation : (dbName= identifier KW_SET KW_LOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation) |dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) );
	public final HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return alterDatabaseSuffixSetLocation() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token newLocation=null;
		Token KW_SET75=null;
		Token KW_LOCATION76=null;
		Token KW_SET77=null;
		Token KW_MANAGEDLOCATION78=null;
		ParserRuleReturnScope dbName =null;

		ASTNode newLocation_tree=null;
		ASTNode KW_SET75_tree=null;
		ASTNode KW_LOCATION76_tree=null;
		ASTNode KW_SET77_tree=null;
		ASTNode KW_MANAGEDLOCATION78_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");
		RewriteRuleTokenStream stream_KW_MANAGEDLOCATION=new RewriteRuleTokenStream(adaptor,"token KW_MANAGEDLOCATION");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("alter database set location", state); 
		try {
			// AlterClauseParser.g:160:5: (dbName= identifier KW_SET KW_LOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation) |dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Identifier) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==KW_SET) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==KW_LOCATION) ) {
						alt10=1;
					}
					else if ( (LA10_3==KW_MANAGEDLOCATION) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA10_0 >= KW_ABORT && LA10_0 <= KW_AFTER)||LA10_0==KW_ALLOC_FRACTION||LA10_0==KW_ANALYZE||LA10_0==KW_ARCHIVE||(LA10_0 >= KW_ASC && LA10_0 <= KW_AT)||(LA10_0 >= KW_AUTOCOMMIT && LA10_0 <= KW_BEFORE)||(LA10_0 >= KW_BUCKET && LA10_0 <= KW_BUCKETS)||(LA10_0 >= KW_CACHE && LA10_0 <= KW_CASCADE)||(LA10_0 >= KW_CBO && LA10_0 <= KW_CHANGE)||(LA10_0 >= KW_CHECK && LA10_0 <= KW_COLLECTION)||(LA10_0 >= KW_COLUMNS && LA10_0 <= KW_COMMENT)||(LA10_0 >= KW_COMPACT && LA10_0 <= KW_CONCATENATE)||(LA10_0 >= KW_CONTINUE && LA10_0 <= KW_COST)||LA10_0==KW_CRON||LA10_0==KW_DATA||LA10_0==KW_DATABASES||(LA10_0 >= KW_DATETIME && LA10_0 <= KW_DCPROPERTIES)||LA10_0==KW_DEBUG||(LA10_0 >= KW_DEFAULT && LA10_0 <= KW_DEFINED)||(LA10_0 >= KW_DELIMITED && LA10_0 <= KW_DESC)||(LA10_0 >= KW_DETAIL && LA10_0 <= KW_DISABLE)||(LA10_0 >= KW_DISTRIBUTE && LA10_0 <= KW_DO)||LA10_0==KW_DOW||(LA10_0 >= KW_DUMP && LA10_0 <= KW_ELEM_TYPE)||LA10_0==KW_ENABLE||(LA10_0 >= KW_ENFORCED && LA10_0 <= KW_EVERY)||(LA10_0 >= KW_EXCLUSIVE && LA10_0 <= KW_EXECUTED)||(LA10_0 >= KW_EXPIRE_SNAPSHOTS && LA10_0 <= KW_EXPRESSION)||(LA10_0 >= KW_FIELDS && LA10_0 <= KW_FIRST)||(LA10_0 >= KW_FORMAT && LA10_0 <= KW_FORMATTED)||LA10_0==KW_FUNCTIONS||(LA10_0 >= KW_HOUR && LA10_0 <= KW_IDXPROPERTIES)||LA10_0==KW_IGNORE||(LA10_0 >= KW_INDEX && LA10_0 <= KW_INDEXES)||(LA10_0 >= KW_INPATH && LA10_0 <= KW_INPUTFORMAT)||(LA10_0 >= KW_ISOLATION && LA10_0 <= KW_JAR)||(LA10_0 >= KW_JOINCOST && LA10_0 <= KW_LAST)||LA10_0==KW_LEVEL||(LA10_0 >= KW_LIMIT && LA10_0 <= KW_LOAD)||(LA10_0 >= KW_LOCATION && LA10_0 <= KW_LONG)||(LA10_0 >= KW_MANAGED && LA10_0 <= KW_MANAGEMENT)||(LA10_0 >= KW_MAPJOIN && LA10_0 <= KW_MATERIALIZED)||LA10_0==KW_METADATA||(LA10_0 >= KW_MINUTE && LA10_0 <= KW_MONTH)||(LA10_0 >= KW_MOVE && LA10_0 <= KW_MSCK)||(LA10_0 >= KW_NORELY && LA10_0 <= KW_NOSCAN)||LA10_0==KW_NOVALIDATE||LA10_0==KW_NULLS||LA10_0==KW_OFFSET||(LA10_0 >= KW_OPERATOR && LA10_0 <= KW_OPTION)||(LA10_0 >= KW_OUTPUTDRIVER && LA10_0 <= KW_OUTPUTFORMAT)||(LA10_0 >= KW_OVERWRITE && LA10_0 <= KW_OWNER)||(LA10_0 >= KW_PARTITIONED && LA10_0 <= KW_PATH)||(LA10_0 >= KW_PLAN && LA10_0 <= KW_POOL)||LA10_0==KW_PRINCIPALS||LA10_0==KW_PURGE||(LA10_0 >= KW_QUARTER && LA10_0 <= KW_QUERY_PARALLELISM)||LA10_0==KW_READ||(LA10_0 >= KW_REBUILD && LA10_0 <= KW_RECORDWRITER)||(LA10_0 >= KW_RELOAD && LA10_0 <= KW_RESTRICT)||LA10_0==KW_REWRITE||(LA10_0 >= KW_ROLE && LA10_0 <= KW_ROLES)||(LA10_0 >= KW_SCHEDULED && LA10_0 <= KW_SECOND)||(LA10_0 >= KW_SEMI && LA10_0 <= KW_SERVER)||(LA10_0 >= KW_SETS && LA10_0 <= KW_SKEWED)||LA10_0==KW_SNAPSHOT||(LA10_0 >= KW_SORT && LA10_0 <= KW_SSL)||(LA10_0 >= KW_STATISTICS && LA10_0 <= KW_SUMMARY)||(LA10_0 >= KW_SYSTEM_TIME && LA10_0 <= KW_SYSTEM_VERSION)||LA10_0==KW_TABLES||(LA10_0 >= KW_TBLPROPERTIES && LA10_0 <= KW_TERMINATED)||LA10_0==KW_TINYINT||LA10_0==KW_TOUCH||(LA10_0 >= KW_TRANSACTION && LA10_0 <= KW_TRANSACTIONS)||LA10_0==KW_TRIM||(LA10_0 >= KW_TYPE && LA10_0 <= KW_UNARCHIVE)||LA10_0==KW_UNDO||LA10_0==KW_UNIONTYPE||(LA10_0 >= KW_UNKNOWN && LA10_0 <= KW_UNSIGNED)||(LA10_0 >= KW_URI && LA10_0 <= KW_USE)||(LA10_0 >= KW_UTC && LA10_0 <= KW_VALIDATE)||LA10_0==KW_VALUE_TYPE||(LA10_0 >= KW_VECTORIZATION && LA10_0 <= KW_WEEK)||LA10_0==KW_WHILE||(LA10_0 >= KW_WITHIN && LA10_0 <= KW_ZONE)||LA10_0==KW_BATCH||LA10_0==KW_DAYOFWEEK||LA10_0==KW_HOLD_DDLTIME||LA10_0==KW_NO_DROP||LA10_0==KW_OFFLINE||LA10_0==KW_PROTECTION||LA10_0==KW_READONLY||LA10_0==KW_TIMESTAMPTZ) ) {
				int LA10_2 = input.LA(2);
				if ( (LA10_2==KW_SET) ) {
					int LA10_4 = input.LA(3);
					if ( (LA10_4==KW_LOCATION) ) {
						alt10=1;
					}
					else if ( (LA10_4==KW_MANAGEDLOCATION) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// AlterClauseParser.g:160:7: dbName= identifier KW_SET KW_LOCATION newLocation= StringLiteral
					{
					pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetLocation859);
					dbName=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());
					KW_SET75=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation861); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET75);

					KW_LOCATION76=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_alterDatabaseSuffixSetLocation863); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION76);

					newLocation=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation867); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(newLocation);

					// AST REWRITE
					// elements: newLocation, dbName
					// token labels: newLocation
					// rule labels: dbName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_newLocation=new RewriteRuleTokenStream(adaptor,"token newLocation",newLocation);
					RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 161:5: -> ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation)
					{
						// AlterClauseParser.g:161:8: ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATABASE_LOCATION, "TOK_ALTERDATABASE_LOCATION"), root_1);
						adaptor.addChild(root_1, stream_dbName.nextTree());
						adaptor.addChild(root_1, stream_newLocation.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:162:7: dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral
					{
					pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetLocation893);
					dbName=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());
					KW_SET77=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation895); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET77);

					KW_MANAGEDLOCATION78=(Token)match(input,KW_MANAGEDLOCATION,FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetLocation897); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_MANAGEDLOCATION.add(KW_MANAGEDLOCATION78);

					newLocation=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation901); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(newLocation);

					// AST REWRITE
					// elements: dbName, newLocation
					// token labels: newLocation
					// rule labels: dbName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_newLocation=new RewriteRuleTokenStream(adaptor,"token newLocation",newLocation);
					RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 163:5: -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
					{
						// AlterClauseParser.g:163:8: ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATABASE_MANAGEDLOCATION, "TOK_ALTERDATABASE_MANAGEDLOCATION"), root_1);
						adaptor.addChild(root_1, stream_dbName.nextTree());
						adaptor.addChild(root_1, stream_newLocation.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDatabaseSuffixSetLocation"


	public static class alterDatabaseSuffixSetManagedLocation_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDatabaseSuffixSetManagedLocation"
	// AlterClauseParser.g:166:1: alterDatabaseSuffixSetManagedLocation : dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) ;
	public final HiveParser_AlterClauseParser.alterDatabaseSuffixSetManagedLocation_return alterDatabaseSuffixSetManagedLocation() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDatabaseSuffixSetManagedLocation_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixSetManagedLocation_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token newLocation=null;
		Token KW_SET79=null;
		Token KW_MANAGEDLOCATION80=null;
		ParserRuleReturnScope dbName =null;

		ASTNode newLocation_tree=null;
		ASTNode KW_SET79_tree=null;
		ASTNode KW_MANAGEDLOCATION80_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_MANAGEDLOCATION=new RewriteRuleTokenStream(adaptor,"token KW_MANAGEDLOCATION");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("alter database set managed location", state); 
		try {
			// AlterClauseParser.g:169:5: (dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) )
			// AlterClauseParser.g:169:7: dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral
			{
			pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetManagedLocation946);
			dbName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());
			KW_SET79=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetManagedLocation948); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET79);

			KW_MANAGEDLOCATION80=(Token)match(input,KW_MANAGEDLOCATION,FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetManagedLocation950); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_MANAGEDLOCATION.add(KW_MANAGEDLOCATION80);

			newLocation=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDatabaseSuffixSetManagedLocation954); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(newLocation);

			// AST REWRITE
			// elements: dbName, newLocation
			// token labels: newLocation
			// rule labels: dbName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_newLocation=new RewriteRuleTokenStream(adaptor,"token newLocation",newLocation);
			RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 170:5: -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
			{
				// AlterClauseParser.g:170:8: ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATABASE_MANAGEDLOCATION, "TOK_ALTERDATABASE_MANAGEDLOCATION"), root_1);
				adaptor.addChild(root_1, stream_dbName.nextTree());
				adaptor.addChild(root_1, stream_newLocation.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDatabaseSuffixSetManagedLocation"


	public static class alterStatementSuffixRename_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixRename"
	// AlterClauseParser.g:173:1: alterStatementSuffixRename[boolean table] : KW_RENAME KW_TO tableName -> { table }? ^( TOK_ALTERTABLE_RENAME tableName ) -> ^( TOK_ALTERVIEW_RENAME tableName ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixRename_return alterStatementSuffixRename(boolean table) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixRename_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRename_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_RENAME81=null;
		Token KW_TO82=null;
		ParserRuleReturnScope tableName83 =null;

		ASTNode KW_RENAME81_tree=null;
		ASTNode KW_TO82_tree=null;
		RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
		RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		 gParent.pushMsg("rename statement", state); 
		try {
			// AlterClauseParser.g:176:5: ( KW_RENAME KW_TO tableName -> { table }? ^( TOK_ALTERTABLE_RENAME tableName ) -> ^( TOK_ALTERVIEW_RENAME tableName ) )
			// AlterClauseParser.g:176:7: KW_RENAME KW_TO tableName
			{
			KW_RENAME81=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterStatementSuffixRename998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_RENAME.add(KW_RENAME81);

			KW_TO82=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixRename1000); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO82);

			pushFollow(FOLLOW_tableName_in_alterStatementSuffixRename1002);
			tableName83=gHiveParser.tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tableName83.getTree());
			// AST REWRITE
			// elements: tableName, tableName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 177:5: -> { table }? ^( TOK_ALTERTABLE_RENAME tableName )
			if ( table ) {
				// AlterClauseParser.g:177:19: ^( TOK_ALTERTABLE_RENAME tableName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_RENAME, "TOK_ALTERTABLE_RENAME"), root_1);
				adaptor.addChild(root_1, stream_tableName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 178:5: -> ^( TOK_ALTERVIEW_RENAME tableName )
			{
				// AlterClauseParser.g:178:19: ^( TOK_ALTERVIEW_RENAME tableName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW_RENAME, "TOK_ALTERVIEW_RENAME"), root_1);
				adaptor.addChild(root_1, stream_tableName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixRename"


	public static class alterStatementSuffixAddCol_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixAddCol"
	// AlterClauseParser.g:181:1: alterStatementSuffixAddCol : (add= KW_ADD |replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN ( restrictOrCascade )? -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? ) -> ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return alterStatementSuffixAddCol() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token add=null;
		Token replace=null;
		Token KW_COLUMNS84=null;
		Token LPAREN85=null;
		Token RPAREN87=null;
		ParserRuleReturnScope columnNameTypeList86 =null;
		ParserRuleReturnScope restrictOrCascade88 =null;

		ASTNode add_tree=null;
		ASTNode replace_tree=null;
		ASTNode KW_COLUMNS84_tree=null;
		ASTNode LPAREN85_tree=null;
		ASTNode RPAREN87_tree=null;
		RewriteRuleTokenStream stream_KW_COLUMNS=new RewriteRuleTokenStream(adaptor,"token KW_COLUMNS");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
		RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_restrictOrCascade=new RewriteRuleSubtreeStream(adaptor,"rule restrictOrCascade");

		 gParent.pushMsg("add column statement", state); 
		try {
			// AlterClauseParser.g:184:5: ( (add= KW_ADD |replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN ( restrictOrCascade )? -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? ) -> ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? ) )
			// AlterClauseParser.g:184:7: (add= KW_ADD |replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN ( restrictOrCascade )?
			{
			// AlterClauseParser.g:184:7: (add= KW_ADD |replace= KW_REPLACE )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==KW_ADD) ) {
				alt11=1;
			}
			else if ( (LA11_0==KW_REPLACE) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// AlterClauseParser.g:184:8: add= KW_ADD
					{
					add=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddCol1069); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ADD.add(add);

					}
					break;
				case 2 :
					// AlterClauseParser.g:184:21: replace= KW_REPLACE
					{
					replace=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixAddCol1075); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_REPLACE.add(replace);

					}
					break;

			}

			KW_COLUMNS84=(Token)match(input,KW_COLUMNS,FOLLOW_KW_COLUMNS_in_alterStatementSuffixAddCol1078); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_COLUMNS.add(KW_COLUMNS84);

			LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixAddCol1080); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN85);

			pushFollow(FOLLOW_columnNameTypeList_in_alterStatementSuffixAddCol1082);
			columnNameTypeList86=gHiveParser.columnNameTypeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList86.getTree());
			RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixAddCol1084); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN87);

			// AlterClauseParser.g:184:85: ( restrictOrCascade )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==KW_CASCADE||LA12_0==KW_RESTRICT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// AlterClauseParser.g:184:85: restrictOrCascade
					{
					pushFollow(FOLLOW_restrictOrCascade_in_alterStatementSuffixAddCol1086);
					restrictOrCascade88=gHiveParser.restrictOrCascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrictOrCascade.add(restrictOrCascade88.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: restrictOrCascade, restrictOrCascade, columnNameTypeList, columnNameTypeList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 185:5: -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? )
			if (add != null) {
				// AlterClauseParser.g:185:24: ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_ADDCOLS, "TOK_ALTERTABLE_ADDCOLS"), root_1);
				adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				// AlterClauseParser.g:185:68: ( restrictOrCascade )?
				if ( stream_restrictOrCascade.hasNext() ) {
					adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());
				}
				stream_restrictOrCascade.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 186:5: -> ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? )
			{
				// AlterClauseParser.g:186:24: ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_REPLACECOLS, "TOK_ALTERTABLE_REPLACECOLS"), root_1);
				adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				// AlterClauseParser.g:186:72: ( restrictOrCascade )?
				if ( stream_restrictOrCascade.hasNext() ) {
					adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());
				}
				stream_restrictOrCascade.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixAddCol"


	public static class alterStatementSuffixAddConstraint_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixAddConstraint"
	// AlterClauseParser.g:189:1: alterStatementSuffixAddConstraint : KW_ADD (fk= alterForeignKeyWithName | alterConstraintWithName ) -> {fk != null}? ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName ) -> ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return alterStatementSuffixAddConstraint() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ADD89=null;
		ParserRuleReturnScope fk =null;
		ParserRuleReturnScope alterConstraintWithName90 =null;

		ASTNode KW_ADD89_tree=null;
		RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
		RewriteRuleSubtreeStream stream_alterForeignKeyWithName=new RewriteRuleSubtreeStream(adaptor,"rule alterForeignKeyWithName");
		RewriteRuleSubtreeStream stream_alterConstraintWithName=new RewriteRuleSubtreeStream(adaptor,"rule alterConstraintWithName");

		 gParent.pushMsg("add constraint statement", state); 
		try {
			// AlterClauseParser.g:192:4: ( KW_ADD (fk= alterForeignKeyWithName | alterConstraintWithName ) -> {fk != null}? ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName ) -> ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName ) )
			// AlterClauseParser.g:192:7: KW_ADD (fk= alterForeignKeyWithName | alterConstraintWithName )
			{
			KW_ADD89=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddConstraint1162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_ADD.add(KW_ADD89);

			// AlterClauseParser.g:192:14: (fk= alterForeignKeyWithName | alterConstraintWithName )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==KW_CONSTRAINT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==Identifier) ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2==KW_FOREIGN) ) {
						alt13=1;
					}
					else if ( (LA13_2==KW_CHECK||LA13_2==KW_PRIMARY||LA13_2==KW_UNIQUE) ) {
						alt13=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA13_1 >= KW_ABORT && LA13_1 <= KW_AFTER)||LA13_1==KW_ALLOC_FRACTION||LA13_1==KW_ANALYZE||LA13_1==KW_ARCHIVE||(LA13_1 >= KW_ASC && LA13_1 <= KW_AT)||(LA13_1 >= KW_AUTOCOMMIT && LA13_1 <= KW_BEFORE)||(LA13_1 >= KW_BUCKET && LA13_1 <= KW_BUCKETS)||(LA13_1 >= KW_CACHE && LA13_1 <= KW_CASCADE)||(LA13_1 >= KW_CBO && LA13_1 <= KW_CHANGE)||(LA13_1 >= KW_CHECK && LA13_1 <= KW_COLLECTION)||(LA13_1 >= KW_COLUMNS && LA13_1 <= KW_COMMENT)||(LA13_1 >= KW_COMPACT && LA13_1 <= KW_CONCATENATE)||(LA13_1 >= KW_CONTINUE && LA13_1 <= KW_COST)||LA13_1==KW_CRON||LA13_1==KW_DATA||LA13_1==KW_DATABASES||(LA13_1 >= KW_DATETIME && LA13_1 <= KW_DCPROPERTIES)||LA13_1==KW_DEBUG||(LA13_1 >= KW_DEFAULT && LA13_1 <= KW_DEFINED)||(LA13_1 >= KW_DELIMITED && LA13_1 <= KW_DESC)||(LA13_1 >= KW_DETAIL && LA13_1 <= KW_DISABLE)||(LA13_1 >= KW_DISTRIBUTE && LA13_1 <= KW_DO)||LA13_1==KW_DOW||(LA13_1 >= KW_DUMP && LA13_1 <= KW_ELEM_TYPE)||LA13_1==KW_ENABLE||(LA13_1 >= KW_ENFORCED && LA13_1 <= KW_EVERY)||(LA13_1 >= KW_EXCLUSIVE && LA13_1 <= KW_EXECUTED)||(LA13_1 >= KW_EXPIRE_SNAPSHOTS && LA13_1 <= KW_EXPRESSION)||(LA13_1 >= KW_FIELDS && LA13_1 <= KW_FIRST)||(LA13_1 >= KW_FORMAT && LA13_1 <= KW_FORMATTED)||LA13_1==KW_FUNCTIONS||(LA13_1 >= KW_HOUR && LA13_1 <= KW_IDXPROPERTIES)||LA13_1==KW_IGNORE||(LA13_1 >= KW_INDEX && LA13_1 <= KW_INDEXES)||(LA13_1 >= KW_INPATH && LA13_1 <= KW_INPUTFORMAT)||(LA13_1 >= KW_ISOLATION && LA13_1 <= KW_JAR)||(LA13_1 >= KW_JOINCOST && LA13_1 <= KW_LAST)||LA13_1==KW_LEVEL||(LA13_1 >= KW_LIMIT && LA13_1 <= KW_LOAD)||(LA13_1 >= KW_LOCATION && LA13_1 <= KW_LONG)||(LA13_1 >= KW_MANAGED && LA13_1 <= KW_MANAGEMENT)||(LA13_1 >= KW_MAPJOIN && LA13_1 <= KW_MATERIALIZED)||LA13_1==KW_METADATA||(LA13_1 >= KW_MINUTE && LA13_1 <= KW_MONTH)||(LA13_1 >= KW_MOVE && LA13_1 <= KW_MSCK)||(LA13_1 >= KW_NORELY && LA13_1 <= KW_NOSCAN)||LA13_1==KW_NOVALIDATE||LA13_1==KW_NULLS||LA13_1==KW_OFFSET||(LA13_1 >= KW_OPERATOR && LA13_1 <= KW_OPTION)||(LA13_1 >= KW_OUTPUTDRIVER && LA13_1 <= KW_OUTPUTFORMAT)||(LA13_1 >= KW_OVERWRITE && LA13_1 <= KW_OWNER)||(LA13_1 >= KW_PARTITIONED && LA13_1 <= KW_PATH)||(LA13_1 >= KW_PLAN && LA13_1 <= KW_POOL)||LA13_1==KW_PRINCIPALS||LA13_1==KW_PURGE||(LA13_1 >= KW_QUARTER && LA13_1 <= KW_QUERY_PARALLELISM)||LA13_1==KW_READ||(LA13_1 >= KW_REBUILD && LA13_1 <= KW_RECORDWRITER)||(LA13_1 >= KW_RELOAD && LA13_1 <= KW_RESTRICT)||LA13_1==KW_REWRITE||(LA13_1 >= KW_ROLE && LA13_1 <= KW_ROLES)||(LA13_1 >= KW_SCHEDULED && LA13_1 <= KW_SECOND)||(LA13_1 >= KW_SEMI && LA13_1 <= KW_SERVER)||(LA13_1 >= KW_SETS && LA13_1 <= KW_SKEWED)||LA13_1==KW_SNAPSHOT||(LA13_1 >= KW_SORT && LA13_1 <= KW_SSL)||(LA13_1 >= KW_STATISTICS && LA13_1 <= KW_SUMMARY)||(LA13_1 >= KW_SYSTEM_TIME && LA13_1 <= KW_SYSTEM_VERSION)||LA13_1==KW_TABLES||(LA13_1 >= KW_TBLPROPERTIES && LA13_1 <= KW_TERMINATED)||LA13_1==KW_TINYINT||LA13_1==KW_TOUCH||(LA13_1 >= KW_TRANSACTION && LA13_1 <= KW_TRANSACTIONS)||LA13_1==KW_TRIM||(LA13_1 >= KW_TYPE && LA13_1 <= KW_UNARCHIVE)||LA13_1==KW_UNDO||LA13_1==KW_UNIONTYPE||(LA13_1 >= KW_UNKNOWN && LA13_1 <= KW_UNSIGNED)||(LA13_1 >= KW_URI && LA13_1 <= KW_USE)||(LA13_1 >= KW_UTC && LA13_1 <= KW_VALIDATE)||LA13_1==KW_VALUE_TYPE||(LA13_1 >= KW_VECTORIZATION && LA13_1 <= KW_WEEK)||LA13_1==KW_WHILE||(LA13_1 >= KW_WITHIN && LA13_1 <= KW_ZONE)||LA13_1==KW_BATCH||LA13_1==KW_DAYOFWEEK||LA13_1==KW_HOLD_DDLTIME||LA13_1==KW_NO_DROP||LA13_1==KW_OFFLINE||LA13_1==KW_PROTECTION||LA13_1==KW_READONLY||LA13_1==KW_TIMESTAMPTZ) ) {
					int LA13_3 = input.LA(3);
					if ( (LA13_3==KW_FOREIGN) ) {
						alt13=1;
					}
					else if ( (LA13_3==KW_CHECK||LA13_3==KW_PRIMARY||LA13_3==KW_UNIQUE) ) {
						alt13=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// AlterClauseParser.g:192:15: fk= alterForeignKeyWithName
					{
					pushFollow(FOLLOW_alterForeignKeyWithName_in_alterStatementSuffixAddConstraint1167);
					fk=gHiveParser.alterForeignKeyWithName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterForeignKeyWithName.add(fk.getTree());
					}
					break;
				case 2 :
					// AlterClauseParser.g:192:44: alterConstraintWithName
					{
					pushFollow(FOLLOW_alterConstraintWithName_in_alterStatementSuffixAddConstraint1171);
					alterConstraintWithName90=gHiveParser.alterConstraintWithName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterConstraintWithName.add(alterConstraintWithName90.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: alterConstraintWithName, alterForeignKeyWithName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 193:4: -> {fk != null}? ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName )
			if (fk != null) {
				// AlterClauseParser.g:193:21: ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_ADDCONSTRAINT, "TOK_ALTERTABLE_ADDCONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_alterForeignKeyWithName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 194:4: -> ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName )
			{
				// AlterClauseParser.g:194:21: ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_ADDCONSTRAINT, "TOK_ALTERTABLE_ADDCONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_alterConstraintWithName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixAddConstraint"


	public static class alterStatementSuffixUpdateColumns_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixUpdateColumns"
	// AlterClauseParser.g:197:1: alterStatementSuffixUpdateColumns : KW_UPDATE KW_COLUMNS ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return alterStatementSuffixUpdateColumns() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_UPDATE91=null;
		Token KW_COLUMNS92=null;
		ParserRuleReturnScope restrictOrCascade93 =null;

		ASTNode KW_UPDATE91_tree=null;
		ASTNode KW_COLUMNS92_tree=null;
		RewriteRuleTokenStream stream_KW_COLUMNS=new RewriteRuleTokenStream(adaptor,"token KW_COLUMNS");
		RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
		RewriteRuleSubtreeStream stream_restrictOrCascade=new RewriteRuleSubtreeStream(adaptor,"rule restrictOrCascade");

		 gParent.pushMsg("update columns statement", state); 
		try {
			// AlterClauseParser.g:200:5: ( KW_UPDATE KW_COLUMNS ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? ) )
			// AlterClauseParser.g:200:7: KW_UPDATE KW_COLUMNS ( restrictOrCascade )?
			{
			KW_UPDATE91=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateColumns1236); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE91);

			KW_COLUMNS92=(Token)match(input,KW_COLUMNS,FOLLOW_KW_COLUMNS_in_alterStatementSuffixUpdateColumns1238); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_COLUMNS.add(KW_COLUMNS92);

			// AlterClauseParser.g:200:28: ( restrictOrCascade )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==KW_CASCADE||LA14_0==KW_RESTRICT) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// AlterClauseParser.g:200:28: restrictOrCascade
					{
					pushFollow(FOLLOW_restrictOrCascade_in_alterStatementSuffixUpdateColumns1240);
					restrictOrCascade93=gHiveParser.restrictOrCascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrictOrCascade.add(restrictOrCascade93.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: restrictOrCascade
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 201:5: -> ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? )
			{
				// AlterClauseParser.g:201:8: ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATECOLUMNS, "TOK_ALTERTABLE_UPDATECOLUMNS"), root_1);
				// AlterClauseParser.g:201:39: ( restrictOrCascade )?
				if ( stream_restrictOrCascade.hasNext() ) {
					adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());
				}
				stream_restrictOrCascade.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixUpdateColumns"


	public static class alterStatementSuffixDropConstraint_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixDropConstraint"
	// AlterClauseParser.g:204:1: alterStatementSuffixDropConstraint : KW_DROP KW_CONSTRAINT cName= identifier -> ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return alterStatementSuffixDropConstraint() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DROP94=null;
		Token KW_CONSTRAINT95=null;
		ParserRuleReturnScope cName =null;

		ASTNode KW_DROP94_tree=null;
		ASTNode KW_CONSTRAINT95_tree=null;
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token KW_CONSTRAINT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("drop constraint statement", state); 
		try {
			// AlterClauseParser.g:207:4: ( KW_DROP KW_CONSTRAINT cName= identifier -> ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName) )
			// AlterClauseParser.g:207:6: KW_DROP KW_CONSTRAINT cName= identifier
			{
			KW_DROP94=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropConstraint1280); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP94);

			KW_CONSTRAINT95=(Token)match(input,KW_CONSTRAINT,FOLLOW_KW_CONSTRAINT_in_alterStatementSuffixDropConstraint1282); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CONSTRAINT.add(KW_CONSTRAINT95);

			pushFollow(FOLLOW_identifier_in_alterStatementSuffixDropConstraint1286);
			cName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(cName.getTree());
			// AST REWRITE
			// elements: cName
			// token labels: 
			// rule labels: cName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_cName=new RewriteRuleSubtreeStream(adaptor,"rule cName",cName!=null?cName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 208:4: -> ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName)
			{
				// AlterClauseParser.g:208:6: ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_DROPCONSTRAINT, "TOK_ALTERTABLE_DROPCONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_cName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixDropConstraint"


	public static class alterStatementSuffixRenameCol_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixRenameCol"
	// AlterClauseParser.g:211:1: alterStatementSuffixRenameCol : KW_CHANGE ( KW_COLUMN )? oldName= identifier newName= identifier colType ( alterColumnConstraint[$newName.tree] )? ( KW_COMMENT comment= StringLiteral )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return alterStatementSuffixRenameCol() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token comment=null;
		Token KW_CHANGE96=null;
		Token KW_COLUMN97=null;
		Token KW_COMMENT100=null;
		ParserRuleReturnScope oldName =null;
		ParserRuleReturnScope newName =null;
		ParserRuleReturnScope colType98 =null;
		ParserRuleReturnScope alterColumnConstraint99 =null;
		ParserRuleReturnScope alterStatementChangeColPosition101 =null;
		ParserRuleReturnScope restrictOrCascade102 =null;

		ASTNode comment_tree=null;
		ASTNode KW_CHANGE96_tree=null;
		ASTNode KW_COLUMN97_tree=null;
		ASTNode KW_COMMENT100_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
		RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
		RewriteRuleTokenStream stream_KW_CHANGE=new RewriteRuleTokenStream(adaptor,"token KW_CHANGE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_colType=new RewriteRuleSubtreeStream(adaptor,"rule colType");
		RewriteRuleSubtreeStream stream_alterStatementChangeColPosition=new RewriteRuleSubtreeStream(adaptor,"rule alterStatementChangeColPosition");
		RewriteRuleSubtreeStream stream_restrictOrCascade=new RewriteRuleSubtreeStream(adaptor,"rule restrictOrCascade");
		RewriteRuleSubtreeStream stream_alterColumnConstraint=new RewriteRuleSubtreeStream(adaptor,"rule alterColumnConstraint");

		 gParent.pushMsg("rename column name", state); 
		try {
			// AlterClauseParser.g:214:5: ( KW_CHANGE ( KW_COLUMN )? oldName= identifier newName= identifier colType ( alterColumnConstraint[$newName.tree] )? ( KW_COMMENT comment= StringLiteral )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? ) )
			// AlterClauseParser.g:214:7: KW_CHANGE ( KW_COLUMN )? oldName= identifier newName= identifier colType ( alterColumnConstraint[$newName.tree] )? ( KW_COMMENT comment= StringLiteral )? ( alterStatementChangeColPosition )? ( restrictOrCascade )?
			{
			KW_CHANGE96=(Token)match(input,KW_CHANGE,FOLLOW_KW_CHANGE_in_alterStatementSuffixRenameCol1323); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CHANGE.add(KW_CHANGE96);

			// AlterClauseParser.g:214:17: ( KW_COLUMN )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KW_COLUMN) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// AlterClauseParser.g:214:17: KW_COLUMN
					{
					KW_COLUMN97=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementSuffixRenameCol1325); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN97);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_alterStatementSuffixRenameCol1330);
			oldName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(oldName.getTree());
			pushFollow(FOLLOW_identifier_in_alterStatementSuffixRenameCol1334);
			newName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(newName.getTree());
			pushFollow(FOLLOW_colType_in_alterStatementSuffixRenameCol1336);
			colType98=gHiveParser.colType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_colType.add(colType98.getTree());
			// AlterClauseParser.g:214:74: ( alterColumnConstraint[$newName.tree] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==KW_CHECK||LA16_0==KW_CONSTRAINT||LA16_0==KW_DEFAULT||LA16_0==KW_NOT||LA16_0==KW_PRIMARY||LA16_0==KW_REFERENCES||LA16_0==KW_UNIQUE) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// AlterClauseParser.g:214:74: alterColumnConstraint[$newName.tree]
					{
					pushFollow(FOLLOW_alterColumnConstraint_in_alterStatementSuffixRenameCol1338);
					alterColumnConstraint99=gHiveParser.alterColumnConstraint((newName!=null?((ASTNode)newName.getTree()):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterColumnConstraint.add(alterColumnConstraint99.getTree());
					}
					break;

			}

			// AlterClauseParser.g:214:112: ( KW_COMMENT comment= StringLiteral )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==KW_COMMENT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// AlterClauseParser.g:214:113: KW_COMMENT comment= StringLiteral
					{
					KW_COMMENT100=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_alterStatementSuffixRenameCol1343); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT100);

					comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixRenameCol1347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(comment);

					}
					break;

			}

			// AlterClauseParser.g:214:148: ( alterStatementChangeColPosition )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KW_AFTER||LA18_0==KW_FIRST) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// AlterClauseParser.g:214:148: alterStatementChangeColPosition
					{
					pushFollow(FOLLOW_alterStatementChangeColPosition_in_alterStatementSuffixRenameCol1351);
					alterStatementChangeColPosition101=alterStatementChangeColPosition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterStatementChangeColPosition.add(alterStatementChangeColPosition101.getTree());
					}
					break;

			}

			// AlterClauseParser.g:214:181: ( restrictOrCascade )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==KW_CASCADE||LA19_0==KW_RESTRICT) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// AlterClauseParser.g:214:181: restrictOrCascade
					{
					pushFollow(FOLLOW_restrictOrCascade_in_alterStatementSuffixRenameCol1354);
					restrictOrCascade102=gHiveParser.restrictOrCascade();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_restrictOrCascade.add(restrictOrCascade102.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: colType, oldName, alterColumnConstraint, restrictOrCascade, alterStatementChangeColPosition, comment, newName
			// token labels: comment
			// rule labels: newName, oldName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
			RewriteRuleSubtreeStream stream_newName=new RewriteRuleSubtreeStream(adaptor,"rule newName",newName!=null?newName.getTree():null);
			RewriteRuleSubtreeStream stream_oldName=new RewriteRuleSubtreeStream(adaptor,"rule oldName",oldName!=null?oldName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 215:5: -> ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? )
			{
				// AlterClauseParser.g:215:7: ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_RENAMECOL, "TOK_ALTERTABLE_RENAMECOL"), root_1);
				adaptor.addChild(root_1, stream_oldName.nextTree());
				adaptor.addChild(root_1, stream_newName.nextTree());
				adaptor.addChild(root_1, stream_colType.nextTree());
				// AlterClauseParser.g:215:61: ( $comment)?
				if ( stream_comment.hasNext() ) {
					adaptor.addChild(root_1, stream_comment.nextNode());
				}
				stream_comment.reset();

				// AlterClauseParser.g:215:70: ( alterColumnConstraint )?
				if ( stream_alterColumnConstraint.hasNext() ) {
					adaptor.addChild(root_1, stream_alterColumnConstraint.nextTree());
				}
				stream_alterColumnConstraint.reset();

				// AlterClauseParser.g:215:93: ( alterStatementChangeColPosition )?
				if ( stream_alterStatementChangeColPosition.hasNext() ) {
					adaptor.addChild(root_1, stream_alterStatementChangeColPosition.nextTree());
				}
				stream_alterStatementChangeColPosition.reset();

				// AlterClauseParser.g:215:126: ( restrictOrCascade )?
				if ( stream_restrictOrCascade.hasNext() ) {
					adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());
				}
				stream_restrictOrCascade.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixRenameCol"


	public static class alterStatementSuffixUpdateStatsCol_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixUpdateStatsCol"
	// AlterClauseParser.g:218:1: alterStatementSuffixUpdateStatsCol[boolean partition] : KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> {partition}? ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? ) -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return alterStatementSuffixUpdateStatsCol(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token comment=null;
		Token KW_UPDATE103=null;
		Token KW_STATISTICS104=null;
		Token KW_FOR105=null;
		Token KW_COLUMN106=null;
		Token KW_SET107=null;
		Token KW_COMMENT109=null;
		ParserRuleReturnScope colName =null;
		ParserRuleReturnScope tableProperties108 =null;

		ASTNode comment_tree=null;
		ASTNode KW_UPDATE103_tree=null;
		ASTNode KW_STATISTICS104_tree=null;
		ASTNode KW_FOR105_tree=null;
		ASTNode KW_COLUMN106_tree=null;
		ASTNode KW_SET107_tree=null;
		ASTNode KW_COMMENT109_tree=null;
		RewriteRuleTokenStream stream_KW_STATISTICS=new RewriteRuleTokenStream(adaptor,"token KW_STATISTICS");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
		RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
		RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
		RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");

		 gParent.pushMsg("update column statistics", state); 
		try {
			// AlterClauseParser.g:221:5: ( KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> {partition}? ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? ) -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) )
			// AlterClauseParser.g:221:7: KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )?
			{
			KW_UPDATE103=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStatsCol1413); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE103);

			KW_STATISTICS104=(Token)match(input,KW_STATISTICS,FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStatsCol1415); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_STATISTICS.add(KW_STATISTICS104);

			KW_FOR105=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_alterStatementSuffixUpdateStatsCol1417); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR105);

			// AlterClauseParser.g:221:38: ( KW_COLUMN )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==KW_COLUMN) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// AlterClauseParser.g:221:38: KW_COLUMN
					{
					KW_COLUMN106=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementSuffixUpdateStatsCol1419); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN106);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_alterStatementSuffixUpdateStatsCol1424);
			colName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(colName.getTree());
			KW_SET107=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixUpdateStatsCol1426); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET107);

			pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixUpdateStatsCol1428);
			tableProperties108=gHiveParser.tableProperties();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties108.getTree());
			// AlterClauseParser.g:221:91: ( KW_COMMENT comment= StringLiteral )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==KW_COMMENT) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// AlterClauseParser.g:221:92: KW_COMMENT comment= StringLiteral
					{
					KW_COMMENT109=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_alterStatementSuffixUpdateStatsCol1431); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT109);

					comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixUpdateStatsCol1435); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(comment);

					}
					break;

			}

			// AST REWRITE
			// elements: colName, comment, tableProperties, tableProperties, colName, comment
			// token labels: comment
			// rule labels: colName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
			RewriteRuleSubtreeStream stream_colName=new RewriteRuleSubtreeStream(adaptor,"rule colName",colName!=null?colName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 222:5: -> {partition}? ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? )
			if (partition) {
				// AlterClauseParser.g:222:21: ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_UPDATECOLSTATS, "TOK_ALTERPARTITION_UPDATECOLSTATS"), root_1);
				adaptor.addChild(root_1, stream_colName.nextTree());
				adaptor.addChild(root_1, stream_tableProperties.nextTree());
				// AlterClauseParser.g:222:83: ( $comment)?
				if ( stream_comment.hasNext() ) {
					adaptor.addChild(root_1, stream_comment.nextNode());
				}
				stream_comment.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 223:5: -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
			{
				// AlterClauseParser.g:223:21: ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATECOLSTATS, "TOK_ALTERTABLE_UPDATECOLSTATS"), root_1);
				adaptor.addChild(root_1, stream_colName.nextTree());
				adaptor.addChild(root_1, stream_tableProperties.nextTree());
				// AlterClauseParser.g:223:79: ( $comment)?
				if ( stream_comment.hasNext() ) {
					adaptor.addChild(root_1, stream_comment.nextNode());
				}
				stream_comment.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixUpdateStatsCol"


	public static class alterStatementSuffixUpdateStats_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixUpdateStats"
	// AlterClauseParser.g:226:1: alterStatementSuffixUpdateStats[boolean partition] : KW_UPDATE KW_STATISTICS KW_SET tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties ) -> ^( TOK_ALTERTABLE_UPDATESTATS tableProperties ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return alterStatementSuffixUpdateStats(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_UPDATE110=null;
		Token KW_STATISTICS111=null;
		Token KW_SET112=null;
		ParserRuleReturnScope tableProperties113 =null;

		ASTNode KW_UPDATE110_tree=null;
		ASTNode KW_STATISTICS111_tree=null;
		ASTNode KW_SET112_tree=null;
		RewriteRuleTokenStream stream_KW_STATISTICS=new RewriteRuleTokenStream(adaptor,"token KW_STATISTICS");
		RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");

		 gParent.pushMsg("update basic statistics", state); 
		try {
			// AlterClauseParser.g:229:5: ( KW_UPDATE KW_STATISTICS KW_SET tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties ) -> ^( TOK_ALTERTABLE_UPDATESTATS tableProperties ) )
			// AlterClauseParser.g:229:7: KW_UPDATE KW_STATISTICS KW_SET tableProperties
			{
			KW_UPDATE110=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStats1518); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE110);

			KW_STATISTICS111=(Token)match(input,KW_STATISTICS,FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStats1520); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_STATISTICS.add(KW_STATISTICS111);

			KW_SET112=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixUpdateStats1522); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET112);

			pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixUpdateStats1524);
			tableProperties113=gHiveParser.tableProperties();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties113.getTree());
			// AST REWRITE
			// elements: tableProperties, tableProperties
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 230:5: -> {partition}? ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties )
			if (partition) {
				// AlterClauseParser.g:230:21: ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_UPDATESTATS, "TOK_ALTERPARTITION_UPDATESTATS"), root_1);
				adaptor.addChild(root_1, stream_tableProperties.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 231:5: -> ^( TOK_ALTERTABLE_UPDATESTATS tableProperties )
			{
				// AlterClauseParser.g:231:21: ^( TOK_ALTERTABLE_UPDATESTATS tableProperties )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATESTATS, "TOK_ALTERTABLE_UPDATESTATS"), root_1);
				adaptor.addChild(root_1, stream_tableProperties.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixUpdateStats"


	public static class alterStatementChangeColPosition_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementChangeColPosition"
	// AlterClauseParser.g:234:1: alterStatementChangeColPosition : (first= KW_FIRST | KW_AFTER afterCol= identifier -> {$first != null}? ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION ) -> ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol) );
	public final HiveParser_AlterClauseParser.alterStatementChangeColPosition_return alterStatementChangeColPosition() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementChangeColPosition_return retval = new HiveParser_AlterClauseParser.alterStatementChangeColPosition_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token first=null;
		Token KW_AFTER114=null;
		ParserRuleReturnScope afterCol =null;

		ASTNode first_tree=null;
		ASTNode KW_AFTER114_tree=null;
		RewriteRuleTokenStream stream_KW_AFTER=new RewriteRuleTokenStream(adaptor,"token KW_AFTER");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// AlterClauseParser.g:235:5: (first= KW_FIRST | KW_AFTER afterCol= identifier -> {$first != null}? ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION ) -> ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==KW_FIRST) ) {
				alt22=1;
			}
			else if ( (LA22_0==KW_AFTER) ) {
				alt22=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// AlterClauseParser.g:235:7: first= KW_FIRST
					{
					root_0 = (ASTNode)adaptor.nil();


					first=(Token)match(input,KW_FIRST,FOLLOW_KW_FIRST_in_alterStatementChangeColPosition1582); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					first_tree = (ASTNode)adaptor.create(first);
					adaptor.addChild(root_0, first_tree);
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:235:22: KW_AFTER afterCol= identifier
					{
					KW_AFTER114=(Token)match(input,KW_AFTER,FOLLOW_KW_AFTER_in_alterStatementChangeColPosition1584); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AFTER.add(KW_AFTER114);

					pushFollow(FOLLOW_identifier_in_alterStatementChangeColPosition1588);
					afterCol=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(afterCol.getTree());
					// AST REWRITE
					// elements: afterCol
					// token labels: 
					// rule labels: afterCol, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_afterCol=new RewriteRuleSubtreeStream(adaptor,"rule afterCol",afterCol!=null?afterCol.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 236:5: -> {$first != null}? ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION )
					if (first != null) {
						// AlterClauseParser.g:236:25: ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION, "TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 237:5: -> ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol)
					{
						// AlterClauseParser.g:237:8: ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION, "TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION"), root_1);
						adaptor.addChild(root_1, stream_afterCol.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementChangeColPosition"


	public static class alterStatementSuffixAddPartitions_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixAddPartitions"
	// AlterClauseParser.g:240:1: alterStatementSuffixAddPartitions[boolean table] : KW_ADD ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ -> { table }? ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) -> ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return alterStatementSuffixAddPartitions(boolean table) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ADD115=null;
		ParserRuleReturnScope ifNotExists116 =null;
		ParserRuleReturnScope alterStatementSuffixAddPartitionsElement117 =null;

		ASTNode KW_ADD115_tree=null;
		RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
		RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
		RewriteRuleSubtreeStream stream_alterStatementSuffixAddPartitionsElement=new RewriteRuleSubtreeStream(adaptor,"rule alterStatementSuffixAddPartitionsElement");

		 gParent.pushMsg("add partition statement", state); 
		try {
			// AlterClauseParser.g:243:5: ( KW_ADD ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ -> { table }? ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) -> ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) )
			// AlterClauseParser.g:243:7: KW_ADD ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+
			{
			KW_ADD115=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddPartitions1641); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_ADD.add(KW_ADD115);

			// AlterClauseParser.g:243:14: ( ifNotExists )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==KW_IF) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// AlterClauseParser.g:243:14: ifNotExists
					{
					pushFollow(FOLLOW_ifNotExists_in_alterStatementSuffixAddPartitions1643);
					ifNotExists116=gHiveParser.ifNotExists();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists116.getTree());
					}
					break;

			}

			// AlterClauseParser.g:243:27: ( alterStatementSuffixAddPartitionsElement )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==KW_PARTITION) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// AlterClauseParser.g:243:27: alterStatementSuffixAddPartitionsElement
					{
					pushFollow(FOLLOW_alterStatementSuffixAddPartitionsElement_in_alterStatementSuffixAddPartitions1646);
					alterStatementSuffixAddPartitionsElement117=alterStatementSuffixAddPartitionsElement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alterStatementSuffixAddPartitionsElement.add(alterStatementSuffixAddPartitionsElement117.getTree());
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			// AST REWRITE
			// elements: ifNotExists, ifNotExists, alterStatementSuffixAddPartitionsElement, alterStatementSuffixAddPartitionsElement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 244:5: -> { table }? ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
			if ( table ) {
				// AlterClauseParser.g:244:19: ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_ADDPARTS, "TOK_ALTERTABLE_ADDPARTS"), root_1);
				// AlterClauseParser.g:244:45: ( ifNotExists )?
				if ( stream_ifNotExists.hasNext() ) {
					adaptor.addChild(root_1, stream_ifNotExists.nextTree());
				}
				stream_ifNotExists.reset();

				if ( !(stream_alterStatementSuffixAddPartitionsElement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_alterStatementSuffixAddPartitionsElement.hasNext() ) {
					adaptor.addChild(root_1, stream_alterStatementSuffixAddPartitionsElement.nextTree());
				}
				stream_alterStatementSuffixAddPartitionsElement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 245:5: -> ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
			{
				// AlterClauseParser.g:245:19: ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW_ADDPARTS, "TOK_ALTERVIEW_ADDPARTS"), root_1);
				// AlterClauseParser.g:245:44: ( ifNotExists )?
				if ( stream_ifNotExists.hasNext() ) {
					adaptor.addChild(root_1, stream_ifNotExists.nextTree());
				}
				stream_ifNotExists.reset();

				if ( !(stream_alterStatementSuffixAddPartitionsElement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_alterStatementSuffixAddPartitionsElement.hasNext() ) {
					adaptor.addChild(root_1, stream_alterStatementSuffixAddPartitionsElement.nextTree());
				}
				stream_alterStatementSuffixAddPartitionsElement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixAddPartitions"


	public static class alterStatementSuffixAddPartitionsElement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixAddPartitionsElement"
	// AlterClauseParser.g:248:1: alterStatementSuffixAddPartitionsElement : partitionSpec ( partitionLocation )? ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return alterStatementSuffixAddPartitionsElement() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope partitionSpec118 =null;
		ParserRuleReturnScope partitionLocation119 =null;


		try {
			// AlterClauseParser.g:249:5: ( partitionSpec ( partitionLocation )? )
			// AlterClauseParser.g:249:7: partitionSpec ( partitionLocation )?
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitionsElement1709);
			partitionSpec118=gHiveParser.partitionSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionSpec118.getTree());

			// AlterClauseParser.g:249:21: ( partitionLocation )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==KW_LOCATION) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// AlterClauseParser.g:249:21: partitionLocation
					{
					pushFollow(FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitionsElement1711);
					partitionLocation119=partitionLocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionLocation119.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixAddPartitionsElement"


	public static class alterStatementSuffixTouch_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixTouch"
	// AlterClauseParser.g:252:1: alterStatementSuffixTouch : KW_TOUCH ( partitionSpec )* -> ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixTouch_return alterStatementSuffixTouch() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixTouch_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixTouch_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_TOUCH120=null;
		ParserRuleReturnScope partitionSpec121 =null;

		ASTNode KW_TOUCH120_tree=null;
		RewriteRuleTokenStream stream_KW_TOUCH=new RewriteRuleTokenStream(adaptor,"token KW_TOUCH");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		 gParent.pushMsg("touch statement", state); 
		try {
			// AlterClauseParser.g:255:5: ( KW_TOUCH ( partitionSpec )* -> ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* ) )
			// AlterClauseParser.g:255:7: KW_TOUCH ( partitionSpec )*
			{
			KW_TOUCH120=(Token)match(input,KW_TOUCH,FOLLOW_KW_TOUCH_in_alterStatementSuffixTouch1739); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TOUCH.add(KW_TOUCH120);

			// AlterClauseParser.g:255:16: ( partitionSpec )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==KW_PARTITION) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// AlterClauseParser.g:255:17: partitionSpec
					{
					pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixTouch1742);
					partitionSpec121=gHiveParser.partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec121.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			// AST REWRITE
			// elements: partitionSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 256:5: -> ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* )
			{
				// AlterClauseParser.g:256:8: ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_TOUCH, "TOK_ALTERTABLE_TOUCH"), root_1);
				// AlterClauseParser.g:256:31: ( partitionSpec )*
				while ( stream_partitionSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				}
				stream_partitionSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixTouch"


	public static class alterStatementSuffixArchive_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixArchive"
	// AlterClauseParser.g:259:1: alterStatementSuffixArchive : KW_ARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixArchive_return alterStatementSuffixArchive() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixArchive_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixArchive_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ARCHIVE122=null;
		ParserRuleReturnScope partitionSpec123 =null;

		ASTNode KW_ARCHIVE122_tree=null;
		RewriteRuleTokenStream stream_KW_ARCHIVE=new RewriteRuleTokenStream(adaptor,"token KW_ARCHIVE");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		 gParent.pushMsg("archive statement", state); 
		try {
			// AlterClauseParser.g:262:5: ( KW_ARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* ) )
			// AlterClauseParser.g:262:7: KW_ARCHIVE ( partitionSpec )*
			{
			KW_ARCHIVE122=(Token)match(input,KW_ARCHIVE,FOLLOW_KW_ARCHIVE_in_alterStatementSuffixArchive1786); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_ARCHIVE.add(KW_ARCHIVE122);

			// AlterClauseParser.g:262:18: ( partitionSpec )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==KW_PARTITION) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// AlterClauseParser.g:262:19: partitionSpec
					{
					pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixArchive1789);
					partitionSpec123=gHiveParser.partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec123.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			// AST REWRITE
			// elements: partitionSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 263:5: -> ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* )
			{
				// AlterClauseParser.g:263:8: ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_ARCHIVE, "TOK_ALTERTABLE_ARCHIVE"), root_1);
				// AlterClauseParser.g:263:33: ( partitionSpec )*
				while ( stream_partitionSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				}
				stream_partitionSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixArchive"


	public static class alterStatementSuffixUnArchive_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixUnArchive"
	// AlterClauseParser.g:266:1: alterStatementSuffixUnArchive : KW_UNARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return alterStatementSuffixUnArchive() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_UNARCHIVE124=null;
		ParserRuleReturnScope partitionSpec125 =null;

		ASTNode KW_UNARCHIVE124_tree=null;
		RewriteRuleTokenStream stream_KW_UNARCHIVE=new RewriteRuleTokenStream(adaptor,"token KW_UNARCHIVE");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		 gParent.pushMsg("unarchive statement", state); 
		try {
			// AlterClauseParser.g:269:5: ( KW_UNARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* ) )
			// AlterClauseParser.g:269:7: KW_UNARCHIVE ( partitionSpec )*
			{
			KW_UNARCHIVE124=(Token)match(input,KW_UNARCHIVE,FOLLOW_KW_UNARCHIVE_in_alterStatementSuffixUnArchive1833); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UNARCHIVE.add(KW_UNARCHIVE124);

			// AlterClauseParser.g:269:20: ( partitionSpec )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==KW_PARTITION) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// AlterClauseParser.g:269:21: partitionSpec
					{
					pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixUnArchive1836);
					partitionSpec125=gHiveParser.partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec125.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			// AST REWRITE
			// elements: partitionSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 270:5: -> ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* )
			{
				// AlterClauseParser.g:270:8: ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_UNARCHIVE, "TOK_ALTERTABLE_UNARCHIVE"), root_1);
				// AlterClauseParser.g:270:35: ( partitionSpec )*
				while ( stream_partitionSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				}
				stream_partitionSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixUnArchive"


	public static class partitionLocation_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "partitionLocation"
	// AlterClauseParser.g:273:1: partitionLocation : KW_LOCATION locn= StringLiteral -> ^( TOK_PARTITIONLOCATION $locn) ;
	public final HiveParser_AlterClauseParser.partitionLocation_return partitionLocation() throws RecognitionException {
		HiveParser_AlterClauseParser.partitionLocation_return retval = new HiveParser_AlterClauseParser.partitionLocation_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token locn=null;
		Token KW_LOCATION126=null;

		ASTNode locn_tree=null;
		ASTNode KW_LOCATION126_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");

		 gParent.pushMsg("partition location", state); 
		try {
			// AlterClauseParser.g:276:5: ( KW_LOCATION locn= StringLiteral -> ^( TOK_PARTITIONLOCATION $locn) )
			// AlterClauseParser.g:277:7: KW_LOCATION locn= StringLiteral
			{
			KW_LOCATION126=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_partitionLocation1886); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION126);

			locn=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_partitionLocation1890); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(locn);

			// AST REWRITE
			// elements: locn
			// token labels: locn
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_locn=new RewriteRuleTokenStream(adaptor,"token locn",locn);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 277:38: -> ^( TOK_PARTITIONLOCATION $locn)
			{
				// AlterClauseParser.g:277:41: ^( TOK_PARTITIONLOCATION $locn)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PARTITIONLOCATION, "TOK_PARTITIONLOCATION"), root_1);
				adaptor.addChild(root_1, stream_locn.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionLocation"


	public static class alterStatementSuffixDropPartitions_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixDropPartitions"
	// AlterClauseParser.g:280:1: alterStatementSuffixDropPartitions[boolean table] : KW_DROP ( ifExists )? KW_PARTITION partitionSelectorSpec ( COMMA KW_PARTITION partitionSelectorSpec )* ( KW_PURGE )? ( replicationClause )? -> { table }? ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? ) -> ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return alterStatementSuffixDropPartitions(boolean table) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DROP127=null;
		Token KW_PARTITION129=null;
		Token COMMA131=null;
		Token KW_PARTITION132=null;
		Token KW_PURGE134=null;
		ParserRuleReturnScope ifExists128 =null;
		ParserRuleReturnScope partitionSelectorSpec130 =null;
		ParserRuleReturnScope partitionSelectorSpec133 =null;
		ParserRuleReturnScope replicationClause135 =null;

		ASTNode KW_DROP127_tree=null;
		ASTNode KW_PARTITION129_tree=null;
		ASTNode COMMA131_tree=null;
		ASTNode KW_PARTITION132_tree=null;
		ASTNode KW_PURGE134_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_KW_PURGE=new RewriteRuleTokenStream(adaptor,"token KW_PURGE");
		RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
		RewriteRuleSubtreeStream stream_partitionSelectorSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSelectorSpec");
		RewriteRuleSubtreeStream stream_replicationClause=new RewriteRuleSubtreeStream(adaptor,"rule replicationClause");

		 gParent.pushMsg("drop partition statement", state); 
		try {
			// AlterClauseParser.g:283:5: ( KW_DROP ( ifExists )? KW_PARTITION partitionSelectorSpec ( COMMA KW_PARTITION partitionSelectorSpec )* ( KW_PURGE )? ( replicationClause )? -> { table }? ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? ) -> ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? ) )
			// AlterClauseParser.g:283:7: KW_DROP ( ifExists )? KW_PARTITION partitionSelectorSpec ( COMMA KW_PARTITION partitionSelectorSpec )* ( KW_PURGE )? ( replicationClause )?
			{
			KW_DROP127=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropPartitions1927); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP127);

			// AlterClauseParser.g:283:15: ( ifExists )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==KW_IF) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// AlterClauseParser.g:283:15: ifExists
					{
					pushFollow(FOLLOW_ifExists_in_alterStatementSuffixDropPartitions1929);
					ifExists128=gHiveParser.ifExists();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifExists.add(ifExists128.getTree());
					}
					break;

			}

			KW_PARTITION129=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions1932); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION129);

			pushFollow(FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions1934);
			partitionSelectorSpec130=gHiveParser.partitionSelectorSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionSelectorSpec.add(partitionSelectorSpec130.getTree());
			// AlterClauseParser.g:283:60: ( COMMA KW_PARTITION partitionSelectorSpec )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// AlterClauseParser.g:283:61: COMMA KW_PARTITION partitionSelectorSpec
					{
					COMMA131=(Token)match(input,COMMA,FOLLOW_COMMA_in_alterStatementSuffixDropPartitions1937); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA131);

					KW_PARTITION132=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions1939); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION132);

					pushFollow(FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions1941);
					partitionSelectorSpec133=gHiveParser.partitionSelectorSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSelectorSpec.add(partitionSelectorSpec133.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			// AlterClauseParser.g:283:104: ( KW_PURGE )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==KW_PURGE) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// AlterClauseParser.g:283:104: KW_PURGE
					{
					KW_PURGE134=(Token)match(input,KW_PURGE,FOLLOW_KW_PURGE_in_alterStatementSuffixDropPartitions1945); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PURGE.add(KW_PURGE134);

					}
					break;

			}

			// AlterClauseParser.g:283:114: ( replicationClause )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==KW_FOR) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// AlterClauseParser.g:283:114: replicationClause
					{
					pushFollow(FOLLOW_replicationClause_in_alterStatementSuffixDropPartitions1948);
					replicationClause135=gHiveParser.replicationClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_replicationClause.add(replicationClause135.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: partitionSelectorSpec, replicationClause, KW_PURGE, ifExists, partitionSelectorSpec, replicationClause, ifExists
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 284:5: -> { table }? ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? )
			if ( table ) {
				// AlterClauseParser.g:284:19: ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_DROPPARTS, "TOK_ALTERTABLE_DROPPARTS"), root_1);
				if ( !(stream_partitionSelectorSpec.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_partitionSelectorSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSelectorSpec.nextTree());
				}
				stream_partitionSelectorSpec.reset();

				// AlterClauseParser.g:284:69: ( ifExists )?
				if ( stream_ifExists.hasNext() ) {
					adaptor.addChild(root_1, stream_ifExists.nextTree());
				}
				stream_ifExists.reset();

				// AlterClauseParser.g:284:79: ( KW_PURGE )?
				if ( stream_KW_PURGE.hasNext() ) {
					adaptor.addChild(root_1, stream_KW_PURGE.nextNode());
				}
				stream_KW_PURGE.reset();

				// AlterClauseParser.g:284:89: ( replicationClause )?
				if ( stream_replicationClause.hasNext() ) {
					adaptor.addChild(root_1, stream_replicationClause.nextTree());
				}
				stream_replicationClause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 285:5: -> ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? )
			{
				// AlterClauseParser.g:285:19: ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW_DROPPARTS, "TOK_ALTERVIEW_DROPPARTS"), root_1);
				if ( !(stream_partitionSelectorSpec.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_partitionSelectorSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSelectorSpec.nextTree());
				}
				stream_partitionSelectorSpec.reset();

				// AlterClauseParser.g:285:68: ( ifExists )?
				if ( stream_ifExists.hasNext() ) {
					adaptor.addChild(root_1, stream_ifExists.nextTree());
				}
				stream_ifExists.reset();

				// AlterClauseParser.g:285:78: ( replicationClause )?
				if ( stream_replicationClause.hasNext() ) {
					adaptor.addChild(root_1, stream_replicationClause.nextTree());
				}
				stream_replicationClause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixDropPartitions"


	public static class alterStatementSuffixProperties_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixProperties"
	// AlterClauseParser.g:288:1: alterStatementSuffixProperties : ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? ) );
	public final HiveParser_AlterClauseParser.alterStatementSuffixProperties_return alterStatementSuffixProperties() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixProperties_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET136=null;
		Token KW_TBLPROPERTIES137=null;
		Token KW_UNSET139=null;
		Token KW_TBLPROPERTIES140=null;
		ParserRuleReturnScope tableProperties138 =null;
		ParserRuleReturnScope ifExists141 =null;
		ParserRuleReturnScope tableProperties142 =null;

		ASTNode KW_SET136_tree=null;
		ASTNode KW_TBLPROPERTIES137_tree=null;
		ASTNode KW_UNSET139_tree=null;
		ASTNode KW_TBLPROPERTIES140_tree=null;
		RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
		RewriteRuleTokenStream stream_KW_TBLPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_TBLPROPERTIES");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
		RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");

		 gParent.pushMsg("alter properties statement", state); 
		try {
			// AlterClauseParser.g:291:5: ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==KW_SET) ) {
				alt34=1;
			}
			else if ( (LA34_0==KW_UNSET) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// AlterClauseParser.g:291:7: KW_SET KW_TBLPROPERTIES tableProperties
					{
					KW_SET136=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixProperties2030); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET136);

					KW_TBLPROPERTIES137=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2032); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES137);

					pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixProperties2034);
					tableProperties138=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties138.getTree());
					// AST REWRITE
					// elements: tableProperties
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 292:5: -> ^( TOK_ALTERTABLE_PROPERTIES tableProperties )
					{
						// AlterClauseParser.g:292:8: ^( TOK_ALTERTABLE_PROPERTIES tableProperties )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_PROPERTIES, "TOK_ALTERTABLE_PROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:293:7: KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties
					{
					KW_UNSET139=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterStatementSuffixProperties2054); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNSET.add(KW_UNSET139);

					KW_TBLPROPERTIES140=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2056); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES140);

					// AlterClauseParser.g:293:33: ( ifExists )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==KW_IF) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// AlterClauseParser.g:293:33: ifExists
							{
							pushFollow(FOLLOW_ifExists_in_alterStatementSuffixProperties2058);
							ifExists141=gHiveParser.ifExists();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ifExists.add(ifExists141.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixProperties2061);
					tableProperties142=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties142.getTree());
					// AST REWRITE
					// elements: tableProperties, ifExists
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 294:5: -> ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? )
					{
						// AlterClauseParser.g:294:8: ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_DROPPROPERTIES, "TOK_ALTERTABLE_DROPPROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						// AlterClauseParser.g:294:56: ( ifExists )?
						if ( stream_ifExists.hasNext() ) {
							adaptor.addChild(root_1, stream_ifExists.nextTree());
						}
						stream_ifExists.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixProperties"


	public static class alterViewSuffixProperties_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterViewSuffixProperties"
	// AlterClauseParser.g:297:1: alterViewSuffixProperties : ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERVIEW_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? ) );
	public final HiveParser_AlterClauseParser.alterViewSuffixProperties_return alterViewSuffixProperties() throws RecognitionException {
		HiveParser_AlterClauseParser.alterViewSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterViewSuffixProperties_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET143=null;
		Token KW_TBLPROPERTIES144=null;
		Token KW_UNSET146=null;
		Token KW_TBLPROPERTIES147=null;
		ParserRuleReturnScope tableProperties145 =null;
		ParserRuleReturnScope ifExists148 =null;
		ParserRuleReturnScope tableProperties149 =null;

		ASTNode KW_SET143_tree=null;
		ASTNode KW_TBLPROPERTIES144_tree=null;
		ASTNode KW_UNSET146_tree=null;
		ASTNode KW_TBLPROPERTIES147_tree=null;
		RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
		RewriteRuleTokenStream stream_KW_TBLPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_TBLPROPERTIES");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
		RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");

		 gParent.pushMsg("alter view properties statement", state); 
		try {
			// AlterClauseParser.g:300:5: ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERVIEW_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? ) )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==KW_SET) ) {
				alt36=1;
			}
			else if ( (LA36_0==KW_UNSET) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// AlterClauseParser.g:300:7: KW_SET KW_TBLPROPERTIES tableProperties
					{
					KW_SET143=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterViewSuffixProperties2103); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET143);

					KW_TBLPROPERTIES144=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2105); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES144);

					pushFollow(FOLLOW_tableProperties_in_alterViewSuffixProperties2107);
					tableProperties145=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties145.getTree());
					// AST REWRITE
					// elements: tableProperties
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 301:5: -> ^( TOK_ALTERVIEW_PROPERTIES tableProperties )
					{
						// AlterClauseParser.g:301:8: ^( TOK_ALTERVIEW_PROPERTIES tableProperties )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW_PROPERTIES, "TOK_ALTERVIEW_PROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:302:7: KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties
					{
					KW_UNSET146=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterViewSuffixProperties2127); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNSET.add(KW_UNSET146);

					KW_TBLPROPERTIES147=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2129); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES147);

					// AlterClauseParser.g:302:33: ( ifExists )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==KW_IF) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// AlterClauseParser.g:302:33: ifExists
							{
							pushFollow(FOLLOW_ifExists_in_alterViewSuffixProperties2131);
							ifExists148=gHiveParser.ifExists();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ifExists.add(ifExists148.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_tableProperties_in_alterViewSuffixProperties2134);
					tableProperties149=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties149.getTree());
					// AST REWRITE
					// elements: tableProperties, ifExists
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 303:5: -> ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? )
					{
						// AlterClauseParser.g:303:8: ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERVIEW_DROPPROPERTIES, "TOK_ALTERVIEW_DROPPROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						// AlterClauseParser.g:303:55: ( ifExists )?
						if ( stream_ifExists.hasNext() ) {
							adaptor.addChild(root_1, stream_ifExists.nextTree());
						}
						stream_ifExists.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterViewSuffixProperties"


	public static class alterStatementSuffixSerdeProperties_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixSerdeProperties"
	// AlterClauseParser.g:306:1: alterStatementSuffixSerdeProperties[boolean partition] : ( KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> {partition}? ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? ) -> ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? ) | KW_SET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties ) | KW_UNSET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties ) );
	public final HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return alterStatementSuffixSerdeProperties(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token serdeName=null;
		Token KW_SET150=null;
		Token KW_SERDE151=null;
		Token KW_WITH152=null;
		Token KW_SERDEPROPERTIES153=null;
		Token KW_SET155=null;
		Token KW_SERDEPROPERTIES156=null;
		Token KW_UNSET158=null;
		Token KW_SERDEPROPERTIES159=null;
		ParserRuleReturnScope tableProperties154 =null;
		ParserRuleReturnScope tableProperties157 =null;
		ParserRuleReturnScope tableProperties160 =null;

		ASTNode serdeName_tree=null;
		ASTNode KW_SET150_tree=null;
		ASTNode KW_SERDE151_tree=null;
		ASTNode KW_WITH152_tree=null;
		ASTNode KW_SERDEPROPERTIES153_tree=null;
		ASTNode KW_SET155_tree=null;
		ASTNode KW_SERDEPROPERTIES156_tree=null;
		ASTNode KW_UNSET158_tree=null;
		ASTNode KW_SERDEPROPERTIES159_tree=null;
		RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_SERDEPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_SERDEPROPERTIES");
		RewriteRuleTokenStream stream_KW_SERDE=new RewriteRuleTokenStream(adaptor,"token KW_SERDE");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");

		 gParent.pushMsg("alter serde statement", state); 
		try {
			// AlterClauseParser.g:309:5: ( KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> {partition}? ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? ) -> ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? ) | KW_SET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties ) | KW_UNSET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties ) )
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==KW_SET) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==KW_SERDE) ) {
					alt38=1;
				}
				else if ( (LA38_1==KW_SERDEPROPERTIES) ) {
					alt38=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA38_0==KW_UNSET) ) {
				alt38=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// AlterClauseParser.g:309:7: KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )?
					{
					KW_SET150=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2177); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET150);

					KW_SERDE151=(Token)match(input,KW_SERDE,FOLLOW_KW_SERDE_in_alterStatementSuffixSerdeProperties2179); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SERDE.add(KW_SERDE151);

					serdeName=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixSerdeProperties2183); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(serdeName);

					// AlterClauseParser.g:309:47: ( KW_WITH KW_SERDEPROPERTIES tableProperties )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==KW_WITH) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// AlterClauseParser.g:309:48: KW_WITH KW_SERDEPROPERTIES tableProperties
							{
							KW_WITH152=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixSerdeProperties2186); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH152);

							KW_SERDEPROPERTIES153=(Token)match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2188); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES153);

							pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2190);
							tableProperties154=gHiveParser.tableProperties();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties154.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: serdeName, tableProperties, serdeName, tableProperties
					// token labels: serdeName
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_serdeName=new RewriteRuleTokenStream(adaptor,"token serdeName",serdeName);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 310:5: -> {partition}? ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? )
					if (partition) {
						// AlterClauseParser.g:310:21: ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_SERIALIZER, "TOK_ALTERPARTITION_SERIALIZER"), root_1);
						adaptor.addChild(root_1, stream_serdeName.nextNode());
						// AlterClauseParser.g:310:64: ( tableProperties )?
						if ( stream_tableProperties.hasNext() ) {
							adaptor.addChild(root_1, stream_tableProperties.nextTree());
						}
						stream_tableProperties.reset();

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 311:5: -> ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? )
					{
						// AlterClauseParser.g:311:21: ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SERIALIZER, "TOK_ALTERTABLE_SERIALIZER"), root_1);
						adaptor.addChild(root_1, stream_serdeName.nextNode());
						// AlterClauseParser.g:311:60: ( tableProperties )?
						if ( stream_tableProperties.hasNext() ) {
							adaptor.addChild(root_1, stream_tableProperties.nextTree());
						}
						stream_tableProperties.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:312:7: KW_SET KW_SERDEPROPERTIES tableProperties
					{
					KW_SET155=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2247); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET155);

					KW_SERDEPROPERTIES156=(Token)match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2249); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES156);

					pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2251);
					tableProperties157=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties157.getTree());
					// AST REWRITE
					// elements: tableProperties, tableProperties
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 313:5: -> {partition}? ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties )
					if (partition) {
						// AlterClauseParser.g:313:21: ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_SETSERDEPROPERTIES, "TOK_ALTERPARTITION_SETSERDEPROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 314:5: -> ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties )
					{
						// AlterClauseParser.g:314:21: ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SETSERDEPROPERTIES, "TOK_ALTERTABLE_SETSERDEPROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AlterClauseParser.g:315:7: KW_UNSET KW_SERDEPROPERTIES tableProperties
					{
					KW_UNSET158=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterStatementSuffixSerdeProperties2298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNSET.add(KW_UNSET158);

					KW_SERDEPROPERTIES159=(Token)match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2300); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES159);

					pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2302);
					tableProperties160=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties160.getTree());
					// AST REWRITE
					// elements: tableProperties, tableProperties
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 316:5: -> {partition}? ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties )
					if (partition) {
						// AlterClauseParser.g:316:21: ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_UNSETSERDEPROPERTIES, "TOK_ALTERPARTITION_UNSETSERDEPROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 317:5: -> ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties )
					{
						// AlterClauseParser.g:317:21: ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_UNSETSERDEPROPERTIES, "TOK_ALTERTABLE_UNSETSERDEPROPERTIES"), root_1);
						adaptor.addChild(root_1, stream_tableProperties.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixSerdeProperties"


	public static class tablePartitionPrefix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tablePartitionPrefix"
	// AlterClauseParser.g:320:1: tablePartitionPrefix : tableName ( partitionSpec )? -> ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? ) ;
	public final HiveParser_AlterClauseParser.tablePartitionPrefix_return tablePartitionPrefix() throws RecognitionException {
		HiveParser_AlterClauseParser.tablePartitionPrefix_return retval = new HiveParser_AlterClauseParser.tablePartitionPrefix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope tableName161 =null;
		ParserRuleReturnScope partitionSpec162 =null;

		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		gParent.pushMsg("table partition prefix", state);
		try {
			// AlterClauseParser.g:323:3: ( tableName ( partitionSpec )? -> ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? ) )
			// AlterClauseParser.g:323:5: tableName ( partitionSpec )?
			{
			pushFollow(FOLLOW_tableName_in_tablePartitionPrefix2366);
			tableName161=gHiveParser.tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tableName161.getTree());
			// AlterClauseParser.g:323:15: ( partitionSpec )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==KW_PARTITION) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// AlterClauseParser.g:323:15: partitionSpec
					{
					pushFollow(FOLLOW_partitionSpec_in_tablePartitionPrefix2368);
					partitionSpec162=gHiveParser.partitionSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec162.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: partitionSpec, tableName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 324:3: -> ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? )
			{
				// AlterClauseParser.g:324:5: ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLE_PARTITION, "TOK_TABLE_PARTITION"), root_1);
				adaptor.addChild(root_1, stream_tableName.nextTree());
				// AlterClauseParser.g:324:37: ( partitionSpec )?
				if ( stream_partitionSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				}
				stream_partitionSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tablePartitionPrefix"


	public static class alterStatementSuffixFileFormat_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixFileFormat"
	// AlterClauseParser.g:327:1: alterStatementSuffixFileFormat[boolean partition] : KW_SET KW_FILEFORMAT fileFormat -> {partition}? ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat ) -> ^( TOK_ALTERTABLE_FILEFORMAT fileFormat ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return alterStatementSuffixFileFormat(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET163=null;
		Token KW_FILEFORMAT164=null;
		ParserRuleReturnScope fileFormat165 =null;

		ASTNode KW_SET163_tree=null;
		ASTNode KW_FILEFORMAT164_tree=null;
		RewriteRuleTokenStream stream_KW_FILEFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_FILEFORMAT");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_fileFormat=new RewriteRuleSubtreeStream(adaptor,"rule fileFormat");

		gParent.pushMsg("alter fileformat statement", state); 
		try {
			// AlterClauseParser.g:330:3: ( KW_SET KW_FILEFORMAT fileFormat -> {partition}? ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat ) -> ^( TOK_ALTERTABLE_FILEFORMAT fileFormat ) )
			// AlterClauseParser.g:330:5: KW_SET KW_FILEFORMAT fileFormat
			{
			KW_SET163=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixFileFormat2405); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET163);

			KW_FILEFORMAT164=(Token)match(input,KW_FILEFORMAT,FOLLOW_KW_FILEFORMAT_in_alterStatementSuffixFileFormat2407); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_FILEFORMAT.add(KW_FILEFORMAT164);

			pushFollow(FOLLOW_fileFormat_in_alterStatementSuffixFileFormat2409);
			fileFormat165=fileFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fileFormat.add(fileFormat165.getTree());
			// AST REWRITE
			// elements: fileFormat, fileFormat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 331:3: -> {partition}? ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat )
			if (partition) {
				// AlterClauseParser.g:331:19: ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_FILEFORMAT, "TOK_ALTERPARTITION_FILEFORMAT"), root_1);
				adaptor.addChild(root_1, stream_fileFormat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 332:3: -> ^( TOK_ALTERTABLE_FILEFORMAT fileFormat )
			{
				// AlterClauseParser.g:332:19: ^( TOK_ALTERTABLE_FILEFORMAT fileFormat )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_FILEFORMAT, "TOK_ALTERTABLE_FILEFORMAT"), root_1);
				adaptor.addChild(root_1, stream_fileFormat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixFileFormat"


	public static class alterStatementSuffixClusterbySortby_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixClusterbySortby"
	// AlterClauseParser.g:335:1: alterStatementSuffixClusterbySortby : ( KW_NOT KW_CLUSTERED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED ) | KW_NOT KW_SORTED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED ) | tableBuckets -> ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets ) );
	public final HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return alterStatementSuffixClusterbySortby() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_NOT166=null;
		Token KW_CLUSTERED167=null;
		Token KW_NOT168=null;
		Token KW_SORTED169=null;
		ParserRuleReturnScope tableBuckets170 =null;

		ASTNode KW_NOT166_tree=null;
		ASTNode KW_CLUSTERED167_tree=null;
		ASTNode KW_NOT168_tree=null;
		ASTNode KW_SORTED169_tree=null;
		RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
		RewriteRuleTokenStream stream_KW_SORTED=new RewriteRuleTokenStream(adaptor,"token KW_SORTED");
		RewriteRuleTokenStream stream_KW_CLUSTERED=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTERED");
		RewriteRuleSubtreeStream stream_tableBuckets=new RewriteRuleSubtreeStream(adaptor,"rule tableBuckets");

		gParent.pushMsg("alter partition cluster by sort by statement", state);
		try {
			// AlterClauseParser.g:338:3: ( KW_NOT KW_CLUSTERED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED ) | KW_NOT KW_SORTED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED ) | tableBuckets -> ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets ) )
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==KW_NOT) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==KW_CLUSTERED) ) {
					alt40=1;
				}
				else if ( (LA40_1==KW_SORTED) ) {
					alt40=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA40_0==KW_CLUSTERED) ) {
				alt40=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// AlterClauseParser.g:338:5: KW_NOT KW_CLUSTERED
					{
					KW_NOT166=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2467); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT166);

					KW_CLUSTERED167=(Token)match(input,KW_CLUSTERED,FOLLOW_KW_CLUSTERED_in_alterStatementSuffixClusterbySortby2469); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CLUSTERED.add(KW_CLUSTERED167);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 338:25: -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED )
					{
						// AlterClauseParser.g:338:28: ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_CLUSTER_SORT, "TOK_ALTERTABLE_CLUSTER_SORT"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_NOT_CLUSTERED, "TOK_NOT_CLUSTERED"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:339:5: KW_NOT KW_SORTED
					{
					KW_NOT168=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT168);

					KW_SORTED169=(Token)match(input,KW_SORTED,FOLLOW_KW_SORTED_in_alterStatementSuffixClusterbySortby2485); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SORTED.add(KW_SORTED169);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 339:22: -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED )
					{
						// AlterClauseParser.g:339:25: ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_CLUSTER_SORT, "TOK_ALTERTABLE_CLUSTER_SORT"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_NOT_SORTED, "TOK_NOT_SORTED"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AlterClauseParser.g:340:5: tableBuckets
					{
					pushFollow(FOLLOW_tableBuckets_in_alterStatementSuffixClusterbySortby2499);
					tableBuckets170=gHiveParser.tableBuckets();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableBuckets.add(tableBuckets170.getTree());
					// AST REWRITE
					// elements: tableBuckets
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 340:18: -> ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets )
					{
						// AlterClauseParser.g:340:21: ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_CLUSTER_SORT, "TOK_ALTERTABLE_CLUSTER_SORT"), root_1);
						adaptor.addChild(root_1, stream_tableBuckets.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixClusterbySortby"


	public static class alterTblPartitionStatementSuffixSkewedLocation_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterTblPartitionStatementSuffixSkewedLocation"
	// AlterClauseParser.g:343:1: alterTblPartitionStatementSuffixSkewedLocation : KW_SET KW_SKEWED KW_LOCATION skewedLocations -> ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations ) ;
	public final HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return alterTblPartitionStatementSuffixSkewedLocation() throws RecognitionException {
		HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return retval = new HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET171=null;
		Token KW_SKEWED172=null;
		Token KW_LOCATION173=null;
		ParserRuleReturnScope skewedLocations174 =null;

		ASTNode KW_SET171_tree=null;
		ASTNode KW_SKEWED172_tree=null;
		ASTNode KW_LOCATION173_tree=null;
		RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");
		RewriteRuleTokenStream stream_KW_SKEWED=new RewriteRuleTokenStream(adaptor,"token KW_SKEWED");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_skewedLocations=new RewriteRuleSubtreeStream(adaptor,"rule skewedLocations");

		gParent.pushMsg("alter partition skewed location", state);
		try {
			// AlterClauseParser.g:346:3: ( KW_SET KW_SKEWED KW_LOCATION skewedLocations -> ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations ) )
			// AlterClauseParser.g:346:5: KW_SET KW_SKEWED KW_LOCATION skewedLocations
			{
			KW_SET171=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterTblPartitionStatementSuffixSkewedLocation2530); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET171);

			KW_SKEWED172=(Token)match(input,KW_SKEWED,FOLLOW_KW_SKEWED_in_alterTblPartitionStatementSuffixSkewedLocation2532); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SKEWED.add(KW_SKEWED172);

			KW_LOCATION173=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_alterTblPartitionStatementSuffixSkewedLocation2534); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION173);

			pushFollow(FOLLOW_skewedLocations_in_alterTblPartitionStatementSuffixSkewedLocation2536);
			skewedLocations174=skewedLocations();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_skewedLocations.add(skewedLocations174.getTree());
			// AST REWRITE
			// elements: skewedLocations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 347:3: -> ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations )
			{
				// AlterClauseParser.g:347:6: ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED_LOCATION, "TOK_ALTERTABLE_SKEWED_LOCATION"), root_1);
				adaptor.addChild(root_1, stream_skewedLocations.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterTblPartitionStatementSuffixSkewedLocation"


	public static class skewedLocations_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "skewedLocations"
	// AlterClauseParser.g:350:1: skewedLocations : LPAREN skewedLocationsList RPAREN -> ^( TOK_SKEWED_LOCATIONS skewedLocationsList ) ;
	public final HiveParser_AlterClauseParser.skewedLocations_return skewedLocations() throws RecognitionException {
		HiveParser_AlterClauseParser.skewedLocations_return retval = new HiveParser_AlterClauseParser.skewedLocations_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN175=null;
		Token RPAREN177=null;
		ParserRuleReturnScope skewedLocationsList176 =null;

		ASTNode LPAREN175_tree=null;
		ASTNode RPAREN177_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_skewedLocationsList=new RewriteRuleSubtreeStream(adaptor,"rule skewedLocationsList");

		 gParent.pushMsg("skewed locations", state); 
		try {
			// AlterClauseParser.g:353:5: ( LPAREN skewedLocationsList RPAREN -> ^( TOK_SKEWED_LOCATIONS skewedLocationsList ) )
			// AlterClauseParser.g:354:7: LPAREN skewedLocationsList RPAREN
			{
			LPAREN175=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_skewedLocations2577); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN175);

			pushFollow(FOLLOW_skewedLocationsList_in_skewedLocations2579);
			skewedLocationsList176=skewedLocationsList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_skewedLocationsList.add(skewedLocationsList176.getTree());
			RPAREN177=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_skewedLocations2581); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN177);

			// AST REWRITE
			// elements: skewedLocationsList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 354:41: -> ^( TOK_SKEWED_LOCATIONS skewedLocationsList )
			{
				// AlterClauseParser.g:354:44: ^( TOK_SKEWED_LOCATIONS skewedLocationsList )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SKEWED_LOCATIONS, "TOK_SKEWED_LOCATIONS"), root_1);
				adaptor.addChild(root_1, stream_skewedLocationsList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "skewedLocations"


	public static class skewedLocationsList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "skewedLocationsList"
	// AlterClauseParser.g:357:1: skewedLocationsList : skewedLocationMap ( COMMA skewedLocationMap )* -> ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ ) ;
	public final HiveParser_AlterClauseParser.skewedLocationsList_return skewedLocationsList() throws RecognitionException {
		HiveParser_AlterClauseParser.skewedLocationsList_return retval = new HiveParser_AlterClauseParser.skewedLocationsList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA179=null;
		ParserRuleReturnScope skewedLocationMap178 =null;
		ParserRuleReturnScope skewedLocationMap180 =null;

		ASTNode COMMA179_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_skewedLocationMap=new RewriteRuleSubtreeStream(adaptor,"rule skewedLocationMap");

		 gParent.pushMsg("skewed locations list", state); 
		try {
			// AlterClauseParser.g:360:5: ( skewedLocationMap ( COMMA skewedLocationMap )* -> ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ ) )
			// AlterClauseParser.g:361:7: skewedLocationMap ( COMMA skewedLocationMap )*
			{
			pushFollow(FOLLOW_skewedLocationMap_in_skewedLocationsList2622);
			skewedLocationMap178=skewedLocationMap();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_skewedLocationMap.add(skewedLocationMap178.getTree());
			// AlterClauseParser.g:361:25: ( COMMA skewedLocationMap )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==COMMA) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// AlterClauseParser.g:361:26: COMMA skewedLocationMap
					{
					COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_skewedLocationsList2625); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA179);

					pushFollow(FOLLOW_skewedLocationMap_in_skewedLocationsList2627);
					skewedLocationMap180=skewedLocationMap();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_skewedLocationMap.add(skewedLocationMap180.getTree());
					}
					break;

				default :
					break loop41;
				}
			}

			// AST REWRITE
			// elements: skewedLocationMap
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 361:52: -> ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ )
			{
				// AlterClauseParser.g:361:55: ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SKEWED_LOCATION_LIST, "TOK_SKEWED_LOCATION_LIST"), root_1);
				if ( !(stream_skewedLocationMap.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_skewedLocationMap.hasNext() ) {
					adaptor.addChild(root_1, stream_skewedLocationMap.nextTree());
				}
				stream_skewedLocationMap.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "skewedLocationsList"


	public static class skewedLocationMap_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "skewedLocationMap"
	// AlterClauseParser.g:364:1: skewedLocationMap : key= skewedValueLocationElement EQUAL value= StringLiteral -> ^( TOK_SKEWED_LOCATION_MAP $key $value) ;
	public final HiveParser_AlterClauseParser.skewedLocationMap_return skewedLocationMap() throws RecognitionException {
		HiveParser_AlterClauseParser.skewedLocationMap_return retval = new HiveParser_AlterClauseParser.skewedLocationMap_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token value=null;
		Token EQUAL181=null;
		ParserRuleReturnScope key =null;

		ASTNode value_tree=null;
		ASTNode EQUAL181_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_skewedValueLocationElement=new RewriteRuleSubtreeStream(adaptor,"rule skewedValueLocationElement");

		 gParent.pushMsg("specifying skewed location map", state); 
		try {
			// AlterClauseParser.g:367:5: (key= skewedValueLocationElement EQUAL value= StringLiteral -> ^( TOK_SKEWED_LOCATION_MAP $key $value) )
			// AlterClauseParser.g:368:7: key= skewedValueLocationElement EQUAL value= StringLiteral
			{
			pushFollow(FOLLOW_skewedValueLocationElement_in_skewedLocationMap2673);
			key=gHiveParser.skewedValueLocationElement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_skewedValueLocationElement.add(key.getTree());
			EQUAL181=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_skewedLocationMap2675); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL181);

			value=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_skewedLocationMap2679); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(value);

			// AST REWRITE
			// elements: key, value
			// token labels: value
			// rule labels: key, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_value=new RewriteRuleTokenStream(adaptor,"token value",value);
			RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key",key!=null?key.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 368:64: -> ^( TOK_SKEWED_LOCATION_MAP $key $value)
			{
				// AlterClauseParser.g:368:67: ^( TOK_SKEWED_LOCATION_MAP $key $value)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SKEWED_LOCATION_MAP, "TOK_SKEWED_LOCATION_MAP"), root_1);
				adaptor.addChild(root_1, stream_key.nextTree());
				adaptor.addChild(root_1, stream_value.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "skewedLocationMap"


	public static class alterStatementSuffixLocation_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixLocation"
	// AlterClauseParser.g:371:1: alterStatementSuffixLocation[boolean partition] : KW_SET KW_LOCATION newLoc= StringLiteral -> {partition}? ^( TOK_ALTERPARTITION_LOCATION $newLoc) -> ^( TOK_ALTERTABLE_LOCATION $newLoc) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixLocation_return alterStatementSuffixLocation(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixLocation_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixLocation_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token newLoc=null;
		Token KW_SET182=null;
		Token KW_LOCATION183=null;

		ASTNode newLoc_tree=null;
		ASTNode KW_SET182_tree=null;
		ASTNode KW_LOCATION183_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");

		gParent.pushMsg("alter location", state);
		try {
			// AlterClauseParser.g:374:3: ( KW_SET KW_LOCATION newLoc= StringLiteral -> {partition}? ^( TOK_ALTERPARTITION_LOCATION $newLoc) -> ^( TOK_ALTERTABLE_LOCATION $newLoc) )
			// AlterClauseParser.g:374:5: KW_SET KW_LOCATION newLoc= StringLiteral
			{
			KW_SET182=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixLocation2717); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET182);

			KW_LOCATION183=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_alterStatementSuffixLocation2719); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION183);

			newLoc=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixLocation2723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(newLoc);

			// AST REWRITE
			// elements: newLoc, newLoc
			// token labels: newLoc
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_newLoc=new RewriteRuleTokenStream(adaptor,"token newLoc",newLoc);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 375:3: -> {partition}? ^( TOK_ALTERPARTITION_LOCATION $newLoc)
			if (partition) {
				// AlterClauseParser.g:375:19: ^( TOK_ALTERPARTITION_LOCATION $newLoc)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_LOCATION, "TOK_ALTERPARTITION_LOCATION"), root_1);
				adaptor.addChild(root_1, stream_newLoc.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 376:3: -> ^( TOK_ALTERTABLE_LOCATION $newLoc)
			{
				// AlterClauseParser.g:376:19: ^( TOK_ALTERTABLE_LOCATION $newLoc)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_LOCATION, "TOK_ALTERTABLE_LOCATION"), root_1);
				adaptor.addChild(root_1, stream_newLoc.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixLocation"


	public static class alterStatementSuffixSkewedby_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixSkewedby"
	// AlterClauseParser.g:380:1: alterStatementSuffixSkewedby : ( tableSkewed -> ^( TOK_ALTERTABLE_SKEWED tableSkewed ) | KW_NOT KW_SKEWED -> ^( TOK_ALTERTABLE_SKEWED ) | KW_NOT storedAsDirs -> ^( TOK_ALTERTABLE_SKEWED storedAsDirs ) );
	public final HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return alterStatementSuffixSkewedby() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_NOT185=null;
		Token KW_SKEWED186=null;
		Token KW_NOT187=null;
		ParserRuleReturnScope tableSkewed184 =null;
		ParserRuleReturnScope storedAsDirs188 =null;

		ASTNode KW_NOT185_tree=null;
		ASTNode KW_SKEWED186_tree=null;
		ASTNode KW_NOT187_tree=null;
		RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
		RewriteRuleTokenStream stream_KW_SKEWED=new RewriteRuleTokenStream(adaptor,"token KW_SKEWED");
		RewriteRuleSubtreeStream stream_tableSkewed=new RewriteRuleSubtreeStream(adaptor,"rule tableSkewed");
		RewriteRuleSubtreeStream stream_storedAsDirs=new RewriteRuleSubtreeStream(adaptor,"rule storedAsDirs");

		gParent.pushMsg("alter skewed by statement", state);
		try {
			// AlterClauseParser.g:383:2: ( tableSkewed -> ^( TOK_ALTERTABLE_SKEWED tableSkewed ) | KW_NOT KW_SKEWED -> ^( TOK_ALTERTABLE_SKEWED ) | KW_NOT storedAsDirs -> ^( TOK_ALTERTABLE_SKEWED storedAsDirs ) )
			int alt42=3;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==KW_SKEWED) ) {
				alt42=1;
			}
			else if ( (LA42_0==KW_NOT) ) {
				int LA42_2 = input.LA(2);
				if ( (LA42_2==KW_SKEWED) ) {
					alt42=2;
				}
				else if ( (LA42_2==KW_STORED) ) {
					alt42=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// AlterClauseParser.g:383:4: tableSkewed
					{
					pushFollow(FOLLOW_tableSkewed_in_alterStatementSuffixSkewedby2782);
					tableSkewed184=gHiveParser.tableSkewed();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableSkewed.add(tableSkewed184.getTree());
					// AST REWRITE
					// elements: tableSkewed
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 384:2: -> ^( TOK_ALTERTABLE_SKEWED tableSkewed )
					{
						// AlterClauseParser.g:384:4: ^( TOK_ALTERTABLE_SKEWED tableSkewed )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED, "TOK_ALTERTABLE_SKEWED"), root_1);
						adaptor.addChild(root_1, stream_tableSkewed.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:386:3: KW_NOT KW_SKEWED
					{
					KW_NOT185=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2797); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT185);

					KW_SKEWED186=(Token)match(input,KW_SKEWED,FOLLOW_KW_SKEWED_in_alterStatementSuffixSkewedby2799); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SKEWED.add(KW_SKEWED186);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 387:2: -> ^( TOK_ALTERTABLE_SKEWED )
					{
						// AlterClauseParser.g:387:4: ^( TOK_ALTERTABLE_SKEWED )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED, "TOK_ALTERTABLE_SKEWED"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AlterClauseParser.g:389:3: KW_NOT storedAsDirs
					{
					KW_NOT187=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2812); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT187);

					pushFollow(FOLLOW_storedAsDirs_in_alterStatementSuffixSkewedby2814);
					storedAsDirs188=gHiveParser.storedAsDirs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_storedAsDirs.add(storedAsDirs188.getTree());
					// AST REWRITE
					// elements: storedAsDirs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 390:2: -> ^( TOK_ALTERTABLE_SKEWED storedAsDirs )
					{
						// AlterClauseParser.g:390:4: ^( TOK_ALTERTABLE_SKEWED storedAsDirs )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED, "TOK_ALTERTABLE_SKEWED"), root_1);
						adaptor.addChild(root_1, stream_storedAsDirs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixSkewedby"


	public static class alterStatementSuffixExchangePartition_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixExchangePartition"
	// AlterClauseParser.g:393:1: alterStatementSuffixExchangePartition : KW_EXCHANGE partitionSpec KW_WITH KW_TABLE exchangename= tableName -> ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return alterStatementSuffixExchangePartition() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_EXCHANGE189=null;
		Token KW_WITH191=null;
		Token KW_TABLE192=null;
		ParserRuleReturnScope exchangename =null;
		ParserRuleReturnScope partitionSpec190 =null;

		ASTNode KW_EXCHANGE189_tree=null;
		ASTNode KW_WITH191_tree=null;
		ASTNode KW_TABLE192_tree=null;
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
		RewriteRuleTokenStream stream_KW_EXCHANGE=new RewriteRuleTokenStream(adaptor,"token KW_EXCHANGE");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		gParent.pushMsg("alter exchange partition", state);
		try {
			// AlterClauseParser.g:396:5: ( KW_EXCHANGE partitionSpec KW_WITH KW_TABLE exchangename= tableName -> ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename) )
			// AlterClauseParser.g:396:7: KW_EXCHANGE partitionSpec KW_WITH KW_TABLE exchangename= tableName
			{
			KW_EXCHANGE189=(Token)match(input,KW_EXCHANGE,FOLLOW_KW_EXCHANGE_in_alterStatementSuffixExchangePartition2845); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_EXCHANGE.add(KW_EXCHANGE189);

			pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixExchangePartition2847);
			partitionSpec190=gHiveParser.partitionSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec190.getTree());
			KW_WITH191=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixExchangePartition2849); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH191);

			KW_TABLE192=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_alterStatementSuffixExchangePartition2851); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE192);

			pushFollow(FOLLOW_tableName_in_alterStatementSuffixExchangePartition2855);
			exchangename=gHiveParser.tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(exchangename.getTree());
			// AST REWRITE
			// elements: partitionSpec, exchangename
			// token labels: 
			// rule labels: exchangename, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_exchangename=new RewriteRuleSubtreeStream(adaptor,"rule exchangename",exchangename!=null?exchangename.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 397:5: -> ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename)
			{
				// AlterClauseParser.g:397:8: ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_EXCHANGEPARTITION, "TOK_ALTERTABLE_EXCHANGEPARTITION"), root_1);
				adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				adaptor.addChild(root_1, stream_exchangename.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state);}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixExchangePartition"


	public static class alterStatementSuffixRenamePart_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixRenamePart"
	// AlterClauseParser.g:400:1: alterStatementSuffixRenamePart : KW_RENAME KW_TO partitionSpec -> ^( TOK_ALTERTABLE_RENAMEPART partitionSpec ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return alterStatementSuffixRenamePart() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_RENAME193=null;
		Token KW_TO194=null;
		ParserRuleReturnScope partitionSpec195 =null;

		ASTNode KW_RENAME193_tree=null;
		ASTNode KW_TO194_tree=null;
		RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
		RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
		RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");

		 gParent.pushMsg("alter table rename partition statement", state); 
		try {
			// AlterClauseParser.g:403:5: ( KW_RENAME KW_TO partitionSpec -> ^( TOK_ALTERTABLE_RENAMEPART partitionSpec ) )
			// AlterClauseParser.g:403:7: KW_RENAME KW_TO partitionSpec
			{
			KW_RENAME193=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterStatementSuffixRenamePart2897); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_RENAME.add(KW_RENAME193);

			KW_TO194=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixRenamePart2899); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO194);

			pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixRenamePart2901);
			partitionSpec195=gHiveParser.partitionSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec195.getTree());
			// AST REWRITE
			// elements: partitionSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 404:5: -> ^( TOK_ALTERTABLE_RENAMEPART partitionSpec )
			{
				// AlterClauseParser.g:404:7: ^( TOK_ALTERTABLE_RENAMEPART partitionSpec )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_RENAMEPART, "TOK_ALTERTABLE_RENAMEPART"), root_1);
				adaptor.addChild(root_1, stream_partitionSpec.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixRenamePart"


	public static class alterStatementSuffixStatsPart_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixStatsPart"
	// AlterClauseParser.g:407:1: alterStatementSuffixStatsPart : KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixStatsPart_return alterStatementSuffixStatsPart() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixStatsPart_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixStatsPart_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token comment=null;
		Token KW_UPDATE196=null;
		Token KW_STATISTICS197=null;
		Token KW_FOR198=null;
		Token KW_COLUMN199=null;
		Token KW_SET200=null;
		Token KW_COMMENT202=null;
		ParserRuleReturnScope colName =null;
		ParserRuleReturnScope tableProperties201 =null;

		ASTNode comment_tree=null;
		ASTNode KW_UPDATE196_tree=null;
		ASTNode KW_STATISTICS197_tree=null;
		ASTNode KW_FOR198_tree=null;
		ASTNode KW_COLUMN199_tree=null;
		ASTNode KW_SET200_tree=null;
		ASTNode KW_COMMENT202_tree=null;
		RewriteRuleTokenStream stream_KW_STATISTICS=new RewriteRuleTokenStream(adaptor,"token KW_STATISTICS");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
		RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
		RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
		RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");

		 gParent.pushMsg("alter table stats partition statement", state); 
		try {
			// AlterClauseParser.g:410:5: ( KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) )
			// AlterClauseParser.g:410:7: KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )?
			{
			KW_UPDATE196=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixStatsPart2939); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE196);

			KW_STATISTICS197=(Token)match(input,KW_STATISTICS,FOLLOW_KW_STATISTICS_in_alterStatementSuffixStatsPart2941); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_STATISTICS.add(KW_STATISTICS197);

			KW_FOR198=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_alterStatementSuffixStatsPart2943); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR198);

			// AlterClauseParser.g:410:38: ( KW_COLUMN )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==KW_COLUMN) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// AlterClauseParser.g:410:38: KW_COLUMN
					{
					KW_COLUMN199=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementSuffixStatsPart2945); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN199);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_alterStatementSuffixStatsPart2950);
			colName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(colName.getTree());
			KW_SET200=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixStatsPart2952); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET200);

			pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixStatsPart2954);
			tableProperties201=gHiveParser.tableProperties();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties201.getTree());
			// AlterClauseParser.g:410:91: ( KW_COMMENT comment= StringLiteral )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==KW_COMMENT) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// AlterClauseParser.g:410:92: KW_COMMENT comment= StringLiteral
					{
					KW_COMMENT202=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_alterStatementSuffixStatsPart2957); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT202);

					comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixStatsPart2961); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(comment);

					}
					break;

			}

			// AST REWRITE
			// elements: tableProperties, colName, comment
			// token labels: comment
			// rule labels: colName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
			RewriteRuleSubtreeStream stream_colName=new RewriteRuleSubtreeStream(adaptor,"rule colName",colName!=null?colName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 411:5: -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
			{
				// AlterClauseParser.g:411:7: ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATECOLSTATS, "TOK_ALTERTABLE_UPDATECOLSTATS"), root_1);
				adaptor.addChild(root_1, stream_colName.nextTree());
				adaptor.addChild(root_1, stream_tableProperties.nextTree());
				// AlterClauseParser.g:411:65: ( $comment)?
				if ( stream_comment.hasNext() ) {
					adaptor.addChild(root_1, stream_comment.nextNode());
				}
				stream_comment.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixStatsPart"


	public static class alterStatementSuffixMergeFiles_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixMergeFiles"
	// AlterClauseParser.g:414:1: alterStatementSuffixMergeFiles[boolean partition] : KW_CONCATENATE -> {partition}? ^( TOK_ALTERPARTITION_MERGEFILES ) -> ^( TOK_ALTERTABLE_MERGEFILES ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return alterStatementSuffixMergeFiles(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_CONCATENATE203=null;

		ASTNode KW_CONCATENATE203_tree=null;
		RewriteRuleTokenStream stream_KW_CONCATENATE=new RewriteRuleTokenStream(adaptor,"token KW_CONCATENATE");

		 gParent.pushMsg("", state); 
		try {
			// AlterClauseParser.g:417:5: ( KW_CONCATENATE -> {partition}? ^( TOK_ALTERPARTITION_MERGEFILES ) -> ^( TOK_ALTERTABLE_MERGEFILES ) )
			// AlterClauseParser.g:417:7: KW_CONCATENATE
			{
			KW_CONCATENATE203=(Token)match(input,KW_CONCATENATE,FOLLOW_KW_CONCATENATE_in_alterStatementSuffixMergeFiles3009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CONCATENATE.add(KW_CONCATENATE203);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 418:5: -> {partition}? ^( TOK_ALTERPARTITION_MERGEFILES )
			if (partition) {
				// AlterClauseParser.g:418:21: ^( TOK_ALTERPARTITION_MERGEFILES )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_MERGEFILES, "TOK_ALTERPARTITION_MERGEFILES"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 419:5: -> ^( TOK_ALTERTABLE_MERGEFILES )
			{
				// AlterClauseParser.g:419:21: ^( TOK_ALTERTABLE_MERGEFILES )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_MERGEFILES, "TOK_ALTERTABLE_MERGEFILES"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixMergeFiles"


	public static class alterStatementSuffixBucketNum_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixBucketNum"
	// AlterClauseParser.g:422:1: alterStatementSuffixBucketNum[boolean partition] : KW_INTO num= Number KW_BUCKETS -> {partition}? ^( TOK_ALTERPARTITION_BUCKETS $num) -> ^( TOK_ALTERTABLE_BUCKETS $num) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return alterStatementSuffixBucketNum(boolean partition) throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token num=null;
		Token KW_INTO204=null;
		Token KW_BUCKETS205=null;

		ASTNode num_tree=null;
		ASTNode KW_INTO204_tree=null;
		ASTNode KW_BUCKETS205_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_INTO=new RewriteRuleTokenStream(adaptor,"token KW_INTO");
		RewriteRuleTokenStream stream_KW_BUCKETS=new RewriteRuleTokenStream(adaptor,"token KW_BUCKETS");

		 gParent.pushMsg("", state); 
		try {
			// AlterClauseParser.g:425:5: ( KW_INTO num= Number KW_BUCKETS -> {partition}? ^( TOK_ALTERPARTITION_BUCKETS $num) -> ^( TOK_ALTERTABLE_BUCKETS $num) )
			// AlterClauseParser.g:425:7: KW_INTO num= Number KW_BUCKETS
			{
			KW_INTO204=(Token)match(input,KW_INTO,FOLLOW_KW_INTO_in_alterStatementSuffixBucketNum3072); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_INTO.add(KW_INTO204);

			num=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixBucketNum3076); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(num);

			KW_BUCKETS205=(Token)match(input,KW_BUCKETS,FOLLOW_KW_BUCKETS_in_alterStatementSuffixBucketNum3078); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_BUCKETS.add(KW_BUCKETS205);

			// AST REWRITE
			// elements: num, num
			// token labels: num
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_num=new RewriteRuleTokenStream(adaptor,"token num",num);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 426:5: -> {partition}? ^( TOK_ALTERPARTITION_BUCKETS $num)
			if (partition) {
				// AlterClauseParser.g:426:21: ^( TOK_ALTERPARTITION_BUCKETS $num)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERPARTITION_BUCKETS, "TOK_ALTERPARTITION_BUCKETS"), root_1);
				adaptor.addChild(root_1, stream_num.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 427:5: -> ^( TOK_ALTERTABLE_BUCKETS $num)
			{
				// AlterClauseParser.g:427:21: ^( TOK_ALTERTABLE_BUCKETS $num)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_BUCKETS, "TOK_ALTERTABLE_BUCKETS"), root_1);
				adaptor.addChild(root_1, stream_num.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixBucketNum"


	public static class blocking_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "blocking"
	// AlterClauseParser.g:430:1: blocking : KW_AND KW_WAIT -> TOK_BLOCKING ;
	public final HiveParser_AlterClauseParser.blocking_return blocking() throws RecognitionException {
		HiveParser_AlterClauseParser.blocking_return retval = new HiveParser_AlterClauseParser.blocking_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_AND206=null;
		Token KW_WAIT207=null;

		ASTNode KW_AND206_tree=null;
		ASTNode KW_WAIT207_tree=null;
		RewriteRuleTokenStream stream_KW_WAIT=new RewriteRuleTokenStream(adaptor,"token KW_WAIT");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");

		try {
			// AlterClauseParser.g:431:3: ( KW_AND KW_WAIT -> TOK_BLOCKING )
			// AlterClauseParser.g:431:5: KW_AND KW_WAIT
			{
			KW_AND206=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_blocking3134); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND206);

			KW_WAIT207=(Token)match(input,KW_WAIT,FOLLOW_KW_WAIT_in_blocking3136); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WAIT.add(KW_WAIT207);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 432:3: -> TOK_BLOCKING
			{
				adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_BLOCKING, "TOK_BLOCKING"));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blocking"


	public static class compactPool_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "compactPool"
	// AlterClauseParser.g:435:1: compactPool : KW_POOL poolName= StringLiteral -> ^( TOK_COMPACT_POOL $poolName) ;
	public final HiveParser_AlterClauseParser.compactPool_return compactPool() throws RecognitionException {
		HiveParser_AlterClauseParser.compactPool_return retval = new HiveParser_AlterClauseParser.compactPool_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token poolName=null;
		Token KW_POOL208=null;

		ASTNode poolName_tree=null;
		ASTNode KW_POOL208_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");

		try {
			// AlterClauseParser.g:436:3: ( KW_POOL poolName= StringLiteral -> ^( TOK_COMPACT_POOL $poolName) )
			// AlterClauseParser.g:436:5: KW_POOL poolName= StringLiteral
			{
			KW_POOL208=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_compactPool3155); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_POOL.add(KW_POOL208);

			poolName=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_compactPool3159); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(poolName);

			// AST REWRITE
			// elements: poolName
			// token labels: poolName
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_poolName=new RewriteRuleTokenStream(adaptor,"token poolName",poolName);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 437:3: -> ^( TOK_COMPACT_POOL $poolName)
			{
				// AlterClauseParser.g:437:6: ^( TOK_COMPACT_POOL $poolName)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_COMPACT_POOL, "TOK_COMPACT_POOL"), root_1);
				adaptor.addChild(root_1, stream_poolName.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compactPool"


	public static class alterStatementSuffixCompact_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixCompact"
	// AlterClauseParser.g:440:1: alterStatementSuffixCompact : KW_COMPACT compactType= StringLiteral ( blocking )? ( compactPool )? ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_COMPACT $compactType ( blocking )? ( compactPool )? ( tableProperties )? ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixCompact_return alterStatementSuffixCompact() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixCompact_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixCompact_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token compactType=null;
		Token KW_COMPACT209=null;
		Token KW_WITH212=null;
		Token KW_OVERWRITE213=null;
		Token KW_TBLPROPERTIES214=null;
		ParserRuleReturnScope blocking210 =null;
		ParserRuleReturnScope compactPool211 =null;
		ParserRuleReturnScope tableProperties215 =null;

		ASTNode compactType_tree=null;
		ASTNode KW_COMPACT209_tree=null;
		ASTNode KW_WITH212_tree=null;
		ASTNode KW_OVERWRITE213_tree=null;
		ASTNode KW_TBLPROPERTIES214_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_COMPACT=new RewriteRuleTokenStream(adaptor,"token KW_COMPACT");
		RewriteRuleTokenStream stream_KW_OVERWRITE=new RewriteRuleTokenStream(adaptor,"token KW_OVERWRITE");
		RewriteRuleTokenStream stream_KW_TBLPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_TBLPROPERTIES");
		RewriteRuleSubtreeStream stream_blocking=new RewriteRuleSubtreeStream(adaptor,"rule blocking");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
		RewriteRuleSubtreeStream stream_compactPool=new RewriteRuleSubtreeStream(adaptor,"rule compactPool");

		 gParent.msgs.push("compaction request"); 
		try {
			// AlterClauseParser.g:443:5: ( KW_COMPACT compactType= StringLiteral ( blocking )? ( compactPool )? ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )? -> ^( TOK_ALTERTABLE_COMPACT $compactType ( blocking )? ( compactPool )? ( tableProperties )? ) )
			// AlterClauseParser.g:443:7: KW_COMPACT compactType= StringLiteral ( blocking )? ( compactPool )? ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )?
			{
			KW_COMPACT209=(Token)match(input,KW_COMPACT,FOLLOW_KW_COMPACT_in_alterStatementSuffixCompact3195); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_COMPACT.add(KW_COMPACT209);

			compactType=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixCompact3199); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(compactType);

			// AlterClauseParser.g:443:44: ( blocking )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==KW_AND) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// AlterClauseParser.g:443:44: blocking
					{
					pushFollow(FOLLOW_blocking_in_alterStatementSuffixCompact3201);
					blocking210=blocking();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_blocking.add(blocking210.getTree());
					}
					break;

			}

			// AlterClauseParser.g:443:54: ( compactPool )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==KW_POOL) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// AlterClauseParser.g:443:54: compactPool
					{
					pushFollow(FOLLOW_compactPool_in_alterStatementSuffixCompact3204);
					compactPool211=compactPool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_compactPool.add(compactPool211.getTree());
					}
					break;

			}

			// AlterClauseParser.g:443:67: ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==KW_WITH) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// AlterClauseParser.g:443:68: KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties
					{
					KW_WITH212=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixCompact3208); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH212);

					KW_OVERWRITE213=(Token)match(input,KW_OVERWRITE,FOLLOW_KW_OVERWRITE_in_alterStatementSuffixCompact3210); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_OVERWRITE.add(KW_OVERWRITE213);

					KW_TBLPROPERTIES214=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixCompact3212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES214);

					pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixCompact3214);
					tableProperties215=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties215.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: tableProperties, compactPool, compactType, blocking
			// token labels: compactType
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_compactType=new RewriteRuleTokenStream(adaptor,"token compactType",compactType);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 444:5: -> ^( TOK_ALTERTABLE_COMPACT $compactType ( blocking )? ( compactPool )? ( tableProperties )? )
			{
				// AlterClauseParser.g:444:8: ^( TOK_ALTERTABLE_COMPACT $compactType ( blocking )? ( compactPool )? ( tableProperties )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_COMPACT, "TOK_ALTERTABLE_COMPACT"), root_1);
				adaptor.addChild(root_1, stream_compactType.nextNode());
				// AlterClauseParser.g:444:46: ( blocking )?
				if ( stream_blocking.hasNext() ) {
					adaptor.addChild(root_1, stream_blocking.nextTree());
				}
				stream_blocking.reset();

				// AlterClauseParser.g:444:57: ( compactPool )?
				if ( stream_compactPool.hasNext() ) {
					adaptor.addChild(root_1, stream_compactPool.nextTree());
				}
				stream_compactPool.reset();

				// AlterClauseParser.g:444:70: ( tableProperties )?
				if ( stream_tableProperties.hasNext() ) {
					adaptor.addChild(root_1, stream_tableProperties.nextTree());
				}
				stream_tableProperties.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.msgs.pop(); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixCompact"


	public static class alterStatementSuffixSetOwner_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixSetOwner"
	// AlterClauseParser.g:447:1: alterStatementSuffixSetOwner : KW_SET KW_OWNER principalName -> ^( TOK_ALTERTABLE_OWNER principalName ) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return alterStatementSuffixSetOwner() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET216=null;
		Token KW_OWNER217=null;
		ParserRuleReturnScope principalName218 =null;

		ASTNode KW_SET216_tree=null;
		ASTNode KW_OWNER217_tree=null;
		RewriteRuleTokenStream stream_KW_OWNER=new RewriteRuleTokenStream(adaptor,"token KW_OWNER");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_principalName=new RewriteRuleSubtreeStream(adaptor,"rule principalName");

		 gParent.pushMsg("alter table set owner", state); 
		try {
			// AlterClauseParser.g:450:5: ( KW_SET KW_OWNER principalName -> ^( TOK_ALTERTABLE_OWNER principalName ) )
			// AlterClauseParser.g:450:7: KW_SET KW_OWNER principalName
			{
			KW_SET216=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSetOwner3266); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET216);

			KW_OWNER217=(Token)match(input,KW_OWNER,FOLLOW_KW_OWNER_in_alterStatementSuffixSetOwner3268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OWNER.add(KW_OWNER217);

			pushFollow(FOLLOW_principalName_in_alterStatementSuffixSetOwner3270);
			principalName218=gHiveParser.principalName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_principalName.add(principalName218.getTree());
			// AST REWRITE
			// elements: principalName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 451:5: -> ^( TOK_ALTERTABLE_OWNER principalName )
			{
				// AlterClauseParser.g:451:8: ^( TOK_ALTERTABLE_OWNER principalName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_OWNER, "TOK_ALTERTABLE_OWNER"), root_1);
				adaptor.addChild(root_1, stream_principalName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixSetOwner"


	public static class alterStatementSuffixSetPartSpec_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixSetPartSpec"
	// AlterClauseParser.g:454:1: alterStatementSuffixSetPartSpec : KW_SET KW_PARTITION KW_SPEC LPAREN (spec= partitionTransformSpec ) RPAREN -> ^( TOK_ALTERTABLE_SETPARTSPEC $spec) ;
	public final HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return alterStatementSuffixSetPartSpec() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET219=null;
		Token KW_PARTITION220=null;
		Token KW_SPEC221=null;
		Token LPAREN222=null;
		Token RPAREN223=null;
		ParserRuleReturnScope spec =null;

		ASTNode KW_SET219_tree=null;
		ASTNode KW_PARTITION220_tree=null;
		ASTNode KW_SPEC221_tree=null;
		ASTNode LPAREN222_tree=null;
		ASTNode RPAREN223_tree=null;
		RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
		RewriteRuleTokenStream stream_KW_SPEC=new RewriteRuleTokenStream(adaptor,"token KW_SPEC");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_partitionTransformSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionTransformSpec");

		 gParent.pushMsg("alter table set partition spec", state); 
		try {
			// AlterClauseParser.g:457:5: ( KW_SET KW_PARTITION KW_SPEC LPAREN (spec= partitionTransformSpec ) RPAREN -> ^( TOK_ALTERTABLE_SETPARTSPEC $spec) )
			// AlterClauseParser.g:457:7: KW_SET KW_PARTITION KW_SPEC LPAREN (spec= partitionTransformSpec ) RPAREN
			{
			KW_SET219=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSetPartSpec3309); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET219);

			KW_PARTITION220=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementSuffixSetPartSpec3311); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION220);

			KW_SPEC221=(Token)match(input,KW_SPEC,FOLLOW_KW_SPEC_in_alterStatementSuffixSetPartSpec3313); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SPEC.add(KW_SPEC221);

			LPAREN222=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixSetPartSpec3315); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN222);

			// AlterClauseParser.g:457:42: (spec= partitionTransformSpec )
			// AlterClauseParser.g:457:43: spec= partitionTransformSpec
			{
			pushFollow(FOLLOW_partitionTransformSpec_in_alterStatementSuffixSetPartSpec3322);
			spec=gHiveParser.partitionTransformSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionTransformSpec.add(spec.getTree());
			}

			RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixSetPartSpec3325); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN223);

			// AST REWRITE
			// elements: spec
			// token labels: 
			// rule labels: spec, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec",spec!=null?spec.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 458:5: -> ^( TOK_ALTERTABLE_SETPARTSPEC $spec)
			{
				// AlterClauseParser.g:458:8: ^( TOK_ALTERTABLE_SETPARTSPEC $spec)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_SETPARTSPEC, "TOK_ALTERTABLE_SETPARTSPEC"), root_1);
				adaptor.addChild(root_1, stream_spec.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixSetPartSpec"


	public static class alterStatementSuffixExecute_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterStatementSuffixExecute"
	// AlterClauseParser.g:461:1: alterStatementSuffixExecute : ( KW_EXECUTE KW_ROLLBACK LPAREN (rollbackParam= ( StringLiteral | Number ) ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS LPAREN (expireParam= StringLiteral ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $expireParam) );
	public final HiveParser_AlterClauseParser.alterStatementSuffixExecute_return alterStatementSuffixExecute() throws RecognitionException {
		HiveParser_AlterClauseParser.alterStatementSuffixExecute_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixExecute_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token rollbackParam=null;
		Token expireParam=null;
		Token KW_EXECUTE224=null;
		Token KW_ROLLBACK225=null;
		Token LPAREN226=null;
		Token RPAREN227=null;
		Token KW_EXECUTE228=null;
		Token KW_EXPIRE_SNAPSHOTS229=null;
		Token LPAREN230=null;
		Token RPAREN231=null;

		ASTNode rollbackParam_tree=null;
		ASTNode expireParam_tree=null;
		ASTNode KW_EXECUTE224_tree=null;
		ASTNode KW_ROLLBACK225_tree=null;
		ASTNode LPAREN226_tree=null;
		ASTNode RPAREN227_tree=null;
		ASTNode KW_EXECUTE228_tree=null;
		ASTNode KW_EXPIRE_SNAPSHOTS229_tree=null;
		ASTNode LPAREN230_tree=null;
		ASTNode RPAREN231_tree=null;
		RewriteRuleTokenStream stream_KW_ROLLBACK=new RewriteRuleTokenStream(adaptor,"token KW_ROLLBACK");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_EXPIRE_SNAPSHOTS=new RewriteRuleTokenStream(adaptor,"token KW_EXPIRE_SNAPSHOTS");
		RewriteRuleTokenStream stream_KW_EXECUTE=new RewriteRuleTokenStream(adaptor,"token KW_EXECUTE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");

		 gParent.pushMsg("alter table execute", state); 
		try {
			// AlterClauseParser.g:464:5: ( KW_EXECUTE KW_ROLLBACK LPAREN (rollbackParam= ( StringLiteral | Number ) ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS LPAREN (expireParam= StringLiteral ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $expireParam) )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==KW_EXECUTE) ) {
				int LA49_1 = input.LA(2);
				if ( (LA49_1==KW_ROLLBACK) ) {
					alt49=1;
				}
				else if ( (LA49_1==KW_EXPIRE_SNAPSHOTS) ) {
					alt49=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// AlterClauseParser.g:464:7: KW_EXECUTE KW_ROLLBACK LPAREN (rollbackParam= ( StringLiteral | Number ) ) RPAREN
					{
					KW_EXECUTE224=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3365); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE224);

					KW_ROLLBACK225=(Token)match(input,KW_ROLLBACK,FOLLOW_KW_ROLLBACK_in_alterStatementSuffixExecute3367); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROLLBACK.add(KW_ROLLBACK225);

					LPAREN226=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixExecute3369); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN226);

					// AlterClauseParser.g:464:37: (rollbackParam= ( StringLiteral | Number ) )
					// AlterClauseParser.g:464:38: rollbackParam= ( StringLiteral | Number )
					{
					// AlterClauseParser.g:464:52: ( StringLiteral | Number )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==StringLiteral) ) {
						alt48=1;
					}
					else if ( (LA48_0==Number) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// AlterClauseParser.g:464:53: StringLiteral
							{
							rollbackParam=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3375); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_StringLiteral.add(rollbackParam);

							}
							break;
						case 2 :
							// AlterClauseParser.g:464:69: Number
							{
							rollbackParam=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixExecute3379); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Number.add(rollbackParam);

							}
							break;

					}

					}

					RPAREN227=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixExecute3383); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN227);

					// AST REWRITE
					// elements: KW_ROLLBACK, rollbackParam
					// token labels: rollbackParam
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_rollbackParam=new RewriteRuleTokenStream(adaptor,"token rollbackParam",rollbackParam);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 465:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam)
					{
						// AlterClauseParser.g:465:8: ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE"), root_1);
						adaptor.addChild(root_1, stream_KW_ROLLBACK.nextNode());
						adaptor.addChild(root_1, stream_rollbackParam.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:466:7: KW_EXECUTE KW_EXPIRE_SNAPSHOTS LPAREN (expireParam= StringLiteral ) RPAREN
					{
					KW_EXECUTE228=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3406); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE228);

					KW_EXPIRE_SNAPSHOTS229=(Token)match(input,KW_EXPIRE_SNAPSHOTS,FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3408); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_EXPIRE_SNAPSHOTS.add(KW_EXPIRE_SNAPSHOTS229);

					LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixExecute3410); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN230);

					// AlterClauseParser.g:466:45: (expireParam= StringLiteral )
					// AlterClauseParser.g:466:46: expireParam= StringLiteral
					{
					expireParam=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3415); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(expireParam);

					}

					RPAREN231=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixExecute3418); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN231);

					// AST REWRITE
					// elements: KW_EXPIRE_SNAPSHOTS, expireParam
					// token labels: expireParam
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_expireParam=new RewriteRuleTokenStream(adaptor,"token expireParam",expireParam);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 467:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $expireParam)
					{
						// AlterClauseParser.g:467:8: ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $expireParam)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE"), root_1);
						adaptor.addChild(root_1, stream_KW_EXPIRE_SNAPSHOTS.nextNode());
						adaptor.addChild(root_1, stream_expireParam.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterStatementSuffixExecute"


	public static class fileFormat_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "fileFormat"
	// AlterClauseParser.g:470:1: fileFormat : ( KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral KW_SERDE serdeCls= StringLiteral ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )? -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? ) |genericSpec= identifier -> ^( TOK_FILEFORMAT_GENERIC $genericSpec) );
	public final HiveParser_AlterClauseParser.fileFormat_return fileFormat() throws RecognitionException {
		HiveParser_AlterClauseParser.fileFormat_return retval = new HiveParser_AlterClauseParser.fileFormat_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token inFmt=null;
		Token outFmt=null;
		Token serdeCls=null;
		Token inDriver=null;
		Token outDriver=null;
		Token KW_INPUTFORMAT232=null;
		Token KW_OUTPUTFORMAT233=null;
		Token KW_SERDE234=null;
		Token KW_INPUTDRIVER235=null;
		Token KW_OUTPUTDRIVER236=null;
		ParserRuleReturnScope genericSpec =null;

		ASTNode inFmt_tree=null;
		ASTNode outFmt_tree=null;
		ASTNode serdeCls_tree=null;
		ASTNode inDriver_tree=null;
		ASTNode outDriver_tree=null;
		ASTNode KW_INPUTFORMAT232_tree=null;
		ASTNode KW_OUTPUTFORMAT233_tree=null;
		ASTNode KW_SERDE234_tree=null;
		ASTNode KW_INPUTDRIVER235_tree=null;
		ASTNode KW_OUTPUTDRIVER236_tree=null;
		RewriteRuleTokenStream stream_KW_INPUTFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_INPUTFORMAT");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_INPUTDRIVER=new RewriteRuleTokenStream(adaptor,"token KW_INPUTDRIVER");
		RewriteRuleTokenStream stream_KW_SERDE=new RewriteRuleTokenStream(adaptor,"token KW_SERDE");
		RewriteRuleTokenStream stream_KW_OUTPUTFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_OUTPUTFORMAT");
		RewriteRuleTokenStream stream_KW_OUTPUTDRIVER=new RewriteRuleTokenStream(adaptor,"token KW_OUTPUTDRIVER");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("file format specification", state); 
		try {
			// AlterClauseParser.g:473:5: ( KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral KW_SERDE serdeCls= StringLiteral ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )? -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? ) |genericSpec= identifier -> ^( TOK_FILEFORMAT_GENERIC $genericSpec) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==KW_INPUTFORMAT) ) {
				int LA51_1 = input.LA(2);
				if ( (LA51_1==StringLiteral) ) {
					alt51=1;
				}
				else if ( (LA51_1==EOF) ) {
					alt51=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA51_0==Identifier||(LA51_0 >= KW_ABORT && LA51_0 <= KW_AFTER)||LA51_0==KW_ALLOC_FRACTION||LA51_0==KW_ANALYZE||LA51_0==KW_ARCHIVE||(LA51_0 >= KW_ASC && LA51_0 <= KW_AT)||(LA51_0 >= KW_AUTOCOMMIT && LA51_0 <= KW_BEFORE)||(LA51_0 >= KW_BUCKET && LA51_0 <= KW_BUCKETS)||(LA51_0 >= KW_CACHE && LA51_0 <= KW_CASCADE)||(LA51_0 >= KW_CBO && LA51_0 <= KW_CHANGE)||(LA51_0 >= KW_CHECK && LA51_0 <= KW_COLLECTION)||(LA51_0 >= KW_COLUMNS && LA51_0 <= KW_COMMENT)||(LA51_0 >= KW_COMPACT && LA51_0 <= KW_CONCATENATE)||(LA51_0 >= KW_CONTINUE && LA51_0 <= KW_COST)||LA51_0==KW_CRON||LA51_0==KW_DATA||LA51_0==KW_DATABASES||(LA51_0 >= KW_DATETIME && LA51_0 <= KW_DCPROPERTIES)||LA51_0==KW_DEBUG||(LA51_0 >= KW_DEFAULT && LA51_0 <= KW_DEFINED)||(LA51_0 >= KW_DELIMITED && LA51_0 <= KW_DESC)||(LA51_0 >= KW_DETAIL && LA51_0 <= KW_DISABLE)||(LA51_0 >= KW_DISTRIBUTE && LA51_0 <= KW_DO)||LA51_0==KW_DOW||(LA51_0 >= KW_DUMP && LA51_0 <= KW_ELEM_TYPE)||LA51_0==KW_ENABLE||(LA51_0 >= KW_ENFORCED && LA51_0 <= KW_EVERY)||(LA51_0 >= KW_EXCLUSIVE && LA51_0 <= KW_EXECUTED)||(LA51_0 >= KW_EXPIRE_SNAPSHOTS && LA51_0 <= KW_EXPRESSION)||(LA51_0 >= KW_FIELDS && LA51_0 <= KW_FIRST)||(LA51_0 >= KW_FORMAT && LA51_0 <= KW_FORMATTED)||LA51_0==KW_FUNCTIONS||(LA51_0 >= KW_HOUR && LA51_0 <= KW_IDXPROPERTIES)||LA51_0==KW_IGNORE||(LA51_0 >= KW_INDEX && LA51_0 <= KW_INDEXES)||(LA51_0 >= KW_INPATH && LA51_0 <= KW_INPUTDRIVER)||(LA51_0 >= KW_ISOLATION && LA51_0 <= KW_JAR)||(LA51_0 >= KW_JOINCOST && LA51_0 <= KW_LAST)||LA51_0==KW_LEVEL||(LA51_0 >= KW_LIMIT && LA51_0 <= KW_LOAD)||(LA51_0 >= KW_LOCATION && LA51_0 <= KW_LONG)||(LA51_0 >= KW_MANAGED && LA51_0 <= KW_MANAGEMENT)||(LA51_0 >= KW_MAPJOIN && LA51_0 <= KW_MATERIALIZED)||LA51_0==KW_METADATA||(LA51_0 >= KW_MINUTE && LA51_0 <= KW_MONTH)||(LA51_0 >= KW_MOVE && LA51_0 <= KW_MSCK)||(LA51_0 >= KW_NORELY && LA51_0 <= KW_NOSCAN)||LA51_0==KW_NOVALIDATE||LA51_0==KW_NULLS||LA51_0==KW_OFFSET||(LA51_0 >= KW_OPERATOR && LA51_0 <= KW_OPTION)||(LA51_0 >= KW_OUTPUTDRIVER && LA51_0 <= KW_OUTPUTFORMAT)||(LA51_0 >= KW_OVERWRITE && LA51_0 <= KW_OWNER)||(LA51_0 >= KW_PARTITIONED && LA51_0 <= KW_PATH)||(LA51_0 >= KW_PLAN && LA51_0 <= KW_POOL)||LA51_0==KW_PRINCIPALS||LA51_0==KW_PURGE||(LA51_0 >= KW_QUARTER && LA51_0 <= KW_QUERY_PARALLELISM)||LA51_0==KW_READ||(LA51_0 >= KW_REBUILD && LA51_0 <= KW_RECORDWRITER)||(LA51_0 >= KW_RELOAD && LA51_0 <= KW_RESTRICT)||LA51_0==KW_REWRITE||(LA51_0 >= KW_ROLE && LA51_0 <= KW_ROLES)||(LA51_0 >= KW_SCHEDULED && LA51_0 <= KW_SECOND)||(LA51_0 >= KW_SEMI && LA51_0 <= KW_SERVER)||(LA51_0 >= KW_SETS && LA51_0 <= KW_SKEWED)||LA51_0==KW_SNAPSHOT||(LA51_0 >= KW_SORT && LA51_0 <= KW_SSL)||(LA51_0 >= KW_STATISTICS && LA51_0 <= KW_SUMMARY)||(LA51_0 >= KW_SYSTEM_TIME && LA51_0 <= KW_SYSTEM_VERSION)||LA51_0==KW_TABLES||(LA51_0 >= KW_TBLPROPERTIES && LA51_0 <= KW_TERMINATED)||LA51_0==KW_TINYINT||LA51_0==KW_TOUCH||(LA51_0 >= KW_TRANSACTION && LA51_0 <= KW_TRANSACTIONS)||LA51_0==KW_TRIM||(LA51_0 >= KW_TYPE && LA51_0 <= KW_UNARCHIVE)||LA51_0==KW_UNDO||LA51_0==KW_UNIONTYPE||(LA51_0 >= KW_UNKNOWN && LA51_0 <= KW_UNSIGNED)||(LA51_0 >= KW_URI && LA51_0 <= KW_USE)||(LA51_0 >= KW_UTC && LA51_0 <= KW_VALIDATE)||LA51_0==KW_VALUE_TYPE||(LA51_0 >= KW_VECTORIZATION && LA51_0 <= KW_WEEK)||LA51_0==KW_WHILE||(LA51_0 >= KW_WITHIN && LA51_0 <= KW_ZONE)||LA51_0==KW_BATCH||LA51_0==KW_DAYOFWEEK||LA51_0==KW_HOLD_DDLTIME||LA51_0==KW_NO_DROP||LA51_0==KW_OFFLINE||LA51_0==KW_PROTECTION||LA51_0==KW_READONLY||LA51_0==KW_TIMESTAMPTZ) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// AlterClauseParser.g:473:7: KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral KW_SERDE serdeCls= StringLiteral ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )?
					{
					KW_INPUTFORMAT232=(Token)match(input,KW_INPUTFORMAT,FOLLOW_KW_INPUTFORMAT_in_fileFormat3460); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_INPUTFORMAT.add(KW_INPUTFORMAT232);

					inFmt=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat3464); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(inFmt);

					KW_OUTPUTFORMAT233=(Token)match(input,KW_OUTPUTFORMAT,FOLLOW_KW_OUTPUTFORMAT_in_fileFormat3466); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_OUTPUTFORMAT.add(KW_OUTPUTFORMAT233);

					outFmt=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat3470); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(outFmt);

					KW_SERDE234=(Token)match(input,KW_SERDE,FOLLOW_KW_SERDE_in_fileFormat3472); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SERDE.add(KW_SERDE234);

					serdeCls=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat3476); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(serdeCls);

					// AlterClauseParser.g:473:111: ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==KW_INPUTDRIVER) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// AlterClauseParser.g:473:112: KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral
							{
							KW_INPUTDRIVER235=(Token)match(input,KW_INPUTDRIVER,FOLLOW_KW_INPUTDRIVER_in_fileFormat3479); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_INPUTDRIVER.add(KW_INPUTDRIVER235);

							inDriver=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat3483); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_StringLiteral.add(inDriver);

							KW_OUTPUTDRIVER236=(Token)match(input,KW_OUTPUTDRIVER,FOLLOW_KW_OUTPUTDRIVER_in_fileFormat3485); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTPUTDRIVER.add(KW_OUTPUTDRIVER236);

							outDriver=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat3489); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_StringLiteral.add(outDriver);

							}
							break;

					}

					// AST REWRITE
					// elements: serdeCls, inDriver, outFmt, outDriver, inFmt
					// token labels: inFmt, inDriver, serdeCls, outDriver, outFmt
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_inFmt=new RewriteRuleTokenStream(adaptor,"token inFmt",inFmt);
					RewriteRuleTokenStream stream_inDriver=new RewriteRuleTokenStream(adaptor,"token inDriver",inDriver);
					RewriteRuleTokenStream stream_serdeCls=new RewriteRuleTokenStream(adaptor,"token serdeCls",serdeCls);
					RewriteRuleTokenStream stream_outDriver=new RewriteRuleTokenStream(adaptor,"token outDriver",outDriver);
					RewriteRuleTokenStream stream_outFmt=new RewriteRuleTokenStream(adaptor,"token outFmt",outFmt);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 474:7: -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? )
					{
						// AlterClauseParser.g:474:10: ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLEFILEFORMAT, "TOK_TABLEFILEFORMAT"), root_1);
						adaptor.addChild(root_1, stream_inFmt.nextNode());
						adaptor.addChild(root_1, stream_outFmt.nextNode());
						adaptor.addChild(root_1, stream_serdeCls.nextNode());
						// AlterClauseParser.g:474:58: ( $inDriver)?
						if ( stream_inDriver.hasNext() ) {
							adaptor.addChild(root_1, stream_inDriver.nextNode());
						}
						stream_inDriver.reset();

						// AlterClauseParser.g:474:69: ( $outDriver)?
						if ( stream_outDriver.hasNext() ) {
							adaptor.addChild(root_1, stream_outDriver.nextNode());
						}
						stream_outDriver.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AlterClauseParser.g:475:7: genericSpec= identifier
					{
					pushFollow(FOLLOW_identifier_in_fileFormat3530);
					genericSpec=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(genericSpec.getTree());
					// AST REWRITE
					// elements: genericSpec
					// token labels: 
					// rule labels: genericSpec, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_genericSpec=new RewriteRuleSubtreeStream(adaptor,"rule genericSpec",genericSpec!=null?genericSpec.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 475:30: -> ^( TOK_FILEFORMAT_GENERIC $genericSpec)
					{
						// AlterClauseParser.g:475:33: ^( TOK_FILEFORMAT_GENERIC $genericSpec)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_FILEFORMAT_GENERIC, "TOK_FILEFORMAT_GENERIC"), root_1);
						adaptor.addChild(root_1, stream_genericSpec.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fileFormat"


	public static class alterDataConnectorStatementSuffix_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDataConnectorStatementSuffix"
	// AlterClauseParser.g:478:1: alterDataConnectorStatementSuffix : ( alterDataConnectorSuffixProperties | alterDataConnectorSuffixSetOwner | alterDataConnectorSuffixSetUrl );
	public final HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return alterDataConnectorStatementSuffix() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope alterDataConnectorSuffixProperties237 =null;
		ParserRuleReturnScope alterDataConnectorSuffixSetOwner238 =null;
		ParserRuleReturnScope alterDataConnectorSuffixSetUrl239 =null;


		 gParent.pushMsg("alter connector statement", state); 
		try {
			// AlterClauseParser.g:481:5: ( alterDataConnectorSuffixProperties | alterDataConnectorSuffixSetOwner | alterDataConnectorSuffixSetUrl )
			int alt52=3;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Identifier) ) {
				int LA52_1 = input.LA(2);
				if ( (LA52_1==KW_SET) ) {
					switch ( input.LA(3) ) {
					case KW_DCPROPERTIES:
						{
						alt52=1;
						}
						break;
					case KW_OWNER:
						{
						alt52=2;
						}
						break;
					case KW_URL:
						{
						alt52=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 52, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA52_0 >= KW_ABORT && LA52_0 <= KW_AFTER)||LA52_0==KW_ALLOC_FRACTION||LA52_0==KW_ANALYZE||LA52_0==KW_ARCHIVE||(LA52_0 >= KW_ASC && LA52_0 <= KW_AT)||(LA52_0 >= KW_AUTOCOMMIT && LA52_0 <= KW_BEFORE)||(LA52_0 >= KW_BUCKET && LA52_0 <= KW_BUCKETS)||(LA52_0 >= KW_CACHE && LA52_0 <= KW_CASCADE)||(LA52_0 >= KW_CBO && LA52_0 <= KW_CHANGE)||(LA52_0 >= KW_CHECK && LA52_0 <= KW_COLLECTION)||(LA52_0 >= KW_COLUMNS && LA52_0 <= KW_COMMENT)||(LA52_0 >= KW_COMPACT && LA52_0 <= KW_CONCATENATE)||(LA52_0 >= KW_CONTINUE && LA52_0 <= KW_COST)||LA52_0==KW_CRON||LA52_0==KW_DATA||LA52_0==KW_DATABASES||(LA52_0 >= KW_DATETIME && LA52_0 <= KW_DCPROPERTIES)||LA52_0==KW_DEBUG||(LA52_0 >= KW_DEFAULT && LA52_0 <= KW_DEFINED)||(LA52_0 >= KW_DELIMITED && LA52_0 <= KW_DESC)||(LA52_0 >= KW_DETAIL && LA52_0 <= KW_DISABLE)||(LA52_0 >= KW_DISTRIBUTE && LA52_0 <= KW_DO)||LA52_0==KW_DOW||(LA52_0 >= KW_DUMP && LA52_0 <= KW_ELEM_TYPE)||LA52_0==KW_ENABLE||(LA52_0 >= KW_ENFORCED && LA52_0 <= KW_EVERY)||(LA52_0 >= KW_EXCLUSIVE && LA52_0 <= KW_EXECUTED)||(LA52_0 >= KW_EXPIRE_SNAPSHOTS && LA52_0 <= KW_EXPRESSION)||(LA52_0 >= KW_FIELDS && LA52_0 <= KW_FIRST)||(LA52_0 >= KW_FORMAT && LA52_0 <= KW_FORMATTED)||LA52_0==KW_FUNCTIONS||(LA52_0 >= KW_HOUR && LA52_0 <= KW_IDXPROPERTIES)||LA52_0==KW_IGNORE||(LA52_0 >= KW_INDEX && LA52_0 <= KW_INDEXES)||(LA52_0 >= KW_INPATH && LA52_0 <= KW_INPUTFORMAT)||(LA52_0 >= KW_ISOLATION && LA52_0 <= KW_JAR)||(LA52_0 >= KW_JOINCOST && LA52_0 <= KW_LAST)||LA52_0==KW_LEVEL||(LA52_0 >= KW_LIMIT && LA52_0 <= KW_LOAD)||(LA52_0 >= KW_LOCATION && LA52_0 <= KW_LONG)||(LA52_0 >= KW_MANAGED && LA52_0 <= KW_MANAGEMENT)||(LA52_0 >= KW_MAPJOIN && LA52_0 <= KW_MATERIALIZED)||LA52_0==KW_METADATA||(LA52_0 >= KW_MINUTE && LA52_0 <= KW_MONTH)||(LA52_0 >= KW_MOVE && LA52_0 <= KW_MSCK)||(LA52_0 >= KW_NORELY && LA52_0 <= KW_NOSCAN)||LA52_0==KW_NOVALIDATE||LA52_0==KW_NULLS||LA52_0==KW_OFFSET||(LA52_0 >= KW_OPERATOR && LA52_0 <= KW_OPTION)||(LA52_0 >= KW_OUTPUTDRIVER && LA52_0 <= KW_OUTPUTFORMAT)||(LA52_0 >= KW_OVERWRITE && LA52_0 <= KW_OWNER)||(LA52_0 >= KW_PARTITIONED && LA52_0 <= KW_PATH)||(LA52_0 >= KW_PLAN && LA52_0 <= KW_POOL)||LA52_0==KW_PRINCIPALS||LA52_0==KW_PURGE||(LA52_0 >= KW_QUARTER && LA52_0 <= KW_QUERY_PARALLELISM)||LA52_0==KW_READ||(LA52_0 >= KW_REBUILD && LA52_0 <= KW_RECORDWRITER)||(LA52_0 >= KW_RELOAD && LA52_0 <= KW_RESTRICT)||LA52_0==KW_REWRITE||(LA52_0 >= KW_ROLE && LA52_0 <= KW_ROLES)||(LA52_0 >= KW_SCHEDULED && LA52_0 <= KW_SECOND)||(LA52_0 >= KW_SEMI && LA52_0 <= KW_SERVER)||(LA52_0 >= KW_SETS && LA52_0 <= KW_SKEWED)||LA52_0==KW_SNAPSHOT||(LA52_0 >= KW_SORT && LA52_0 <= KW_SSL)||(LA52_0 >= KW_STATISTICS && LA52_0 <= KW_SUMMARY)||(LA52_0 >= KW_SYSTEM_TIME && LA52_0 <= KW_SYSTEM_VERSION)||LA52_0==KW_TABLES||(LA52_0 >= KW_TBLPROPERTIES && LA52_0 <= KW_TERMINATED)||LA52_0==KW_TINYINT||LA52_0==KW_TOUCH||(LA52_0 >= KW_TRANSACTION && LA52_0 <= KW_TRANSACTIONS)||LA52_0==KW_TRIM||(LA52_0 >= KW_TYPE && LA52_0 <= KW_UNARCHIVE)||LA52_0==KW_UNDO||LA52_0==KW_UNIONTYPE||(LA52_0 >= KW_UNKNOWN && LA52_0 <= KW_UNSIGNED)||(LA52_0 >= KW_URI && LA52_0 <= KW_USE)||(LA52_0 >= KW_UTC && LA52_0 <= KW_VALIDATE)||LA52_0==KW_VALUE_TYPE||(LA52_0 >= KW_VECTORIZATION && LA52_0 <= KW_WEEK)||LA52_0==KW_WHILE||(LA52_0 >= KW_WITHIN && LA52_0 <= KW_ZONE)||LA52_0==KW_BATCH||LA52_0==KW_DAYOFWEEK||LA52_0==KW_HOLD_DDLTIME||LA52_0==KW_NO_DROP||LA52_0==KW_OFFLINE||LA52_0==KW_PROTECTION||LA52_0==KW_READONLY||LA52_0==KW_TIMESTAMPTZ) ) {
				int LA52_2 = input.LA(2);
				if ( (LA52_2==KW_SET) ) {
					switch ( input.LA(3) ) {
					case KW_DCPROPERTIES:
						{
						alt52=1;
						}
						break;
					case KW_OWNER:
						{
						alt52=2;
						}
						break;
					case KW_URL:
						{
						alt52=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 52, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// AlterClauseParser.g:481:7: alterDataConnectorSuffixProperties
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterDataConnectorSuffixProperties_in_alterDataConnectorStatementSuffix3566);
					alterDataConnectorSuffixProperties237=alterDataConnectorSuffixProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDataConnectorSuffixProperties237.getTree());

					}
					break;
				case 2 :
					// AlterClauseParser.g:482:7: alterDataConnectorSuffixSetOwner
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterDataConnectorSuffixSetOwner_in_alterDataConnectorStatementSuffix3574);
					alterDataConnectorSuffixSetOwner238=alterDataConnectorSuffixSetOwner();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDataConnectorSuffixSetOwner238.getTree());

					}
					break;
				case 3 :
					// AlterClauseParser.g:483:7: alterDataConnectorSuffixSetUrl
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterDataConnectorSuffixSetUrl_in_alterDataConnectorStatementSuffix3582);
					alterDataConnectorSuffixSetUrl239=alterDataConnectorSuffixSetUrl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDataConnectorSuffixSetUrl239.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDataConnectorStatementSuffix"


	public static class alterDataConnectorSuffixProperties_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDataConnectorSuffixProperties"
	// AlterClauseParser.g:486:1: alterDataConnectorSuffixProperties : name= identifier KW_SET KW_DCPROPERTIES dcProperties -> ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties ) ;
	public final HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return alterDataConnectorSuffixProperties() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET240=null;
		Token KW_DCPROPERTIES241=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope dcProperties242 =null;

		ASTNode KW_SET240_tree=null;
		ASTNode KW_DCPROPERTIES241_tree=null;
		RewriteRuleTokenStream stream_KW_DCPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_DCPROPERTIES");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_dcProperties=new RewriteRuleSubtreeStream(adaptor,"rule dcProperties");

		 gParent.pushMsg("alter connector set properties statement", state); 
		try {
			// AlterClauseParser.g:489:5: (name= identifier KW_SET KW_DCPROPERTIES dcProperties -> ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties ) )
			// AlterClauseParser.g:489:7: name= identifier KW_SET KW_DCPROPERTIES dcProperties
			{
			pushFollow(FOLLOW_identifier_in_alterDataConnectorSuffixProperties3611);
			name=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(name.getTree());
			KW_SET240=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDataConnectorSuffixProperties3613); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET240);

			KW_DCPROPERTIES241=(Token)match(input,KW_DCPROPERTIES,FOLLOW_KW_DCPROPERTIES_in_alterDataConnectorSuffixProperties3615); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DCPROPERTIES.add(KW_DCPROPERTIES241);

			pushFollow(FOLLOW_dcProperties_in_alterDataConnectorSuffixProperties3617);
			dcProperties242=gHiveParser.dcProperties();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dcProperties.add(dcProperties242.getTree());
			// AST REWRITE
			// elements: name, dcProperties
			// token labels: 
			// rule labels: name, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 490:5: -> ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties )
			{
				// AlterClauseParser.g:490:8: ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATACONNECTOR_PROPERTIES, "TOK_ALTERDATACONNECTOR_PROPERTIES"), root_1);
				adaptor.addChild(root_1, stream_name.nextTree());
				adaptor.addChild(root_1, stream_dcProperties.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDataConnectorSuffixProperties"


	public static class alterDataConnectorSuffixSetOwner_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDataConnectorSuffixSetOwner"
	// AlterClauseParser.g:493:1: alterDataConnectorSuffixSetOwner : dcName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName ) ;
	public final HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return alterDataConnectorSuffixSetOwner() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return retval = new HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_SET243=null;
		Token KW_OWNER244=null;
		ParserRuleReturnScope dcName =null;
		ParserRuleReturnScope principalName245 =null;

		ASTNode KW_SET243_tree=null;
		ASTNode KW_OWNER244_tree=null;
		RewriteRuleTokenStream stream_KW_OWNER=new RewriteRuleTokenStream(adaptor,"token KW_OWNER");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_principalName=new RewriteRuleSubtreeStream(adaptor,"rule principalName");

		 gParent.pushMsg("alter connector set owner", state); 
		try {
			// AlterClauseParser.g:496:5: (dcName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName ) )
			// AlterClauseParser.g:496:7: dcName= identifier KW_SET KW_OWNER principalName
			{
			pushFollow(FOLLOW_identifier_in_alterDataConnectorSuffixSetOwner3661);
			dcName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dcName.getTree());
			KW_SET243=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDataConnectorSuffixSetOwner3663); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET243);

			KW_OWNER244=(Token)match(input,KW_OWNER,FOLLOW_KW_OWNER_in_alterDataConnectorSuffixSetOwner3665); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OWNER.add(KW_OWNER244);

			pushFollow(FOLLOW_principalName_in_alterDataConnectorSuffixSetOwner3667);
			principalName245=gHiveParser.principalName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_principalName.add(principalName245.getTree());
			// AST REWRITE
			// elements: dcName, principalName
			// token labels: 
			// rule labels: dcName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_dcName=new RewriteRuleSubtreeStream(adaptor,"rule dcName",dcName!=null?dcName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 497:5: -> ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName )
			{
				// AlterClauseParser.g:497:8: ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATACONNECTOR_OWNER, "TOK_ALTERDATACONNECTOR_OWNER"), root_1);
				adaptor.addChild(root_1, stream_dcName.nextTree());
				adaptor.addChild(root_1, stream_principalName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDataConnectorSuffixSetOwner"


	public static class alterDataConnectorSuffixSetUrl_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterDataConnectorSuffixSetUrl"
	// AlterClauseParser.g:500:1: alterDataConnectorSuffixSetUrl : dcName= identifier KW_SET KW_URL newUri= StringLiteral -> ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri) ;
	public final HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return alterDataConnectorSuffixSetUrl() throws RecognitionException {
		HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return retval = new HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token newUri=null;
		Token KW_SET246=null;
		Token KW_URL247=null;
		ParserRuleReturnScope dcName =null;

		ASTNode newUri_tree=null;
		ASTNode KW_SET246_tree=null;
		ASTNode KW_URL247_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_URL=new RewriteRuleTokenStream(adaptor,"token KW_URL");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg("alter connector set url", state); 
		try {
			// AlterClauseParser.g:503:5: (dcName= identifier KW_SET KW_URL newUri= StringLiteral -> ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri) )
			// AlterClauseParser.g:503:7: dcName= identifier KW_SET KW_URL newUri= StringLiteral
			{
			pushFollow(FOLLOW_identifier_in_alterDataConnectorSuffixSetUrl3711);
			dcName=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dcName.getTree());
			KW_SET246=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDataConnectorSuffixSetUrl3713); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET246);

			KW_URL247=(Token)match(input,KW_URL,FOLLOW_KW_URL_in_alterDataConnectorSuffixSetUrl3715); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_URL.add(KW_URL247);

			newUri=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDataConnectorSuffixSetUrl3719); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(newUri);

			// AST REWRITE
			// elements: newUri, dcName
			// token labels: newUri
			// rule labels: dcName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_newUri=new RewriteRuleTokenStream(adaptor,"token newUri",newUri);
			RewriteRuleSubtreeStream stream_dcName=new RewriteRuleSubtreeStream(adaptor,"rule dcName",dcName!=null?dcName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 504:5: -> ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri)
			{
				// AlterClauseParser.g:504:8: ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTERDATACONNECTOR_URL, "TOK_ALTERDATACONNECTOR_URL"), root_1);
				adaptor.addChild(root_1, stream_dcName.nextTree());
				adaptor.addChild(root_1, stream_newUri.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterDataConnectorSuffixSetUrl"

	// $ANTLR start synpred1_AlterClauseParser
	public final void synpred1_AlterClauseParser_fragment() throws RecognitionException {
		// AlterClauseParser.g:60:7: ( alterStatementSuffixRename[true] )
		// AlterClauseParser.g:60:8: alterStatementSuffixRename[true]
		{
		pushFollow(FOLLOW_alterStatementSuffixRename_in_synpred1_AlterClauseParser196);
		alterStatementSuffixRename(true);
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_AlterClauseParser

	// Delegated rules

	public final boolean synpred1_AlterClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_AlterClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_KW_ALTER_in_alterStatement66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_TABLE_in_alterStatement68 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_alterStatement70 = new BitSet(new long[]{0x2000008020000000L,0x0080000000000902L,0x001000000000000AL,0x0040000800000000L,0x0840000022000000L,0x0002802004000000L});
	public static final BitSet FOLLOW_alterTableStatementSuffix_in_alterStatement72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterStatement90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_alterStatement92 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_alterStatement94 = new BitSet(new long[]{0x0000020020000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000080000L,0x0042000002080000L,0x0400800000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_KW_AS_in_alterStatement96 = new BitSet(new long[]{0x0000000020000000L,0x0080000000000000L,0x0000000000000000L,0x0000000000080000L,0x0042000002080000L,0x0400800000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_alterViewStatementSuffix_in_alterStatement99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterStatement117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_KW_MATERIALIZED_in_alterStatement119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_alterStatement121 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_alterStatement125 = new BitSet(new long[]{0x0000000000000000L,0x0801000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_alterMaterializedViewStatementSuffix_in_alterStatement127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterStatement140 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_KW_DATABASE_in_alterStatement143 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_SCHEMA_in_alterStatement145 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_alterDatabaseStatementSuffix_in_alterStatement148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterStatement160 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_DATACONNECTOR_in_alterStatement162 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_alterDataConnectorStatementSuffix_in_alterStatement164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixRename_in_alterTableStatementSuffix202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixDropPartitions_in_alterTableStatementSuffix211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixAddPartitions_in_alterTableStatementSuffix220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixTouch_in_alterTableStatementSuffix229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixArchive_in_alterTableStatementSuffix237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixUnArchive_in_alterTableStatementSuffix245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixProperties_in_alterTableStatementSuffix253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixSkewedby_in_alterTableStatementSuffix261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixExchangePartition_in_alterTableStatementSuffix269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementPartitionKeyType_in_alterTableStatementSuffix277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixDropConstraint_in_alterTableStatementSuffix285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixAddConstraint_in_alterTableStatementSuffix293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionSpec_in_alterTableStatementSuffix310 = new BitSet(new long[]{0x2000000020000000L,0x0000000000000902L,0x0010000000000000L,0x0000000800000000L,0x0040000022000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixSetOwner_in_alterTableStatementSuffix327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixSetPartSpec_in_alterTableStatementSuffix335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixExecute_in_alterTableStatementSuffix343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixFileFormat_in_alterTblPartitionStatementSuffix369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixLocation_in_alterTblPartitionStatementSuffix376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixMergeFiles_in_alterTblPartitionStatementSuffix383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixSerdeProperties_in_alterTblPartitionStatementSuffix390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixRenamePart_in_alterTblPartitionStatementSuffix397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixBucketNum_in_alterTblPartitionStatementSuffix403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTblPartitionStatementSuffixSkewedLocation_in_alterTblPartitionStatementSuffix410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixClusterbySortby_in_alterTblPartitionStatementSuffix416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixCompact_in_alterTblPartitionStatementSuffix422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixUpdateStatsCol_in_alterTblPartitionStatementSuffix428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixUpdateStats_in_alterTblPartitionStatementSuffix435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixRenameCol_in_alterTblPartitionStatementSuffix442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixAddCol_in_alterTblPartitionStatementSuffix448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixUpdateColumns_in_alterTblPartitionStatementSuffix454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementPartitionKeyType476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementPartitionKeyType478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_alterStatementPartitionKeyType480 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_columnNameType_in_alterStatementPartitionKeyType482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_alterStatementPartitionKeyType484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterViewSuffixProperties_in_alterViewStatementSuffix517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixRename_in_alterViewStatementSuffix525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixAddPartitions_in_alterViewStatementSuffix534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixDropPartitions_in_alterViewStatementSuffix543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectStatementWithCTE_in_alterViewStatementSuffix552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewSuffixRewrite_in_alterMaterializedViewStatementSuffix588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewSuffixRebuild_in_alterMaterializedViewStatementSuffix597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewriteEnabled_in_alterMaterializedViewSuffixRewrite629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewriteDisabled_in_alterMaterializedViewSuffixRewrite635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_REBUILD_in_alterMaterializedViewSuffixRebuild679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterDatabaseSuffixProperties_in_alterDatabaseStatementSuffix714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterDatabaseSuffixSetOwner_in_alterDatabaseStatementSuffix722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterDatabaseSuffixSetLocation_in_alterDatabaseStatementSuffix730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixProperties759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixProperties761 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_KW_DBPROPERTIES_in_alterDatabaseSuffixProperties763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_dbProperties_in_alterDatabaseSuffixProperties765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetOwner809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetOwner811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_KW_OWNER_in_alterDatabaseSuffixSetOwner813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L,0x0000000000000000L,0x0000004000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_principalName_in_alterDatabaseSuffixSetOwner815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetLocation859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_KW_LOCATION_in_alterDatabaseSuffixSetLocation863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetLocation893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetLocation897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetManagedLocation946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetManagedLocation948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetManagedLocation950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterDatabaseSuffixSetManagedLocation954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RENAME_in_alterStatementSuffixRename998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixRename1000 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_alterStatementSuffixRename1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddCol1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixAddCol1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_KW_COLUMNS_in_alterStatementSuffixAddCol1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixAddCol1080 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_alterStatementSuffixAddCol1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixAddCol1084 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_restrictOrCascade_in_alterStatementSuffixAddCol1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddConstraint1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_alterForeignKeyWithName_in_alterStatementSuffixAddConstraint1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterConstraintWithName_in_alterStatementSuffixAddConstraint1171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateColumns1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_KW_COLUMNS_in_alterStatementSuffixUpdateColumns1238 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_restrictOrCascade_in_alterStatementSuffixUpdateColumns1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropConstraint1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_KW_CONSTRAINT_in_alterStatementSuffixDropConstraint1282 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_alterStatementSuffixDropConstraint1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CHANGE_in_alterStatementSuffixRenameCol1323 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF7FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementSuffixRenameCol1325 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_alterStatementSuffixRenameCol1330 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_alterStatementSuffixRenameCol1334 = new BitSet(new long[]{0x400E010000000000L,0x0020001060000000L,0x0002000000080000L,0x0000000000080000L,0x1000000000008000L,0x1000020001C00300L});
	public static final BitSet FOLLOW_colType_in_alterStatementSuffixRenameCol1336 = new BitSet(new long[]{0x8200000080000002L,0x0000002000002040L,0x0000000000040000L,0x0000000800000000L,0x0000000200100010L,0x0000040000000000L});
	public static final BitSet FOLLOW_alterColumnConstraint_in_alterStatementSuffixRenameCol1338 = new BitSet(new long[]{0x0200000080000002L,0x0000000000000040L,0x0000000000040000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_KW_COMMENT_in_alterStatementSuffixRenameCol1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixRenameCol1347 = new BitSet(new long[]{0x0200000080000002L,0x0000000000000000L,0x0000000000040000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_alterStatementChangeColPosition_in_alterStatementSuffixRenameCol1351 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_restrictOrCascade_in_alterStatementSuffixRenameCol1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStatsCol1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStatsCol1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_KW_FOR_in_alterStatementSuffixUpdateStatsCol1417 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF7FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementSuffixUpdateStatsCol1419 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_alterStatementSuffixUpdateStatsCol1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixUpdateStatsCol1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixUpdateStatsCol1428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_COMMENT_in_alterStatementSuffixUpdateStatsCol1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixUpdateStatsCol1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStats1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStats1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixUpdateStats1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixUpdateStats1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FIRST_in_alterStatementChangeColPosition1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AFTER_in_alterStatementChangeColPosition1584 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_alterStatementChangeColPosition1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddPartitions1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_ifNotExists_in_alterStatementSuffixAddPartitions1643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_alterStatementSuffixAddPartitionsElement_in_alterStatementSuffixAddPartitions1646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitionsElement1709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitionsElement1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TOUCH_in_alterStatementSuffixTouch1739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixTouch1742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_ARCHIVE_in_alterStatementSuffixArchive1786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixArchive1789 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_UNARCHIVE_in_alterStatementSuffixUnArchive1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixUnArchive1836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_LOCATION_in_partitionLocation1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_partitionLocation1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropPartitions1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_ifExists_in_alterStatementSuffixDropPartitions1929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions1934 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000400000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_alterStatementSuffixDropPartitions1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions1941 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000400000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KW_PURGE_in_alterStatementSuffixDropPartitions1945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_replicationClause_in_alterStatementSuffixDropPartitions1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixProperties2030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixProperties2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNSET_in_alterStatementSuffixProperties2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ifExists_in_alterStatementSuffixProperties2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixProperties2061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterViewSuffixProperties2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterViewSuffixProperties2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNSET_in_alterViewSuffixProperties2127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ifExists_in_alterViewSuffixProperties2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterViewSuffixProperties2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_SERDE_in_alterStatementSuffixSerdeProperties2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixSerdeProperties2183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixSerdeProperties2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNSET_in_alterStatementSuffixSerdeProperties2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tablePartitionPrefix2366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_tablePartitionPrefix2368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixFileFormat2405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_FILEFORMAT_in_alterStatementSuffixFileFormat2407 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_fileFormat_in_alterStatementSuffixFileFormat2409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CLUSTERED_in_alterStatementSuffixClusterbySortby2469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_KW_SORTED_in_alterStatementSuffixClusterbySortby2485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableBuckets_in_alterStatementSuffixClusterbySortby2499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterTblPartitionStatementSuffixSkewedLocation2530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_KW_SKEWED_in_alterTblPartitionStatementSuffixSkewedLocation2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_KW_LOCATION_in_alterTblPartitionStatementSuffixSkewedLocation2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_skewedLocations_in_alterTblPartitionStatementSuffixSkewedLocation2536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_skewedLocations2577 = new BitSet(new long[]{0x0000000002001000L,0x0000000020600000L,0x0000000000002000L,0x0000002000000000L,0x0000000000000000L,0x0000000400C00000L,0x0000000809820000L});
	public static final BitSet FOLLOW_skewedLocationsList_in_skewedLocations2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_skewedLocations2581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_skewedLocationMap_in_skewedLocationsList2622 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_skewedLocationsList2625 = new BitSet(new long[]{0x0000000002001000L,0x0000000020600000L,0x0000000000002000L,0x0000002000000000L,0x0000000000000000L,0x0000000400C00000L,0x0000000809820000L});
	public static final BitSet FOLLOW_skewedLocationMap_in_skewedLocationsList2627 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_skewedValueLocationElement_in_skewedLocationMap2673 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_skewedLocationMap2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_skewedLocationMap2679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixLocation2717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_KW_LOCATION_in_alterStatementSuffixLocation2719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixLocation2723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableSkewed_in_alterStatementSuffixSkewedby2782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_KW_SKEWED_in_alterStatementSuffixSkewedby2799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_storedAsDirs_in_alterStatementSuffixSkewedby2814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_EXCHANGE_in_alterStatementSuffixExchangePartition2845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixExchangePartition2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixExchangePartition2849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_TABLE_in_alterStatementSuffixExchangePartition2851 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_alterStatementSuffixExchangePartition2855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RENAME_in_alterStatementSuffixRenamePart2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixRenamePart2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixRenamePart2901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixStatsPart2939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KW_STATISTICS_in_alterStatementSuffixStatsPart2941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_KW_FOR_in_alterStatementSuffixStatsPart2943 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF7FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementSuffixStatsPart2945 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_alterStatementSuffixStatsPart2950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixStatsPart2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixStatsPart2954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_COMMENT_in_alterStatementSuffixStatsPart2957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixStatsPart2961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CONCATENATE_in_alterStatementSuffixMergeFiles3009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_INTO_in_alterStatementSuffixBucketNum3072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_Number_in_alterStatementSuffixBucketNum3076 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_KW_BUCKETS_in_alterStatementSuffixBucketNum3078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AND_in_blocking3134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_KW_WAIT_in_blocking3136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_POOL_in_compactPool3155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_compactPool3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_COMPACT_in_alterStatementSuffixCompact3195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixCompact3199 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_blocking_in_alterStatementSuffixCompact3201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_compactPool_in_alterStatementSuffixCompact3204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixCompact3208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_KW_OVERWRITE_in_alterStatementSuffixCompact3210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixCompact3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixCompact3214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSetOwner3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_KW_OWNER_in_alterStatementSuffixSetOwner3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L,0x0000000000000000L,0x0000004000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_principalName_in_alterStatementSuffixSetOwner3270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSetPartSpec3309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementSuffixSetPartSpec3311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SPEC_in_alterStatementSuffixSetPartSpec3313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixSetPartSpec3315 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2BA750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_partitionTransformSpec_in_alterStatementSuffixSetPartSpec3322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixSetPartSpec3325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_ROLLBACK_in_alterStatementSuffixExecute3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixExecute3369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800800000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_Number_in_alterStatementSuffixExecute3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixExecute3383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixExecute3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixExecute3418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_INPUTFORMAT_in_fileFormat3460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_fileFormat3464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_KW_OUTPUTFORMAT_in_fileFormat3466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_fileFormat3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_SERDE_in_fileFormat3472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_fileFormat3476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_KW_INPUTDRIVER_in_fileFormat3479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_fileFormat3483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_KW_OUTPUTDRIVER_in_fileFormat3485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_fileFormat3489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_fileFormat3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterDataConnectorSuffixProperties_in_alterDataConnectorStatementSuffix3566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterDataConnectorSuffixSetOwner_in_alterDataConnectorStatementSuffix3574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterDataConnectorSuffixSetUrl_in_alterDataConnectorStatementSuffix3582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDataConnectorSuffixProperties3611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDataConnectorSuffixProperties3613 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_KW_DCPROPERTIES_in_alterDataConnectorSuffixProperties3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_dcProperties_in_alterDataConnectorSuffixProperties3617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDataConnectorSuffixSetOwner3661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDataConnectorSuffixSetOwner3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_KW_OWNER_in_alterDataConnectorSuffixSetOwner3665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L,0x0000000000000000L,0x0000004000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_principalName_in_alterDataConnectorSuffixSetOwner3667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_alterDataConnectorSuffixSetUrl3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_SET_in_alterDataConnectorSuffixSetUrl3713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_KW_URL_in_alterDataConnectorSuffixSetUrl3715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_alterDataConnectorSuffixSetUrl3719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterStatementSuffixRename_in_synpred1_AlterClauseParser196 = new BitSet(new long[]{0x0000000000000002L});
}
