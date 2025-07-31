# ========================
# Stage 1: Build the JAR
# ========================
FROM eclipse-temurin:21-jdk as builder

WORKDIR /app

# Copy source code
COPY . .

# Install Maven and build the project
RUN apt-get update && apt-get install -y maven \
    && mvn clean package -DskipTests

# ==========================
# Stage 2: Run the JAR
# ==========================
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy the built jar from stage 1
COPY --from=builder /app/target/ai-customer-support-chatbot-dashboard-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
