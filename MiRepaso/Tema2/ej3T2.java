/*
 * ejercicio 3 | tema 2
 * 
 * Crea las variables nombre , direccion y telefono y asígnales los valores correspon-
 * dientes. Muestra los valores de esas variables por pantalla de tal forma que el
 * resultado del programa sea el mismo que en el ejercicio 2.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej3T2 {
	
	public static void main (String[] args) {
		
	String nombre = "Esther Hitos Garcia";
	String direcc = "C/ Alegria nº de la suerte";
	int telef = 12345678;
	String ColorReset = "\033[39;49m";
	
	System.out.println("\033[31;45m Mi nombre:" +nombre+ColorReset );//se pinta todo el bloque
	System.out.println("\033[31;45m Mi dirección:" +ColorReset+direcc);//solo se pinta lo entrecomillado
	System.out.println("\033[31;45m Mi telefono:"+ColorReset+telef);
	System.out.print(ColorReset);	
		
	}
}

