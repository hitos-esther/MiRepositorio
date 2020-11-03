/*
 * ej8T2.java
 * 
 * Escribe un programa que declare 5 variables de tipo char . A continuación, crea 
 * otra variable como cadena de caracteres y asígnale como valor la concatena-ción 
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres 
 * por pantalla ¿Qué problemas te encuentras? que si quiero hacer alguna oeracion matematica
 * tengo que poner que es flotante para que me haga la operacion 
 * ¿cómo lo has solucionado?
 * poniendolo en dos salidas diferentes
 * 
 * @authora Esther Hitos Garcia
 */


public class ej8T2 {
	
	public static void main (String[] args) {
	char telefono ='☏';
	char cantidad ='4';
	char precio ='2';
	char cafe ='☕';
	char paz ='☮';
	int cuesta = 4*2;
	
	
	System.out.println("Quiero un "+cafe+" llamo por "+telefono+" a la tienda y me dan "+paz+" porque tienen en stock voy a comprar:");
	System.out.printf(cantidad+" paquetes y me cuesta "+precio+" euros, el total es:%d Euros\n",+cuesta);	
	}
}

