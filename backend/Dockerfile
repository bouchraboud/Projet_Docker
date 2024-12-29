# Étape 1 : Utiliser une image de base légère basée sur Alpine Linux
FROM eclipse-temurin:17-jre-alpine

# Étape 2 : Définir un répertoire de travail pour l'application
WORKDIR /app

COPY target/docker-0.0.1-SNAPSHOT.jar /app/demo.jar

# Étape 3 : Exposer uniquement le port nécessaire
EXPOSE 8080

# Étape 4 : Configurer le point d'entrée de l'application
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]