/**
* multiplicacion desde teclado
* 
* @author Raul Martin
*/

public class Ejercicio01 {
  public static void main (String[] args) {
	
	String linea;
	  
	System.out.print("Introduzca un numero: ");
	linea = System.console().readLine();
	int numero1;
	numero1 = Integer.parseInt( linea );
	
	System.out.print("Introduzca otro numero:");
	linea = System.console().readLine();
	int numero2;
	numero2 = Integer.parseInt ( linea );
	
	int total;
	total = (numero1 * numero2);
	System.out.println("El primer numero es " + numero1 + " El segundo numero es " + numero2);
	System.out.print("Su multiplicacion es ");
	System.out.print(total);
	}
}
	
