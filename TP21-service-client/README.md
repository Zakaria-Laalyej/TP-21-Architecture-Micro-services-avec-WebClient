# TP 21 - Service Client (Port 8081)

**Auteur :** Zakaria Laalyej (2DSI)  
**Cours :** Architecture Microservices : Conception, Déploiement et Orchestration (EMSI)  

---

## 📌 Présentation du Projet
Ce microservice gère les clients dans le TP 21 (WebClient).

- Port : 8081
- Nom Eureka : SERVICE-CLIENT
- Base de données : MySQL (clientservicedb)
- Classe principale : ServiceClientApplication
- Endpoints :
  - GET http://localhost:8081/api/clients
  - GET http://localhost:8081/api/clients/1
  - POST http://localhost:8081/api/clients

---

## 🚀 Lancement dans IntelliJ IDEA
1. Ouvrez ce dossier dans IntelliJ via : **File → Open → C:\Users\pc\IdeaProjects\TP21-service-client**
2. Clic droit sur `pom.xml` → **Maven → Reload Project**
3. Lancez la classe principale (Run ▶).
