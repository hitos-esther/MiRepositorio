/**
 * BucleEjemploClase.java
 * Ejercicio 7 | Tema 2
 * @author Esther Hitos 1ºDAW

Programa que escriba por pantalla la tabla de potencias de un número introducido por teclado.
*También se ha de pedir por teclado la cantidad de filas que ha de tener la tabla de potencias. 
* La tabla de potencias empezará por el primer número elevado a la primera potencia (1), 
* después lo hará elevadao a la segunda potencia (2), y así hasta llegar al segundo número.

2
7

2 ^ 1 = 2
2 ^ 2 = 4
...
2 ^ 7 = 128

---

2^3 = 2 * 2 * 2;
*/

public class EjemploBucles04{
	public static void main(String[] args){
		
		int result = 1;
		//*se pide numero donde sacamos la potencia
		System.out.print("Introduce un numero porfabor:");
		int numero = Integer.parseInt(System.console().readLine());
		
		//*pedimos numero de filas
		System.out.print("Introduce el numero de filas porfabor:");
		int fila = Integer.parseInt(System.console().readLine());
		
		for (int i = 1; i<=fila; i++) {
			result *=numero;//* esto es igual a: result = result * numero;
			
			System.out.println ("La potencia del numero:" + numero + "^"+ i + "es igual:" + result);
			
			}
		
		
		
		}
	
	
	
}
