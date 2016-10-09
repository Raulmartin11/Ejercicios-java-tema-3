/**
* Conversor de euros a pesetas por tecado
*
*@author Raul Martin
*/

public class Ejercicio02 {
	public static void main (String[] args) {
		
		String linea;
		
		double e = 1;
		double p = 166.386;
		
		System.out.print("Introduzca una cantidad de: ");
		linea = System.console().readLine();
		double numero1;
		numero1 = Integer.parseInt ( linea );
		
		double total;
		total = (( numero1 ) * 166.386 );
		System.out.println("Su valor en pesetas es: ");
		System.out.print(total);
	}
}

