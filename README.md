# Reverie – Creative Vault & Publishing Platform
### Where creativity lives!!

Reverie is a secure and scalable full-stack web application designed as a creative vault and publishing platform where users can store, manage, and publish their digital content such as files, notes, and creative works. The platform enables users to maintain both private and public content, giving full control over what to keep personal and what to share with the world.

The system acts as a personal creative space + publishing system, allowing users to safely store drafts, ideas, and media, and later publish them publicly whenever they choose. This makes Reverie a hybrid between a secure content vault and a lightweight publishing platform.

The backend is built using Spring Boot with a clean layered architecture (Controller – Service – Repository). It ensures modularity, scalability, and maintainability. Authentication and authorization are handled using Spring Security with JWT (JSON Web Tokens) for secure and stateless session management.

The platform integrates Supabase PostgreSQL cloud database for structured data storage and Supabase Storage API for handling file uploads and media assets. The application is containerized using Docker, ensuring consistent deployment across environments.

Overall, Reverie is designed as a privacy-first creative ecosystem that allows seamless switching between private storage and public publishing.

## Features
Secure user authentication using JWT
Role-based access control using Spring Security
Private content storage (only visible to owner)
Public publishing system (share content with others)
Upload and manage files, notes, and media
Cloud storage integration using Supabase Storage API
RESTful API architecture for backend communication
Dockerized deployment for portability and consistency

## Tech Stack
Backend
Java
Spring Boot
Spring Security
JWT (JSON Web Token)
Database
PostgreSQL (Supabase Cloud Database)
Storage
Supabase Storage API
DevOps
Docker
Architecture
RESTful API
Layered Architecture (Controller – Service – Repository)

## Core Concept

Reverie introduces a dual-mode content system:

### Private Mode

Content is visible only to the creator and stored securely in the vault.

### Public Mode

Content is published and accessible to other users through the platform.

Users can switch between these two modes anytime, giving full flexibility over their creative work.

## Authentication Flow
User registers or logs in
Server validates credentials
JWT token is generated upon successful authentication
Token is sent to the client
Token is used for accessing protected APIs
Each content operation is user-specific and secured
