🔥 Project Overview
The AI Customer Support Chatbot Dashboard is a web application that allows customers to interact with an AI-powered chatbot for support queries (e.g., FAQs, order status, refunds) and provides an admin dashboard for support managers to monitor chats, manage FAQ data, and view analytics. The application is secure, scalable, and deployable to modern cloud environments.

🤔 Why This Project?
Real-World Relevance: Demonstrates AI integration for customer support, a common business need.
Full-Stack Development: Combines backend (Spring Boot) and frontend (React) with modern practices.
Scalability: Uses microservices principles and containerization (Docker/Kubernetes).
Security: Implements OAuth2 for authentication and role-based access control.
Extensibility: Can be adapted for SaaS, e-commerce, or other industries.

🧠 Core Features
AI Chatbot with Spring AI:
Integrates with OpenRouter (or a local LLM like Ollama) to handle customer queries.
Uses prompt templates for common scenarios (e.g., FAQs, order status).
Stores chat history in MongoDB for persistence and analysis.
- Admin Dashboard:
Displays chat logs, user satisfaction ratings, and analytics (e.g., number of chats, resolution rate).
Allows admins to manage FAQ data and fine-tune chatbot prompts.
- Authentication & Authorization:
Implements OAuth2 for secure login (e.g., via Google or a custom provider).
Role-based access control with USER (customers) and ADMIN (support managers) roles.
Live Chat (Optional):
Enables real-time chat using WebSocket for AI-human hybrid conversations.
Allows support agents to intervene when the AI cannot resolve a query.

🛠️ Tech Stack
- Backend:
Java 21 + Spring Boot 3.5: For building REST APIs and microservices.
Spring AI: For integrating with OpenRouter or a local LLM.
Spring Security + OAuth2: For authentication and authorization.
MongoDB: For storing chat logs.
MySQL: For storing user and role data.
- Frontend:
React.js: For a dynamic, responsive UI.
Axios: For making REST API calls to the backend.
DevOps (Optional):
Docker: For containerizing services.
Kubernetes: For orchestration and scaling.
GitHub Actions: For CI/CD pipelines.
Terraform + Ansible: For infrastructure provisioning.

📂 Project Structure
Here’s the proposed project structure, split into backend and frontend modules for clarity. The backend is a Spring Boot application, and the frontend is a React application.

text

Collapse

Wrap

Copy
ai-customer-support-chatbot/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/aichatbot/
│   │   │   │   ├── config/                     # Spring configuration (Security, MongoDB, MySQL)
│   │   │   │   ├── controller/                 # REST API controllers
│   │   │   │   ├── model/                     # Entity classes (User, Role, ChatLog)
│   │   │   │   ├── repository/                # Spring Data repositories
│   │   │   │   ├── service/                   # Business logic (AI, Chat, Auth)
│   │   │   │   ├── websocket/                 # WebSocket handlers (optional)
│   │   │   │   └── AiChatbotApplication.java  # Main application class
│   │   │   └── resources/
│   │   │       ├── application.yml            # Configuration (DB, OpenRouter API key)
│   │   │       └── prompts/                   # Prompt templates for AI
│   │   └── test/                              # Unit and integration tests
│   ├── pom.xml                                # Maven dependencies
│   └── Dockerfile                             # Docker configuration
├── frontend/
│   ├── src/
│   │   ├── components/                        # React components (Chat, Dashboard, Login)
│   │   ├── pages/                             # React pages (Home, AdminDashboard)
│   │   ├── services/                          # API service (Axios calls to backend)
│   │   ├── App.js                             # Main React app
│   │   ├── index.js                           # React entry point
│   │   └── styles/                            # CSS/SCSS for styling
│   ├── package.json                           # Node.js dependencies
│   └── Dockerfile                             # Docker configuration
├── kubernetes/                                # Kubernetes manifests (optional)
│   ├── deployment.yml
│   ├── service.yml
│   └── ingress.yml
├── terraform/                                 # Terraform scripts (optional)
│   └── main.tf
├── ansible/                                   # Ansible playbooks (optional)
│   └── deploy.yml
└── README.md                                  # Project documentation

🛠️ Implementation Guide
Backend Setup (Spring Boot)
The backend will handle AI integration, REST APIs, database operations, and security.

Set Up Spring Boot Project
Use Spring Initializr to create a new Spring Boot project with the following dependencies:

Spring Web
Spring Security
Spring Data MongoDB
Spring Data JPA (for MySQL)
Spring AI (add manually via Maven)
Lombok (optional, for reducing boilerplate)
WebSocket (optional, for live chat)


<img width="782" height="425" alt="download" src="https://github.com/user-attachments/assets/290f1b13-09bb-417d-a243-10e7a141112b" />
