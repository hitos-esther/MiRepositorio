/*
 * ej4T4.java
 * 
 * Realiza un programa que resuelva una ecuación de primer 
 * grado (del tipo ax+b = 0 ). 
 * 
 * Ejemplo 1: 
 * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 
 * Por favor, introduzca el valor de a: 2 
 * Ahora introduzca el valor de b: 1 
 * x = -0.5
 *  
 * Ejemplo 2: 
 * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 
 * Por favor, introduzca el valor de a: 0 
 * Ahora introduzca el valor de b: 7 
 * Esa ecuación no tiene solución real.
 *
 * 
 * @authora Esther Hitos Garcia
 */


public class ej5T4 {
	
	public static void main (String[] args) {
		System.out.println("Programa que resuelve ecuaciones de primer grado  ax + b = 0");
    System.out.print("Introduce el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
		
	

