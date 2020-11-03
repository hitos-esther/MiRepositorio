/*
 * ej10T3.java
 * 
 * Realiza un conversor de Mb a Kb
 * 
 * @authora Esther Hitos Garcia
 */


public class ej10T3 {
	
	public static void main (String[] args) {
		int Kb= 1024;
		
		System.out.println("Conversion de Megabyte a Kilobyte");
		System.out.print("Introduze los Mb : ");
		int Mb = Integer.parseInt( System.console().readLine() );
		
		int conv = Mb * Kb;
		System.out.println("El resultado de " +Mb+ " Mb es: " +conv+ " Kb");
	}
}

