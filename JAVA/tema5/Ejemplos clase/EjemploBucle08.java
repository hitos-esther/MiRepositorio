 
 /*EjemploBucle08.java
 * Ejercicio 7 | Tema 5
 * @author Esther Hitos 1ºDAW
 * 
 * 
 * Apartir de un numero introducido por teclado
 *1
 *1 2 
 *1 2 3 4
 *1 2 3 4 5 6
 *1 2 3 4 5 6 7 8
 *1 2 3 4 5 6 7 8 9 10
 *
 * que salgan incrementado de dos numeros por fila
*/


import java.util.Scanner;

public class EjemploBucle08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int filas = 0;
        
        String lista = "";
        
		System.out.print("Introduce un numero porfabor:");
		filas = s.nextInt();
		
		for (int i = 1; i <=filas*2; i++) { 
			lista =lista+i+" ";
				if (i%2!=0){
				System.out.println(lista);
				}
			}
	}
}
