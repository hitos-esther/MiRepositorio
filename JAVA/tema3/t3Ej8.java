/**
 * t3Ej8.java
 * Ejercicio 8 | Tema 3
 * Calcula el salario semanal de un empleado en base a las horas trabajadas.
 * @author Esther Hitos 1ºDAW
 */
public class t3Ej8 { // Clase principal
  public static void main(String[] args) {
    String linea;
    int eurosHora = 12;
    /* Recibe horas trabajadas */
    System.out.print("Por favor, introduce las horas trabajadas: ");
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(linea);
    /* Calcula el salario y lo muestra */
    int totalSueldo = (eurosHora*horasTrabajadas);
    System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasTrabajadas, totalSueldo);
  }
}
