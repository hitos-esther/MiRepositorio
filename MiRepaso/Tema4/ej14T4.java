/*
 * ej14T4.java
 * 
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej14T4 {
	
	public static void main (String[] args) {
		System.out.println("ES PAR EL NUMERO?");
		System.out.println("Y DIVISIBLE ENTRE 5?");
		System.out.print("Introduce un numero sin decimales: \n");
		int par=Integer.parseInt(System.console().readLine());
		if((par % 2)== 0){
			System.out.println("El numero SI es par!!!");
			}else{
				System.out.println("EL numero NO es par...");
				}
				
				if ((par % 5)==0){
					System.out.println("El numero SI es divisible entre 5");
					}else{
						System.out.println("El numero NO es divisible entre 5");
						}
	}
}

