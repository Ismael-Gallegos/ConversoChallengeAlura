package ParaMoneda;

import javax.swing.*;

/**
 * Esta clase contiene el método conversionMoneda,
 * que es el encargado de mostrar el menú de opciones para el "Conversor de Divisas"
 * y llamar a la clase ConversionMonedapara realizar la conversión seleccionada.
 * @author dora_
 *
 */

public class opcionConversionMoneda {
	
	ConversionMoneda monedas = new ConversionMoneda();
	
	public void ConversionMoneda(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elija la moneda en la que desea realizar la conversion", "Monedas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas",
						"De Pesos a Yen Japonés", "De Pesos a Won Sur-Coreano", 
						"De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos",
						"De Yen Japonés a Pesos", "De Won Sur-Coreano a Pesos"
						}, "Seleccion")).toString();
		
		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.PesosMexAdollar(valor);
			break;
						
		case "De Pesos a Euro":
			monedas.PesosMexAeuro(valor);
			break;
						
		case "De Pesos a Libras Esterlinas":
			monedas.PesosMexALibraEsterlina(valor);
			break;
			
			
		case "De Pesos a Yen Japonés":
			monedas.PesosMexAYenJapones(valor);
			break;
						
		case "De Pesos a Won Sur-Coreano":	
			monedas.PesosMexAwonSurcoreano(valor);
			break;			
			
		case "De Dólar a Pesos":
			monedas.dollarApesoMex(valor);
			break;		
			
		case "De Euro a Pesos":	
			monedas.EuroAPesosMex(valor);
			break;
			
		case "De Libras Esterlinas a Pesos":
			monedas.LibraEsterlinaAPesosMex(valor);
			break;		
			
		case "De Yen Japonés a Pesos":	
			monedas.YenJaponesAPesosMex(valor);
			break;		
			
		case "De Won Sur-Coreano a Pesos":	
			monedas.wonSurcoreanoAPesosMex(valor);
			break;
			
		}
	}
}
