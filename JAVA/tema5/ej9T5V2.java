/**
 * Ejercicio 9 (2ª versión)| Tema 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido 
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con 
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como 
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de 
 * esta manera, la única limitación en el número de dígitos la establece el tipo de 
 * dato que se utilice ( int o long ).
 * 
 * @authora Esther Hitos Garcia
 */


public class ej9T5V2 {
	
	public static void main (String[] args) {
		
		int numeroDeDigitos = 1, n, numeroIntroducido;

		System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
		numeroIntroducido = Integer.parseInt(System.console().readLine());
		
		n = numeroIntroducido;
			
			while (n > 10) {
				n /= 10;
				numeroDeDigitos++;
			}
		System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
	}
}

