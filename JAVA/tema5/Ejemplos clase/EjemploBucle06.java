/*
 * BucleEjemploClase.java
 * Ejercicio 6 | Tema 5
 * @author Esther Hitos 1ºDAW
 * 
 * 
 * Escribe un programa que pida al usuario un número entero.
 * Si el número es par, debe presentar su tabla de multiplicar (del 1 al 10).
 * Si el número es impar, debe presentar su tabla de sumar (1 al 10).
*/

import java.util.Scanner;

public class EjemploBucle06{
	public static void main(String[] ARGS){
		Scanner obtenerNumero = new Scanner(System.in);
		int numero,i,j;

		System.out.print("indica la tabla de multiplicar: ");
		numero = obtenerNumero.nextInt();


			for(j = 1; j <= 10; j++){
									
			System.out.println(numero + " X " + j + " = " + numero*j);
			}
				System.out.println();

		}
}
