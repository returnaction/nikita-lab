# 📦 Используем базовый образ с Java 17 (Alpine — легкий)
FROM openjdk:17-jdk-alpine

# 📁 Создаём временный том /tmp
VOLUME /tmp

# 📥 Копируем jar-файл в контейнер
COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

# 🚀 Запускаем Spring Boot приложение
ENTRYPOINT ["java", "-jar", "/app.jar"]