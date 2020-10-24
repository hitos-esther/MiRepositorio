/*
 *ejrcicio 1 | ejercicios cortos bucles
 * Escribe una programa que muestre tu nombre por pantalla.
 * @authora Esther Hitos
 *
 *Realice un programa que presente por pantalla una lista de números enteros consecutivos en orden creciente,
 *desde el 0 en adelante. El programa pedirá la cantidad de números que se van a mostrar.
 *
 *  Introduzca la cantidad de números: 7
 *  1-2-3-4-5-6-7
 */
 
 import java.util.Scanner;

public class ej1Corto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        
        
		System.out.print("Introduce un numero porfabor:");
		num = leer.nextInt();
		
			for (int i = 1; i <=num; i++) { 
			
			 System.out.print(i+"-");
			}
		
		}
}
