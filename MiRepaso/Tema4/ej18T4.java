/*
 * ej18T4.java
 * 
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero 
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej18T4 {
	
	public static void main (String[] args) {
		int numero,primeracifra = 0;
		
		System.out.println("Programa para saber el primer numero introducido");
		System.out.println("Porfabor introduce hasta 5 numeros sin decimales");
		 numero = Integer.parseInt(System.console().readLine());
		
		if(numero < 10){
			primeracifra = numero;
			}
		if((numero>=10)&&(numero<100)){
			primeracifra = numero/10;
			}	
		if((numero>=100)&&(numero<1000)){
			primeracifra = numero/100;
			}	
		if((numero>=1000)&&(numero<10000)){
			primeracifra = numero/1000;
			}
		if((numero>=10000)&&(numero<100000)){
			primeracifra = numero/10000;
			}
		System.out.println("El PRIMER digito del numero introducido es : "+primeracifra);			
	}
}

