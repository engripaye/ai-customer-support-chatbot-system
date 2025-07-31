# Use Java 21 base image
FROM eclipse-temurin:21-jdk

# Set build ARG
ARG JAR_FILE=target/ai-customer-support-chatbot-dashboard-0.0.1-SNAPSHOT.jar

# Copy the JAR into the image
COPY ${JAR_FILE} app.jar

# Expose the correct port (optional)
EXPOSE 9090

# Run the app
ENTRYPOINT ["java", "-jar", "/app.jar"]
