/*EjemploBucle09.java
 * Ejercicio 9 | Tema 5
 * @author Esther Hitos 1ºDAW
 * 
 * 
 * Apartir de un numero introducido por teclado
 *	   1
 *	  123 
 *   12345
 *	1234566
 * 123556789
 *1236567891011
 *
 * que salgan incrementado de dos numeros por fila
*/



 import java.util.Scanner;
public class EjemploBucle09 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
			int total = 0;
			
		
		System.out.print("Por favor, introduzca el numero de la altura de la pirámide:");
			int numaltura = s.nextInt();
			
			// inserta espacios en -1 para que me 
			for (int i = 1; i <=numaltura; i++) {
			System.out.println(" ");
				
				// pinta la línea de números
			for (int j = 1; j <=numaltura-i; j++)
			System.out.print(" ");
			
					for(int k = 1; k<=(i*2)-1; k++){
					total = k;
					System.out.print(total);
					}
			}			System.out.println(" ");
						
	}
						

}
