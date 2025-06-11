## 🌟 Hotel Nova - Sitio Web con Java EE

Este repositorio contiene el desarrollo de la página web del **Hotel Nova**, creada usando Java EE (Servlets, JSP y JDBC). La aplicación permite a los usuarios conocer el hotel, ver habitaciones y contactar al establecimiento.

## 🏨 Descripción del Proyecto

El objetivo es ofrecer una plataforma web funcional para el Hotel Nova donde los usuarios puedan:

- Ver la información general del hotel.
- Explorar las habitaciones y servicios.
- Enviar solicitudes de reserva.
- Contactar mediante un formulario.

## 🛠️ Tecnologías Utilizadas

- Java EE (Servlets + JSP)
- JDBC (conexión a base de datos MySQL)
- HTML5, CSS3, Java
- Apache Tomcat 10+
- MySQL 8.x

## 📁 Estructura del Proyecto

HotelNova/
├── src/
│ └── com/hotelnova/servlets/
│ ├── Cargar.java
│ ├── menuHabitacion.java
│ ├── menuServicios.java
├── WebContent/
│ ├── index.jsp
│ ├── habitaciones.jsp
│ ├── servicios.jsp
│ ├── css/
│ │ └── styles.css
│ └── WEB-INF/
│ └── web.xml
├── README.md
└── .sql (script para crear la base de datos)


## ⚙️ Configuración del Proyecto

### Requisitos

- JDK 11 o superior
- Apache Tomcat 10+
- MySQL Server
- IDE compatible (Eclipse, IntelliJ, NetBeans)

### Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/mkhaili001/hotel-nova.git
   ```
2. Importa el proyecto en tu IDE como un proyecto Dynamic Web Project.

3. Configura el servidor Tomcat y añade el proyecto.

4. Crea la base de datos en MySQL con el script Hotel.sql incluido.

5. Configura los parámetros de conexión a la base de datos (JDBC) en el Servlet correspondiente.

### Script SQL básico

CREATE DATABASE Hotel;
USE Hotel;

    
    DROP TABLE IF EXISTS `habitaciones`;
    /*!40101 SET @saved_cs_client     = @@character_set_client */;
    /*!50503 SET character_set_client = utf8mb4 */;
    CREATE TABLE `habitaciones` (
      `id_habitacion` int NOT NULL AUTO_INCREMENT,
      `numeroHabitacion` int unsigned NOT NULL,
      `metros` double unsigned NOT NULL,
      `precio` float unsigned NOT NULL,
      `numeroCamas` int unsigned NOT NULL,
      `exterior` tinyint NOT NULL,
      PRIMARY KEY (`id_habitacion`),
      UNIQUE KEY `numeroHabitacion_UNIQUE` (`numeroHabitacion`)
    ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

### 🚀 Ejecución

- Inicia el servidor Tomcat desde tu IDE o manualmente.

- Accede a la aplicación desde tu navegador



## ✅ Funcionalidades

- 🏠 Página de inicio con presentación del hotel.

- 🛏️ Visualización de habitaciones desde base de datos.

- 📸 Capturas de Pantalla

- ✉️ Contacto

Email: contacto@hotelnova.com

Web: hotelnova.com

Tel: +34 123 456 789

## 📄 Licencia

Distribuido bajo la Licencia MIT. Ver LICENSE para más información.
