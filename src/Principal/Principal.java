package Principal;

import javax.swing.*;
import ParaMoneda.*;
import ParaTemperatura.*;

/**
 * La clase Principal, "Principal", es la clase principal del programa y maneja el men� de opciones.
 * @author dora_
 *
 */

public class Principal {
	
	public static void main(String[] args) {
		
		opcionConversionMoneda conversion = new opcionConversionMoneda();
		OptionsTemp conversionTemp = new OptionsTemp();
		
		/**
		 * Esta clase contiene el m�todo main, que es el punto de entrada del programa.
		 * Aqu� se realiza un bucle infinito para mostrar un men� al usuario y seleccionar entre el "Conversor de Divisas" o el "Conversor de Escalas de Temperatura".
		 * Luego, dependiendo de la opci�n elegida, se llama a la clase correspondiente para realizar la conversi�n.
		 */
		
		while (true) {
			String opciones = JOptionPane.showInputDialog(null, 
				"Seleccione una opci�n para conversi�n", "Men�",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
					"Conversor de Divisas", "Conversor de Escalas de Temperatura"
				}, null).toString();
			
			switch (opciones) {
				case "Conversor de Divisas":
					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir");
					double cantidad = Double.parseDouble(input);
					conversion.ConversionMoneda(cantidad);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "�Desea realizar m�s conversiones?");
					if (JOptionPane.OK_OPTION == respuesta) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						return; // Sale del programa si el usuario no desea m�s conversiones.
					}
					break;
					
				case "Conversor de Escalas de Temperatura":
					String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double tempRecibida = Double.parseDouble(input1);
					conversionTemp.tempConversion(tempRecibida);
					
					int respuestaTemp = JOptionPane.showConfirmDialog(null, "�Desea realizar m�s conversiones?");
					if (JOptionPane.OK_OPTION == respuestaTemp) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						return; // Sale del programa si el usuario no desea m�s conversiones.
					}
					break;
					
					/**
					 * Si se ingresa un valor no v�lido (por ejemplo, una letra en lugar de un n�mero), 
					 * el programa mostrar� un mensaje de error y le pedir� al usuario que ingrese nuevamente el valor.
					 */
					
				default:
					JOptionPane.showMessageDialog(null, "Opci�n no v�lida. Intente nuevamente.");
										
					break;
					
					/**
					 * Puede repetir el proceso de conversi�n tantas veces como desee hasta que decida salir del programa.
					 */
			}
		}
	}
}
