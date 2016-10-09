/**
* calcular area de un rectanglo
*
*@author Raul Martin
*/

public class Ejercicio05 {
	public static void main (String[] args) {
		
		String linea;
		
		System.out.print("Base del rectangulo: ");
		linea = System.console().readLine();
		int base;
		base = Integer.parseInt( linea );
		
		System.out.print("Altura del rectangulo: ");
		linea = System.console().readLine();
		int altura;
		altura = Integer.parseInt( linea );
		
		int area;
		area = base * altura;
		
		System.out.print("El area del rectangulo es: ");
		System.out.println(area);
	}
}
