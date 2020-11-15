/*
 * Ejercicio 6 | Tema 5
 
 * Imprime los números de 320 a 160 de 20 en 20 (con do while).
 
 * @author Esther Hitos Garcia
 */
 
 public class ej6T5 { // Clase principal
  public static void main(String[] args) {
    int i = 320;
    do {
      System.out.print(i+" ");
      i=i-20;
    }
    while (i>=160);
  }
}
