/*
 * ej7T3.java
 * 
 * Escribe un programa que calcule el total de una 
 * factura a partir de la base imponible.
 * 
 * @authora Esther Hitos Garcia
 */

	import java.util.Scanner;
public class ej7T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la base imponible de tu factura: \n");
		double baseimponible = s.nextDouble();
		System.out.println("Ahora calculare el total de tu factura....");
		
		double iva = baseimponible*0.21;
		double total = baseimponible*1.21;
		System.out.printf(" Base Imponible  %-8.2f\n ",baseimponible);
		System.out.printf("IVA ➟➟➟➟➟➟➟➟➟➟  %-8.2f\n ",iva);
		System.out.println("-------------------------");
		System.out.printf(" Total ➟➟➟➟➟➟➟➟➟ %-8.2f\n",total);
		
	}
}

