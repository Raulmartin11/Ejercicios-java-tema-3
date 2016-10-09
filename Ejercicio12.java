/**
 * Media de examenes
 * 
 * @author Raul Martin
 */
 
public class Ejercicio12 {
	public static void main(String[] args) {
		
		String linea;
		
		System.out.print("Nota del primer examen: ");
		linea = System.console().readLine();
		double nota1;
		nota1 = Integer.parseInt( linea );
		
		System.out.print("Nota deseada: ");
		linea = System.console().readLine();
		double media;
		media = Integer.parseInt( linea );
		
		double nota2;
		nota2 = (((media) - (nota1 * 0.4)) / 0.6);
		System.out.println("Tienes que sacar en el segundo examen: ");
		System.out.print(nota2);
	}
}
