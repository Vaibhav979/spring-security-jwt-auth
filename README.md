📂 Project Structure (at a glance)
spring-security-jwt-auth/
 ├── src/main/java/com/vaibhav/springsecurity/
 │    ├── config/            # SecurityConfig, FilterConfig, etc.
 │    ├── controller/        # AuthController, TestController
 │    ├── filter/            # JWTFilter
 │    ├── model/             # User, Role, DTOs
 │    ├── repository/        # UserRepository
 │    ├── service/           # UserDetailsServiceImpl, JWTService
 │    └── SpringSecurityJwtAuthApplication.java
 ├── src/main/resources/
 │    └── application.properties
 ├── README.md
 └── pom.xml

📝 README.md content
# Spring Security JWT Authentication

This project demonstrates **end-to-end JWT authentication with Spring Security**.  
It covers:
- User Registration & Login
- Generating JWT Tokens
- Securing Endpoints with JWT Filter
- Role-based Authorization

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/spring-security-jwt-auth.git
   cd spring-security-jwt-auth


Configure application.properties with your DB credentials.

Run the application:

mvn spring-boot:run


Endpoints:

POST /auth/register → Register new user
POST /auth/login → Authenticate & get JWT
GET /hello → Secured endpoint (requires JWT)
🛠️ Tech Stack
Java 17+
Spring Boot
Spring Security
JWT (io.jsonwebtoken)
Maven
H2 / MySQL (choose your DB)
📖 References
Spring Security Docs
JWT.io
✨ Future Enhancements
Refresh Tokens
Logout with Token Blacklist
Role-based Access Control (RBAC)
