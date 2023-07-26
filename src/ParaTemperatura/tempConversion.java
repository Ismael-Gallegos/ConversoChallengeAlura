package ParaTemperatura;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene los métodos para realizar las conversiones entre diferentes escalas de temperatura,
 * como Celsius, Fahrenheit y Kelvin
 * @author dora_
 *
 */

public class tempConversion {
	
	public void ConversorCelsiusFahrenheit (double valor) {
		double CelsiusFah = (valor * 1.8) + 32;
		CelsiusFah = (double)Math.round(CelsiusFah * 100d)/100;
		JOptionPane.showMessageDialog(null, "Equivale a: " + CelsiusFah + "° Fahrenheit");
	}
	public void ConversorCelsiusKelvin(double valor) {
		double CelsiusKel = valor + 273.15;
		CelsiusKel = (double)Math.round(CelsiusKel * 100d)/100;
		JOptionPane.showMessageDialog(null, "Equivale a: " + CelsiusKel + "° Kelvin");
	}
	
	
	public void ConversorFahrenheitCelsius(double valor) {
		double fahreCelsius = (valor - 32) + (0.556);
		fahreCelsius = (double)Math.round(fahreCelsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "Equivale a: " + fahreCelsius + "° Celsius");
	}
	public void ConversorFahrenheitKelvin(double valor) {
		double fahreKel = (valor + 459.67) * (0.556);
		fahreKel = (double)Math.round(fahreKel * 100d)/100;
		JOptionPane.showMessageDialog(null, "Equivale a: " + fahreKel + "° Kelvin");
	}
	
	
	public void ConversorKelvinCelsius(double valor) {
		double kelvCelsius = valor - 273.15;
		kelvCelsius = (double)Math.round(kelvCelsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "Equivale a: " + kelvCelsius + "° Celsius");
	}
	public void ConversorKelvinFahrenheit(double valor) {
		double kelvFahren = ((valor - 273.15) * (1.8)) + 32;
		kelvFahren = (double)Math.round(kelvFahren * 100d)/100;
		JOptionPane.showMessageDialog(null, "Equivale a: " + kelvFahren + "° Fahrenheit");
	}
}
