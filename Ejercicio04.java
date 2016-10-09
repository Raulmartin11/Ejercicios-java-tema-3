/**
* calculos aritmeticos por teclado
*
*@author Raul Martin
*/

public class Ejercicio04 {
	public static void main (String[] args) {
		
		String linea;
		
		System.out.print("Introduzca un numero: ");
		linea = System.console().readLine();
		double numero1;
		numero1 = Integer.parseInt( linea );
		
		System.out.print("Intruduzca otro numero: ");
		linea = System.console().readLine();
		double numero2;
		numero2 = Integer.parseInt( linea );
		
		double total;
		total = numero1 + numero2;
		
		double total2;
		total2 = numero1 - numero2;
		
		double total3;
		total3 = numero1 * numero2;
		
		double total4;
		total4 = numero1 / numero2;
		
		System.out.print("La suma de los dos numeros es igual a: ");
		System.out.println(total);
		
		System.out.print("La resta de los dos numeros es igual a: ");
		System.out.println(total2);
		
		System.out.print("La multiplicacion de los dos numeros es igual a: ");
		System.out.println(total3);
		
		System.out.print("La division de los dos numeros es igual a: ");
		System.out.println(total4);
	}
}
