/*
 * ej5T3.java
 * 
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej5T3 {
	
	public static void main (String[] args) {
		
		System.out.println("Introduzca en cm la base del rectangulo: ");
		double base = Integer.parseInt( System.console().readLine() );
		
		System.out.println("Introduzca en cm la altura del rectangulo: ");
		double altura = Integer.parseInt( System.console().readLine() );
		
		double area = base*altura;
		System.out.printf("El area del rectangulo es: \n" +area);
	}
}

