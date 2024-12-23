-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: empleados_db
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),(2,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),(3,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),(4,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),(5,'Luisa','Martínez','Administrador',55000,'2021-03-12'),(6,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),(7,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),(8,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),(9,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),(10,'Luisa','Martínez','Administrador',55000,'2021-03-12'),(11,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),(12,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),(13,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),(14,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),(15,'Luisa','Martínez','Administrador',55000,'2021-03-12'),(16,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),(17,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),(18,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),(19,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),(20,'Luisa','Martínez','Administrador',55000,'2021-03-12'),(21,'Laura','Gómez','Gerente de Ventas',75000,'2020-03-01'),(22,'Carlos','Hernández','Ingeniero de Software',68000,'2021-07-15'),(23,'Ana','López','Especialista en Marketing',62000,'2024-01-10'),(24,'Laura','Gómez','Gerente de Ventas',75000,'2020-03-01'),(25,'Carlos','Hernández','Ingeniero de Software',68000,'2021-07-15'),(26,'Ana','López','Especialista en Marketing',62000,'2024-01-10');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-21 20:05:45
