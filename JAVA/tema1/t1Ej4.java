/*
 * t1Ej4.java
 * 
 * Ejercicio 4 | Tema 1
 *  Muestra 10 palabras en inglés junto con la traducción al castellano.
 * Las palabras deben estar en 2 columnas y alineadas a la izquierda.
 * @autora Esther Hitos 1º DAW
 */

public class t1Ej4 {
  public static void main(String[] args) {
    System.out.println("Hora      Lunes      Martes      Miercoles      Jueves      Viernes");
    System.out.println("--------------------------------------------------------------------");
    System.out.printf("%s      %-8s      %-8s      %-8s      %-8s      %-8s\n",  "08.15", "Sistemas", "Prog", "Sistemas", "Prog", "Prog");
    System.out.printf("%s      %-8s      %-8s      %-8s      %-8s      %-8s\n",  "09.15", "Sistemas", "Prog", "Sistemas", "Prog", "Prog");
    System.out.printf("%s      %-8s      %-8s      %-8s      %-8s      %-8s\n",  "10.15", "Sistemas", "Prog", "Sistemas", "Prog", "Entorno");
    System.out.printf("%s      %-8s      %-8s      %-8s      %-8s      %-8s\n",  "11.45", "FOL", "BBDD", "Entorno", "BBDD", "Lenguaj");
    System.out.printf("%s      %-8s      %-8s      %-8s      %-8s      %-8s\n",  "12.40", "FOL", "BBDD", "Lenguaj", "BBDD", "Lenguaj");
    System.out.printf("%s      %-8s      %-8s      %-8s      %-8s      %-8s\n",  "13.35", "FOL", "BBDD", "Lenguaj", "BBDD", "Lenguaj");
  }
}
