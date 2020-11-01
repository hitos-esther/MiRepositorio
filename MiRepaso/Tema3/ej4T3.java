/*
 * ej4T3.java
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números 
 * introducidos por teclado.
 * 
 * @authora Esther Hitos Garcia
 */

 import java.util.Scanner;
public class ej4T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int num1 = Integer.parseInt(s.nextLine());
		
		System.out.print("Introduce otro numero: ");
		int num2 = Integer.parseInt(s.nextLine());
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicar = num1 * num2;
		double dividir = num1 / num2;
		
		System.out.println(" ____________________________");
		System.out.println("| SUMA | RESTA | MULT | DIVI |");
		System.out.println("|------|-------|------|------|");
		System.out.printf( "| %-5d| %4d  |%4d  | %.2f |\n",+suma,+resta,+multiplicar,+dividir);
		System.out.println(" ----------------------------");
	}
}

