/*
 * 
 * ejrcicio 2 | ejercicios cortos bucles
 * 
 * @authora Esther Hitos
 * 
 * 
 * Realice un programa que presente por pantalla 
 * una lista de números enteros consecutivos en orden creciente.
 * El programa pedirá la cantidad de números que se van a mostrar y a partir de qué número.
 * 
 * Introduzca la cantidad de números: 7
 * Introduzca el primer número: 19
 * 19-20-21-22-23-24-25
 * 
 * 
 * for (sentencias_inicio;expresion;incremento) {
  bloque_sentencias;
}
*/

import java.util.Scanner;

public class ej2Corto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 1;
        int inicio = num;
        
		System.out.print("Introduce un numero porfabor:");
		num = leer.nextInt();
		System.out.print("Introduzca el primer número:");
		inicio = leer.nextInt();
			
			
				for (int i=inicio; i<=num; ++i) { 
			
				System.out.print(i+"-");
		
		}
	}
}
