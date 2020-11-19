/*
 * ej2Ex.java
 * 
 * Implemente un programa que solicite al usuario un número entero largo y positivo. Dicho programa
obtendrá dos enteros largos a partir de él, y los presentará por pantalla. Uno de ellos contendrá los dígitos
pares en el mismo orden en el que aparecen en el número de partida, y el otro contendrá los dígitos impares
en orden inverso al que aparecen en el número de partida. Vea los siguientes ejemplos:
 * 
 * @authora Esther Hitos Garcia
 */


public class ej2Ex {
	
	public static void main (String[] args) {
	
		long cuentanumeros = 0; 
		
			System.out.print("Introduzca el numero largo y positivo: ");
				long numerointroducido = Long.parseLong(System.console().readLine());
		
		
		while(cuentanumeros >= 0) {
			cuentanumeros++; // Incrementa en uno la variable	
		}
		
		System.out.print("Las cifres pares del " +numerointroducido+ " son: ");
		
	}
}

