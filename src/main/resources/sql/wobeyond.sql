/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/10/17 21:19:04                          */
/*==============================================================*/

DROP TABLE IF EXISTS BUSI_ORDRE;

DROP TABLE IF EXISTS ACCOUNT_HAND_APPLY;

DROP TABLE IF EXISTS Account;

DROP TABLE IF EXISTS BUSI_ORDER;

DROP TABLE IF EXISTS PROD;

DROP TABLE IF EXISTS SERIAL;

DROP TABLE IF EXISTS customer;

DROP TABLE IF EXISTS order_send;

/*==============================================================*/
/* Table: ACCOUNT_HAND_APPLY                                    */
/*==============================================================*/
CREATE TABLE ACCOUNT_HAND_APPLY
(
   ACCOUNT_HAND_APPLY_ID INT AUTO_INCREMENT COMMENT '开户信息ID',
   OPERATORID           INT COMMENT '操作员ID',
   OPERATORNAME         VARCHAR(50) COMMENT '操作员姓名',
   PROVINCE             VARCHAR(10) COMMENT '省分',
   CITY                 VARCHAR(10) COMMENT '地市',
   DISTRICT             VARCHAR(10) COMMENT '区县',
   DEPARTMENT           VARCHAR(50) COMMENT '部门',
   CHANNEL              VARCHAR(50) COMMENT '渠道名称',
   PROD_ID              INT COMMENT '产品ID',
   PROD_TYPE            INT COMMENT '产品类别',
   PROD_NAME            VARCHAR(50) COMMENT '产品名称',
   COMBO_FEE            DECIMAL(10,2) COMMENT '套餐月费',
   PROMISE_TIME         INT COMMENT '承诺在网时长',
   PRE_PAY_FEE          DECIMAL(10,2) COMMENT '预存款',
   CUSTID               INT COMMENT '客户ID',
   REALNAMETYPE         INT COMMENT '客户实名标识',
   CUSTTYPE             INT COMMENT '新老客户标识',
   REFCUSTID            INT COMMENT '老客户ID',
   CERTTYPE             INT COMMENT '证件类型',
   CERTNUM              VARCHAR(50) COMMENT '证件号码',
   CERTADRESS           VARCHAR(512) COMMENT '证件地址',
   CUSTOMERNAME         VARCHAR(50) COMMENT '客户名称',
   SEX                  VARCHAR(10) COMMENT '性别',
   TMPPHONE             VARCHAR(50) COMMENT '电话',
   CUSTTYPE1            INT COMMENT '客户类型',
   PSPTNUMBER           INT COMMENT '港澳台居民出入境证件证件号码',
   SERIAL_ID            INT COMMENT '业务编码',
   SERIAL_NUMBER        VARCHAR(50) COMMENT '手机号码',
   SERIAL_PROVINCE      VARCHAR(10) COMMENT '归属省分',
   SERIAL_CITY          VARCHAR(10) COMMENT '归属地市',
   BUSINESS_TYPE        INT COMMENT '业务分类',
   ADVANCE_LIMIT        DECIMAL(10,2) COMMENT '预存款（分）',
   MONTHFEE_LIMIT       DECIMAL(10,2) COMMENT '月承诺通信费（分）',
   MONTH_LIMIT          INT COMMENT '协议期（月）',
   NICE_RULE_TAG        INT COMMENT '靓号标志位',
   FEATURE_TYPE         INT COMMENT '特色靓号类型',
   FEATURE_NAME         VARCHAR(50) COMMENT '特色靓号名',
   GOOD_TYPE            VARCHAR(50) COMMENT '靓号类型',
   PAYINFO              VARCHAR(50) COMMENT '支付信息',
   PAYTYPE              VARCHAR(50) COMMENT '支付方式',
   PAYORG               VARCHAR(50) COMMENT '支付机构名称',
   PAYNUM               INT COMMENT '支付账号',
   SALEPRICE            DECIMAL(10,2) COMMENT '销售价格（单位：厘）',
   COST                 DECIMAL(10,2) COMMENT '成本价格（单位：厘）',
   CARDPRICE            DECIMAL(10,2) COMMENT '卡费（单位：厘）',
   RESERVAPRICE         DECIMAL(10,2) COMMENT '预存话费金额（单位：厘）',
   RESOURCESBRANDCODE   VARCHAR(50) COMMENT '品牌',
   ORGDEVICEBRANDCODE   VARCHAR(50) COMMENT '3GESS维护品牌',
   RESOURCESBRANDNAME   VARCHAR(50) COMMENT '终端品牌名称',
   RESOURCESMODELCODE   VARCHAR(50) COMMENT '型号',
   RESOURCESMODELNAME   VARCHAR(50) COMMENT '终端型号名称',
   RESOURCESSRCCODE     VARCHAR(50) COMMENT '终端来源编码',
   RESOURCESSRCNAME     VARCHAR(50) COMMENT '终端来源名称',
   RESOURCESSUPPLYCORP  VARCHAR(50) COMMENT '终端供货商名称',
   RESOURCESSERVICECORP VARCHAR(50) COMMENT '终端服务商名称',
   RESOURCESCOLOR       VARCHAR(10) COMMENT '终端颜色',
   MACHINETYPECODE      VARCHAR(50) COMMENT '终端机型编码',
   MACHINETYPENAME      VARCHAR(50) COMMENT '终端机型名称',
   TERMINALTYPE         VARCHAR(10) COMMENT '终端类别编码',
   TERMINALTSUBTYPE     INT COMMENT '终端子类别编码',
   SIMID                INT COMMENT 'SIMID',
   IMSI                 VARCHAR(50) COMMENT '新IMSI号' ,
   PRIMARY KEY (ACCOUNT_HAND_APPLY_ID)
);

ALTER TABLE ACCOUNT_HAND_APPLY COMMENT '开户信息表';

/*==============================================================*/
/* Table: Account                                               */
/*==============================================================*/
CREATE TABLE Account
(
   OPERATORID           INT NOT NULL AUTO_INCREMENT COMMENT '操作员ID',
   OPERATORNAME         VARCHAR(50) COMMENT '操作员姓名',
   PROVINCE             VARCHAR(10) COMMENT '省分',
   CITY                 VARCHAR(10) COMMENT '地市',
   DISTRICT             VARCHAR(10) COMMENT '区县',
   DEPARTMENT           VARCHAR(50) COMMENT '部门',
   CHANNEL              VARCHAR(50) COMMENT '渠道名称',
   ROLE                 VARCHAR(50) COMMENT '角色',
   passwd		            VARCHAR(50) COMMENT '密码',
   pic		              VARCHAR(5000) COMMENT '照片',
   PRIMARY KEY (OPERATORID)
);
ALTER TABLE Account COMMENT '后台用户员表';
/*==============================================================*/
/* Table: BUSI_ORDRE                                            */
/*==============================================================*/
CREATE TABLE BUSI_ORDER
(
   BUSI_CELLNO          INT NOT NULL AUTO_INCREMENT COMMENT '办理业务号码',
   BUSI_ORDER_DATE      DATETIME COMMENT '业务系统订单日期',
   PROVINCE_CODE        VARCHAR(10) COMMENT '省分',
   EPARCHY_CODE         VARCHAR(10) COMMENT '地市',
   CITY_CODE            VARCHAR(10) COMMENT '区县',
   CHANNEL_ID           VARCHAR(50) COMMENT '渠道',
   OPER_ID              INT COMMENT '操作员ID',
   BUSI_ORDER_ID        INT  COMMENT '业务系统支付订单号',
   SIGNATURE            VARCHAR(50) COMMENT '接口签名',
   SIGNATURE_TYPE       VARCHAR(50) COMMENT '签名方式',
   BUSI_TRANS_TYPE      VARCHAR(50) COMMENT '交易类型',
   BUSI_MERC_ID         VARCHAR(50) COMMENT '合作商户名称',
   BUSI_AMT             DECIMAL(10,2) COMMENT '订单金额（单位:分）',
   CUSTID               INT COMMENT '客户ID',
   SERIAL_ID            VARCHAR(50) COMMENT '号码ID',
   PROD_ID              INT COMMENT '产品ID',
   PAYINFO              VARCHAR(50) COMMENT '支付信息',
   PAYTYPE              VARCHAR(50) COMMENT '支付方式',
   PAYORG               VARCHAR(50) COMMENT '支付机构名称',
   PAYNUM               INT COMMENT '支付账号',
   pay_flag 		INT  COMMENT '成功标志',
   PRIMARY KEY (BUSI_CELLNO)
);

ALTER TABLE BUSI_ORDER COMMENT '支付订单表';

/*==============================================================*/
/* Table: PROD                                                  */
/*==============================================================*/
CREATE TABLE PROD
(
   PROD_ID              INT NOT NULL AUTO_INCREMENT COMMENT '产品ID',
   PROD_TYPE            VARCHAR(50) COMMENT '产品类别',
   PROD_NAME            VARCHAR(50) COMMENT '产品名称',
   COMBO_FEE            DECIMAL(10,2) COMMENT '套餐月费',
   PROMISE_TIME         INT COMMENT '承诺在网时长',
   PRE_PAY_FEE          DECIMAL(10,2) COMMENT '预存款',
   DES_PIC              VARCHAR(512) COMMENT '描述图片',
   PRIMARY KEY (PROD_ID)
);

ALTER TABLE PROD COMMENT '产品表';

/*==============================================================*/
/* Table: SERIAL                                                */
/*==============================================================*/
CREATE TABLE SERIAL
(
   SERIAL_ID            INT NOT NULL AUTO_INCREMENT COMMENT '业务编码',
   SERIAL_NUMBER        VARCHAR(50)   COMMENT '手机号码',
   SERIAL_PROVINCE      VARCHAR(10) COMMENT '归属省分',
   SERIAL_CITY          VARCHAR(10) COMMENT '地市',
   BUSINESS_TYPE        INT COMMENT '业务分类',
   ADVANCE_LIMIT        DECIMAL(10,2) COMMENT '预存款（分）',
   MONTHFEE_LIMIT       DECIMAL(10,2) COMMENT '月承诺通信费（分）',
   MONTH_LIMIT          INT COMMENT '协议期（月）',
   NICE_RULE_TAG        INT COMMENT '靓号标志位',
   FEATURE_TYPE         INT COMMENT '特色靓号类型',
   FEATURE_NAME         VARCHAR(50) COMMENT '特色靓号名',
   GOOD_TYPE            VARCHAR(50) COMMENT '靓号类型',
   HIGHLIGHT_NUMS       INT COMMENT '号码高亮位数',
   TOP_HIGHLIGHT_NUMS   INT COMMENT '号码类型高亮位数',
   PRIMARY KEY (SERIAL_ID)
);

ALTER TABLE SERIAL COMMENT '靓号表';

/*==============================================================*/
/* Table: customer                                              */
/*==============================================================*/
CREATE TABLE customer
(
   CUSTID               INT NOT NULL AUTO_INCREMENT COMMENT '客户ID',
   REALNAMETYPE         INT COMMENT '客户实名标识',
   CUSTTYPE             INT COMMENT '新老客户标识',
   REFCUSTID            INT COMMENT '老客户ID',
   CERTTYPE             INT COMMENT '证件类型',
   CERTNUM              VARCHAR(50) COMMENT '证件号码',
   CERTADRESS           VARCHAR(512) COMMENT '证件地址',
   CUSTOMERNAME         VARCHAR(50) COMMENT '客户名称',
   CERTEXPIREDATE       DATETIME COMMENT '证件失效日期',
   SEX                  VARCHAR(10) COMMENT '性别',
   TMPPHONE             VARCHAR(50) COMMENT '电话',
   CONTACTPERSON        VARCHAR(50) COMMENT '联系人',
   CONTACTPHONE         VARCHAR(50) COMMENT '联系人电话',
   CONTACTADDRESS       VARCHAR(512) COMMENT '联系地址',
   CUSTTYPE1            INT COMMENT '客户类型',
   ISSUESNUMBER         INT COMMENT '港澳台居民出入境证件签发次数',
   PSPTAUTHORITY        VARCHAR(50) COMMENT '港澳台居民出入境证件签发机关',
   PSPTSTARTDATE        DATETIME COMMENT '港澳台居民出入境证件证件起始有效期',
   PSPTNUMBER           VARCHAR(512) COMMENT '港澳台居民出入境证件证件号码',
   CUSTOMERREMARK       VARCHAR(512) COMMENT '客户备注',
   PRIMARY KEY (CUSTID)
);

ALTER TABLE customer COMMENT '客户信息表';

/*==============================================================*/
/* Table: order_send                                            */
/*==============================================================*/
CREATE TABLE order_send
(
   DELI_NO              INT NOT NULL COMMENT '配送订单号',
   OPER_ID              INT COMMENT '操作员ID',
   CUSTID               INT COMMENT '客户ID',
   SERIAL_ID            VARCHAR(50) COMMENT '号码ID',
   PROD_ID              INT COMMENT '产品ID',
   ACCOUNT_HAND_APPLY_ID INT COMMENT '开户ID',
   CONTACTADDRESS       VARCHAR(512) COMMENT '联系地址',
   PRIMARY KEY (DELI_NO)
);

ALTER TABLE order_send COMMENT '配送订单表';

/*==============================================================*/
/* View: district_count   各区数量的视图：获取近10个月的签约数量   */
/*==============================================================*/
CREATE  VIEW `district_count` AS

SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'1' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 9))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'2' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 8))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'3' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 7))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'4' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 6))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'5' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 5))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'6' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 4))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'7' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 3))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'8' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 2))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'9' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (PERIOD_DIFF(DATE_FORMAT(NOW(),'%Y%m'),DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m')) = 1))
GROUP BY `b`.`DISTRICT` UNION ALL SELECT `b`.`DISTRICT` AS `district`,COUNT(0) AS `counts`,'10' AS `months` FROM (`busi_order` `a` JOIN `account` `b`)
WHERE ((`a`.`OPER_ID` = `b`.`OPERATORID`) AND (`a`.`pay_flag` = 1) AND (DATE_FORMAT(`a`.`BUSI_ORDER_DATE`,'%Y%m') = DATE_FORMAT(CURDATE(),'%Y%m')))
GROUP BY `b`.`DISTRICT` ;


-- 把时间在原基础增加10个月，为了统计“时间环比销售分析”看起来更好看
UPDATE busi_order c SET c.BUSI_ORDER_DATE = DATE_ADD(c.BUSI_ORDER_DATE, INTERVAL 10 MONTH) ;