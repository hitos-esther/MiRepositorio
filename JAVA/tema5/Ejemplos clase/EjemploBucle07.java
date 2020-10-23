/*
 * EjemploBucle07.java
 * Ejercicio 7 | Tema 5
 * @author Esther Hitos 1ºDAW
 * 
 * 
 * Apartir de un numero introducido por teclado
 *1
 *1 2 
 *1 2 3
 *1 2 3 4
 *1 2 3 4 5
 *
 *que salgan incrementado por fila de uno en uno
*/

import java.util.Scanner;

public class EjemploBucle07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int filas = 0;
        String lista = "";
        
		System.out.print("Introduce un numero porfabor:");
		filas = s.nextInt();
		
			for (int i = 1; i <=filas; i++) { 
			lista =lista+i+" ";
			System.out.println(lista);
			}
		
		}
}
