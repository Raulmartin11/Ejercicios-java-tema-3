/**
* Salario semanal
* 
* @author Raul Martin
*/

public class Ejercicio08 {
	public static void main(String[] args) {
		
		String linea;
		
		System.out.print("Numero de horas trabajadas al dia: ");
		linea = System.console().readLine();
		int horas;
		horas = Integer.parseInt( linea );
		
		System.out.print("Numero de dias trabajados: ");
		linea = System.console().readLine();
		int dias;
		dias = Integer.parseInt( linea );
		
		int salario;
		salario = (horas * dias) * 12;
		
		System.out.print("Si cobras 12 euros la horas, esta semanas has ganado: ");
		System.out.print(salario);
		System.out.println(" euros");
	}
}
