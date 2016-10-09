/**
* Pasar de Kb a Mb
* 
*@author Raul Martin
*/

public class Ejercicio11 {
	public static void main (String[] args) {
		
		double Mb = 0.001024;
		int Kb = 1;
		
		String linea;
		
		System.out.print("Intruduzca el numero de Kb: ");
		linea = System.console().readLine();
		int kb;
		kb = Integer.parseInt( linea );
		
		double total;
		total = (kb * Mb);
		
		System.out.print("En Mb son: ");
		System.out.println(total);
	}
}
