/*
 * Ejercicio 2 | Tema 5
 
 * Imprime todos los múltiplos de 5 del 0 al 100 (con while).
 
 * @authora Esther Hitos Garcia
 */
 
 public class ej2T5 { // Clase principal
  public static void main(String[] args) {
    int i = 1;
    while (i<=100){
      if (i%5==0){
        System.out.print(i+" ");
      }
      i++;
    }
  }
}
