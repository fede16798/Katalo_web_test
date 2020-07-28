# Katalo_web_test

# Ejecutar Test Cases

Test cases contiene los test grabados para su ejecución. Seleccionamos uno y clickeas en play para ejecutarlo. 

# Grabar un test case

Los elementos pueden recibir una variable por parametro, indicando, en la sección variables, que tipo de dato y que valor contienen.

1- Record web (Se encuentr en la parte superior de la pantalla).

Seleccionar paso a paso lo que debe hacer Katalon. De esta forma quedará grabado para ser ejecutado cuando se requiera. 

Record Web, además de grabar los pasos, captura los objetos necesarios para su ejecución.

2- New - Test case

Para grabar un test mediante estos pasos, primero es necesario capturar los objetos desde "Object Respository".
Una vez obtenidos los objetos, repetimos los pasos N°2. La grabación de los pasos, cumplen la misma función y es indistinto si se ejecuta desde Record (tener en cuenta que 
acá no es necesario el paso previo de la captura de objetos, ya que se hace al mismo tiempo). 

# Capturar objetos

Object repository - new - test object

Se ingresa la url y se caputan los objetos. Los campos seleccionados quedarán guardados para usarlos cuando se necesite. Los valores que necesite tomar el objeto se mandan por 
parametro cuando se está grabando un test.

# Keywords
Una keywords es una sentencia que nos permite realizar una acción en específica sobre un elemento o sobre nuestra aplicación:

Algunos ejemplos son: Open Browser - Click - Double Click
