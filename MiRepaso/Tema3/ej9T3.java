/*
 * ej9T3.java
 * 
 * Escribe un programa que calcule el volumen de un cono según la
 * fórmula V = (1/3)πr^2h
 * 
 * 
 */


public class ej9T3 {
	
	public static void main (String[] args) {
		final double  PI = 3.141592654 ;  
    // En lugar para definir una constante se podría usar
    // la constante Math.PI predefinida
    System.out.println( " Calculemos el Volumen de un cono " );
    System.out.print( " Introduce la altura (cm): " );
    double h = Double.parseDouble(System. console().readLine());
    System.out.print( " Introduzce el radio (cm): " );
    double r = Double.parseDouble(System. console().readLine());
    double v = ( 1.0 / 3.0 ) *  PI  * r * r * h;
    System.out.println( " El volumen del cono es de %.3d"  +   v +  " cm³ " );
	}
}

