/**
 * t3Ej11.java
 * Ejercicio 11 | Tema 3
 * Recibe una cifra en Kb y la convierte a Mb.
 * @author Esther Hitos 1ºDAW
 */
public class t3Ej11 { // Clase principal
  public static void main(String[] args) {
    String linea;
    int paso = 1024;
    /* Recibe numero de Kb */
    System.out.print("Por favor, introduceun número de Kb: ");
    linea = System.console().readLine();
    int kb = Integer.parseInt(linea);
    /* Calcula los Mb y los muestra */
    int total = kb/paso;
    System.out.printf("%d Kb son %d Mb. \n", kb, total);
  }
}
