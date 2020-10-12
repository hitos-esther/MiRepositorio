/**
 * Ejercicio 8 | Tema 4
 * Calcula la media de tres notas y dice la nota del boletín.
 * @author Esther Hitos
 */
 
 public class t4Ej8 { // Clase principal
  public static void main(String[] args) {
	  
    String boletin = "a";
    
    /* Recibe notas */
    System.out.print("Por favor, introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    /* Calcula la media */
    double media = (nota1+nota2+nota3)/3;
    
    /* if para decir la nota */
    if (media < 5){
      boletin = "insuficiente \n";
    } else if (media < 6){
      boletin = "suficiente \n";
    } else if (media < 7){
      boletin = "bien \n";
    } else if (media < 9){
      boletin = "notable \n";
    } else if (media <= 10){
      boletin = "sobresaliente \n";
    } else {
      System.out.println("Una de las notas es incorrecta, vuelve a introducirlas. \n");
    }
    System.out.printf("Su nota en el boletín es un: %s. \n", boletin);
  }
}
