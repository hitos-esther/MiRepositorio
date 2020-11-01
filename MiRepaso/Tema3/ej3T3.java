/*
 * ej3T3.java
 * 
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @authora Esther Hitos Garcia
 */

 import java.util.Scanner;
public class ej3T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double x = 166.386;
		
		System.out.println("Convertidor de Pesetas a Euros");
		System.out.print("Introduce las Pesetas a convertir: ");
    int pesetas = Integer.parseInt(s.nextLine());
    
    double resultado = pesetas/x; 
    System.out.printf("La conversion de "+pesetas+" pesetas en euros es: %.2f Euros\n",resultado);
	}
}

