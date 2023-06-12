-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: edunovajp28
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clan`
--

DROP TABLE IF EXISTS `clan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clan` (
  `grupa` int(11) NOT NULL,
  `polaznik` int(11) NOT NULL,
  KEY `polaznik` (`polaznik`),
  KEY `grupa` (`grupa`),
  CONSTRAINT `clan_ibfk_1` FOREIGN KEY (`polaznik`) REFERENCES `polaznik` (`sifra`),
  CONSTRAINT `clan_ibfk_2` FOREIGN KEY (`grupa`) REFERENCES `grupa` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clan`
--

LOCK TABLES `clan` WRITE;
/*!40000 ALTER TABLE `clan` DISABLE KEYS */;
INSERT INTO `clan` VALUES (4,1),(4,9),(4,25);
/*!40000 ALTER TABLE `clan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupa`
--

DROP TABLE IF EXISTS `grupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grupa` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(50) NOT NULL,
  `smjer` int(11) NOT NULL,
  `maxpolaznika` int(11) DEFAULT NULL,
  `predavac` int(11) DEFAULT NULL,
  `datumpocetka` datetime DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `smjer` (`smjer`),
  KEY `predavac` (`predavac`),
  CONSTRAINT `grupa_ibfk_1` FOREIGN KEY (`smjer`) REFERENCES `smjer` (`sifra`),
  CONSTRAINT `grupa_ibfk_2` FOREIGN KEY (`predavac`) REFERENCES `predavac` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupa`
--

LOCK TABLES `grupa` WRITE;
/*!40000 ALTER TABLE `grupa` DISABLE KEYS */;
INSERT INTO `grupa` VALUES (2,'WP1',2,25,1,NULL),(3,'S1',3,25,1,NULL),(4,'S2',4,25,1,NULL);
/*!40000 ALTER TABLE `grupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `osoba`
--

DROP TABLE IF EXISTS `osoba`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `osoba` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) NOT NULL,
  `prezime` varchar(50) NOT NULL,
  `oib` char(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `osoba`
--

LOCK TABLES `osoba` WRITE;
/*!40000 ALTER TABLE `osoba` DISABLE KEYS */;
INSERT INTO `osoba` VALUES (1,'Tomislav','Jakopec',NULL,'tjakopec@gmail.com'),(2,'Denis','Simov',NULL,'dsimov19@gmail.com'),(3,'Ivan','Islentiev',NULL,'ivanislentiev@hotmail.com'),(4,'Antonio','Majić',NULL,'antonio.majich@gmail.com'),(5,'Kristi','novoselić',NULL,'kristinovoselic@gmail.com'),(6,'Josip','Belić',NULL,'josip.belic989@gmail.com'),(7,'Ivan','Marošević','53476139335','ivanmarosevic4@gmail.com'),(8,'Damir','Sučić',NULL,'dsucic7@gmail.com'),(9,'Dino','Dješka',NULL,'dino.djeska@gmail.com'),(10,'Goran','Kovačić',NULL,'kovacic.go@gmail.com'),(11,'Luka','Lijić',NULL,'lukalijic8@gmail.com'),(12,'Antonio','Miloloža',NULL,'milolozaantonio@yahoo.com'),(13,'Marijan','Kešinović',NULL,'kesinovic957@gmail.com'),(14,'Ivan','Kuna',NULL,'ivan.kuna@yahoo.com'),(15,'Maksimilian','Bagarić',NULL,'maxbagaric@gmail.com'),(16,'Martin','Tetković',NULL,'marcatet001@gmail.com'),(17,'Vjeran','Šergo',NULL,'vjeran.sergo@gmail.com'),(18,'Filip','Čatić',NULL,'fcatic031@gmail.com'),(19,'Petar','Matić',NULL,'petarmatic00@gmail.com'),(20,'Branimir','Fekete',NULL,'branimir.fekete@gmail.com'),(21,'Lazar','Volarev',NULL,'lazarv79@gmail.com'),(22,'Adriana','Plečaš',NULL,'adriana.plecas@gmail.com'),(23,'Goran','Franjić',NULL,'goran@proces.hr'),(24,'Marko','Ivanović',NULL,'markoivanovic19@gmail.com'),(25,'Emina','Vejsilović',NULL,'emiomiemi@gmail.com'),(26,'Ana','Jurić',NULL,'ana.juric19@gmail.com'),(27,'Shaquille','O\'Neal',NULL,NULL),(28,'Shaqille','ONeal',NULL,NULL);
/*!40000 ALTER TABLE `osoba` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `polaznik`
--

DROP TABLE IF EXISTS `polaznik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `polaznik` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `brojugovora` varchar(20) DEFAULT NULL,
  `osoba` int(11) NOT NULL,
  PRIMARY KEY (`sifra`),
  KEY `osoba` (`osoba`),
  CONSTRAINT `polaznik_ibfk_1` FOREIGN KEY (`osoba`) REFERENCES `osoba` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `polaznik`
--

LOCK TABLES `polaznik` WRITE;
/*!40000 ALTER TABLE `polaznik` DISABLE KEYS */;
INSERT INTO `polaznik` VALUES (1,NULL,2),(2,NULL,3),(3,NULL,4),(4,NULL,5),(5,NULL,6),(6,NULL,7),(7,NULL,8),(8,NULL,9),(9,NULL,10),(10,NULL,11),(11,NULL,12),(12,NULL,13),(13,NULL,14),(14,NULL,15),(15,NULL,16),(16,NULL,17),(17,NULL,18),(18,NULL,19),(19,NULL,20),(20,NULL,21),(21,NULL,22),(22,NULL,23),(23,NULL,24),(24,NULL,25),(25,NULL,26);
/*!40000 ALTER TABLE `polaznik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `predavac`
--

DROP TABLE IF EXISTS `predavac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `predavac` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `iban` varchar(50) DEFAULT NULL,
  `osoba` int(11) NOT NULL,
  PRIMARY KEY (`sifra`),
  KEY `osoba` (`osoba`),
  CONSTRAINT `predavac_ibfk_1` FOREIGN KEY (`osoba`) REFERENCES `osoba` (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `predavac`
--

LOCK TABLES `predavac` WRITE;
/*!40000 ALTER TABLE `predavac` DISABLE KEYS */;
INSERT INTO `predavac` VALUES (1,NULL,1);
/*!40000 ALTER TABLE `predavac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `smjer`
--

DROP TABLE IF EXISTS `smjer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smjer` (
  `sifra` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(50) NOT NULL,
  `cijena` decimal(18,2) DEFAULT NULL,
  `upisnina` decimal(18,2) DEFAULT NULL,
  `trajanje` int(11) NOT NULL,
  `verificiran` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smjer`
--

LOCK TABLES `smjer` WRITE;
/*!40000 ALTER TABLE `smjer` DISABLE KEYS */;
INSERT INTO `smjer` VALUES (2,'Web programiranje',900.00,50.00,250,NULL),(3,'PHP programiranje',765.00,73.00,130,0),(4,'Serviser',648.00,60.00,100,0);
/*!40000 ALTER TABLE `smjer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-11 20:50:33
