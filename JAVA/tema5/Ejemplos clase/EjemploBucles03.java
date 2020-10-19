/**
 * BucleEjemploClase.java
 * Ejercicio 7 | Tema 2
 * @author Esther Hitos 1ºDAW
 
* Programa que escriba por pantalla la tabla de multiplicar de un número introducido por teclado. 
* También se ha de pedir por teclado la cantidad de filas que ha de tener la tabla de multiplicar. 
* La tabla de multiplicar empezará por multiplicar el primer número introducido por 1, 
* después lo hará por 2, y así hasta llegar al segundo número.
*/



public class EjemploBucles03{
	public static void main( String args[] ){
		
		int num1;
		int num2;
		int tabla;
		
		for (int i=1; i< 11; i++){
			System.out.println("introduce el numero de la tabla:");
			num1 = Integer.parseInt(System.console().readLine());
			System.out.println("introduce por lo que quieres multiplicar:");
			num2 = Integer.parseInt(System.console().readLine());
		
		
			tabla = num1 * num2;
			System.out.println("El resultado de la suma es:"+tabla);
		}
		
		
	}
}

