
DROP TABLE IF EXISTS `tbl_hero`;
CREATE TABLE `tbl_hero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `src_photo` varchar(100) DEFAULT NULL,
  `src_video` varchar(100) DEFAULT NULL,
  `instruction` varchar(700) NOT NULL,
  category varchar(20), 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1010 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `tbl_phone`;
CREATE TABLE `tbl_phone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `number` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1012 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `tbl_sayc`;
CREATE TABLE `tbl_sayc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `instruction` varchar(80) DEFAULT NULL,
  heroid  int,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` int(3) NOT NULL,
  `loginName` varchar(20) NOT NULL,
  `loginPwd` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `positionid` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1012 DEFAULT CHARSET=utf8;


