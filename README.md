= Prueba Indra cliente Inditex =

== Introdución ==

Esto es la resolución de una prueba propuesta por Indra


== Qué es esto ==

Esto es una aplicación en la cual se ha desarrollado un EndPoint para dar solución a un problema propuesto.
Se cargarán unos datos en el arranque de la aplicación en una base de datos en memoria tipo H2.

El EndPoint recibe como parámetros de entrada  fechaAplicacion, identificadorProducto, identificadorCadena.

Devolverá identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y 
precio final a aplicar.


== Cómo hacerlo correr? == 

Esta aplicación se pordrá lanzar desde la carpeta raiz del projecto  el comando en cmd:

  mvnw spring-boot:run

o corriendo  zara-0.0.1-SNAPSHOT.jar dentro de la carpeta /target con el comando en cmd:

   java -jar zara-0.0.1-SNAPSHOT.jar


== Cómo probarlo? ==

Tendrá configurado un EndPoint en la url:
localhost:9090/zara/obtePrices

Se lanzarán una serie pruebas, que se podrán encontrar en un archivo de postman ubicado en src/main/resources/datos/New Collection.postman_collection.json

-          Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
-          Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
-          Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
-          Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
-          Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)

Este archivo se deberá importar a postman para la ejecución de dichas pruebas. 
