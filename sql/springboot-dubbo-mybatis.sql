/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : springboot-dubbo-mybatis

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 03/11/2018 15:58:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` bigint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '商品名称',
  `unitPrice` decimal(10, 2) NOT NULL COMMENT '商品单价',
  `number` decimal(10, 2) NOT NULL COMMENT '商品数量',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createUserId` bigint(4) NULL DEFAULT NULL COMMENT '创建人id',
  `del` tinyint(1) NULL DEFAULT 1 COMMENT '删除标识 0:已删除 1:未删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '小米note', 2000.00, 1000.00, '2018-11-02 14:38:39', NULL, 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(164) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createUserId` bigint(4) NULL DEFAULT NULL COMMENT '创建人id',
  `updateTime` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `updateUserId` bigint(4) NULL DEFAULT NULL COMMENT '修改人id',
  `del` tinyint(1) NULL DEFAULT 1 COMMENT '删除标识 0:已删除 1:未删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456', '2018-11-02 09:37:23', NULL, '2018-11-02 09:37:33', NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
