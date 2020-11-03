/*
 * ej5T2.java
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * 
 * @authora Esther Hitos Garcia
 */


public class ej5T2 {
	
	public static void main (String[] args) {
	
	double euros = 166.386;
	
	System.out.print("Introduce las pesetas:");
	int num = Integer.parseInt(System.console().readLine());
	int pesetas = num;
	
	double conversion = pesetas/euros;
	System.out.printf("%d pesetas dividido por %.3f euros.\n", pesetas, euros);
	System.out.println("La conversion en euros es:" +conversion);
		
	}
}

