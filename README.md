# Compilar y ejecutar el proyecto

Realizado bajo:

-	Java 8
-	Spring boot 2.1.6
-	maven 3.6.1


Ingresar al directorio "Desafio_Uno" mediante consola y ejecutar lo siguiente:

	mvn package

Esperar hasta que termine.


# Configurar

En el proyecto, ubicar el archivo "application.properties"

	Desafio_Uno/src/main/resources/application.properties

Editar url.GDD y agregar la URL del servicio rest "Generador De Datos", en este caso va con la url Local.

	url.GDD = http://127.0.0.1:8080/periodos/api
	

# Ejecutar

Para ejecutar el proyecto ingresar al directorio "Desafio_Uno"  mediante consola y ejecutar lo siguiente:

	java -jar target/desafio1-0.0.1.jar   

En caso de linux cambiar el "/" por unn "\" en la ruta y esperar que termine.

Nota: Tener configurado la URL del paso prvio -> Configurar.

# Visualizar

Para visualizar el resultado se debe ingresar a la siguiente url en el navegador o postman.

	http://127.0.0.1:8181/desafio_1/fechas
	
por consola:

	curl -X GET --header 'Accept: application/json' 'http://127.0.0.1:8181/desafio_1/fechas'
	

	
