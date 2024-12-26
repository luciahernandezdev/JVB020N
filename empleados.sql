
--  Usando la DB
USE empleados;

--  Creación de la Tabla Empleado
CREATE TABLE IF NOT EXISTS empleados (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `salario` double DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  PRIMARY KEY (`id`)
);


--  Insertando datos en la Tabla Empleados

INSERT INTO empleados (id, nombre, apellido, cargo. salario, fecha_inicio)
 (1,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),
 (2,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),
 (3,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),
 (4,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),
 (5,'Luisa','Martínez','Administrador',55000,'2021-03-12'),
 (6,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),
 (7,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),
 (8,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),
 (9,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),
 (10,'Luisa','Martínez','Administrador',55000,'2021-03-12'),
 (11,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),
 (12,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),
 (13,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),
 (14,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),
 (15,'Luisa','Martínez','Administrador',55000,'2021-03-12'),
 (16,'Pedro','Ramos','Gerente de Operaciones',50000,'2023-12-20'),
 (17,'Candea','Peña','Analista de Datos',45000,'2023-11-15'),
 (18,'Manuel','Montero','Desarrollador',60000,'2023-01-10'),
 (19,'Maria','Castellón','Diseñadora',40000,'2022-08-05'),
 (20,'Luisa','Martínez','Administrador',55000,'2021-03-12'),
 (21,'Laura','Gómez','Gerente de Ventas',75000,'2020-03-01'),
 (22,'Carlos','Hernández','Ingeniero de Software',68000,'2021-07-15'),
 (23,'Ana','López','Especialista en Marketing',62000,'2024-01-10'),
 (24,'Laura','Gómez','Gerente de Ventas',75000,'2020-03-01'),
 (25,'Carlos','Hernández','Ingeniero de Software',68000,'2021-07-15'),
 (26,'Ana','López','Especialista en Marketing',62000,'2024-01-10');

