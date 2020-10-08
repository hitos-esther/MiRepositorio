/**
 * t3Ej3.java
 * Ejercicio 3 | Tema 3
 * Recibe un número de pesetas y lo convierte a euros
 * @author Esther Hitos 1ºDAW
 */
 
public class t3Ej3 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recibe el número de euros */
    System.out.print("Por favor, introduce una cantidad de euros: ");
    linea = System.console().readLine();
    double euros = Double.parseDouble(linea);
    /* Convierte los euros en ptas. y las muestra */
    int pesetas = (int)(euros*166.86);
    System.out.printf("%.2f euros son %d ptas. \n", euros, pesetas);
  }
}
