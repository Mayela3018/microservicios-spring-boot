# 🚀 Sistema de Microservicios - Spring Boot + React

Sistema completo de microservicios desarrollado con **Spring Boot** (backend) y **React + Vite** (frontend) para la gestión de productos y categorías.

## 📋 Arquitectura

```
Frontend (React + Vite)
         ↓
    Puerto 5173
         ↓
Eureka Server (8761)
         ↓
    ┌────┴────┐
    ↓         ↓
Categoria   Producto
Service     Service
(8081)      (8082)
```

## 🛠️ Tecnologías Utilizadas

### Backend
- Java 17
- Spring Boot 3.5.7
- Spring Cloud 2025.0.0
- Eureka Server (Service Discovery)
- Feign Client (Comunicación entre microservicios)
- Spring Data JPA
- MySQL
- Maven

### Frontend
- React 18
- Vite
- Tailwind CSS
- Framer Motion
- Axios
- Lucide React Icons

## 📁 Estructura del Proyecto

```
microservicios-spring-boot/
├── backend/
│   ├── eureka-server/          # Service Discovery (8761)
│   ├── api-gateway/            # API Gateway (8080)
│   ├── categoria-service/      # Microservicio de categorías (8081)
│   └── producto-service/       # Microservicio de productos (8082)
├── frontend/                   # Aplicación React (5173)
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   └── services/
│   └── package.json
└── README.md
```

## 🔧 Requisitos Previos

- Java JDK 17 o superior
- Maven 3.6+
- Node.js 18+ y npm
- MySQL 8.0+
- Git

## ⚙️ Configuración

### 1. Base de Datos

Crear las bases de datos en MySQL:

```sql
CREATE DATABASE db_categoria;
CREATE DATABASE db_producto;
```

### 2. Backend

Cada microservicio tiene su propio `application.properties`:

**Categoria Service (Puerto 8081)**
```properties
server.port=8081
spring.datasource.url=jdbc:mysql://localhost:3306/db_categoria
spring.datasource.username=root
spring.datasource.password=
```

**Producto Service (Puerto 8082)**
```properties
server.port=8082
spring.datasource.url=jdbc:mysql://localhost:3306/db_producto
spring.datasource.username=root
spring.datasource.password=
```

### 3. Frontend

Instalar dependencias:

```bash
cd frontend
npm install
```

## 🚀 Ejecución

### Orden de inicio de servicios:

#### 1. Eureka Server (8761)
```bash
cd backend/eureka-server
mvn spring-boot:run
```

Verificar en: http://localhost:8761

#### 2. Categoria Service (8081)
```bash
cd backend/categoria-service
mvn spring-boot:run
```

#### 3. Producto Service (8082)
```bash
cd backend/producto-service
mvn spring-boot:run
```

#### 4. Frontend (5173)
```bash
cd frontend
npm run dev
```

Abrir en el navegador: http://localhost:5173

## 📡 Endpoints API

### Categorías

- `GET /api/categorias` - Listar todas las categorías
- `GET /api/categorias/{id}` - Obtener categoría por ID
- `POST /api/categorias` - Crear nueva categoría
- `PUT /api/categorias/{id}` - Actualizar categoría
- `DELETE /api/categorias/{id}` - Eliminar categoría

### Productos

- `GET /api/productos` - Listar todos los productos
- `GET /api/productos/{id}` - Obtener producto con su categoría (Feign Client)
- `POST /api/productos` - Crear nuevo producto
- `PUT /api/productos/{id}` - Actualizar producto
- `DELETE /api/productos/{id}` - Eliminar producto

## 🧪 Pruebas con Postman

**Crear Categoría:**
```json
POST http://localhost:8081/api/categorias
{
    "nombre": "Electrónica"
}
```

**Crear Producto:**
```json
POST http://localhost:8082/api/productos
{
    "nombre": "Laptop HP",
    "precio": 2500.00,
    "stock": 15,
    "categoriaId": 1
}
```

**Obtener Producto con Categoría:**
```
GET http://localhost:8082/api/productos/1
```

## ✨ Características Principales

- ✅ Arquitectura de microservicios independientes
- ✅ Service Discovery con Eureka
- ✅ Comunicación entre servicios con Feign Client
- ✅ Base de datos independiente por servicio
- ✅ APIs RESTful con operaciones CRUD completas
- ✅ Frontend moderno con React y Tailwind CSS
- ✅ Validaciones en tiempo real
- ✅ Notificaciones tipo Toast
- ✅ Modals interactivos
- ✅ Búsqueda y filtrado de datos

## 📸 Capturas de Pantalla

### Eureka Dashboard
![Eureka](docs/images/eureka.png)

### Frontend - Productos
![Productos](docs/images/productos.png)

### Frontend - Categorías
![Categorias](docs/images/categorias.png)

## 🤝 Contribuciones

Este proyecto fue desarrollado con fines académicos para el curso de Desarrollo de Aplicaciones Web.

## 👨‍💻 Autor

**Ticona Mayela**

Curso: Desarrollo de Aplicaciones Web 

## 📄 Licencia

Este proyecto es de uso académico.

