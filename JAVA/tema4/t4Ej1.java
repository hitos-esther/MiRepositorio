/**
 * Ejercicio 1 | Tema 4
 * Pide día de la semana y devuelve asignatura que hay a primera hora.
 * @author Esther Hitos
 */

public class t4Ej1 { // Clase principal
  public static void main(String[] args) {
    
    String diaSem;
    /* Recoge dia de la semana */
    System.out.print("Por favor, introduce un dia de la semana: ");
    diaSem = System.console().readLine().toLowerCase();
    /* Switch para encontrar asignatura */
    switch (diaSem){
        case "lunes":
        case "miércoles":
          System.out.print("Hay Sistemas Informáticos.\n");
          break;
        case "martes":
        case "jueves":
        case "viernes":
          System.out.print("Hay Programación.\n");
          break;
        case "sábado":
        case "domingo":
          System.out.print("No hay clase.\n");
        default:
          System.out.print("¿Qué parte de dia de la semana no entendiste?\n");
    }
  }
}
