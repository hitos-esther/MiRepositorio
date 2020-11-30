/*
 * ejercicio 13 | Tema 4
 * 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej13T4 {
	
	public static void main (String[] args) {
		int aux;
		
		System.out.println("Vamos a introducir tres numeros enteros y lo ordenamos de menor a mayor");
		System.out.print("Introduce el primer numero: \n");
		int num1=Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el segundo numero: \n");
		int num2=Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el tercer numero: \n");
		int num3=Integer.parseInt(System.console().readLine());
		
		if(num1 > num2){
			aux = num1;
			num1=num2;
			num2=aux;
		}
		if(num2 > num3){
			aux = num2;
			num2=num3;
			num3=aux;
			}
		if(num1 > num2){
			aux = num1;
			num1=num2;
			num2=aux;
		}
		System.out.println("El orden correcto de MENOR a MAYOR de los tres numeros son:");
		System.out.println("1º="+num1+", 2º="+num2+", 3º="+num3);
	}
}

