/*
 * ej12T3.java
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo 
 * examen de la asignatura Programación para obtener la media deseada. Hay 
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del 
 * segundo examen un 60%. 
 * Ejemplo 1: 
 * Introduce la nota del primer examen: 7 
 * ¿Qué nota quieres sacar en el trimestre? 8.5 
 * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen. 
 * Ejemplo 2: 
 * Introduce la nota del primer examen: 8 
 * ¿Qué nota quieres sacar en el trimestre? 7 
 * Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej12T3 {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce la nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce qué nota quieres sacar en el trimestre: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		double media = (( nota2 * 100 )-( nota1 * 40)/60);
		
		System.out.printf(" Necesitas sacar en el sigiente examen un %2.2f para tener un: %2.2f\n",media,nota2);
	}
}

