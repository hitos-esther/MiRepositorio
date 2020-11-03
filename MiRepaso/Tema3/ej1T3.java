/*
 * ej1T3.java
 * 
 * Realiza un programa que pida dos números y que luego muestre 
 * el resultado de su multiplicación.
 * 
 * 
 * @authora Esther Hitos garcia
 */


public class ej1T3 {
	
	public static void main (String[] args) {
		String linea;
		
		System.out.println("¿Que numeros vamos a multiplicar?");
		System.out.print("introduzca el primer numero: ");
		linea = System.console().readLine();
		int num1=Integer.parseInt(linea);
		
		System.out.print("introduzca el segundo numero: ");
		linea = System.console().readLine();
		int num2=Integer.parseInt(linea);
		
		int resultado = num1*num2;
		System.out.println("El numero "+num1+" multiplicado por el "+num2+", da el total de:"+resultado);
		
	}
}

