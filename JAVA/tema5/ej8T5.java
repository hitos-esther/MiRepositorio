/**
 * Ejercicio 8 | Tema 5
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * @authora Esther Hitos Garcia
 */


public class ej8T5 { // Clase principal
  public static void main(String[] args) {
		
    System.out.print("Introduce un número ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Tabla de multiplicar del "+num+"\n");
    for (int i = 1; i<= 10; i++){
      System.out.println(num+" x "+i+" = "+num*i);
    }
  }
}

