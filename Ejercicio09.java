/**
 *  Calcula el volumen
 * 
 * @author Raul Martin
 */
 
 public class Ejercicio09 {
	 public static void main (String[] args) {
		 
		 String linea;
		 
		 System.out.print("Valor del radio: ");
		 linea = System.console().readLine();
		 int r;
		 r = Integer.parseInt( linea );
		 
		 System.out.print("Altura del cono: ");
		 linea = System.console().readLine();
		 int h;
		 h = Integer.parseInt( linea );
		 
		 double volumen;
		 volumen = ((3.14 / 3) + (r * r) * h);
		 
		 System.out.print("El volumen del cono es: ");
		 System.out.println(volumen);
	 }
}
