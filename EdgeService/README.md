# Meetup Microservices Session2
### Main Api Gateway

Este código tiene como función servir de API Gateway para todos los servicios de la aplicación de ejemplo. Su misión es ser la puerta de entrada a cualquier requerimiento y tener un mapeo de cada servicio existente, utilizando ***Zuul***, al mimo tiempo que consultar y realizar balanceo de carga entre los servicios registrados en el Service Discovery (***Eureka***), a través del cliente interno ***Ribbon***. Ambos componentes pertenecientes a ***Netflix OSS***.

Este pequeño API es el mismo utilizado en la presentación del meetup Microservices Session 1, con algunas modificaciones menores, y fue obtenido desde el post de Roberto Crespo http://www.robertocrespo.net/kaizen/zuul-implementacion-de-un-api-gateway/ 

Este API Gateway es del tipo Server Side.

La configuración de rutas para el gateway se encuentra en el archivo:

$RUTA_BASE/src/main/resources/application.yml

### Instalación ###
```console

[user@machine]$ cd $RUTA_BASE
[user@machine]$ mvn install

```

### Ejecución ###
```console

[user@machine]$ java -jar target/api-gateway-0.0.1-SNAPSHOT.jar

```

### Más información sobre ZUUL ###
https://github.com/Netflix/zuul


### Más información sobre Ribbon ###
https://github.com/Netflix/ribbon

