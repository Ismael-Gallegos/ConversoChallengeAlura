# Conversor de Divisas y Escalas de Temperatura

Este programa implementa un conversor de divisas y escalas de temperatura. Permite al usuario elegir entre dos opciones: "Conversor de Divisas" y "Conversor de Escalas de Temperatura". A continuación, se presenta una breve descripción del código y cómo utilizarlo.

## Uso del programa

1. Ejecute el programa `Principal.java` desde su IDE o plataforma de desarrollo.

2. Aparecerá una ventana emergente con las opciones disponibles para el usuario:

    - "Conversor de Divisas": Permite realizar conversiones entre distintas monedas.
    - "Conversor de Escalas de Temperatura": Permite convertir temperaturas entre Celsius, Fahrenheit y Kelvin.

3. Seleccione la opción deseada haciendo clic en el botón correspondiente.

4. Si eligió "Conversor de Divisas", ingrese la cantidad que desea convertir cuando se le solicite.

5. Si eligió "Conversor de Escalas de Temperatura", ingrese el valor de temperatura que desea convertir cuando se le solicite.

6. El programa mostrará el resultado de la conversión en una ventana emergente.

7. Después de ver el resultado, puede optar por realizar más conversiones o salir del programa.

## Código

El código se encuentra dividido en tres paquetes:

- `principal`: Contiene la clase `Principal`, que es la clase principal del programa y maneja el menú de opciones.

- `paraMoneda`: Contiene la clase `ConversionMoneda`, que se encarga de realizar las conversiones de divisas, y la clase `OpcionConversionMoneda`, que maneja el proceso de selección de monedas y muestra los resultados de las conversiones.

- `paraTemperatura`: Contiene la clase `TempConversion`, que se encarga de realizar las conversiones de temperaturas, y la clase `OptionsTemp`, que maneja el proceso de selección de escalas de temperatura y muestra los resultados de las conversiones.

Es importante tener en cuenta que el programa utiliza ventanas emergentes (JOptionPane) para mostrar los mensajes y solicitar información al usuario.

## Requisitos

- Java Runtime Environment (JRE) instalado en su sistema.

## Notas

- El programa utiliza aproximaciones de dos decimales para mostrar los resultados de las conversiones.

- Si se ingresa un valor no válido (por ejemplo, una letra en lugar de un número), el programa mostrará un mensaje de error y le pedirá al usuario que ingrese nuevamente el valor.

- Puede repetir el proceso de conversión tantas veces como desee hasta que decida salir del programa.

¡Gracias por utilizar nuestro Conversor de Divisas y Escalas de Temperatura! Si tiene alguna pregunta o inquietud, no dude en ponerse en contacto con el desarrollador.
