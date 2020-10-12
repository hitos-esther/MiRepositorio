/**
 * Ejercicio 3 | Tema 4
 * Pide un número y devuelve día de la semana.
 * @author Esther Hitos
 */
 
 public class t4Ej3 { // Clase principal
  public static void main(String[] args) {
  
  /* Recoge número */
    System.out.print("Por favor, introduce un número (del 1 al 7): ");
    int diaSem = Integer.parseInt(System.console().readLine());
    /* Switch para encontrar día */
    switch (diaSem){
        case 1:
          System.out.print("Lunes \n");
          break;
        case 2:
          System.out.print("Martes \n");
          break;
        case 3:
          System.out.print("Miercoles \n");
          break;
        case 4:
          System.out.print("Jueves \n");
          break;
        case 5:
          System.out.print("Viernes \n");
          break;
        case 6:
          System.out.print("Sabado \n");
          break;
        case 7:
          System.out.print("Domingo \n");
          break;
        default:
          System.out.print("¿Qué parte de número del 1 al 7 no entiendes? \n");
    }
  }
}
