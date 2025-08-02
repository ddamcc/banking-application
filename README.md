# 💳 Secure Banking Application

A **Banking Application** developed as a personal project to simulate core banking operations.
A secure, role-based online banking system developed using **Spring Boot**, **Spring Security**, **JWT**, and **MySQL**. This application supports both **admin** and **user** roles and provides features like login, dashboard access, notices, contact form, and secure session management.

## 🚀 Features

- 🔐 **User & Admin Authentication** using **JWT** and **Spring Security**
- 📥 **Login with email & password**
- 🛡️ **Role-based Access**:
  - **Admin** can access additional views and functionalities
  - **User** can view personal banking information
- 📃 **Notice Board**: View notices stored in the database
- 📬 **Contact Form**: Users can submit queries via a contact form
- 🏦 **User Dashboard** includes:
  - 📁 **Account** – View account details
  - 💰 **Balance** – View total available balance
  - 💳 **Cards** – View credit card information
  - 💸 **Loans** – View loan status and history

## 🖼️ UI Previews

### 🔑 Login Page & Navigation

### 🏠 User Dashboard

## 🛠️ Tech Stack

| Layer        | Technology Used                    |
|--------------|------------------------------------|
| Backend      | Java, Spring Boot, Spring Security |
| Security     | JWT (JSON Web Token), CSRF         |
| Database     | MySQL                              |
| Build Tool   | Maven                              |


## 📦 Project Structure

src/
├── controller/ # REST Controllers
├── service/ # Business Logic
├── repository/ # JPA Repositories
├── model/ # Entity Classes
├── config/ # Configuration Files
└── security/ # JWT + Security Logic
