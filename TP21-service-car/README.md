# TP 21 - Service Car avec WebClient (Port 8082)

**Auteur :** Zakaria Laalyej (2DSI)  
**Cours :** Architecture Microservices : Conception, Déploiement et Orchestration (EMSI)  

---

## 📌 Présentation du Projet
Ce microservice gère les voitures et communique avec SERVICE-CLIENT via WebClient (@LoadBalanced).

- Port : 8082
- Nom Eureka : SERVICE-CAR
- Base de données : MySQL (carservicedb)
- Classe principale : ServiceCarApplication
- Endpoints :
  - GET http://localhost:8082/api/test/client/1 (Test WebClient isolé)
  - GET http://localhost:8082/api/cars (Voitures enrichies avec leurs clients)
  - GET http://localhost:8082/api/cars/byClient/1

---

## 🚀 Lancement dans IntelliJ IDEA
1. Ouvrez ce dossier dans IntelliJ via : **File → Open → C:\Users\pc\IdeaProjects\TP21-service-car**
2. Clic droit sur `pom.xml` → **Maven → Reload Project**
3. Lancez la classe principale (Run ▶).
