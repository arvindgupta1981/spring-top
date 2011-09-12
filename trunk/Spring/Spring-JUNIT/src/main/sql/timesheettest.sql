-- MySQL dump 10.13  Distrib 5.5.13, for Linux (x86_64)
--
-- Host: localhost    Database: timesheet
-- ------------------------------------------------------
-- Server version	5.5.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee_m`
--

DROP TABLE IF EXISTS `employee_m`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_m` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(100) DEFAULT NULL,
  `employee_type` varchar(2) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_m`
--

LOCK TABLES `employee_m` WRITE;
/*!40000 ALTER TABLE `employee_m` DISABLE KEYS */;
INSERT INTO `employee_m` VALUES (1,'Arvind','GN');
/*!40000 ALTER TABLE `employee_m` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `holiday_m`
--

DROP TABLE IF EXISTS `holiday_m`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `holiday_m` (
  `holiday_id` int(11) NOT NULL AUTO_INCREMENT,
  `holiday_date` date NOT NULL,
  `holiday_desc` varchar(200) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  PRIMARY KEY (`holiday_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `holiday_m`
--

LOCK TABLES `holiday_m` WRITE;
/*!40000 ALTER TABLE `holiday_m` DISABLE KEYS */;
/*!40000 ALTER TABLE `holiday_m` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timesheet_t`
--

DROP TABLE IF EXISTS `timesheet_t`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timesheet_t` (
  `timesheet_id` int(11) NOT NULL AUTO_INCREMENT,
  `attendance_date` date NOT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `mark` varchar(2) NOT NULL,
  `holiday_id` int(11) DEFAULT NULL,
  `year` int(11) NOT NULL,
  PRIMARY KEY (`timesheet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timesheet_t`
--

LOCK TABLES `timesheet_t` WRITE;
/*!40000 ALTER TABLE `timesheet_t` DISABLE KEYS */;
/*!40000 ALTER TABLE `timesheet_t` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-09-09  6:31:26
