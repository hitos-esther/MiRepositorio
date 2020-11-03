/*
 * ej11T3.java
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej11T3 {
	
	public static void main (String[] args) {
		double Mb= 1024;
		
		System.out.println("Conversion de Kilobyte a Megabyte");
		System.out.print("Introduze los Kb : ");
		double Kb = Double.parseDouble( System.console().readLine() );
		
		double conv = Kb / Mb;
		System.out.printf("El resultado de " +Kb+ " Kb es: " +conv+ " Mb\n");
	}
}

