/*
 * ej2T4.java
 * 
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos 
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las 
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej2T4 {
	
	public static void main (String[] args) {
		System.out.println("¿Me puedes decir que hora es porfabor?");
		int hora = Integer.parseInt(System.console().readLine());
		
		if ((hora >= 6) && (hora <= 12)){
			System.out.println("Buenos dias y gracias");
		}
		
		if ((hora >= 13) &&( hora <= 20)){
			System.out.println("Buenas tardes y gracias");
		}
		
		if ((hora >= 21) && (hora <=24)){
			System.out.println("Buenas noches y gracias");
		}
		
		if ((( hora >= 1) && (hora <= 5))){
			System.out.println("Buenas Madrugadas y gracias.");
		}
		
		if ((hora >= 0) && (hora <= 0)){
			System.out.println("Perdon, no te entiendo");
		}
	}
}
