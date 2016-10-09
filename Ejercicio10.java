/**
* Pasar de Mb a Kb
* 
*@author Raul Martin
*/

public class Ejercicio10 {
	public static void main (String[] args) {
		
		int Mb = 1;
		int Kb = 1024;
		
		String linea;
		
		System.out.print("Intruduzca el numero de Mb: ");
		linea = System.console().readLine();
		int mb;
		mb = Integer.parseInt( linea );
		
		int total;
		total = (mb * Kb);
		
		System.out.print("En Kb son: ");
		System.out.println(total);
	}
}
