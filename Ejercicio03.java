/**
* Conversor de pesetas a euros por tecado
*
*@author Raul Martin
*/

public class Ejercicio03 {
	public static void main (String[] args) {
		
		String linea;
		
		double e = 0.006;
		double p = 1;
		
		System.out.print("Cantidad de pesetas a conversar: ");
		linea = System.console().readLine();
		double numero1;
		numero1 = Integer.parseInt ( linea );
		
		double total;
		total = (( numero1 ) * e );
		System.out.println("Su valor en euros es: ");
		System.out.print(total);
	}
}
