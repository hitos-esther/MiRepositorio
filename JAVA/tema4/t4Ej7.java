/**
 * Ejercicio 7 | Tema 4
 * Calcula la media de tres notas.
 * @author Esther Hitos
 */
 
 public class t4Ej7 { // Clase principal
  public static void main(String[] args) {
  
    /* Recibe notas */
    System.out.print("Por favor, introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    /* Calcula la media y la muestra */
    double media = (nota1+nota2+nota3)/3;
    System.out.printf("La media de %.2f, %.2f y %.2f = %.2f \n", nota1, nota2, nota3, media);
    
  }
}
