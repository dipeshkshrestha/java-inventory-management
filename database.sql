/*
SQLyog Ultimate v8.55 
MySQL - 5.0.27-community-nt : Database - ims_yamaha10
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ims_yamaha10` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ims_yamaha10`;

/*Table structure for table `color_details` */

DROP TABLE IF EXISTS `color_details`;

CREATE TABLE `color_details` (
  `ID` int(11) NOT NULL auto_increment,
  `Color` varchar(40) default '',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `color_details` */

insert  into `color_details`(`ID`,`Color`) values (1,'RED'),(2,'WHITE'),(3,'BLUE X BLACK'),(4,'BLACK'),(5,'FLAMING RED'),(6,'MAGICAL MAGENTA'),(7,'GREY METALLIC'),(8,'MIDNIGHT BLACK'),(9,'SUNSET RED'),(10,'BLACK X RED'),(11,'SPORT ELECTRIC BLUE'),(12,'GLORY GOLD'),(13,'LAVA RED'),(14,'FLAMING ORANGE'),(15,'QUALITY RED'),(16,'QUALITY BLUE'),(17,'GREEN'),(18,'MOLTEN ORANGE');

/*Table structure for table `enginecapacity` */

DROP TABLE IF EXISTS `enginecapacity`;

CREATE TABLE `enginecapacity` (
  `ID` int(11) NOT NULL auto_increment,
  `Engine_Capacity` varchar(10) NOT NULL default '',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `enginecapacity` */

insert  into `enginecapacity`(`ID`,`Engine_Capacity`) values (1,'113'),(2,'106'),(3,'149'),(4,'153'),(5,'123'),(6,'113');

/*Table structure for table `model_details` */

DROP TABLE IF EXISTS `model_details`;

CREATE TABLE `model_details` (
  `ID` int(11) NOT NULL auto_increment,
  `Model` varchar(100) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `model_details` */

insert  into `model_details`(`ID`,`Model`) values (1,'YZF R15'),(2,'FZS'),(4,'SZ-R'),(5,'SZ-X'),(6,'SS125'),(7,'YBR125'),(8,'YBR110'),(9,'RAY Z'),(10,'FZ'),(11,'FZ-Fi'),(12,'ALPHA'),(19,'FZ');

/*Table structure for table `sales` */

DROP TABLE IF EXISTS `sales`;

CREATE TABLE `sales` (
  `Bill_No` int(11) NOT NULL auto_increment,
  `date` date default NULL,
  `cust_name` varchar(100) default NULL,
  `address` varchar(100) default NULL,
  `contact_no` decimal(10,0) default NULL,
  `reg_no` varchar(20) default NULL,
  `selling_price` decimal(10,2) default NULL,
  `model` varchar(40) default NULL,
  `cc` varchar(10) default NULL,
  `color` varchar(40) default NULL,
  `qty` int(11) default NULL,
  `total_amt` decimal(10,2) default NULL,
  `engine_no` varchar(100) default NULL,
  `dis_per` decimal(10,2) default NULL,
  `chasis_no` varchar(100) default NULL,
  `amt_after_dis` decimal(10,2) default NULL,
  `payment_mode` varchar(10) default NULL,
  `vat_per` int(11) default NULL,
  `bank_name` varchar(100) default NULL,
  `vat_amt` decimal(10,2) default NULL,
  `chq_no` varchar(100) default NULL,
  `grand_total` decimal(10,2) default NULL,
  `description` varchar(250) default NULL,
  PRIMARY KEY  (`Bill_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales` */

insert  into `sales`(`Bill_No`,`date`,`cust_name`,`address`,`contact_no`,`reg_no`,`selling_price`,`model`,`cc`,`color`,`qty`,`total_amt`,`engine_no`,`dis_per`,`chasis_no`,`amt_after_dis`,`payment_mode`,`vat_per`,`bank_name`,`vat_amt`,`chq_no`,`grand_total`,`description`) values (4,'2015-07-17','jIKESH','jyatha','1234567','BA29PA 9359','200000.00','SS125','123','RED',1,'200000.00','35B1-10421','12.00','ME135B-162019487','176000.00','Cash',13,'','22880.00','','198880.00','asas'),(7,'2015-07-17','Baburam','Kathmandu','1234567890','BA29PA 9999','200000.00','SS125','123','RED',1,'200000.00','35B1019429','5.00','ME135B-162019489','190000.00','Credit',13,'Nabil Bank','24700.00','275643','214700.00','	'),(8,'2015-07-17','Ram Baran Yadav','Kathmandu','7878787878','BA25PA 91067','200000.00','SS125','123','RED',1,'200000.00','35B1019429','5.00','ME135B-162019489','190000.00','Credit',13,'Nabil Bank','24700.00','275643','214700.00','	'),(9,'2015-07-18','   ndfdnf  dfsdf','afdsdf','1234567890','BA29PA 9390','200000.00','SS125','123','RED',1,'200000.00','35B1019429','0.00','ME135B-162019489','200000.00','Cash',13,'','26000.00','','226000.00','dsfadf');

/*Table structure for table `sales_backup` */

DROP TABLE IF EXISTS `sales_backup`;

CREATE TABLE `sales_backup` (
  `Bill_No` int(11) NOT NULL auto_increment,
  `date` date default NULL,
  `cust_name` varchar(40) default NULL,
  `address` varchar(40) default NULL,
  `contact_no` decimal(10,0) default NULL,
  `reg_no` varchar(20) default NULL,
  `selling_price` decimal(10,2) default NULL,
  `model` varchar(10) default NULL,
  `cc` varchar(11) default NULL,
  `color` varchar(20) default NULL,
  `qty` int(11) default NULL,
  `total_amt` decimal(10,2) default NULL,
  `engine_no` varchar(40) default NULL,
  `dis_per` int(11) default NULL,
  `chasis_no` varchar(40) default NULL,
  `amt_after_dis` float default NULL,
  `payment_mode` varchar(10) default NULL,
  `vat_per` int(11) default NULL,
  `bank_name` varchar(40) default NULL,
  `vat_amt` decimal(20,2) default NULL,
  `chq_no` varchar(20) default NULL,
  `grand_total` decimal(10,2) default NULL,
  `description` varchar(250) default NULL,
  PRIMARY KEY  (`Bill_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_backup` */

insert  into `sales_backup`(`Bill_No`,`date`,`cust_name`,`address`,`contact_no`,`reg_no`,`selling_price`,`model`,`cc`,`color`,`qty`,`total_amt`,`engine_no`,`dis_per`,`chasis_no`,`amt_after_dis`,`payment_mode`,`vat_per`,`bank_name`,`vat_amt`,`chq_no`,`grand_total`,`description`) values (1,'2015-07-17','Rajan Shrestha','Jyatha','9876543120','BA29PA 9999','200000.00','SS125','123','RED',1,'200000.00','35B1-10421',12,'ME135B-162019487',176000,'Cash',13,'','22880.00','','198880.00','description'),(2,'2015-07-17','jIKESH','jyatha','1234567','BA29PA 9359','200000.00','SS125','123','RED',1,'200000.00','35B1-10421',12,'ME135B-162019487',176000,'Cash',13,'','22880.00','','198880.00','asas'),(3,'2015-07-17','Ram Baran Yadav','Kathmandu','988787','BA29PA 9390','200000.00','SS125','123','RED',1,'200000.00','35B1019429',5,'ME135B-162019489',190000,'Credit',13,'Nabil Bank','24700.00','275643','214700.00','	'),(4,'2015-07-17','Ram Baran Yadav','Kathmandu','1234567890','BA29PA 9999','200000.00','SS125','123','RED',1,'200000.00','35B1019429',5,'ME135B-162019489',190000,'Credit',13,'Nabil Bank','24700.00','275643','214700.00','	'),(5,'2015-07-17','Baburam','Kathmandu','1234567890','BA29PA 9999','200000.00','SS125','123','RED',1,'200000.00','35B1019429',5,'ME135B-162019489',190000,'Credit',13,'Nabil Bank','24700.00','275643','214700.00','	'),(6,'2015-07-17','Ram Baran Yadav','Kathmandu','7878787878','BA25PA 91067','200000.00','SS125','123','RED',1,'200000.00','35B1019429',5,'ME135B-162019489',190000,'Credit',13,'Nabil Bank','24700.00','275643','214700.00','	'),(7,'2015-07-18','   ndfdnf  dfsdf','afdsdf','1234567890','BA29PA 9390','200000.00','SS125','123','RED',1,'200000.00','35B1019429',0,'ME135B-162019489',200000,'Cash',13,'','26000.00','','226000.00','dsfadf');

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `Stock_ID` int(11) NOT NULL auto_increment,
  `Date` date default NULL,
  `Model` varchar(100) default '',
  `Color` varchar(100) default '',
  `Reg_No` varchar(100) default '',
  `Engine_Capacity` varchar(100) default NULL,
  `Engine_Number` varchar(100) default '',
  `Chasis_Number` varchar(100) default '',
  `Selling_Price` decimal(10,2) default NULL,
  PRIMARY KEY  (`Stock_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock` */

insert  into `stock`(`Stock_ID`,`Date`,`Model`,`Color`,`Reg_No`,`Engine_Capacity`,`Engine_Number`,`Chasis_Number`,`Selling_Price`) values (2,'2015-07-17','YZF R15','BLUE X BLACK','BA98PA1212','153','ENGINENO','CHASISNO','7823782.23'),(3,'2015-07-18','SZ-X','RED','abcd','113','efgn','ijdkf','7878.98'),(4,'2015-07-17','SS125','RED','BA29PA 9999','123','35B1019429','ME135B-162019489','200000.00');

/*Table structure for table `stock_backup` */

DROP TABLE IF EXISTS `stock_backup`;

CREATE TABLE `stock_backup` (
  `Stock_ID` int(11) NOT NULL auto_increment,
  `Date` date default NULL,
  `Model` varchar(20) default '',
  `Color` varchar(20) default '',
  `Reg_No` varchar(20) default '',
  `Engine_Capacity` varchar(10) default NULL,
  `Engine_Number` varchar(40) default '',
  `Chasis_Number` varchar(40) default '',
  `Selling_Price` decimal(18,2) default NULL,
  PRIMARY KEY  (`Stock_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock_backup` */

insert  into `stock_backup`(`Stock_ID`,`Date`,`Model`,`Color`,`Reg_No`,`Engine_Capacity`,`Engine_Number`,`Chasis_Number`,`Selling_Price`) values (1,'2015-07-17','SS125','RED','BA29PA 9359','123','35B1-10421','ME135B-162019487','200000.00'),(2,'2015-07-17','SS125','RED','BA29PA 9999','123','35B1-10421','ME135B-162019487','200000.00'),(3,'2015-07-16','SS125','RED','BA29PA 9390','123','35B1019429','ME135B-162019489','200000.00'),(4,'2015-07-17','FZS','FLAMING RED','BA25PA 91067','153','EC125','VCC124','300000.00'),(5,'2015-07-17','YZF R15','BLUE X BLACK','BA98PA1212','153','ENGINENO','CHASISNO','7823782.23'),(6,'2015-07-18','SZ-X','RED','abcd','113','efgn','ijdkf','7878.98');

/*Table structure for table `user_details` */

DROP TABLE IF EXISTS `user_details`;

CREATE TABLE `user_details` (
  `user_id` int(10) NOT NULL auto_increment,
  `name` varchar(100) NOT NULL default '',
  `username` varchar(100) NOT NULL default '',
  `password` varchar(100) NOT NULL default '',
  `user_role` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_details` */

insert  into `user_details`(`user_id`,`name`,`username`,`password`,`user_role`) values (1,'Dipesh Shrestha','dipesh','password','admin'),(2,'Jikesh Prajapati','jikesh','jikesh','stock'),(3,'Bikash Gyawali','bikash','bikash','sales'),(4,'Rachana Shrestha','Rach','Rach','admin');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
