✨ Microservicios con Spring Boot + React (Vite & Tailwind)

Sistema completo de gestión de Productos y Categorías desarrollado con arquitectura de microservicios, Spring Cloud, Eureka, Feign y React + Vite para el frontend.
Ideal para prácticas profesionales, exámenes o portafolio.

🏗️ Arquitectura del Proyecto
📦 microservicios-spring-boot
│
├── 🖥️ backend/
│   ├── 🌐 api-gateway/          → Punto único de entrada (opcional)
│   ├── 📚 categoria-service/     → Microservicio de categorías
│   ├── 🛒 producto-service/      → Microservicio de productos
│   └── 🔍 eureka-server/         → Service Discovery
│
├── 🎨 frontend/                  → Aplicación React + Vite + Tailwind + Axios
│   ├── src/
│   ├── public/
│   └── package.json
│
└── 📄 README.md

🚀 Tecnologías Utilizadas
🖥️ Backend (Microservicios)

Spring Boot 3

Spring Cloud Netflix Eureka

Spring Web

Spring Data JPA

Feign Client

MySQL

Maven

🎨 Frontend (SPA)

React + Vite

Tailwind CSS

Axios

Framer Motion

Lucide React (iconos)

🛠️ Herramientas

IntelliJ IDEA

Visual Studio Code

Postman

Git & GitHub

🔍 Características Principales
🧩 Microservicios Independientes

✔ Cada servicio tiene su propia base de datos
✔ CRUD completo de Categorías y Productos
✔ Desacoplamiento entre servicios

🔗 Comunicación entre Servicios

✔ Implementación con Feign Client
✔ Producto-Service consulta categorías a través de Categoria-Service

📡 Descubrimiento de Servicios

✔ Eureka Server administra el registro dinámico de microservicios
✔ Evita direcciones estáticas
✔ Escalable y organizado

🎨 Frontend Moderno con React

✔ Interfaz bonita y responsiva
✔ CRUD completo
✔ Validaciones en tiempo real
✔ Modals, toasts y animaciones
✔ Comunicación vía Axios
