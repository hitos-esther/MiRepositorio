/**
 * t3Ej6.java
 * Ejercicio 6 | Tema 3
 * Recibe la altura y base de un triángulo y calcula su área.
 * @author Esther Hitos 1ºDAW
 */
 public class t3Ej6 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recibe la altura del triángulo */
    System.out.print("Por favor, introduce la altura del triángulo: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    /* Recibe la base del triángulo */
    System.out.print("Por favor, introduce la base del triángulo: ");
    linea = System.console().readLine();
    double base = Double.parseDouble(linea);
    /* Calcula el área y la muestra */
    double area = (base*altura)/2;
    System.out.println("La anchura del rectángulo de ("+base+"x"+altura+") es: "+area);
  }
}
