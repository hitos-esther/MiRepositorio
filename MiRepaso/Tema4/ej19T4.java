/*
 * ej19T4.java
 * 
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que 
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @authora Esther Hitos Garcia 
 */


public class ej19T4 {
	
	public static void main (String[] args) {
		int numero,digito = 0;
		
		System.out.println("Programa para saber cuántos dígitos tiene un número entero");
		System.out.println("Porfabor introduce hasta 5 numeros sin decimales");
		 numero = Math.abs(Integer.parseInt(System.console().readLine()));//Método que nos permite calcular el valor absoluto de un número.
		
		if(numero < 10){
			digito = 1;
			}else if
			((numero>=10)&&(numero<100)){
			digito = 2;
			}else if
			((numero>=100)&&(numero<1000)){
			digito = 3;
			}	else if
			((numero>=1000)&&(numero<10000)){
			digito = 4;
			}else if 
			((numero>=10000)&&(numero<100000)){
			digito = 5;
			}
		System.out.println("El numero introducido tiene " +digito+ " digitos");
	}
}

