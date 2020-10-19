/**
 * BucleEjemploClase.java
 * Ejercicio 7 | Tema 2
 * @author Esther Hitos 1ºDAW
 
*Programa que realice diez sumas de 2 numeros cada una, 
* los cuales se pediran, en cada ocasion, al usuario.
* en cada pasada se han de pedir los dos numeros a sumar y mostrar el resultado de la suma.
*/



public class EjemploBucles02{
	public static void main( String args[] ){
		
		int num1;
		int num2;
		int suma;
		
		for (int i=1; i< 11; i++){
			System.out.println("introduce el primer numero:");
			num1 = Integer.parseInt(System.console().readLine());
			System.out.println("introduce el segundo numero:");
			num2 = Integer.parseInt(System.console().readLine());
		
		
			suma = num1 + num2;
			System.out.println("El resultado de la suma es:"+suma);
		}
		
		
	}
}
