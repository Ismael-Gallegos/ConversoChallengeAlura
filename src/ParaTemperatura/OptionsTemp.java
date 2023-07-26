package ParaTemperatura;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene el método tempConversion,
 * que muestra el menú de opciones para el "Conversor de Escalas de Temperatura"
 * y llama a la clase TempConversionpara realizar la conversión seleccionada
 * @author dora_
 *
 */

public class OptionsTemp {
	
	tempConversion temperatura = new tempConversion();
	
	public void tempConversion(double valor) {
		
	String opcion =(JOptionPane.showInputDialog(null, 
			"Elija la escala de temperatura que desea convertir ", "Escalas", 
			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
							"De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"}, 
					"Selección")).toString();
	
	switch (opcion) {
	case "De Celsius a Fahrenheit":
		temperatura.ConversorCelsiusFahrenheit(valor);
		break;
	
	case "De Celsius a Kelvin": 
		temperatura.ConversorCelsiusKelvin(valor);
		break;
		
	case "De Fahrenheit a Celsius":
		temperatura.ConversorFahrenheitCelsius(valor);
		break;
		
	case "De Fahrenheit a Kelvin":
		temperatura.ConversorFahrenheitKelvin(valor);
		break;
		
	case "De Kelvin a Celsius":
		temperatura.ConversorKelvinCelsius(valor);
		break;
		
	case "De Kelvin a Fahrenheit":
		temperatura.ConversorKelvinFahrenheit(valor);
		break;
	}
	}
}
