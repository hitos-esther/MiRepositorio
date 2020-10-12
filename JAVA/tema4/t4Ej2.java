/**
 * Ejercicio 2 | Tema 4
 * Pide día de la semana y devuelve asignatura que hay a primera hora.
 * @author Esther Hitos
 */
 
 public class t4Ej2 { // Clase principal
  public static void main(String[] args) {
 
 /* Recoge la hora */
    System.out.print("Por favor, introduce la hora (con un número entero, sin minutos): ");
    int hora = Integer.parseInt(System.console().readLine());
    /* Calcula el tramo en el que está */
    if ((hora >= 6)&&(hora <= 12)){
      System.out.print("Buenos días.\n");
    } 
    else if ((hora >= 13)&&(hora <= 20)){
      System.out.print("Buenas tardes.\n");
    } 
    else if ((hora >= 21)&&(hora <= 23)){
      System.out.print("Buenas noches.\n");
    } 
    else if ((hora >= 0)&&(hora <= 5)){
      System.out.print("Buenas noches.\n");
    } 
    else {
      System.out.print("Porfabor introduce una hora con numeros enteros.\n");
    }
  }
}
