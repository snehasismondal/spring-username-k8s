FROM eclipse-temurin:21-jre-alpine

WORKDIR '/working-dir'

COPY './target/user-service.jar' '/working-dir'

EXPOSE 9191

CMD ["java","-jar","user-service.jar"]