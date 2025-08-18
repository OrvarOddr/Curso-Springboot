## Spring Framework 6 & Spring Boot 3 desde cero a experto

Proyecto base del curso usando VS Code. Documento simple con lo esencial para arrancar y trabajar.

---

## Requisitos
- Java 21 (o compatible).

```bash
java -version
```

- Maven Wrapper incluido (`mvnw`, `mvnw.cmd`).

```bash
./mvnw -v
```

## VS Code: extensiones recomendadas
- Extension Pack for Java (Microsoft)
- Spring Boot Extension Pack (VMware)

## Puesta en marcha rápida
Arranca la app en modo desarrollo:

```bash
./mvnw spring-boot:run
```

Abre: http://localhost:8080

## Comandos útiles
- Ejecutar pruebas

```bash
./mvnw test
```

- Construir JAR

```bash
./mvnw clean package
```

- Ejecutar el JAR

```bash
java -jar target/springboot-web-0.0.1-SNAPSHOT.jar
```

---

Spring Boot 3.5.x + Java 21.
