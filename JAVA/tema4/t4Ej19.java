/**
 * Ejercicio 19 | Tema 4
 * Número de cifras de un número entero.
 * @author Esther Hitos
 */
 
 public class t4Ej19 { // Clase principal
  public static void main(String[] args) {
	  
    System.out.print("Por favor, introduce un número entero (max. 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    if (num > 100000){
      System.out.print("La cifra debe tener como máximo 5 cifras.");
      
      // Divide hasta que num < 10)
    } else {
      int contador = 1;
      num = num/10;
      if (num < 10){
        contador++;
        System.out.print("El número tiene " + contador + " cifras.");
      } else {
        contador++;
        num = num/10;
        if (num < 10){
          contador++;
          System.out.print("El número tiene " + contador + " cifras.");
        } else {
          contador++;
          num = num/10;
          if (num < 10){
            contador++;
            System.out.print("El número tiene " + contador + " cifras.");
          } else {
            contador++;
            num = num/10;
            if (num < 10){
              contador++;
              System.out.print("El número tiene " + contador + " cifras.");
            } else {
              contador++;
              num = num/10;
              System.out.print("El número tiene " + contador + " cifras.");
            }
          }
        }
      }
    }
  }
}
