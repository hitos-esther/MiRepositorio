/*
 * ej6T3.java
 * 
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej6T3 {
	
	public static void main (String[] args) {
		//de esta manera consigo calcular enteros con flotantes
		float area = 0;
    int base = 5;
    int altura = 3;
		
		area = (float)(base*altura)/2;
		
		System.out.println("Un triangulo con base "+base+" y altura "+altura+" su area es " +area);
		
		
	}
}

