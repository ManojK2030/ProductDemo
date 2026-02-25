# Product Management System - Spring Boot

## 🎓 Internship Context

This project was developed as part of my internship to gain hands-on
experience in Java backend development using Spring Boot.

During this project, I learned:

- Building MVC-based web applications
- Connecting Spring Boot with MySQL
- Implementing CRUD operations
- Handling routing and controller mappings
- Using Git and GitHub for version control

---

## ⚙️ Technologies Used
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Thymeleaf
- Maven

---

## 🚀 Project Execution Flow

1. User opens the application in browser.
2. Request goes to Spring DispatcherServlet.
3. Controller handles the request.
4. Service layer processes business logic.
5. Repository fetches data from MySQL.
6. Data is sent back to Controller.
7. Controller returns Thymeleaf template.
8. HTML page is rendered to the user.

---

## MySQL: Products Table

### SQL Schema

```sql
CREATE DATABASE product_demo;
USE product_demo;

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2),
    quantity INT
);
```

### Sample Data (5 Products)

```sql
INSERT INTO products (name, category, price, quantity) VALUES
('Laptop', 'Electronics', 65000, 10),
('Mobile Phone', 'Electronics', 30000, 25),
('Office Chair', 'Furniture', 8500, 15),
('Notebook', 'Stationery', 60, 200),
('Water Bottle', 'Accessories', 450, 50);
```
---
## application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_demo
spring.datasource.username=root
spring.datasource.password=your_password
```
--- 
## Final Flow 

```
Product List Page
   ↓ (click product name)
GET /products/3
   ↓
Controller fetches product
   ↓
Product Details Page
```
---
## 📸 Output Screenshots

### Products Page
<img width="773" height="429" alt="image" src="https://github.com/user-attachments/assets/c41aa00c-2d86-4cbf-97ea-844dc3aa37b2" />

### Product Details Page
<img width="923" height="380" alt="image" src="https://github.com/user-attachments/assets/728368cc-4059-408f-b463-c38e90a1824f" />
