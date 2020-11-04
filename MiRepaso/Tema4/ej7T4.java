/*
 * ej7T4.java
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej7T4 {
	
	public static void main (String[] args) {
		System.out.println("Introduce la nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce la nota del segundo examen: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce la nota del tercer examen: ");
		double nota3 = Double.parseDouble(System.console().readLine());
		
		double media = (nota1+nota2+nota3)/3;
		
		System.out.printf("El calculo de la media de las tres notas es: %.2f \n",media);
	}
}



