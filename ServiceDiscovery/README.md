# Meetup Microservices Session2
### Eureka Discovery Service

Este código tiene como función implementar un Eureka server, que será el encargado de "saber" dónde está ubicado cada servicio y cada réplica (nodo) en caso de tener más de una instancia de un servicio.

Eureka se ecarga también de realizar el balanceo de carga entre los nodos que atienden el requerimiento a un servicio y retorna dicha información al API Gateway que tomó dicho request desde el exterior de la plataforma.

Este pequeña implementación de Eureka es la misma utilizada en la presentación del meetup Microservices Session 1, con algunas modificaciones menores, y fue obtenida desde el post de Roberto Crespo http://www.robertocrespo.net/kaizen/zuul-implementacion-de-un-api-gateway/ 

La configuración del server se encuentra en el archivo:

$RUTA_BASE/src/main/resources/application.yml

### Instalación ###
```console

[user@machine]$ cd $RUTA_BASE
[user@machine]$ mvn install

```

### Ejecución ###
```console

[user@machine]$ java -jar target/service-discovery-0.0.1-SNAPSHOT.jar

```

### Más información sobre Eureka ###
https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance



