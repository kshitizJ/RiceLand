CREATE DATABASE  IF NOT EXISTS `RiceLand` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `RiceLand`;
-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: RiceLand
-- ------------------------------------------------------
-- Server version	8.0.23-0ubuntu0.20.04.1

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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `path` varchar(100) NOT NULL,
  `price` int NOT NULL,
  `star` int DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  `date_added` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Basmati Rice','basmati.jpeg',170,3,'Give your taste-bud a flavour of Basmati Rice by Kohinoor. It is non-sticky and posses 100% purity and have aromatic fragrance.','featured','completed','2021-05-04 13:55:35'),(2,'Arborio Rice','arborio.jpeg',580,4,'Arborio rice are more creamy and chewy as compared to other varities of rice. \r\nIt has a starchy taste an mix well with other flavours.','featured','completed','2021-05-04 15:13:15'),(3,'Valencia Rice','valencia 1.jpg',300,0,'Give your taste-bud a flavour of Valencia rice.It is non-sticky and posses 100% purity and have aromatic fragrance.','featured','completed','2021-05-04 19:46:10'),(4,'Wild Rice','wild rice.jpg',200,3,'The low calorie and high nutrient contents make wild rice a nutrient-dense food. Must give a try to wild rice at our website as it provides best quality.','latest','completed','2021-05-04 19:47:24'),(5,'Red Rice','red.jpeg',580,0,'Give your taste-bud a flavour of red rice. It is has a nutty flavor and red rice has the highest nutritional value of rice eaten with germ intact.','featured','pending','2021-05-04 19:50:07'),(6,'Parboiled Rice','parboiled.jpeg',113,0,'Parboiled Rice is a great happy medium between different varieties because it offers a more subtle flavour to your taste-buds.','featured','completed','2021-05-04 19:52:15'),(7,'Matta Rice','matta.jpeg',450,0,'Matta Rice are extremely important for maintaining many systems of\r\nyour body and living healthy. So do keep your body healthy and fit by trying our special matta rice.','featured','completed','2021-05-04 19:55:12');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-10 21:20:34
