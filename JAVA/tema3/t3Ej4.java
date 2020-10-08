/**
 * t3Ej4.java
 * Ejercicio 4 | Tema 3
 * Recibe dos números y los suma, resta, multipica y divide
 * @author Esther Hitos 1ºDAW
 */
 
 public class t3Ej4 { // Clase principal
  public static void main(String[] args) {
    String linea;
    /* Recoge el primer número*/
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    double x = Double.parseDouble(linea);
    /* Recoge el segundo número*/
    System.out.print("Por favor, introduce otro número: ");
    linea = System.console().readLine();
    double y = Double.parseDouble(linea);
    /* Calcula los resultados y los muestra */
    System.out.println("x = " +x+"  y = "+y);
    System.out.println("x+y = "+(x+y)+"  x-y = "+(x-y));
    System.out.println("x*y = "+(x*y)+ "  x/y = "+(x/y));
  }
}
