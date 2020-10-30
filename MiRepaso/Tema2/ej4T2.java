/*
 * ejercicio 4 | Tema 2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej4T2 {
	
	public static void main (String[] args) {
	double peset = 166.386;//numeros con mas de un decimal double

	System.out.println("Introduce los euros a convertir en pesetas: ");
	double euros = Integer.parseInt(System.console().readLine());
	
	double conversion = euros*peset;
	
	System.out.println("La cantidad en pesetas de los euros introducidos es:" +conversion);	
	}
}

