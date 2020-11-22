/**
 * Ejercicio 9 | Tema 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido 
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con 
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como 
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de 
 * esta manera, la única limitación en el número de dígitos la establece el tipo de 
 * dato que se utilice ( int o long ).
 * 
 * @authora Esther Hitos Garcia
 */
 
 public class ej9T5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número ");
    int num = Integer.parseInt(System.console().readLine());
    int i;
    for (i = 0; num > 0; i++){
      num = num/10;
    }
    System.out.println("El número tiene "+i+" cifras.");
  }
}
