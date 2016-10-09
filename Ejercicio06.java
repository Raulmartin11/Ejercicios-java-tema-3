/**
* calcular area de un triangulo
*
*@author Raul Martin
*/

public class Ejercicio06 {
	public static void main (String[] args) {
		
		String linea;
		
		System.out.print("Base del triangulo: ");
		linea = System.console().readLine();
		int base;
		base = Integer.parseInt( linea );
		
		System.out.print("Altura del triangulo: ");
		linea = System.console().readLine();
		int altura;
		altura = Integer.parseInt( linea );
		
		int area;
		area = (base * altura) /2;
		
		System.out.print("El area del triangulo es: ");
		System.out.println(area);
	}
}
