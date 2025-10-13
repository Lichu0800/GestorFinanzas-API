# GestorFinanzas - Sistema de Gestión de Finanzas Personales

Sistema de gestión de finanzas personales desarrollado con **Spring Boot**, **Spring Security**, **JWT (JSON Web Tokens)** y un modelo robusto de **roles y permisos** para el manejo de usuarios.

---

## 🚀 Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 3.4.3**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Maven 3.6+**
- **MySQL**
- **JPA/Hibernate**

---

## ⚙️ Instalación y Configuración
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Lichu0800/GestorFinanzas.git
cd GestorFinanzas
```

### 2️⃣ Configurar la base de datos
Modifica `application.properties` con los datos de tu base de datos MySQL.

```properties
# DATOS DE LA DB
spring.datasource.url=jdbc:mysql://localhost:3306/gestorfinanzas?seSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=tu_password

# NOMBRE DE LA APP
spring.application.name=gestorfinanzas

# Configuración de JWT
security.jwt.private.key=44baf780f484b615fbb0f9cc6a3db9b51fd873a416d7ced9797bb9f5a18d977d
security.jwt.user.generator=GESTORFINANZAS-SEC
```

### 3️⃣ Ejecutar la aplicación
```bash
mvn spring-boot:run
```

---

## 📌 Endpoints Principales
### 🔐 Autenticación
- `POST /auth/login` → Iniciar sesión con credenciales de usuario.

### 👥 Usuarios
- `GET /api/users` → Obtener todos los usuarios.
- `GET /api/users/{id}` → Obtener un usuario por ID.
- `POST /api/users` → Crear un nuevo usuario.

### 🎭 Roles
- `GET /api/roles` → Obtener todos los roles.
- `GET /api/roles/{id}` → Obtener un rol por ID.
- `POST /api/roles` → Crear un nuevo rol.

### 🔑 Permisos
- `GET /api/permissions` → Obtener todos los permisos.
- `GET /api/permissions/{id}` → Obtener un permiso por ID.
- `POST /api/permissions` → Crear un nuevo permiso.

---

## 📂 Estructura del Proyecto
```
/src/main/java/com/lisandro/gestorfinanzas/  # Código fuente principal.
├── controller/                             # Controladores REST
├── dto/                                    # Objetos de transferencia de datos
├── model/                                  # Entidades JPA
├── repository/                             # Repositorios de datos
├── service/                                # Lógica de negocio
├── Security/                               # Configuración de seguridad
├── utils/                                  # Utilidades (JWT)
/src/main/resources/                        # Archivos de configuración y recursos.
/src/test/java/com/lisandro/gestorfinanzas/ # Pruebas unitarias.
```

---

## 🔒 Características de Seguridad
- **Autenticación JWT**: Tokens seguros para autenticación de usuarios
- **Roles y Permisos**: Sistema granular de autorización
- **Encriptación BCrypt**: Contraseñas seguras
- **Session Stateless**: API REST completamente sin estado

---

## 🎯 Funcionalidades Futuras
- Gestión de ingresos y gastos
- Categorización de transacciones
- Reportes financieros
- Dashboard de análisis
- Metas de ahorro
- Recordatorios de pagos

---

## 🤝 Contribuir
Si deseas contribuir a este proyecto, puedes hacer un **fork**, crear una rama con tus cambios y enviar un pull request. 🙌

---

## 👤 Autor
💡 **Lichu** - [GitHub](https://github.com/Lichu0800)

---

## 📜 Licencia
Este proyecto está bajo la licencia **MIT**.

