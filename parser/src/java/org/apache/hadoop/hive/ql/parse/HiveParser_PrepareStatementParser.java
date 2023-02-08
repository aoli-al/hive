// $ANTLR 3.5.2 PrepareStatementParser.g 2023-02-08 15:38:05

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
public class HiveParser_PrepareStatementParser extends Parser {
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


	public HiveParser_PrepareStatementParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_PrepareStatementParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "PrepareStatementParser.g"; }


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


	public static class prepareStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "prepareStatement"
	// PrepareStatementParser.g:47:1: prepareStatement : KW_PREPARE identifier KW_FROM queryStatementExpression -> ^( TOK_PREPARE queryStatementExpression identifier ) ;
	public final HiveParser_PrepareStatementParser.prepareStatement_return prepareStatement() throws RecognitionException {
		HiveParser_PrepareStatementParser.prepareStatement_return retval = new HiveParser_PrepareStatementParser.prepareStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_PREPARE1=null;
		Token KW_FROM3=null;
		ParserRuleReturnScope identifier2 =null;
		ParserRuleReturnScope queryStatementExpression4 =null;

		ASTNode KW_PREPARE1_tree=null;
		ASTNode KW_FROM3_tree=null;
		RewriteRuleTokenStream stream_KW_PREPARE=new RewriteRuleTokenStream(adaptor,"token KW_PREPARE");
		RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");

		 gParent.pushMsg("prepare statement ", state); 
		try {
			// PrepareStatementParser.g:50:5: ( KW_PREPARE identifier KW_FROM queryStatementExpression -> ^( TOK_PREPARE queryStatementExpression identifier ) )
			// PrepareStatementParser.g:50:7: KW_PREPARE identifier KW_FROM queryStatementExpression
			{
			KW_PREPARE1=(Token)match(input,KW_PREPARE,FOLLOW_KW_PREPARE_in_prepareStatement66);  
			stream_KW_PREPARE.add(KW_PREPARE1);

			pushFollow(FOLLOW_identifier_in_prepareStatement68);
			identifier2=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(identifier2.getTree());
			KW_FROM3=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_prepareStatement70);  
			stream_KW_FROM.add(KW_FROM3);

			pushFollow(FOLLOW_queryStatementExpression_in_prepareStatement72);
			queryStatementExpression4=gHiveParser.queryStatementExpression();
			state._fsp--;

			stream_queryStatementExpression.add(queryStatementExpression4.getTree());
			// AST REWRITE
			// elements: queryStatementExpression, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 51:5: -> ^( TOK_PREPARE queryStatementExpression identifier )
			{
				// PrepareStatementParser.g:51:8: ^( TOK_PREPARE queryStatementExpression identifier )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PREPARE, "TOK_PREPARE"), root_1);
				adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prepareStatement"


	public static class executeStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "executeStatement"
	// PrepareStatementParser.g:54:1: executeStatement : KW_EXECUTE identifier KW_USING executeParamList -> ^( TOK_EXECUTE executeParamList identifier ) ;
	public final HiveParser_PrepareStatementParser.executeStatement_return executeStatement() throws RecognitionException {
		HiveParser_PrepareStatementParser.executeStatement_return retval = new HiveParser_PrepareStatementParser.executeStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_EXECUTE5=null;
		Token KW_USING7=null;
		ParserRuleReturnScope identifier6 =null;
		ParserRuleReturnScope executeParamList8 =null;

		ASTNode KW_EXECUTE5_tree=null;
		ASTNode KW_USING7_tree=null;
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_KW_EXECUTE=new RewriteRuleTokenStream(adaptor,"token KW_EXECUTE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_executeParamList=new RewriteRuleSubtreeStream(adaptor,"rule executeParamList");

		 gParent.pushMsg("execute statement ", state); 
		try {
			// PrepareStatementParser.g:57:5: ( KW_EXECUTE identifier KW_USING executeParamList -> ^( TOK_EXECUTE executeParamList identifier ) )
			// PrepareStatementParser.g:57:7: KW_EXECUTE identifier KW_USING executeParamList
			{
			KW_EXECUTE5=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_executeStatement113);  
			stream_KW_EXECUTE.add(KW_EXECUTE5);

			pushFollow(FOLLOW_identifier_in_executeStatement115);
			identifier6=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(identifier6.getTree());
			KW_USING7=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_executeStatement117);  
			stream_KW_USING.add(KW_USING7);

			pushFollow(FOLLOW_executeParamList_in_executeStatement119);
			executeParamList8=executeParamList();
			state._fsp--;

			stream_executeParamList.add(executeParamList8.getTree());
			// AST REWRITE
			// elements: executeParamList, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 58:5: -> ^( TOK_EXECUTE executeParamList identifier )
			{
				// PrepareStatementParser.g:58:8: ^( TOK_EXECUTE executeParamList identifier )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_EXECUTE, "TOK_EXECUTE"), root_1);
				adaptor.addChild(root_1, stream_executeParamList.nextTree());
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "executeStatement"


	public static class executeParamList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "executeParamList"
	// PrepareStatementParser.g:62:1: executeParamList : constant ( COMMA constant )* -> ^( TOK_EXECUTE_PARAM_LIST ( constant )+ ) ;
	public final HiveParser_PrepareStatementParser.executeParamList_return executeParamList() throws RecognitionException {
		HiveParser_PrepareStatementParser.executeParamList_return retval = new HiveParser_PrepareStatementParser.executeParamList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA10=null;
		ParserRuleReturnScope constant9 =null;
		ParserRuleReturnScope constant11 =null;

		ASTNode COMMA10_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		 gParent.pushMsg("execute param list", state); 
		try {
			// PrepareStatementParser.g:65:5: ( constant ( COMMA constant )* -> ^( TOK_EXECUTE_PARAM_LIST ( constant )+ ) )
			// PrepareStatementParser.g:65:7: constant ( COMMA constant )*
			{
			pushFollow(FOLLOW_constant_in_executeParamList161);
			constant9=gHiveParser.constant();
			state._fsp--;

			stream_constant.add(constant9.getTree());
			// PrepareStatementParser.g:65:16: ( COMMA constant )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==COMMA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// PrepareStatementParser.g:65:17: COMMA constant
					{
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_executeParamList164);  
					stream_COMMA.add(COMMA10);

					pushFollow(FOLLOW_constant_in_executeParamList166);
					constant11=gHiveParser.constant();
					state._fsp--;

					stream_constant.add(constant11.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: constant
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 66:5: -> ^( TOK_EXECUTE_PARAM_LIST ( constant )+ )
			{
				// PrepareStatementParser.g:66:8: ^( TOK_EXECUTE_PARAM_LIST ( constant )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_EXECUTE_PARAM_LIST, "TOK_EXECUTE_PARAM_LIST"), root_1);
				if ( !(stream_constant.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_constant.hasNext() ) {
					adaptor.addChild(root_1, stream_constant.nextTree());
				}
				stream_constant.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "executeParamList"

	// Delegated rules



	public static final BitSet FOLLOW_KW_PREPARE_in_prepareStatement66 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_prepareStatement68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_FROM_in_prepareStatement70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000008000000L,0x0000000000080000L,0x0002000000080000L,0x0400000000000000L,0x0000000000020040L});
	public static final BitSet FOLLOW_queryStatementExpression_in_prepareStatement72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_EXECUTE_in_executeStatement113 = new BitSet(new long[]{0xB360DC8AFD000000L,0xEB5DEEEBC502CF6FL,0xFDC0ECB8460783DCL,0xF3B61956DAF77DD0L,0xAFBDF0CBFFC72EA0L,0xEB9DF2B2750EB7F7L,0x0000000000001F93L,0x0400000000002000L,0x0008000000000000L,0x0001100000000000L,0x0000000000080800L,0x0000000001000000L});
	public static final BitSet FOLLOW_identifier_in_executeStatement115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_KW_USING_in_executeStatement117 = new BitSet(new long[]{0x0000000002001000L,0x0000000020600000L,0x0000000000002000L,0x0000002000000000L,0x0000000000000000L,0x0000000400C00000L,0x0000000809800000L});
	public static final BitSet FOLLOW_executeParamList_in_executeStatement119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_executeParamList161 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_executeParamList164 = new BitSet(new long[]{0x0000000002001000L,0x0000000020600000L,0x0000000000002000L,0x0000002000000000L,0x0000000000000000L,0x0000000400C00000L,0x0000000809800000L});
	public static final BitSet FOLLOW_constant_in_executeParamList166 = new BitSet(new long[]{0x0000000000000202L});
}
