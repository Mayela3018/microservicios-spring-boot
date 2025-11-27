🚀 Sistema de Microservicios - Spring Boot + React
Sistema completo de microservicios desarrollado con Spring Boot (backend) y React + Vite (frontend) para la gestión de productos y categorías.
📋 Arquitectura
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

🛠️ Tecnologías Utilizadas
Backend

Java 17
Spring Boot 3.5.7
Spring Cloud 2025.0.0
Eureka Server (Service Discovery)
Feign Client (Comunicación entre microservicios)
Spring Data JPA
MySQL
Maven

Frontend

React 18
Vite
Tailwind CSS
Framer Motion
Axios
Lucide React Icons
