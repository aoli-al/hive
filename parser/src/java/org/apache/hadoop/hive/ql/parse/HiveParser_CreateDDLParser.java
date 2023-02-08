// $ANTLR 3.5.2 CreateDDLParser.g 2023-02-08 15:38:05

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
public class HiveParser_CreateDDLParser extends Parser {
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


	public HiveParser_CreateDDLParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_CreateDDLParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "CreateDDLParser.g"; }


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


	public static class likeTableOrFile_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "likeTableOrFile"
	// CreateDDLParser.g:46:1: likeTableOrFile : ( ( KW_LIKE KW_FILE )=> KW_LIKE KW_FILE | ( KW_LIKE KW_FILE format= identifier uri= StringLiteral ) -> ^( TOK_LIKEFILE $format $uri) | ( KW_LIKE likeName= tableName ) -> ^( TOK_LIKETABLE $likeName) );
	public final HiveParser_CreateDDLParser.likeTableOrFile_return likeTableOrFile() throws RecognitionException {
		HiveParser_CreateDDLParser.likeTableOrFile_return retval = new HiveParser_CreateDDLParser.likeTableOrFile_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token uri=null;
		Token KW_LIKE1=null;
		Token KW_FILE2=null;
		Token KW_LIKE3=null;
		Token KW_FILE4=null;
		Token KW_LIKE5=null;
		ParserRuleReturnScope format =null;
		ParserRuleReturnScope likeName =null;

		ASTNode uri_tree=null;
		ASTNode KW_LIKE1_tree=null;
		ASTNode KW_FILE2_tree=null;
		ASTNode KW_LIKE3_tree=null;
		ASTNode KW_FILE4_tree=null;
		ASTNode KW_LIKE5_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_FILE=new RewriteRuleTokenStream(adaptor,"token KW_FILE");
		RewriteRuleTokenStream stream_KW_LIKE=new RewriteRuleTokenStream(adaptor,"token KW_LIKE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		try {
			// CreateDDLParser.g:47:5: ( ( KW_LIKE KW_FILE )=> KW_LIKE KW_FILE | ( KW_LIKE KW_FILE format= identifier uri= StringLiteral ) -> ^( TOK_LIKEFILE $format $uri) | ( KW_LIKE likeName= tableName ) -> ^( TOK_LIKETABLE $likeName) )
			int alt1=3;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==KW_LIKE) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==KW_FILE) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==Identifier||(LA1_2 >= KW_ABORT && LA1_2 <= KW_AFTER)||LA1_2==KW_ALLOC_FRACTION||LA1_2==KW_ANALYZE||LA1_2==KW_ARCHIVE||(LA1_2 >= KW_ASC && LA1_2 <= KW_AT)||(LA1_2 >= KW_AUTOCOMMIT && LA1_2 <= KW_BEFORE)||(LA1_2 >= KW_BUCKET && LA1_2 <= KW_BUCKETS)||(LA1_2 >= KW_CACHE && LA1_2 <= KW_CASCADE)||(LA1_2 >= KW_CBO && LA1_2 <= KW_CHANGE)||(LA1_2 >= KW_CHECK && LA1_2 <= KW_COLLECTION)||(LA1_2 >= KW_COLUMNS && LA1_2 <= KW_COMMENT)||(LA1_2 >= KW_COMPACT && LA1_2 <= KW_CONCATENATE)||(LA1_2 >= KW_CONTINUE && LA1_2 <= KW_COST)||LA1_2==KW_CRON||LA1_2==KW_DATA||LA1_2==KW_DATABASES||(LA1_2 >= KW_DATETIME && LA1_2 <= KW_DCPROPERTIES)||LA1_2==KW_DEBUG||(LA1_2 >= KW_DEFAULT && LA1_2 <= KW_DEFINED)||(LA1_2 >= KW_DELIMITED && LA1_2 <= KW_DESC)||(LA1_2 >= KW_DETAIL && LA1_2 <= KW_DISABLE)||(LA1_2 >= KW_DISTRIBUTE && LA1_2 <= KW_DO)||LA1_2==KW_DOW||(LA1_2 >= KW_DUMP && LA1_2 <= KW_ELEM_TYPE)||LA1_2==KW_ENABLE||(LA1_2 >= KW_ENFORCED && LA1_2 <= KW_EVERY)||(LA1_2 >= KW_EXCLUSIVE && LA1_2 <= KW_EXECUTED)||(LA1_2 >= KW_EXPIRE_SNAPSHOTS && LA1_2 <= KW_EXPRESSION)||(LA1_2 >= KW_FIELDS && LA1_2 <= KW_FIRST)||(LA1_2 >= KW_FORMAT && LA1_2 <= KW_FORMATTED)||LA1_2==KW_FUNCTIONS||(LA1_2 >= KW_HOUR && LA1_2 <= KW_IDXPROPERTIES)||LA1_2==KW_IGNORE||(LA1_2 >= KW_INDEX && LA1_2 <= KW_INDEXES)||(LA1_2 >= KW_INPATH && LA1_2 <= KW_INPUTFORMAT)||(LA1_2 >= KW_ISOLATION && LA1_2 <= KW_JAR)||(LA1_2 >= KW_JOINCOST && LA1_2 <= KW_LAST)||LA1_2==KW_LEVEL||(LA1_2 >= KW_LIMIT && LA1_2 <= KW_LOAD)||(LA1_2 >= KW_LOCATION && LA1_2 <= KW_LONG)||(LA1_2 >= KW_MANAGED && LA1_2 <= KW_MANAGEMENT)||(LA1_2 >= KW_MAPJOIN && LA1_2 <= KW_MATERIALIZED)||LA1_2==KW_METADATA||(LA1_2 >= KW_MINUTE && LA1_2 <= KW_MONTH)||(LA1_2 >= KW_MOVE && LA1_2 <= KW_MSCK)||(LA1_2 >= KW_NORELY && LA1_2 <= KW_NOSCAN)||LA1_2==KW_NOVALIDATE||LA1_2==KW_NULLS||LA1_2==KW_OFFSET||(LA1_2 >= KW_OPERATOR && LA1_2 <= KW_OPTION)||(LA1_2 >= KW_OUTPUTDRIVER && LA1_2 <= KW_OUTPUTFORMAT)||(LA1_2 >= KW_OVERWRITE && LA1_2 <= KW_OWNER)||(LA1_2 >= KW_PARTITIONED && LA1_2 <= KW_PATH)||(LA1_2 >= KW_PLAN && LA1_2 <= KW_POOL)||LA1_2==KW_PRINCIPALS||LA1_2==KW_PURGE||(LA1_2 >= KW_QUARTER && LA1_2 <= KW_QUERY_PARALLELISM)||LA1_2==KW_READ||(LA1_2 >= KW_REBUILD && LA1_2 <= KW_RECORDWRITER)||(LA1_2 >= KW_RELOAD && LA1_2 <= KW_RESTRICT)||LA1_2==KW_REWRITE||(LA1_2 >= KW_ROLE && LA1_2 <= KW_ROLES)||(LA1_2 >= KW_SCHEDULED && LA1_2 <= KW_SECOND)||(LA1_2 >= KW_SEMI && LA1_2 <= KW_SERVER)||(LA1_2 >= KW_SETS && LA1_2 <= KW_SKEWED)||LA1_2==KW_SNAPSHOT||(LA1_2 >= KW_SORT && LA1_2 <= KW_SSL)||(LA1_2 >= KW_STATISTICS && LA1_2 <= KW_SUMMARY)||(LA1_2 >= KW_SYSTEM_TIME && LA1_2 <= KW_SYSTEM_VERSION)||LA1_2==KW_TABLES||(LA1_2 >= KW_TBLPROPERTIES && LA1_2 <= KW_TERMINATED)||LA1_2==KW_TINYINT||LA1_2==KW_TOUCH||(LA1_2 >= KW_TRANSACTION && LA1_2 <= KW_TRANSACTIONS)||LA1_2==KW_TRIM||(LA1_2 >= KW_TYPE && LA1_2 <= KW_UNARCHIVE)||LA1_2==KW_UNDO||LA1_2==KW_UNIONTYPE||(LA1_2 >= KW_UNKNOWN && LA1_2 <= KW_UNSIGNED)||(LA1_2 >= KW_URI && LA1_2 <= KW_USE)||(LA1_2 >= KW_UTC && LA1_2 <= KW_VALIDATE)||LA1_2==KW_VALUE_TYPE||(LA1_2 >= KW_VECTORIZATION && LA1_2 <= KW_WEEK)||LA1_2==KW_WHILE||(LA1_2 >= KW_WITHIN && LA1_2 <= KW_ZONE)||LA1_2==KW_BATCH||LA1_2==KW_DAYOFWEEK||LA1_2==KW_HOLD_DDLTIME||LA1_2==KW_NO_DROP||LA1_2==KW_OFFLINE||LA1_2==KW_PROTECTION||LA1_2==KW_READONLY||LA1_2==KW_TIMESTAMPTZ) ) {
						alt1=2;
					}
					else if ( (synpred1_CreateDDLParser()) ) {
						alt1=1;
					}
					else if ( (true) ) {
						alt1=3;
					}

				}
				else if ( (LA1_1==Identifier||(LA1_1 >= KW_ABORT && LA1_1 <= KW_AFTER)||LA1_1==KW_ALLOC_FRACTION||LA1_1==KW_ANALYZE||LA1_1==KW_ARCHIVE||(LA1_1 >= KW_ASC && LA1_1 <= KW_AT)||(LA1_1 >= KW_AUTOCOMMIT && LA1_1 <= KW_BEFORE)||(LA1_1 >= KW_BUCKET && LA1_1 <= KW_BUCKETS)||(LA1_1 >= KW_CACHE && LA1_1 <= KW_CASCADE)||(LA1_1 >= KW_CBO && LA1_1 <= KW_CHANGE)||(LA1_1 >= KW_CHECK && LA1_1 <= KW_COLLECTION)||(LA1_1 >= KW_COLUMNS && LA1_1 <= KW_COMMENT)||(LA1_1 >= KW_COMPACT && LA1_1 <= KW_CONCATENATE)||(LA1_1 >= KW_CONTINUE && LA1_1 <= KW_COST)||LA1_1==KW_CRON||LA1_1==KW_DATA||LA1_1==KW_DATABASES||(LA1_1 >= KW_DATETIME && LA1_1 <= KW_DCPROPERTIES)||LA1_1==KW_DEBUG||(LA1_1 >= KW_DEFAULT && LA1_1 <= KW_DEFINED)||(LA1_1 >= KW_DELIMITED && LA1_1 <= KW_DESC)||(LA1_1 >= KW_DETAIL && LA1_1 <= KW_DISABLE)||(LA1_1 >= KW_DISTRIBUTE && LA1_1 <= KW_DO)||LA1_1==KW_DOW||(LA1_1 >= KW_DUMP && LA1_1 <= KW_ELEM_TYPE)||LA1_1==KW_ENABLE||(LA1_1 >= KW_ENFORCED && LA1_1 <= KW_EVERY)||(LA1_1 >= KW_EXCLUSIVE && LA1_1 <= KW_EXECUTED)||(LA1_1 >= KW_EXPIRE_SNAPSHOTS && LA1_1 <= KW_EXPRESSION)||LA1_1==KW_FIELDS||(LA1_1 >= KW_FILEFORMAT && LA1_1 <= KW_FIRST)||(LA1_1 >= KW_FORMAT && LA1_1 <= KW_FORMATTED)||LA1_1==KW_FUNCTIONS||(LA1_1 >= KW_HOUR && LA1_1 <= KW_IDXPROPERTIES)||LA1_1==KW_IGNORE||(LA1_1 >= KW_INDEX && LA1_1 <= KW_INDEXES)||(LA1_1 >= KW_INPATH && LA1_1 <= KW_INPUTFORMAT)||(LA1_1 >= KW_ISOLATION && LA1_1 <= KW_JAR)||(LA1_1 >= KW_JOINCOST && LA1_1 <= KW_LAST)||LA1_1==KW_LEVEL||(LA1_1 >= KW_LIMIT && LA1_1 <= KW_LOAD)||(LA1_1 >= KW_LOCATION && LA1_1 <= KW_LONG)||(LA1_1 >= KW_MANAGED && LA1_1 <= KW_MANAGEMENT)||(LA1_1 >= KW_MAPJOIN && LA1_1 <= KW_MATERIALIZED)||LA1_1==KW_METADATA||(LA1_1 >= KW_MINUTE && LA1_1 <= KW_MONTH)||(LA1_1 >= KW_MOVE && LA1_1 <= KW_MSCK)||(LA1_1 >= KW_NORELY && LA1_1 <= KW_NOSCAN)||LA1_1==KW_NOVALIDATE||LA1_1==KW_NULLS||LA1_1==KW_OFFSET||(LA1_1 >= KW_OPERATOR && LA1_1 <= KW_OPTION)||(LA1_1 >= KW_OUTPUTDRIVER && LA1_1 <= KW_OUTPUTFORMAT)||(LA1_1 >= KW_OVERWRITE && LA1_1 <= KW_OWNER)||(LA1_1 >= KW_PARTITIONED && LA1_1 <= KW_PATH)||(LA1_1 >= KW_PLAN && LA1_1 <= KW_POOL)||LA1_1==KW_PRINCIPALS||LA1_1==KW_PURGE||(LA1_1 >= KW_QUARTER && LA1_1 <= KW_QUERY_PARALLELISM)||LA1_1==KW_READ||(LA1_1 >= KW_REBUILD && LA1_1 <= KW_RECORDWRITER)||(LA1_1 >= KW_RELOAD && LA1_1 <= KW_RESTRICT)||LA1_1==KW_REWRITE||(LA1_1 >= KW_ROLE && LA1_1 <= KW_ROLES)||(LA1_1 >= KW_SCHEDULED && LA1_1 <= KW_SECOND)||(LA1_1 >= KW_SEMI && LA1_1 <= KW_SERVER)||(LA1_1 >= KW_SETS && LA1_1 <= KW_SKEWED)||LA1_1==KW_SNAPSHOT||(LA1_1 >= KW_SORT && LA1_1 <= KW_SSL)||(LA1_1 >= KW_STATISTICS && LA1_1 <= KW_SUMMARY)||(LA1_1 >= KW_SYSTEM_TIME && LA1_1 <= KW_SYSTEM_VERSION)||LA1_1==KW_TABLES||(LA1_1 >= KW_TBLPROPERTIES && LA1_1 <= KW_TERMINATED)||LA1_1==KW_TINYINT||LA1_1==KW_TOUCH||(LA1_1 >= KW_TRANSACTION && LA1_1 <= KW_TRANSACTIONS)||LA1_1==KW_TRIM||(LA1_1 >= KW_TYPE && LA1_1 <= KW_UNARCHIVE)||LA1_1==KW_UNDO||LA1_1==KW_UNIONTYPE||(LA1_1 >= KW_UNKNOWN && LA1_1 <= KW_UNSIGNED)||(LA1_1 >= KW_URI && LA1_1 <= KW_USE)||(LA1_1 >= KW_UTC && LA1_1 <= KW_VALIDATE)||LA1_1==KW_VALUE_TYPE||(LA1_1 >= KW_VECTORIZATION && LA1_1 <= KW_WEEK)||LA1_1==KW_WHILE||(LA1_1 >= KW_WITHIN && LA1_1 <= KW_ZONE)||LA1_1==KW_BATCH||LA1_1==KW_DAYOFWEEK||LA1_1==KW_HOLD_DDLTIME||LA1_1==KW_NO_DROP||LA1_1==KW_OFFLINE||LA1_1==KW_PROTECTION||LA1_1==KW_READONLY||LA1_1==KW_TIMESTAMPTZ) ) {
					alt1=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// CreateDDLParser.g:47:7: ( KW_LIKE KW_FILE )=> KW_LIKE KW_FILE
					{
					root_0 = (ASTNode)adaptor.nil();


					KW_LIKE1=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_likeTableOrFile63); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_LIKE1_tree = (ASTNode)adaptor.create(KW_LIKE1);
					adaptor.addChild(root_0, KW_LIKE1_tree);
					}

					KW_FILE2=(Token)match(input,KW_FILE,FOLLOW_KW_FILE_in_likeTableOrFile65); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_FILE2_tree = (ASTNode)adaptor.create(KW_FILE2);
					adaptor.addChild(root_0, KW_FILE2_tree);
					}

					}
					break;
				case 2 :
					// CreateDDLParser.g:48:7: ( KW_LIKE KW_FILE format= identifier uri= StringLiteral )
					{
					// CreateDDLParser.g:48:7: ( KW_LIKE KW_FILE format= identifier uri= StringLiteral )
					// CreateDDLParser.g:48:8: KW_LIKE KW_FILE format= identifier uri= StringLiteral
					{
					KW_LIKE3=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_likeTableOrFile74); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LIKE.add(KW_LIKE3);

					KW_FILE4=(Token)match(input,KW_FILE,FOLLOW_KW_FILE_in_likeTableOrFile76); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_FILE.add(KW_FILE4);

					pushFollow(FOLLOW_identifier_in_likeTableOrFile80);
					format=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(format.getTree());
					uri=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_likeTableOrFile84); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_StringLiteral.add(uri);

					}

					// AST REWRITE
					// elements: format, uri
					// token labels: uri
					// rule labels: format, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_uri=new RewriteRuleTokenStream(adaptor,"token uri",uri);
					RewriteRuleSubtreeStream stream_format=new RewriteRuleSubtreeStream(adaptor,"rule format",format!=null?format.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 48:61: -> ^( TOK_LIKEFILE $format $uri)
					{
						// CreateDDLParser.g:48:64: ^( TOK_LIKEFILE $format $uri)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_LIKEFILE, "TOK_LIKEFILE"), root_1);
						adaptor.addChild(root_1, stream_format.nextTree());
						adaptor.addChild(root_1, stream_uri.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// CreateDDLParser.g:49:7: ( KW_LIKE likeName= tableName )
					{
					// CreateDDLParser.g:49:7: ( KW_LIKE likeName= tableName )
					// CreateDDLParser.g:49:8: KW_LIKE likeName= tableName
					{
					KW_LIKE5=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_likeTableOrFile106); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LIKE.add(KW_LIKE5);

					pushFollow(FOLLOW_tableName_in_likeTableOrFile110);
					likeName=gHiveParser.tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(likeName.getTree());
					}

					// AST REWRITE
					// elements: likeName
					// token labels: 
					// rule labels: likeName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_likeName=new RewriteRuleSubtreeStream(adaptor,"rule likeName",likeName!=null?likeName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 49:36: -> ^( TOK_LIKETABLE $likeName)
					{
						// CreateDDLParser.g:49:39: ^( TOK_LIKETABLE $likeName)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_LIKETABLE, "TOK_LIKETABLE"), root_1);
						adaptor.addChild(root_1, stream_likeName.nextTree());
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
	// $ANTLR end "likeTableOrFile"


	public static class createTableStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "createTableStatement"
	// CreateDDLParser.g:53:1: createTableStatement : ( KW_CREATE (temp= KW_TEMPORARY )? (trans= KW_TRANSACTIONAL )? (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) | KW_CREATE mgd= KW_MANAGED KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) );
	public final HiveParser_CreateDDLParser.createTableStatement_return createTableStatement() throws RecognitionException {
		HiveParser_CreateDDLParser.createTableStatement_return retval = new HiveParser_CreateDDLParser.createTableStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token temp=null;
		Token trans=null;
		Token ext=null;
		Token mgd=null;
		Token KW_CREATE6=null;
		Token KW_TABLE7=null;
		Token LPAREN15=null;
		Token RPAREN17=null;
		Token KW_AS26=null;
		Token KW_CREATE28=null;
		Token KW_TABLE29=null;
		Token LPAREN36=null;
		Token RPAREN38=null;
		Token KW_AS47=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope ifNotExists8 =null;
		ParserRuleReturnScope likeTableOrFile9 =null;
		ParserRuleReturnScope createTablePartitionSpec10 =null;
		ParserRuleReturnScope tableRowFormat11 =null;
		ParserRuleReturnScope tableFileFormat12 =null;
		ParserRuleReturnScope tableLocation13 =null;
		ParserRuleReturnScope tablePropertiesPrefixed14 =null;
		ParserRuleReturnScope columnNameTypeOrConstraintList16 =null;
		ParserRuleReturnScope tableComment18 =null;
		ParserRuleReturnScope createTablePartitionSpec19 =null;
		ParserRuleReturnScope tableBuckets20 =null;
		ParserRuleReturnScope tableSkewed21 =null;
		ParserRuleReturnScope tableRowFormat22 =null;
		ParserRuleReturnScope tableFileFormat23 =null;
		ParserRuleReturnScope tableLocation24 =null;
		ParserRuleReturnScope tablePropertiesPrefixed25 =null;
		ParserRuleReturnScope selectStatementWithCTE27 =null;
		ParserRuleReturnScope ifNotExists30 =null;
		ParserRuleReturnScope likeTableOrFile31 =null;
		ParserRuleReturnScope tableRowFormat32 =null;
		ParserRuleReturnScope tableFileFormat33 =null;
		ParserRuleReturnScope tableLocation34 =null;
		ParserRuleReturnScope tablePropertiesPrefixed35 =null;
		ParserRuleReturnScope columnNameTypeOrConstraintList37 =null;
		ParserRuleReturnScope tableComment39 =null;
		ParserRuleReturnScope createTablePartitionSpec40 =null;
		ParserRuleReturnScope tableBuckets41 =null;
		ParserRuleReturnScope tableSkewed42 =null;
		ParserRuleReturnScope tableRowFormat43 =null;
		ParserRuleReturnScope tableFileFormat44 =null;
		ParserRuleReturnScope tableLocation45 =null;
		ParserRuleReturnScope tablePropertiesPrefixed46 =null;
		ParserRuleReturnScope selectStatementWithCTE48 =null;

		ASTNode temp_tree=null;
		ASTNode trans_tree=null;
		ASTNode ext_tree=null;
		ASTNode mgd_tree=null;
		ASTNode KW_CREATE6_tree=null;
		ASTNode KW_TABLE7_tree=null;
		ASTNode LPAREN15_tree=null;
		ASTNode RPAREN17_tree=null;
		ASTNode KW_AS26_tree=null;
		ASTNode KW_CREATE28_tree=null;
		ASTNode KW_TABLE29_tree=null;
		ASTNode LPAREN36_tree=null;
		ASTNode RPAREN38_tree=null;
		ASTNode KW_AS47_tree=null;
		RewriteRuleTokenStream stream_KW_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token KW_TEMPORARY");
		RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
		RewriteRuleTokenStream stream_KW_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token KW_EXTERNAL");
		RewriteRuleTokenStream stream_KW_TRANSACTIONAL=new RewriteRuleTokenStream(adaptor,"token KW_TRANSACTIONAL");
		RewriteRuleTokenStream stream_KW_MANAGED=new RewriteRuleTokenStream(adaptor,"token KW_MANAGED");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_tableLocation=new RewriteRuleSubtreeStream(adaptor,"rule tableLocation");
		RewriteRuleSubtreeStream stream_columnNameTypeOrConstraintList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeOrConstraintList");
		RewriteRuleSubtreeStream stream_tableSkewed=new RewriteRuleSubtreeStream(adaptor,"rule tableSkewed");
		RewriteRuleSubtreeStream stream_tablePropertiesPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule tablePropertiesPrefixed");
		RewriteRuleSubtreeStream stream_likeTableOrFile=new RewriteRuleSubtreeStream(adaptor,"rule likeTableOrFile");
		RewriteRuleSubtreeStream stream_tableFileFormat=new RewriteRuleSubtreeStream(adaptor,"rule tableFileFormat");
		RewriteRuleSubtreeStream stream_tableComment=new RewriteRuleSubtreeStream(adaptor,"rule tableComment");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
		RewriteRuleSubtreeStream stream_tableRowFormat=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormat");
		RewriteRuleSubtreeStream stream_selectStatementWithCTE=new RewriteRuleSubtreeStream(adaptor,"rule selectStatementWithCTE");
		RewriteRuleSubtreeStream stream_createTablePartitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule createTablePartitionSpec");
		RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
		RewriteRuleSubtreeStream stream_tableBuckets=new RewriteRuleSubtreeStream(adaptor,"rule tableBuckets");

		 gParent.pushMsg("create table statement", state); 
		try {
			// CreateDDLParser.g:56:5: ( KW_CREATE (temp= KW_TEMPORARY )? (trans= KW_TRANSACTIONAL )? (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) | KW_CREATE mgd= KW_MANAGED KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==KW_CREATE) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==KW_MANAGED) ) {
					alt38=2;
				}
				else if ( (LA38_1==KW_EXTERNAL||LA38_1==KW_TABLE||LA38_1==KW_TEMPORARY||LA38_1==KW_TRANSACTIONAL) ) {
					alt38=1;
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

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// CreateDDLParser.g:56:7: KW_CREATE (temp= KW_TEMPORARY )? (trans= KW_TRANSACTIONAL )? (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
					{
					KW_CREATE6=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createTableStatement148); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE6);

					// CreateDDLParser.g:56:17: (temp= KW_TEMPORARY )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==KW_TEMPORARY) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// CreateDDLParser.g:56:18: temp= KW_TEMPORARY
							{
							temp=(Token)match(input,KW_TEMPORARY,FOLLOW_KW_TEMPORARY_in_createTableStatement153); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_TEMPORARY.add(temp);

							}
							break;

					}

					// CreateDDLParser.g:56:38: (trans= KW_TRANSACTIONAL )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==KW_TRANSACTIONAL) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// CreateDDLParser.g:56:39: trans= KW_TRANSACTIONAL
							{
							trans=(Token)match(input,KW_TRANSACTIONAL,FOLLOW_KW_TRANSACTIONAL_in_createTableStatement160); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_TRANSACTIONAL.add(trans);

							}
							break;

					}

					// CreateDDLParser.g:56:64: (ext= KW_EXTERNAL )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==KW_EXTERNAL) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// CreateDDLParser.g:56:65: ext= KW_EXTERNAL
							{
							ext=(Token)match(input,KW_EXTERNAL,FOLLOW_KW_EXTERNAL_in_createTableStatement167); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_EXTERNAL.add(ext);

							}
							break;

					}

					KW_TABLE7=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_createTableStatement171); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE7);

					// CreateDDLParser.g:56:92: ( ifNotExists )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==KW_IF) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// CreateDDLParser.g:56:92: ifNotExists
							{
							pushFollow(FOLLOW_ifNotExists_in_createTableStatement173);
							ifNotExists8=gHiveParser.ifNotExists();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists8.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_tableName_in_createTableStatement178);
					name=gHiveParser.tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(name.getTree());
					// CreateDDLParser.g:57:7: ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==KW_LIKE) ) {
						alt21=1;
					}
					else if ( (LA21_0==EOF||LA21_0==KW_AS||LA21_0==KW_CLUSTERED||LA21_0==KW_COMMENT||LA21_0==KW_LOCATION||LA21_0==KW_PARTITIONED||LA21_0==KW_ROW||LA21_0==KW_SKEWED||LA21_0==KW_STORED||LA21_0==KW_TBLPROPERTIES||LA21_0==LPAREN) ) {
						alt21=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// CreateDDLParser.g:57:10: likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )?
							{
							pushFollow(FOLLOW_likeTableOrFile_in_createTableStatement189);
							likeTableOrFile9=likeTableOrFile();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_likeTableOrFile.add(likeTableOrFile9.getTree());
							// CreateDDLParser.g:58:10: ( createTablePartitionSpec )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==KW_PARTITIONED) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// CreateDDLParser.g:58:10: createTablePartitionSpec
									{
									pushFollow(FOLLOW_createTablePartitionSpec_in_createTableStatement200);
									createTablePartitionSpec10=gHiveParser.createTablePartitionSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_createTablePartitionSpec.add(createTablePartitionSpec10.getTree());
									}
									break;

							}

							// CreateDDLParser.g:59:10: ( tableRowFormat )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==KW_ROW) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// CreateDDLParser.g:59:10: tableRowFormat
									{
									pushFollow(FOLLOW_tableRowFormat_in_createTableStatement212);
									tableRowFormat11=gHiveParser.tableRowFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat11.getTree());
									}
									break;

							}

							// CreateDDLParser.g:60:10: ( tableFileFormat )?
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( (LA8_0==KW_STORED) ) {
								alt8=1;
							}
							switch (alt8) {
								case 1 :
									// CreateDDLParser.g:60:10: tableFileFormat
									{
									pushFollow(FOLLOW_tableFileFormat_in_createTableStatement224);
									tableFileFormat12=gHiveParser.tableFileFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat12.getTree());
									}
									break;

							}

							// CreateDDLParser.g:61:10: ( tableLocation )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==KW_LOCATION) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// CreateDDLParser.g:61:10: tableLocation
									{
									pushFollow(FOLLOW_tableLocation_in_createTableStatement236);
									tableLocation13=gHiveParser.tableLocation();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation13.getTree());
									}
									break;

							}

							// CreateDDLParser.g:62:10: ( tablePropertiesPrefixed )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==KW_TBLPROPERTIES) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// CreateDDLParser.g:62:10: tablePropertiesPrefixed
									{
									pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement248);
									tablePropertiesPrefixed14=gHiveParser.tablePropertiesPrefixed();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed14.getTree());
									}
									break;

							}

							}
							break;
						case 2 :
							// CreateDDLParser.g:63:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )?
							{
							// CreateDDLParser.g:63:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==LPAREN) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// CreateDDLParser.g:63:11: LPAREN columnNameTypeOrConstraintList RPAREN
									{
									LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement261); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN15);

									pushFollow(FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement263);
									columnNameTypeOrConstraintList16=gHiveParser.columnNameTypeOrConstraintList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeOrConstraintList.add(columnNameTypeOrConstraintList16.getTree());
									RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement265); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN17);

									}
									break;

							}

							// CreateDDLParser.g:64:10: ( tableComment )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==KW_COMMENT) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// CreateDDLParser.g:64:10: tableComment
									{
									pushFollow(FOLLOW_tableComment_in_createTableStatement278);
									tableComment18=gHiveParser.tableComment();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableComment.add(tableComment18.getTree());
									}
									break;

							}

							// CreateDDLParser.g:65:10: ( createTablePartitionSpec )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==KW_PARTITIONED) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// CreateDDLParser.g:65:10: createTablePartitionSpec
									{
									pushFollow(FOLLOW_createTablePartitionSpec_in_createTableStatement290);
									createTablePartitionSpec19=gHiveParser.createTablePartitionSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_createTablePartitionSpec.add(createTablePartitionSpec19.getTree());
									}
									break;

							}

							// CreateDDLParser.g:66:10: ( tableBuckets )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==KW_CLUSTERED) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// CreateDDLParser.g:66:10: tableBuckets
									{
									pushFollow(FOLLOW_tableBuckets_in_createTableStatement302);
									tableBuckets20=gHiveParser.tableBuckets();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableBuckets.add(tableBuckets20.getTree());
									}
									break;

							}

							// CreateDDLParser.g:67:10: ( tableSkewed )?
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==KW_SKEWED) ) {
								alt15=1;
							}
							switch (alt15) {
								case 1 :
									// CreateDDLParser.g:67:10: tableSkewed
									{
									pushFollow(FOLLOW_tableSkewed_in_createTableStatement314);
									tableSkewed21=gHiveParser.tableSkewed();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableSkewed.add(tableSkewed21.getTree());
									}
									break;

							}

							// CreateDDLParser.g:68:10: ( tableRowFormat )?
							int alt16=2;
							int LA16_0 = input.LA(1);
							if ( (LA16_0==KW_ROW) ) {
								alt16=1;
							}
							switch (alt16) {
								case 1 :
									// CreateDDLParser.g:68:10: tableRowFormat
									{
									pushFollow(FOLLOW_tableRowFormat_in_createTableStatement326);
									tableRowFormat22=gHiveParser.tableRowFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat22.getTree());
									}
									break;

							}

							// CreateDDLParser.g:69:10: ( tableFileFormat )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==KW_STORED) ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// CreateDDLParser.g:69:10: tableFileFormat
									{
									pushFollow(FOLLOW_tableFileFormat_in_createTableStatement338);
									tableFileFormat23=gHiveParser.tableFileFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat23.getTree());
									}
									break;

							}

							// CreateDDLParser.g:70:10: ( tableLocation )?
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==KW_LOCATION) ) {
								alt18=1;
							}
							switch (alt18) {
								case 1 :
									// CreateDDLParser.g:70:10: tableLocation
									{
									pushFollow(FOLLOW_tableLocation_in_createTableStatement350);
									tableLocation24=gHiveParser.tableLocation();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation24.getTree());
									}
									break;

							}

							// CreateDDLParser.g:71:10: ( tablePropertiesPrefixed )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==KW_TBLPROPERTIES) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// CreateDDLParser.g:71:10: tablePropertiesPrefixed
									{
									pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement362);
									tablePropertiesPrefixed25=gHiveParser.tablePropertiesPrefixed();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed25.getTree());
									}
									break;

							}

							// CreateDDLParser.g:72:10: ( KW_AS selectStatementWithCTE )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==KW_AS) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// CreateDDLParser.g:72:11: KW_AS selectStatementWithCTE
									{
									KW_AS26=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_createTableStatement375); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS26);

									pushFollow(FOLLOW_selectStatementWithCTE_in_createTableStatement377);
									selectStatementWithCTE27=gHiveParser.selectStatementWithCTE();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_selectStatementWithCTE.add(selectStatementWithCTE27.getTree());
									}
									break;

							}

							}
							break;

					}

					// AST REWRITE
					// elements: tableComment, ext, name, temp, likeTableOrFile, columnNameTypeOrConstraintList, tableBuckets, tableSkewed, tableLocation, ifNotExists, tableRowFormat, selectStatementWithCTE, trans, createTablePartitionSpec, tableFileFormat, tablePropertiesPrefixed
					// token labels: ext, temp, trans
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_ext=new RewriteRuleTokenStream(adaptor,"token ext",ext);
					RewriteRuleTokenStream stream_temp=new RewriteRuleTokenStream(adaptor,"token temp",temp);
					RewriteRuleTokenStream stream_trans=new RewriteRuleTokenStream(adaptor,"token trans",trans);
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 74:5: -> ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
					{
						// CreateDDLParser.g:74:8: ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATETABLE, "TOK_CREATETABLE"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						// CreateDDLParser.g:74:33: ( $temp)?
						if ( stream_temp.hasNext() ) {
							adaptor.addChild(root_1, stream_temp.nextNode());
						}
						stream_temp.reset();

						// CreateDDLParser.g:74:40: ( $trans)?
						if ( stream_trans.hasNext() ) {
							adaptor.addChild(root_1, stream_trans.nextNode());
						}
						stream_trans.reset();

						// CreateDDLParser.g:74:48: ( $ext)?
						if ( stream_ext.hasNext() ) {
							adaptor.addChild(root_1, stream_ext.nextNode());
						}
						stream_ext.reset();

						// CreateDDLParser.g:74:53: ( ifNotExists )?
						if ( stream_ifNotExists.hasNext() ) {
							adaptor.addChild(root_1, stream_ifNotExists.nextTree());
						}
						stream_ifNotExists.reset();

						// CreateDDLParser.g:75:10: ( likeTableOrFile )?
						if ( stream_likeTableOrFile.hasNext() ) {
							adaptor.addChild(root_1, stream_likeTableOrFile.nextTree());
						}
						stream_likeTableOrFile.reset();

						// CreateDDLParser.g:76:10: ( columnNameTypeOrConstraintList )?
						if ( stream_columnNameTypeOrConstraintList.hasNext() ) {
							adaptor.addChild(root_1, stream_columnNameTypeOrConstraintList.nextTree());
						}
						stream_columnNameTypeOrConstraintList.reset();

						// CreateDDLParser.g:77:10: ( tableComment )?
						if ( stream_tableComment.hasNext() ) {
							adaptor.addChild(root_1, stream_tableComment.nextTree());
						}
						stream_tableComment.reset();

						// CreateDDLParser.g:78:10: ( createTablePartitionSpec )?
						if ( stream_createTablePartitionSpec.hasNext() ) {
							adaptor.addChild(root_1, stream_createTablePartitionSpec.nextTree());
						}
						stream_createTablePartitionSpec.reset();

						// CreateDDLParser.g:79:10: ( tableBuckets )?
						if ( stream_tableBuckets.hasNext() ) {
							adaptor.addChild(root_1, stream_tableBuckets.nextTree());
						}
						stream_tableBuckets.reset();

						// CreateDDLParser.g:80:10: ( tableSkewed )?
						if ( stream_tableSkewed.hasNext() ) {
							adaptor.addChild(root_1, stream_tableSkewed.nextTree());
						}
						stream_tableSkewed.reset();

						// CreateDDLParser.g:81:10: ( tableRowFormat )?
						if ( stream_tableRowFormat.hasNext() ) {
							adaptor.addChild(root_1, stream_tableRowFormat.nextTree());
						}
						stream_tableRowFormat.reset();

						// CreateDDLParser.g:82:10: ( tableFileFormat )?
						if ( stream_tableFileFormat.hasNext() ) {
							adaptor.addChild(root_1, stream_tableFileFormat.nextTree());
						}
						stream_tableFileFormat.reset();

						// CreateDDLParser.g:83:10: ( tableLocation )?
						if ( stream_tableLocation.hasNext() ) {
							adaptor.addChild(root_1, stream_tableLocation.nextTree());
						}
						stream_tableLocation.reset();

						// CreateDDLParser.g:84:10: ( tablePropertiesPrefixed )?
						if ( stream_tablePropertiesPrefixed.hasNext() ) {
							adaptor.addChild(root_1, stream_tablePropertiesPrefixed.nextTree());
						}
						stream_tablePropertiesPrefixed.reset();

						// CreateDDLParser.g:85:10: ( selectStatementWithCTE )?
						if ( stream_selectStatementWithCTE.hasNext() ) {
							adaptor.addChild(root_1, stream_selectStatementWithCTE.nextTree());
						}
						stream_selectStatementWithCTE.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// CreateDDLParser.g:87:7: KW_CREATE mgd= KW_MANAGED KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
					{
					KW_CREATE28=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createTableStatement564); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE28);

					mgd=(Token)match(input,KW_MANAGED,FOLLOW_KW_MANAGED_in_createTableStatement568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_MANAGED.add(mgd);

					KW_TABLE29=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_createTableStatement570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE29);

					// CreateDDLParser.g:87:41: ( ifNotExists )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==KW_IF) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// CreateDDLParser.g:87:41: ifNotExists
							{
							pushFollow(FOLLOW_ifNotExists_in_createTableStatement572);
							ifNotExists30=gHiveParser.ifNotExists();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists30.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_tableName_in_createTableStatement577);
					name=gHiveParser.tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(name.getTree());
					// CreateDDLParser.g:88:7: ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==KW_LIKE) ) {
						alt37=1;
					}
					else if ( (LA37_0==EOF||LA37_0==KW_AS||LA37_0==KW_CLUSTERED||LA37_0==KW_COMMENT||LA37_0==KW_LOCATION||LA37_0==KW_PARTITIONED||LA37_0==KW_ROW||LA37_0==KW_SKEWED||LA37_0==KW_STORED||LA37_0==KW_TBLPROPERTIES||LA37_0==LPAREN) ) {
						alt37=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// CreateDDLParser.g:88:10: likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )?
							{
							pushFollow(FOLLOW_likeTableOrFile_in_createTableStatement588);
							likeTableOrFile31=likeTableOrFile();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_likeTableOrFile.add(likeTableOrFile31.getTree());
							// CreateDDLParser.g:89:10: ( tableRowFormat )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==KW_ROW) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// CreateDDLParser.g:89:10: tableRowFormat
									{
									pushFollow(FOLLOW_tableRowFormat_in_createTableStatement599);
									tableRowFormat32=gHiveParser.tableRowFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat32.getTree());
									}
									break;

							}

							// CreateDDLParser.g:90:10: ( tableFileFormat )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==KW_STORED) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// CreateDDLParser.g:90:10: tableFileFormat
									{
									pushFollow(FOLLOW_tableFileFormat_in_createTableStatement611);
									tableFileFormat33=gHiveParser.tableFileFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat33.getTree());
									}
									break;

							}

							// CreateDDLParser.g:91:10: ( tableLocation )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==KW_LOCATION) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// CreateDDLParser.g:91:10: tableLocation
									{
									pushFollow(FOLLOW_tableLocation_in_createTableStatement623);
									tableLocation34=gHiveParser.tableLocation();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation34.getTree());
									}
									break;

							}

							// CreateDDLParser.g:92:10: ( tablePropertiesPrefixed )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==KW_TBLPROPERTIES) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// CreateDDLParser.g:92:10: tablePropertiesPrefixed
									{
									pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement635);
									tablePropertiesPrefixed35=gHiveParser.tablePropertiesPrefixed();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed35.getTree());
									}
									break;

							}

							}
							break;
						case 2 :
							// CreateDDLParser.g:93:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )?
							{
							// CreateDDLParser.g:93:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==LPAREN) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// CreateDDLParser.g:93:11: LPAREN columnNameTypeOrConstraintList RPAREN
									{
									LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement648); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN36);

									pushFollow(FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement650);
									columnNameTypeOrConstraintList37=gHiveParser.columnNameTypeOrConstraintList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeOrConstraintList.add(columnNameTypeOrConstraintList37.getTree());
									RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement652); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN38);

									}
									break;

							}

							// CreateDDLParser.g:94:10: ( tableComment )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==KW_COMMENT) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// CreateDDLParser.g:94:10: tableComment
									{
									pushFollow(FOLLOW_tableComment_in_createTableStatement665);
									tableComment39=gHiveParser.tableComment();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableComment.add(tableComment39.getTree());
									}
									break;

							}

							// CreateDDLParser.g:95:10: ( createTablePartitionSpec )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0==KW_PARTITIONED) ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// CreateDDLParser.g:95:10: createTablePartitionSpec
									{
									pushFollow(FOLLOW_createTablePartitionSpec_in_createTableStatement677);
									createTablePartitionSpec40=gHiveParser.createTablePartitionSpec();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_createTablePartitionSpec.add(createTablePartitionSpec40.getTree());
									}
									break;

							}

							// CreateDDLParser.g:96:10: ( tableBuckets )?
							int alt30=2;
							int LA30_0 = input.LA(1);
							if ( (LA30_0==KW_CLUSTERED) ) {
								alt30=1;
							}
							switch (alt30) {
								case 1 :
									// CreateDDLParser.g:96:10: tableBuckets
									{
									pushFollow(FOLLOW_tableBuckets_in_createTableStatement689);
									tableBuckets41=gHiveParser.tableBuckets();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableBuckets.add(tableBuckets41.getTree());
									}
									break;

							}

							// CreateDDLParser.g:97:10: ( tableSkewed )?
							int alt31=2;
							int LA31_0 = input.LA(1);
							if ( (LA31_0==KW_SKEWED) ) {
								alt31=1;
							}
							switch (alt31) {
								case 1 :
									// CreateDDLParser.g:97:10: tableSkewed
									{
									pushFollow(FOLLOW_tableSkewed_in_createTableStatement701);
									tableSkewed42=gHiveParser.tableSkewed();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableSkewed.add(tableSkewed42.getTree());
									}
									break;

							}

							// CreateDDLParser.g:98:10: ( tableRowFormat )?
							int alt32=2;
							int LA32_0 = input.LA(1);
							if ( (LA32_0==KW_ROW) ) {
								alt32=1;
							}
							switch (alt32) {
								case 1 :
									// CreateDDLParser.g:98:10: tableRowFormat
									{
									pushFollow(FOLLOW_tableRowFormat_in_createTableStatement713);
									tableRowFormat43=gHiveParser.tableRowFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat43.getTree());
									}
									break;

							}

							// CreateDDLParser.g:99:10: ( tableFileFormat )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==KW_STORED) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// CreateDDLParser.g:99:10: tableFileFormat
									{
									pushFollow(FOLLOW_tableFileFormat_in_createTableStatement725);
									tableFileFormat44=gHiveParser.tableFileFormat();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat44.getTree());
									}
									break;

							}

							// CreateDDLParser.g:100:10: ( tableLocation )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==KW_LOCATION) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// CreateDDLParser.g:100:10: tableLocation
									{
									pushFollow(FOLLOW_tableLocation_in_createTableStatement737);
									tableLocation45=gHiveParser.tableLocation();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation45.getTree());
									}
									break;

							}

							// CreateDDLParser.g:101:10: ( tablePropertiesPrefixed )?
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0==KW_TBLPROPERTIES) ) {
								alt35=1;
							}
							switch (alt35) {
								case 1 :
									// CreateDDLParser.g:101:10: tablePropertiesPrefixed
									{
									pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement749);
									tablePropertiesPrefixed46=gHiveParser.tablePropertiesPrefixed();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed46.getTree());
									}
									break;

							}

							// CreateDDLParser.g:102:10: ( KW_AS selectStatementWithCTE )?
							int alt36=2;
							int LA36_0 = input.LA(1);
							if ( (LA36_0==KW_AS) ) {
								alt36=1;
							}
							switch (alt36) {
								case 1 :
									// CreateDDLParser.g:102:11: KW_AS selectStatementWithCTE
									{
									KW_AS47=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_createTableStatement762); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS47);

									pushFollow(FOLLOW_selectStatementWithCTE_in_createTableStatement764);
									selectStatementWithCTE48=gHiveParser.selectStatementWithCTE();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_selectStatementWithCTE.add(selectStatementWithCTE48.getTree());
									}
									break;

							}

							}
							break;

					}

					// AST REWRITE
					// elements: createTablePartitionSpec, tableFileFormat, likeTableOrFile, tableComment, mgd, tableRowFormat, name, tableSkewed, tableBuckets, tablePropertiesPrefixed, columnNameTypeOrConstraintList, tableLocation, selectStatementWithCTE, ifNotExists
					// token labels: mgd
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_mgd=new RewriteRuleTokenStream(adaptor,"token mgd",mgd);
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 104:5: -> ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
					{
						// CreateDDLParser.g:104:8: ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATETABLE, "TOK_CREATETABLE"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, stream_mgd.nextNode());
						// CreateDDLParser.g:104:37: ( ifNotExists )?
						if ( stream_ifNotExists.hasNext() ) {
							adaptor.addChild(root_1, stream_ifNotExists.nextTree());
						}
						stream_ifNotExists.reset();

						// CreateDDLParser.g:105:10: ( likeTableOrFile )?
						if ( stream_likeTableOrFile.hasNext() ) {
							adaptor.addChild(root_1, stream_likeTableOrFile.nextTree());
						}
						stream_likeTableOrFile.reset();

						// CreateDDLParser.g:106:10: ( columnNameTypeOrConstraintList )?
						if ( stream_columnNameTypeOrConstraintList.hasNext() ) {
							adaptor.addChild(root_1, stream_columnNameTypeOrConstraintList.nextTree());
						}
						stream_columnNameTypeOrConstraintList.reset();

						// CreateDDLParser.g:107:10: ( tableComment )?
						if ( stream_tableComment.hasNext() ) {
							adaptor.addChild(root_1, stream_tableComment.nextTree());
						}
						stream_tableComment.reset();

						// CreateDDLParser.g:108:10: ( createTablePartitionSpec )?
						if ( stream_createTablePartitionSpec.hasNext() ) {
							adaptor.addChild(root_1, stream_createTablePartitionSpec.nextTree());
						}
						stream_createTablePartitionSpec.reset();

						// CreateDDLParser.g:109:10: ( tableBuckets )?
						if ( stream_tableBuckets.hasNext() ) {
							adaptor.addChild(root_1, stream_tableBuckets.nextTree());
						}
						stream_tableBuckets.reset();

						// CreateDDLParser.g:110:10: ( tableSkewed )?
						if ( stream_tableSkewed.hasNext() ) {
							adaptor.addChild(root_1, stream_tableSkewed.nextTree());
						}
						stream_tableSkewed.reset();

						// CreateDDLParser.g:111:10: ( tableRowFormat )?
						if ( stream_tableRowFormat.hasNext() ) {
							adaptor.addChild(root_1, stream_tableRowFormat.nextTree());
						}
						stream_tableRowFormat.reset();

						// CreateDDLParser.g:112:10: ( tableFileFormat )?
						if ( stream_tableFileFormat.hasNext() ) {
							adaptor.addChild(root_1, stream_tableFileFormat.nextTree());
						}
						stream_tableFileFormat.reset();

						// CreateDDLParser.g:113:10: ( tableLocation )?
						if ( stream_tableLocation.hasNext() ) {
							adaptor.addChild(root_1, stream_tableLocation.nextTree());
						}
						stream_tableLocation.reset();

						// CreateDDLParser.g:114:10: ( tablePropertiesPrefixed )?
						if ( stream_tablePropertiesPrefixed.hasNext() ) {
							adaptor.addChild(root_1, stream_tablePropertiesPrefixed.nextTree());
						}
						stream_tablePropertiesPrefixed.reset();

						// CreateDDLParser.g:115:10: ( selectStatementWithCTE )?
						if ( stream_selectStatementWithCTE.hasNext() ) {
							adaptor.addChild(root_1, stream_selectStatementWithCTE.nextTree());
						}
						stream_selectStatementWithCTE.reset();

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
	// $ANTLR end "createTableStatement"


	public static class createDataConnectorStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "createDataConnectorStatement"
	// CreateDDLParser.g:119:1: createDataConnectorStatement : KW_CREATE KW_DATACONNECTOR ( ifNotExists )? name= identifier dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )? -> ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? ) ;
	public final HiveParser_CreateDDLParser.createDataConnectorStatement_return createDataConnectorStatement() throws RecognitionException {
		HiveParser_CreateDDLParser.createDataConnectorStatement_return retval = new HiveParser_CreateDDLParser.createDataConnectorStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_CREATE49=null;
		Token KW_DATACONNECTOR50=null;
		Token KW_WITH55=null;
		Token KW_DCPROPERTIES56=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope dcprops =null;
		ParserRuleReturnScope ifNotExists51 =null;
		ParserRuleReturnScope dataConnectorType52 =null;
		ParserRuleReturnScope dataConnectorUrl53 =null;
		ParserRuleReturnScope dataConnectorComment54 =null;

		ASTNode KW_CREATE49_tree=null;
		ASTNode KW_DATACONNECTOR50_tree=null;
		ASTNode KW_WITH55_tree=null;
		ASTNode KW_DCPROPERTIES56_tree=null;
		RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_DATACONNECTOR=new RewriteRuleTokenStream(adaptor,"token KW_DATACONNECTOR");
		RewriteRuleTokenStream stream_KW_DCPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_DCPROPERTIES");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_dataConnectorType=new RewriteRuleSubtreeStream(adaptor,"rule dataConnectorType");
		RewriteRuleSubtreeStream stream_dcProperties=new RewriteRuleSubtreeStream(adaptor,"rule dcProperties");
		RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
		RewriteRuleSubtreeStream stream_dataConnectorComment=new RewriteRuleSubtreeStream(adaptor,"rule dataConnectorComment");
		RewriteRuleSubtreeStream stream_dataConnectorUrl=new RewriteRuleSubtreeStream(adaptor,"rule dataConnectorUrl");

		 gParent.pushMsg("create connector statement", state); 
		try {
			// CreateDDLParser.g:122:5: ( KW_CREATE KW_DATACONNECTOR ( ifNotExists )? name= identifier dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )? -> ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? ) )
			// CreateDDLParser.g:122:7: KW_CREATE KW_DATACONNECTOR ( ifNotExists )? name= identifier dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )?
			{
			KW_CREATE49=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createDataConnectorStatement961); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE49);

			KW_DATACONNECTOR50=(Token)match(input,KW_DATACONNECTOR,FOLLOW_KW_DATACONNECTOR_in_createDataConnectorStatement963); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DATACONNECTOR.add(KW_DATACONNECTOR50);

			// CreateDDLParser.g:122:34: ( ifNotExists )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==KW_IF) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// CreateDDLParser.g:122:34: ifNotExists
					{
					pushFollow(FOLLOW_ifNotExists_in_createDataConnectorStatement965);
					ifNotExists51=gHiveParser.ifNotExists();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists51.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_createDataConnectorStatement970);
			name=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(name.getTree());
			pushFollow(FOLLOW_dataConnectorType_in_createDataConnectorStatement972);
			dataConnectorType52=dataConnectorType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dataConnectorType.add(dataConnectorType52.getTree());
			pushFollow(FOLLOW_dataConnectorUrl_in_createDataConnectorStatement974);
			dataConnectorUrl53=dataConnectorUrl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dataConnectorUrl.add(dataConnectorUrl53.getTree());
			// CreateDDLParser.g:122:98: ( dataConnectorComment )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==KW_COMMENT) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// CreateDDLParser.g:122:98: dataConnectorComment
					{
					pushFollow(FOLLOW_dataConnectorComment_in_createDataConnectorStatement976);
					dataConnectorComment54=dataConnectorComment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_dataConnectorComment.add(dataConnectorComment54.getTree());
					}
					break;

			}

			// CreateDDLParser.g:122:120: ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==KW_WITH) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// CreateDDLParser.g:122:122: KW_WITH KW_DCPROPERTIES dcprops= dcProperties
					{
					KW_WITH55=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createDataConnectorStatement981); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH55);

					KW_DCPROPERTIES56=(Token)match(input,KW_DCPROPERTIES,FOLLOW_KW_DCPROPERTIES_in_createDataConnectorStatement983); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_DCPROPERTIES.add(KW_DCPROPERTIES56);

					pushFollow(FOLLOW_dcProperties_in_createDataConnectorStatement987);
					dcprops=dcProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_dcProperties.add(dcprops.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: dataConnectorComment, dataConnectorType, dataConnectorUrl, name, ifNotExists, dcprops
			// token labels: 
			// rule labels: name, retval, dcprops
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_dcprops=new RewriteRuleSubtreeStream(adaptor,"rule dcprops",dcprops!=null?dcprops.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 123:5: -> ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? )
			{
				// CreateDDLParser.g:123:8: ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATEDATACONNECTOR, "TOK_CREATEDATACONNECTOR"), root_1);
				adaptor.addChild(root_1, stream_name.nextTree());
				// CreateDDLParser.g:123:40: ( ifNotExists )?
				if ( stream_ifNotExists.hasNext() ) {
					adaptor.addChild(root_1, stream_ifNotExists.nextTree());
				}
				stream_ifNotExists.reset();

				adaptor.addChild(root_1, stream_dataConnectorType.nextTree());
				adaptor.addChild(root_1, stream_dataConnectorUrl.nextTree());
				// CreateDDLParser.g:123:88: ( dataConnectorComment )?
				if ( stream_dataConnectorComment.hasNext() ) {
					adaptor.addChild(root_1, stream_dataConnectorComment.nextTree());
				}
				stream_dataConnectorComment.reset();

				// CreateDDLParser.g:123:111: ( $dcprops)?
				if ( stream_dcprops.hasNext() ) {
					adaptor.addChild(root_1, stream_dcprops.nextTree());
				}
				stream_dcprops.reset();

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
	// $ANTLR end "createDataConnectorStatement"


	public static class dataConnectorComment_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dataConnectorComment"
	// CreateDDLParser.g:126:1: dataConnectorComment : KW_COMMENT comment= StringLiteral -> ^( TOK_DATACONNECTORCOMMENT $comment) ;
	public final HiveParser_CreateDDLParser.dataConnectorComment_return dataConnectorComment() throws RecognitionException {
		HiveParser_CreateDDLParser.dataConnectorComment_return retval = new HiveParser_CreateDDLParser.dataConnectorComment_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token comment=null;
		Token KW_COMMENT57=null;

		ASTNode comment_tree=null;
		ASTNode KW_COMMENT57_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");

		 gParent.pushMsg("dataconnector comment", state); 
		try {
			// CreateDDLParser.g:129:5: ( KW_COMMENT comment= StringLiteral -> ^( TOK_DATACONNECTORCOMMENT $comment) )
			// CreateDDLParser.g:129:7: KW_COMMENT comment= StringLiteral
			{
			KW_COMMENT57=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_dataConnectorComment1043); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT57);

			comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataConnectorComment1047); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(comment);

			// AST REWRITE
			// elements: comment
			// token labels: comment
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 130:5: -> ^( TOK_DATACONNECTORCOMMENT $comment)
			{
				// CreateDDLParser.g:130:8: ^( TOK_DATACONNECTORCOMMENT $comment)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DATACONNECTORCOMMENT, "TOK_DATACONNECTORCOMMENT"), root_1);
				adaptor.addChild(root_1, stream_comment.nextNode());
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
	// $ANTLR end "dataConnectorComment"


	public static class dataConnectorUrl_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dataConnectorUrl"
	// CreateDDLParser.g:133:1: dataConnectorUrl : KW_URL url= StringLiteral -> ^( TOK_DATACONNECTORURL $url) ;
	public final HiveParser_CreateDDLParser.dataConnectorUrl_return dataConnectorUrl() throws RecognitionException {
		HiveParser_CreateDDLParser.dataConnectorUrl_return retval = new HiveParser_CreateDDLParser.dataConnectorUrl_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token url=null;
		Token KW_URL58=null;

		ASTNode url_tree=null;
		ASTNode KW_URL58_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_URL=new RewriteRuleTokenStream(adaptor,"token KW_URL");

		 gParent.pushMsg("dataconnector URL", state); 
		try {
			// CreateDDLParser.g:136:5: ( KW_URL url= StringLiteral -> ^( TOK_DATACONNECTORURL $url) )
			// CreateDDLParser.g:136:7: KW_URL url= StringLiteral
			{
			KW_URL58=(Token)match(input,KW_URL,FOLLOW_KW_URL_in_dataConnectorUrl1087); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_URL.add(KW_URL58);

			url=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataConnectorUrl1091); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(url);

			// AST REWRITE
			// elements: url
			// token labels: url
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_url=new RewriteRuleTokenStream(adaptor,"token url",url);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 137:5: -> ^( TOK_DATACONNECTORURL $url)
			{
				// CreateDDLParser.g:137:8: ^( TOK_DATACONNECTORURL $url)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DATACONNECTORURL, "TOK_DATACONNECTORURL"), root_1);
				adaptor.addChild(root_1, stream_url.nextNode());
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
	// $ANTLR end "dataConnectorUrl"


	public static class dataConnectorType_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dataConnectorType"
	// CreateDDLParser.g:140:1: dataConnectorType : KW_TYPE dcType= StringLiteral -> ^( TOK_DATACONNECTORTYPE $dcType) ;
	public final HiveParser_CreateDDLParser.dataConnectorType_return dataConnectorType() throws RecognitionException {
		HiveParser_CreateDDLParser.dataConnectorType_return retval = new HiveParser_CreateDDLParser.dataConnectorType_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token dcType=null;
		Token KW_TYPE59=null;

		ASTNode dcType_tree=null;
		ASTNode KW_TYPE59_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_TYPE=new RewriteRuleTokenStream(adaptor,"token KW_TYPE");

		 gParent.pushMsg("dataconnector type", state); 
		try {
			// CreateDDLParser.g:143:5: ( KW_TYPE dcType= StringLiteral -> ^( TOK_DATACONNECTORTYPE $dcType) )
			// CreateDDLParser.g:143:7: KW_TYPE dcType= StringLiteral
			{
			KW_TYPE59=(Token)match(input,KW_TYPE,FOLLOW_KW_TYPE_in_dataConnectorType1131); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TYPE.add(KW_TYPE59);

			dcType=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataConnectorType1135); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(dcType);

			// AST REWRITE
			// elements: dcType
			// token labels: dcType
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dcType=new RewriteRuleTokenStream(adaptor,"token dcType",dcType);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 144:5: -> ^( TOK_DATACONNECTORTYPE $dcType)
			{
				// CreateDDLParser.g:144:8: ^( TOK_DATACONNECTORTYPE $dcType)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DATACONNECTORTYPE, "TOK_DATACONNECTORTYPE"), root_1);
				adaptor.addChild(root_1, stream_dcType.nextNode());
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
	// $ANTLR end "dataConnectorType"


	public static class dcProperties_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dcProperties"
	// CreateDDLParser.g:147:1: dcProperties : LPAREN dbPropertiesList RPAREN -> ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList ) ;
	public final HiveParser_CreateDDLParser.dcProperties_return dcProperties() throws RecognitionException {
		HiveParser_CreateDDLParser.dcProperties_return retval = new HiveParser_CreateDDLParser.dcProperties_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN60=null;
		Token RPAREN62=null;
		ParserRuleReturnScope dbPropertiesList61 =null;

		ASTNode LPAREN60_tree=null;
		ASTNode RPAREN62_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_dbPropertiesList=new RewriteRuleSubtreeStream(adaptor,"rule dbPropertiesList");

		 gParent.pushMsg("dcproperties", state); 
		try {
			// CreateDDLParser.g:150:5: ( LPAREN dbPropertiesList RPAREN -> ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList ) )
			// CreateDDLParser.g:151:7: LPAREN dbPropertiesList RPAREN
			{
			LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dcProperties1181); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN60);

			pushFollow(FOLLOW_dbPropertiesList_in_dcProperties1183);
			dbPropertiesList61=gHiveParser.dbPropertiesList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_dbPropertiesList.add(dbPropertiesList61.getTree());
			RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dcProperties1185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN62);

			// AST REWRITE
			// elements: dbPropertiesList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 151:38: -> ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList )
			{
				// CreateDDLParser.g:151:41: ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DATACONNECTORPROPERTIES, "TOK_DATACONNECTORPROPERTIES"), root_1);
				adaptor.addChild(root_1, stream_dbPropertiesList.nextTree());
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
	// $ANTLR end "dcProperties"


	public static class dropDataConnectorStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dropDataConnectorStatement"
	// CreateDDLParser.g:154:1: dropDataConnectorStatement : KW_DROP ( KW_DATACONNECTOR ) ( ifExists )? identifier -> ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? ) ;
	public final HiveParser_CreateDDLParser.dropDataConnectorStatement_return dropDataConnectorStatement() throws RecognitionException {
		HiveParser_CreateDDLParser.dropDataConnectorStatement_return retval = new HiveParser_CreateDDLParser.dropDataConnectorStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DROP63=null;
		Token KW_DATACONNECTOR64=null;
		ParserRuleReturnScope ifExists65 =null;
		ParserRuleReturnScope identifier66 =null;

		ASTNode KW_DROP63_tree=null;
		ASTNode KW_DATACONNECTOR64_tree=null;
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_DATACONNECTOR=new RewriteRuleTokenStream(adaptor,"token KW_DATACONNECTOR");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");

		 gParent.pushMsg("drop connector statement", state); 
		try {
			// CreateDDLParser.g:157:5: ( KW_DROP ( KW_DATACONNECTOR ) ( ifExists )? identifier -> ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? ) )
			// CreateDDLParser.g:157:7: KW_DROP ( KW_DATACONNECTOR ) ( ifExists )? identifier
			{
			KW_DROP63=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropDataConnectorStatement1220); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP63);

			// CreateDDLParser.g:157:15: ( KW_DATACONNECTOR )
			// CreateDDLParser.g:157:16: KW_DATACONNECTOR
			{
			KW_DATACONNECTOR64=(Token)match(input,KW_DATACONNECTOR,FOLLOW_KW_DATACONNECTOR_in_dropDataConnectorStatement1223); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_DATACONNECTOR.add(KW_DATACONNECTOR64);

			}

			// CreateDDLParser.g:157:34: ( ifExists )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==KW_IF) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// CreateDDLParser.g:157:34: ifExists
					{
					pushFollow(FOLLOW_ifExists_in_dropDataConnectorStatement1226);
					ifExists65=gHiveParser.ifExists();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifExists.add(ifExists65.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_dropDataConnectorStatement1229);
			identifier66=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier66.getTree());
			// AST REWRITE
			// elements: identifier, ifExists
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 158:5: -> ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? )
			{
				// CreateDDLParser.g:158:8: ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROPDATACONNECTOR, "TOK_DROPDATACONNECTOR"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				// CreateDDLParser.g:158:43: ( ifExists )?
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
	// $ANTLR end "dropDataConnectorStatement"

	// $ANTLR start synpred1_CreateDDLParser
	public final void synpred1_CreateDDLParser_fragment() throws RecognitionException {
		// CreateDDLParser.g:47:7: ( KW_LIKE KW_FILE )
		// CreateDDLParser.g:47:8: KW_LIKE KW_FILE
		{
		match(input,KW_LIKE,FOLLOW_KW_LIKE_in_synpred1_CreateDDLParser56); if (state.failed) return;

		match(input,KW_FILE,FOLLOW_KW_FILE_in_synpred1_CreateDDLParser58); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_CreateDDLParser

	// Delegated rules

	public final boolean synpred1_CreateDDLParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_CreateDDLParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_KW_LIKE_in_likeTableOrFile63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_FILE_in_likeTableOrFile65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LIKE_in_likeTableOrFile74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_FILE_in_likeTableOrFile76 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_likeTableOrFile80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_likeTableOrFile84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LIKE_in_likeTableOrFile106 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_likeTableOrFile110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CREATE_in_createTableStatement148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000020044000L});
	public static final BitSet FOLLOW_KW_TEMPORARY_in_createTableStatement153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000020004000L});
	public static final BitSet FOLLOW_KW_TRANSACTIONAL_in_createTableStatement160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_EXTERNAL_in_createTableStatement167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_TABLE_in_createTableStatement171 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECF8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_ifNotExists_in_createTableStatement173 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_createTableStatement178 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000042L,0x0000000000000000L,0x0080000000000420L,0x0800040000000000L,0x0000000000020040L,0x0000000000020000L});
	public static final BitSet FOLLOW_likeTableOrFile_in_createTableStatement189 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0080000000000400L,0x0000040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_createTablePartitionSpec_in_createTableStatement200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableLocation_in_createTableStatement236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_createTableStatement261 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502EF6FL,0xFDC0ECB8470783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EB0L,0xEB9DF6B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_createTableStatement265 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000042L,0x0000000000000000L,0x0080000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableComment_in_createTableStatement278 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000002L,0x0000000000000000L,0x0080000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_createTablePartitionSpec_in_createTableStatement290 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000002L,0x0000000000000000L,0x0000000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableBuckets_in_createTableStatement302 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableSkewed_in_createTableStatement314 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement326 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement338 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableLocation_in_createTableStatement350 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement362 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_KW_AS_in_createTableStatement375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L,0x0002000000080000L,0x0400000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_selectStatementWithCTE_in_createTableStatement377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CREATE_in_createTableStatement564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_MANAGED_in_createTableStatement568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_TABLE_in_createTableStatement570 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECF8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_ifNotExists_in_createTableStatement572 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_tableName_in_createTableStatement577 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000042L,0x0000000000000000L,0x0080000000000420L,0x0800040000000000L,0x0000000000020040L,0x0000000000020000L});
	public static final BitSet FOLLOW_likeTableOrFile_in_createTableStatement588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableLocation_in_createTableStatement623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_createTableStatement648 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502EF6FL,0xFDC0ECB8470783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EB0L,0xEB9DF6B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_createTableStatement652 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000042L,0x0000000000000000L,0x0080000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableComment_in_createTableStatement665 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000002L,0x0000000000000000L,0x0080000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_createTablePartitionSpec_in_createTableStatement677 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000002L,0x0000000000000000L,0x0000000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableBuckets_in_createTableStatement689 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0800040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableSkewed_in_createTableStatement701 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000040000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement713 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement725 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tableLocation_in_createTableStatement737 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement749 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_KW_AS_in_createTableStatement762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L,0x0002000000080000L,0x0400000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_selectStatementWithCTE_in_createTableStatement764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CREATE_in_createDataConnectorStatement961 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_DATACONNECTOR_in_createDataConnectorStatement963 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECF8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_ifNotExists_in_createDataConnectorStatement965 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_createDataConnectorStatement970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_dataConnectorType_in_createDataConnectorStatement972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_dataConnectorUrl_in_createDataConnectorStatement974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_dataConnectorComment_in_createDataConnectorStatement976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_WITH_in_createDataConnectorStatement981 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_KW_DCPROPERTIES_in_createDataConnectorStatement983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_dcProperties_in_createDataConnectorStatement987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_COMMENT_in_dataConnectorComment1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_dataConnectorComment1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_URL_in_dataConnectorUrl1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_dataConnectorUrl1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TYPE_in_dataConnectorType1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_StringLiteral_in_dataConnectorType1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_dcProperties1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_dbPropertiesList_in_dcProperties1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RPAREN_in_dcProperties1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_dropDataConnectorStatement1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_DATACONNECTOR_in_dropDataConnectorStatement1223 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECF8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_ifExists_in_dropDataConnectorStatement1226 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_dropDataConnectorStatement1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LIKE_in_synpred1_CreateDDLParser56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_KW_FILE_in_synpred1_CreateDDLParser58 = new BitSet(new long[]{0x0000000000000002L});
}
