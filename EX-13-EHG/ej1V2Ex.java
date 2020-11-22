/*
 * 
 * ej1V2.java
 * 
 * Implemente un programa que solicite al usuario un par de números, que se corresponderán con el 
 * número de filas y el número de columnas de un tablero. Dicho tablero deberá presentarse por consola "al 
 * estilo" de los tableros de ajedrez. Para pintar la cuadrícula "rellena" puede utilizar dos caracteres "cuadrícula 
 * rellena". El carácter cuadrícula rellena es: █. Vea los siguientes ejemplos:
 * 
 * @authora Esther Hitos Garcia
 */
 


public class ej1V2Ex {
	
	public static void main (String[] args) {
		int filas, columnas;
   
    do {
      System.out.print("Introduzca el número de filas (1-20): ");
      filas = Integer.parseInt(System.console().readLine());
      if (!((filas>0) && (filas<=20))) {
        System.out.print("Valor fuera de rango. ");
      }
    } while (!((filas>0) && (filas<=20)));
    
    do {
      System.out.print("Introduzca el número de columnas (1-20): ");
      columnas = Integer.parseInt(System.console().readLine());
      if (!((columnas>0) && (columnas<=20))) {
        System.out.print("Valor fuera de rango. ");
      }
    } while (!((columnas>0) && (columnas<=20)));
    
    System.out.println();
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++){
        if ((i+j)%2==0) {
          System.out.print("██");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    
  }
}
	


