/*
 * ej6T2.java
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base 
 * imponible (precio sin IVA). La base imponible estará almacenada en una variable.
 * 
 * 
 * @authora Esther Hitos Garcia
 */
public class ej6T2{
	public static void main(String[] args){
	
	double baseInponible= 40.20;//se le da el valor fijo a la base imponible
	//System.out.println("Introduce los euros a convertir en pesetas: ");//para introducir el usuario la baseInponuble
	//double baseInponible = Integer.parseInt(System.console().readLine());
	System.out.printf(" Base Imponible  %-8.2f\n ",baseInponible);
	System.out.printf("IVA ➟➟➟➟➟➟➟➟➟➟  %-8.2f\n ",(baseInponible * 0.21));
	System.out.println("-------------------------");
	System.out.printf(" Total ➟➟➟➟➟➟➟➟➟ %-8.2f\n",(baseInponible * 1.21));
	
	
	
	}
}
