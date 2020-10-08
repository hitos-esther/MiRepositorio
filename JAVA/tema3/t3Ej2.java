/**
 * t3Ej2.java
 * Ejercicio 2 | Tema 3
 * Recibe un número de pesetas y lo convierte a euros
 * @author Esther Hitos 1ºDAW
 */
 
 public class t3Ej2 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recibe el número de pesetas */
    System.out.print("Por favor, introduce una cantidad de pesetas: ");
    linea = System.console().readLine();
    int pesetas = Integer.parseInt(linea);
    /* Convierte las ptas en euros y los muestra */
    double euros = (double)(pesetas)*0.006;
    System.out.printf("%d ptas. son %.2f euros. \n", pesetas,euros);
  }
}
