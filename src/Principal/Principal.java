package Principal;

import javax.swing.*;
import ParaMoneda.*;
import ParaTemperatura.*;

/**
 * La clase Principal, "Principal", es la clase principal del programa y maneja el menú de opciones.
 * @author dora_
 *
 */

public class Principal {
	
	public static void main(String[] args) {
		
		opcionConversionMoneda conversion = new opcionConversionMoneda();
		OptionsTemp conversionTemp = new OptionsTemp();
		
		/**
		 * Esta clase contiene el método main, que es el punto de entrada del programa.
		 * Aquí se realiza un bucle infinito para mostrar un menú al usuario y seleccionar entre el "Conversor de Divisas" o el "Conversor de Escalas de Temperatura".
		 * Luego, dependiendo de la opción elegida, se llama a la clase correspondiente para realizar la conversión.
		 */
		
		while (true) {
			String opciones = JOptionPane.showInputDialog(null, 
				"Seleccione una opción para conversión", "Menú",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
					"Conversor de Divisas", "Conversor de Escalas de Temperatura"
				}, null).toString();
			
			switch (opciones) {
				case "Conversor de Divisas":
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir");
					double cantidad = Double.parseDouble(input);
					conversion.ConversionMoneda(cantidad);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar más conversiones?");
					if (JOptionPane.OK_OPTION == respuesta) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						return; // Sale del programa si el usuario no desea más conversiones.
					}
					break;
					
				case "Conversor de Escalas de Temperatura":
					String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double tempRecibida = Double.parseDouble(input1);
					conversionTemp.tempConversion(tempRecibida);
					
					int respuestaTemp = JOptionPane.showConfirmDialog(null, "¿Desea realizar más conversiones?");
					if (JOptionPane.OK_OPTION == respuestaTemp) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						return; // Sale del programa si el usuario no desea más conversiones.
					}
					break;
					
					/**
					 * Si se ingresa un valor no válido (por ejemplo, una letra en lugar de un número), 
					 * el programa mostrará un mensaje de error y le pedirá al usuario que ingrese nuevamente el valor.
					 */
					
				default:
					JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
										
					break;
					
					/**
					 * Puede repetir el proceso de conversión tantas veces como desee hasta que decida salir del programa.
					 */
			}
		}
	}
}
