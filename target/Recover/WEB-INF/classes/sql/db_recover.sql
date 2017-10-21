/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : db_recover

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-10-21 11:36:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) DEFAULT NULL,
  `admin_password` varchar(20) DEFAULT NULL,
  `admin_realname` varchar(20) DEFAULT NULL,
  `admin_sex` varchar(20) DEFAULT NULL,
  `admin_age` varchar(20) DEFAULT NULL,
  `admin_rank` varchar(20) DEFAULT NULL,
  `admin_phone` varchar(20) DEFAULT NULL,
  `admin_date` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES ('1', '821453366', '123456', '普通用户', '男', '22', '2', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('2', 'admin', 'admin', '管理员', '男', '21', '1', '15423323563', '2017-03-12');
INSERT INTO `tb_admin` VALUES ('3', '4564456', '123456', '小明', '女', '22', '1', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('4', '45456787', '123456', '小花', '男', '22', '1', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('5', '7898779', '123456', '小李', '女', '22', '2', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('6', '45645646', '123456', '张飞', '男', '22', '2', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('7', '79854512', '123456', '杨东', '男', '22', '2', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('8', '45612536', '123456', '马虎', '女', '22', '2', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('9', '78945123', '123456', '山水', '男', '22', '1', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('10', '156789421', '123456', '扇贝', '男', '22', '1', '15684523145', '2017-10-14');
INSERT INTO `tb_admin` VALUES ('11', '486451245', '123456', '小明', '男', '23', '2', '13954213536', '2017-10-14');

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(20) DEFAULT NULL,
  `customer_sex` varchar(20) DEFAULT NULL,
  `customer_age` varchar(20) DEFAULT NULL,
  `customer_email` varchar(20) DEFAULT NULL,
  `customer_phone` varchar(20) DEFAULT NULL,
  `customer_company` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES ('1', '张经理', '男', '30', '1532135345@qq.com', '15426453625', '西安中铁一局');
INSERT INTO `tb_customer` VALUES ('3', '黄山', '男', '22', '821457744@qq.com', '1564236512', '西安二手车交易');
INSERT INTO `tb_customer` VALUES ('4', '李东', '男', '36', '965412632@qq.com', '15632453625', '西安宏润钢材有限公司');

-- ----------------------------
-- Table structure for tb_recovery
-- ----------------------------
DROP TABLE IF EXISTS `tb_recovery`;
CREATE TABLE `tb_recovery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `recovery_year` int(11) DEFAULT NULL,
  `recovery_month` int(11) DEFAULT NULL,
  `recovery_day` int(11) DEFAULT NULL,
  `recovery_code` varchar(20) DEFAULT NULL COMMENT '代码',
  `recovery_steel_id` varchar(20) DEFAULT '' COMMENT '名称',
  `recovery_capacity` varchar(20) DEFAULT '' COMMENT '大小',
  `recovery_pirce` varchar(20) DEFAULT NULL COMMENT '价格',
  `recovery_storage_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_recovery
-- ----------------------------
INSERT INTO `tb_recovery` VALUES ('18', '2017', '1', '11', 'HS111', 'GY002', '222', '222', 'KF001');
INSERT INTO `tb_recovery` VALUES ('19', '2017', '1', '12', 'HS112', 'GY002', '111', '100', 'KF001');
INSERT INTO `tb_recovery` VALUES ('21', '2017', '1', '8', 'HS108', 'BF001', '420', '110', 'KF002');
INSERT INTO `tb_recovery` VALUES ('23', '2017', '1', '30', 'HS130', 'BF001', '300', '95', 'KF002');
INSERT INTO `tb_recovery` VALUES ('25', '2017', '2', '1', 'HS201', 'GY002', '100', '100', 'KF003');
INSERT INTO `tb_recovery` VALUES ('26', '2017', '2', '3', 'HS203', 'BF001', '200', '100', 'KF003');
INSERT INTO `tb_recovery` VALUES ('27', '2017', '3', '26', 'HS326', 'JX013', '500', '120', 'KF004');
INSERT INTO `tb_recovery` VALUES ('28', '2017', '5', '22', 'HS522', 'JX013', '300', '90', 'KF002');
INSERT INTO `tb_recovery` VALUES ('29', '2017', '4', '12', '412', 'GY002', '300', '80', 'KF002');
INSERT INTO `tb_recovery` VALUES ('30', '2017', '5', '15', 'HS515', 'BF001', '500', '120', 'KF002');
INSERT INTO `tb_recovery` VALUES ('31', '2017', '6', '19', 'H619', 'GY002', '200', '100', 'KF004');
INSERT INTO `tb_recovery` VALUES ('32', '2017', '3', '15', 'HS315', 'JX013', '1000', '100', 'KF003');
INSERT INTO `tb_recovery` VALUES ('33', '2017', '7', '16', 'HS716', 'JX013', '500', '90', 'KF005');
INSERT INTO `tb_recovery` VALUES ('34', '2016', '1', '12', 'HS16112', 'GY002', '100', '100', 'KF001');
INSERT INTO `tb_recovery` VALUES ('35', '2016', '2', '22', 'HS16222', 'GY002', '200', '90', 'KF002');

-- ----------------------------
-- Table structure for tb_sale
-- ----------------------------
DROP TABLE IF EXISTS `tb_sale`;
CREATE TABLE `tb_sale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sale_year` int(11) DEFAULT NULL COMMENT '时间',
  `sale_month` int(11) DEFAULT NULL,
  `sale_day` int(11) DEFAULT NULL,
  `sale_code` varchar(20) DEFAULT NULL,
  `sale_steel_id` varchar(20) DEFAULT NULL,
  `sale_capacity` varchar(20) DEFAULT NULL,
  `sale_pirce` varchar(20) DEFAULT NULL,
  `sale_customer_id` varchar(20) DEFAULT NULL COMMENT '客户id',
  `sale_storage_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_sale
-- ----------------------------
INSERT INTO `tb_sale` VALUES ('7', '2017', '1', '23', 'XS123', null, '100', '200', '1', 'KF002');
INSERT INTO `tb_sale` VALUES ('8', '2017', '1', '5', 'XS105', null, '100', '200', '1', 'KF001');
INSERT INTO `tb_sale` VALUES ('9', '2017', '3', '15', 'XS315', null, '100', '300', '3', 'KF004');
INSERT INTO `tb_sale` VALUES ('10', '2017', '3', '18', 'XS318', null, '200', '150', '3', 'KF002');
INSERT INTO `tb_sale` VALUES ('11', '2017', '5', '29', 'XS529', null, '100', '200', '1', 'KF003');
INSERT INTO `tb_sale` VALUES ('12', '2017', '6', '1', 'XS601', null, '100', '200', '4', 'KF003');
INSERT INTO `tb_sale` VALUES ('13', '2017', '3', '3', 'XS303', null, '200', '150', '4', 'KF003');
INSERT INTO `tb_sale` VALUES ('14', '2017', '4', '16', 'XS416', null, '100', '200', '3', 'KF002');
INSERT INTO `tb_sale` VALUES ('15', '2017', '6', '14', 'XS614', null, '100', '200', '1', 'KF002');
INSERT INTO `tb_sale` VALUES ('16', '2017', '7', '27', 'XS727', null, '130', '150', '3', 'KF003');
INSERT INTO `tb_sale` VALUES ('17', '2017', '7', '25', 'XS725', null, '100', '250', '1', 'KF002');
INSERT INTO `tb_sale` VALUES ('19', '2017', '7', '30', 'XS713', null, '300', '200', '1', 'KF002');
INSERT INTO `tb_sale` VALUES ('20', '2017', '8', '12', 'XS812', null, '500', '150', '1', 'KF002');

-- ----------------------------
-- Table structure for tb_steel
-- ----------------------------
DROP TABLE IF EXISTS `tb_steel`;
CREATE TABLE `tb_steel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `steel_version` varchar(20) DEFAULT NULL COMMENT '型号',
  `steel_name` varchar(20) DEFAULT NULL COMMENT '名称',
  `steel_price` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_steel
-- ----------------------------
INSERT INTO `tb_steel` VALUES ('1', 'BF001', '报废汽车', '122');
INSERT INTO `tb_steel` VALUES ('6', 'GY002', '工业绣钢', '97');
INSERT INTO `tb_steel` VALUES ('8', 'JX013', '机械拆卸部件', '100');

-- ----------------------------
-- Table structure for tb_stock
-- ----------------------------
DROP TABLE IF EXISTS `tb_stock`;
CREATE TABLE `tb_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_year` varchar(20) DEFAULT NULL,
  `stock_month` varchar(20) DEFAULT NULL,
  `stock_code` varchar(20) DEFAULT NULL COMMENT '代码',
  `stock_capacity` varchar(20) DEFAULT '' COMMENT '大小',
  `stock_steel_id` varchar(20) DEFAULT NULL COMMENT '钢铁类型',
  `stock_storage_id` varchar(20) DEFAULT NULL COMMENT '库房编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_stock
-- ----------------------------
INSERT INTO `tb_stock` VALUES ('8', null, null, 'KF003', '770', null, 'KF003');
INSERT INTO `tb_stock` VALUES ('13', null, null, 'KF002', '620', null, 'KF002');
INSERT INTO `tb_stock` VALUES ('14', null, null, 'KF001', '333', null, 'KF001');
INSERT INTO `tb_stock` VALUES ('15', null, null, 'KF004', '600', null, 'KF004');
INSERT INTO `tb_stock` VALUES ('16', null, null, 'KF005', '500', null, 'KF005');

-- ----------------------------
-- Table structure for tb_storage
-- ----------------------------
DROP TABLE IF EXISTS `tb_storage`;
CREATE TABLE `tb_storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `storage_code` varchar(20) DEFAULT NULL,
  `storage_name` varchar(20) DEFAULT NULL,
  `storage_capacity` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_storage
-- ----------------------------
INSERT INTO `tb_storage` VALUES ('13', 'KF003', '三号库房', '50000');
INSERT INTO `tb_storage` VALUES ('18', 'KF002', '二号库房', '80000');
INSERT INTO `tb_storage` VALUES ('19', 'KF001', '一号库房', '70000');
INSERT INTO `tb_storage` VALUES ('20', 'KF004', '四号库房', '80000');
INSERT INTO `tb_storage` VALUES ('21', 'KF005', '五号库房', '80000');
