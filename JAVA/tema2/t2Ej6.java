/**
 * t2Ej6.java
 * Ejercicio 6 | Tema 2
 * Calcula el total de una factura a partit de la base imponible.
 * @author Esther Hitos 1ºDAW
 */
 
 public class t2Ej6 { // Clase principal
  public static void main(String[] args) {
    int IVA = 21;
    int baseImp = 100;
    int totalFac = ((baseImp*IVA/100)+baseImp);
    
    System.out.printf("El total sin IVA es: "+baseImp+".\n");
    System.out.printf("El total con IVA es: "+totalFac+".\n");
    
  }
}
