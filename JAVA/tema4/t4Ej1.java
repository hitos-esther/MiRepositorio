/**
 * t4Ej1.java
 * Ejercicio 1 | Tema 4
 * que pida dia de la semana y te diga la asignatura que toca
 * @author Esther Hitos 1ºDAW
 */
 
 public class t4Ej1 {
  public static void main ( String [] args ){
  /*Pide el dia de la semana*/
    System.out.print("Por favor, introduzca el dia de la semana: ");
     int diaSem = Integer.parseInt(Sistem.console().readLine());
     /* Switch para encontrar asignatura */
    String (diaSem){
       case "lunes":
        case "miércoles":
          System.out.print("Este dia de la semana Toca LM.");
          break;
        case "martes":
        case "jueves":
        case "viernes":
          System.out.print("Este dia de la semana Toca Programación.");
          break;
        case "sábado":
        case "domingo":
          System.out.print("No hay clase.");
        default:
          System.out.print("¿Qué parte de dia de la semana no entendiste?");
    
    }
    
  
  }
 
 }
