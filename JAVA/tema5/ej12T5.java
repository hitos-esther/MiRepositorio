/*
 * Ejercicio 12 | Tema 5
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de 
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y 
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los 
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe 
 * introducir por teclado.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej12T5 {
	
	public static void main (String[] args) {
		int cifras; 
    
		do {
      System.out.print("Introduce un número ");
      cifras = Integer.parseInt(System.console().readLine());
		} while (cifras <= 2);
			int num1 = 0;
			int num2 = 1;
			int fibo = 0;
    
		System.out.print("Las primeras "+cifras+" de la serie de Fibonacci son: "+ num1+" "+num2+ " ");
			
		for (int i = 0; i < (cifras-2); i++){
			fibo = num1 + num2;
			System.out.print(" "+fibo+" ");
			num1 = num2;
			num2 = fibo;
		}
	}
}

