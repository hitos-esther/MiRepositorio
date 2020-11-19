/*
 * Examen|ej1Ex.java
 * 
 * [1,75 puntos] Implemente un programa que solicite al usuario un par de números, 
 * que se corresponderán con el número de filas y el número de columnas de un tablero. 
 * Dicho tablero deberá presentarse por consola "al estilo" de los tableros de ajedrez. 
 * Para pintar la cuadrícula "rellena" puede utilizar dos caracteres "cuadrícula rellena". 
 * El carácter cuadrícula rellena es: █. Vea los siguientes ejemplos:
 * 
 * 
 */


public class ej3Ex {
	
	public static void main (String[] args) {
		String nombre;
		
		System.out.print("Introduce el nombre del articulo: ");
		nombre = (System.console().readLine());
		
		System.out.print("Introduce el precio con iva): ");
		double precio = Double.parseDouble(System.console().readLine());
		
		System.out.print("Cantidad que quieres del producto: ");
		double cant = Double.parseDouble(System.console().readLine());
		
		double iva1= 1.04;
		double iva2= 1.10;
		double iva3= 1.21;
		double total = cant + precio;
		
		
		System.out.println("Total factura con distintos tipos de iva de IVA");
		System.out.printf( "Total➟➟➟➟➟➟➟➟➟➟➟➟➟➟  %-8.2f\n ",total );
		System.out.println("----------------------------------------------");
		System.out.printf( "base imponible  %4:%8.2f       %-8.2s\n ",iva3,total-0.04);
		System.out.printf( "base imponible %10:%8.2f       %-8.2f\n ",iva2,total-0.10);
		System.out.printf( "base imponible %21:%8.2f       %-8.2f\n ",iva3,total-0.21);
		
	}
	
	
}

