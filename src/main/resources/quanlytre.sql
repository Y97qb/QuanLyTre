-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlytre
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `lop`
--

DROP TABLE IF EXISTS `lop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop` (
  `MALOP` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `NAMHOC` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SOLUONGTRE` int DEFAULT NULL,
  `TENGV1` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `TENGV2` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `TENLOP` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MALOP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop`
--

LOCK TABLES `lop` WRITE;
/*!40000 ALTER TABLE `lop` DISABLE KEYS */;
INSERT INTO `lop` VALUES ('ML01','2018-2019',5,'Y','Hung','2A'),('ML02','2018-2019',3,'Huyen','Ha','3A'),('ML03','2018-2019',3,'Linh','Lan','2B');
/*!40000 ALTER TABLE `lop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theodoivang`
--

DROP TABLE IF EXISTS `theodoivang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theodoivang` (
  `NGAYHOC` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `LYDO` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `THOIGIANNGHI` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `MATRE` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`NGAYHOC`,`MATRE`),
  KEY `FK1gml4hr9b6bugp8h6p46s138v` (`MATRE`),
  CONSTRAINT `FK1gml4hr9b6bugp8h6p46s138v` FOREIGN KEY (`MATRE`) REFERENCES `tre` (`MATRE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theodoivang`
--

LOCK TABLES `theodoivang` WRITE;
/*!40000 ALTER TABLE `theodoivang` DISABLE KEYS */;
/*!40000 ALTER TABLE `theodoivang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tre`
--

DROP TABLE IF EXISTS `tre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tre` (
  `MATRE` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `GIOITINH` int DEFAULT NULL,
  `HOTEN` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `HOTENPH` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `NGAYSINH` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `NGAYVAOHOC` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `SODIENTHOAIPH` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `TRANGTHAI` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `MALOP` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`MATRE`),
  KEY `FK3q2gx4q4p33ial5y7uo3hg75m` (`MALOP`),
  CONSTRAINT `FK3q2gx4q4p33ial5y7uo3hg75m` FOREIGN KEY (`MALOP`) REFERENCES `lop` (`MALOP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tre`
--

LOCK TABLES `tre` WRITE;
/*!40000 ALTER TABLE `tre` DISABLE KEYS */;
INSERT INTO `tre` VALUES ('MT01',0,'Italia97','Nguyễn Văn A','03/12/1997','03/12/2019','0772505870','Học','ML01'),('MT02',0,'Thanh Hà','Nguyễn Văn C','03/12/1998','11/11/2019','07745321678','Học','ML02'),('MT03',1,'Italia98','Nguyễn Văn B','03/12/1999','03/12/2019','0772505871','Học','ML01'),('MT04',1,'Huyen','Hung','03/12/1997','03/12/2020','01258975211','Hoc','ML03'),('MT05',1,'Huyen','Hung','03/12/1997','03/12/2020','01258975211','Hoc','ML03'),('MT06',0,'Huyen','Hung','03/12/1997','03/12/2020','01258975211','Hoc','ML03'),('MT07',1,'Huyen','Hung','03/12/1997','03/12/2020','01258975211','Hoc','ML02'),('MT08',1,'Huyen','Hung','03/12/1997','03/12/2020','01258975211','Hoc','ML02');
/*!40000 ALTER TABLE `tre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_thongtintre`
--

DROP TABLE IF EXISTS `view_thongtintre`;
/*!50001 DROP VIEW IF EXISTS `view_thongtintre`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `view_thongtintre` AS SELECT 
 1 AS `MATRE`,
 1 AS `NGAYSINH`,
 1 AS `HOTEN`,
 1 AS `TENLOP`,
 1 AS `TENGV1`,
 1 AS `TENGV2`,
 1 AS `NAMHOC`,
 1 AS `NGAYHOC`,
 1 AS `THOIGIANNGHI`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_thongtintre`
--

/*!50001 DROP VIEW IF EXISTS `view_thongtintre`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_thongtintre` AS select `tr`.`MATRE` AS `MATRE`,`tr`.`NGAYSINH` AS `NGAYSINH`,`tr`.`HOTEN` AS `HOTEN`,`l`.`TENLOP` AS `TENLOP`,`l`.`TENGV1` AS `TENGV1`,`l`.`TENGV2` AS `TENGV2`,`l`.`NAMHOC` AS `NAMHOC`,`x`.`NGAYHOC` AS `NGAYHOC`,`x`.`THOIGIANNGHI` AS `THOIGIANNGHI` from ((`tre` `tr` join `lop` `l` on((`l`.`MALOP` = `tr`.`MALOP`))) join `theodoivang` `x` on((`x`.`MATRE` = `tr`.`MATRE`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-29 11:02:36
