/*
 * 
 * ej2T3.java
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
 * convertir debe ser introducida por teclado.
 * 
 * 
 * @authora Esther Hitos garcia
 */


public class ej2T3 {
	
	public static void main (String[] args) {
		double pesetas = 166.386;
		
		System.out.println("Convertidor de Euros a Pesetas");
		System.out.print("introduzca una cantidad en Euros porfabor: ");
		double euros = Integer.parseInt( System.console().readLine() );
		
		double resultado = euros*pesetas;
		System.out.println("la conversion de "+euros+" euros en pesetas es: "+resultado+"pts");
		
	}
}

