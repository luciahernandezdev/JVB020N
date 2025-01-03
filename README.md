Desarrollo de una Aplicación de Gestión de Empleados

Esta prueba es una aplicación desarrollada en Java que utiliza JPA(Java Persistence Api) para gestionar empleados en una base de datos.
Ofrece funcionalidades CRUD (Crear, Leer, Actualizar y Eliminar) y la capacidad de buscar empleados por cargo.

Ejecución del Proyecto
1. Configuración de la Base de Datos
   Asegúrate de tener MySQL (o el sistema de base de datos de tu preferencia) instalado y en ejecución.
2. Crea una base de datos llamada empleados (o la que desees). 
3. Configura el archivo persistence.xml ubicado en src/main/resources/META-INF para conectarte a tu base de datos.
   Ejemplo:
   <persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" version="2.1">
   <persistence-unit name="empleadoPU">
   <class>org.empleados.entities.Empleado</class>
   <properties>
   <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
   <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/empleados"/>
   <property name="jakarta.persistence.jdbc.user" value="root"/>
   <property name="jakarta.persistence.jdbc.password" value="password"/>
   <property name="jakarta.persistence.schema-generation.database.action" value="update"/>
   </properties>
   </persistence-unit>
   </persistence>
4. Comprobar los archivos de configuración pom.xml. Debe tener las librerias externas de Hibernate.
     <!--Instalar las librerías externas para la conexión de una DB-->
     <dependencies>
       <!--  JPA (Hibernate)  -->
       <dependency>
           <groupId>org.hibernate</groupId>
           <artifactId>hibernate-core</artifactId>
           <version>6.2.7.Final</version>
       </dependency>
       <!--  JPA API  -->
       <dependency>
          <groupId>jakarta.persistence</groupId>
          <artifactId>jakarta.persistence-api</artifactId>
          <version>3.1.0</version>
       </dependency>
      <!-- Conector mysql workbench 8.0.33 -->
      <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>8.0.21</version>
      </dependency>
     </dependencies>

Funcionalidades
1. Crear un empleado. El sistema crea un nuevo empleado y verifica la tabla empleados en la base de datos para que contenga el nuevo registro.
2. Listar Empleados. El sistema imprime todos los empleados registrados.
3. Actualizar Empleados. Modifica los datos de un empleado existente identificándolo por su ID:
4. Eliminar un empleado. Elimina empleado existente utilizando su ID.
5. Buscar por Cargo. Busca y muestra empleados por cargo.

Resultados
1. Los cambios realizados en el sistema deben verse reflejados directamente en la base da datos.
2. Se implementa el manejo básico de excepciones y validaciones para operaciones CRUD.

