package ParaMoneda;

import javax.swing.*;

/**
 * Esta clase contiene los métodos para realizar las conversiones de moneda entre pesos mexicanos y diferentes monedas extranjeras, 
 * como dólares, euros, libras esterlinas, yenes japoneses y wones surcoreanos.
 * @author dora_
 *
 */

public class ConversionMoneda {
	
	/**
	 * Valores de conversion de mi moneda a las Extranjeras.
	 * @param valor
	 */
	
	public void PesosMexAdollar(double valor) {
		double dollar = valor / 16.94;
		dollar = (double)Math.round(dollar * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes: $ " + dollar + " Dolares");
	}
	
	public void PesosMexAeuro(double valor) {
		double Euro = valor / 18.90;
		Euro = (double)Math.round(Euro * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes: $" + Euro + " Euros");
	}
	
	public void PesosMexALibraEsterlina(double valor) {
		double LibraEsterlina = valor / 21.84;
		LibraEsterlina = (double)Math.round(LibraEsterlina * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes: $" + LibraEsterlina + " Libras Esterlinas");
	}
	
	public void PesosMexAYenJapones(double valor) {
		double yenJapones = valor / 0.12;
		yenJapones = (double)Math.round(yenJapones * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes: $" + yenJapones + " Yenes Japoneses");
	}
	
	public void PesosMexAwonSurcoreano(double valor) {
		double wonSurcoreano = valor / 0.013;
		wonSurcoreano = (double)Math.round(wonSurcoreano * 100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes: $" + wonSurcoreano + " Wones Sur-Coreanos");
	}
	
	
	/**
	 * Valores de conversion de moneda Extranjera a mi moneda.
	 * @param valor
	 */
	
		public void dollarApesoMex (double valor) {
			double dollar = valor * 16.94;
			dollar =(double)Math.round(dollar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Equivalen a: $" + dollar + " Pesos Mexicanos");
		}
		public void EuroAPesosMex(double valor) {
			double Euro = valor * 18.90;
			Euro = (double)Math.round(Euro * 100d) /100;
			JOptionPane.showMessageDialog(null, "Equivalen a: $" + Euro + " Pesos Mexicanos");
		}
		
		public void LibraEsterlinaAPesosMex(double valor) {
			double LibraEsterlina = valor * 21.84;
			LibraEsterlina = (double)Math.round(LibraEsterlina * 100d) /100;
			JOptionPane.showMessageDialog(null, "Equivalen a: $" + LibraEsterlina + " Pesos Mexicanos");
		}
		
		public void YenJaponesAPesosMex(double valor) {
			double yenJapones = valor * 0.12;
			yenJapones = (double)Math.round(yenJapones * 100d) /100;
			JOptionPane.showMessageDialog(null, "Equivalen a: $" + yenJapones + " Pesos Mexicanos");
		}
		
		public void wonSurcoreanoAPesosMex(double valor) {
			double wonSurcoreano = valor * 0.013;
			wonSurcoreano = (double)Math.round(wonSurcoreano * 100d) /100;
			JOptionPane.showMessageDialog(null, "Equivalen a: $" + wonSurcoreano + " Pesos Mexicanos");
		}
}
