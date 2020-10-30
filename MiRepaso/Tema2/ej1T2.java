/*
 * Ejercicio 1 | tema 2
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y . Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * 
 * @autora Esther Hitos Garcia
 */ 
public class ej1T2{
	public static void main (String [] args){
	int x = 144;
	int y = 999;
	
	int suma = x + y;
	System.out.println("El resultado de la suma de 144 entre 999 es: " + suma);
	int resta = x-y;
	System.out.println("El resultado de la resta de 144 entre 999 es: " + resta);
	int div = x/y;
	System.out.println("El resultado de la division de 144 entre 999 es: " + div);
	int mult = x*y;
	System.out.println("El resultado de la multiplicación de 144 entre 999 es: " + mult);
	
	
	}
}
