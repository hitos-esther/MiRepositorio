/**
 * BucleEjemploClase.java
 * Ejercicio 7 | Tema 2
 * @author Esther Hitos 1ºDAW
 
*Programa que pida al usuario (a) una frase y 
*(el) numero de veces que la va a repetir
*/

public class BucleEjemploClase{
	public static void main( String args[] ){
		String userMessage = " ";
		int cant = 0;
		System.out.printf("que vas a preguntar:");
		userMessage = System.console().readLine();
		System.out.printf("cuantas veces vas a preguntar:");
		cant = Integer.parseInt(System.console().readLine());
		
		for (int i=1; i<= cant; i++){
			
			System.out.println(userMessage);
			}
		
		
		}
}
