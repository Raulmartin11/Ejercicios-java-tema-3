/**
 * Factura
 * 
 * @author Raul Martin
 */
 
public class Ejercicio07 {
	public static void main(String[] args) {
		
		String linea;
		
		System.out.print("Precio del objeto: ");
		linea = System.console().readLine();
		double precio;
		precio = Integer.parseInt( linea );
		
		double total;
		total = precio * 1.21;
		System.out.print("Factura total: ");
		System.out.println(total);
	}
}
