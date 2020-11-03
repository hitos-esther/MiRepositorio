/*
 * ejemplo de como cambiar una variable de numero entero (int) a double
 * 
 * 
 * @autora Esther Hitos Garcia
 */ 
public class casting{
	public static void main (String args[]){
	
	int x = 2;
	int y = 9;
	double division;
	
	division = (double) y / (double) x;
	// Descomenta la siguiente línea y observa cómo cambia el resultado.
	//division = y / x;
	System.out.println("El resultado de la división es " + division);
	
	}
}
