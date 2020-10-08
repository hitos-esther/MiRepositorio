/**
 * NumerosEnteros.java
 * 
 * Ejercicio Prueba | Tema3
 *  Hacer un programa 2 numeros enteros y el resultado de estas operaciones
 *  suma,resta,producto,cociente entero y division entera
 *@autora Esther Hitos 1º DAW
 */
 
 public class NumerosEnteros{
  public  static  void  main ( String [] args ) {
  
    String linea;
    
    /* Recoge el primer número*/
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    
    /* Recoge el segundo número*/
    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt(linea);
    
    /* Realiza la operación y la muestra en pantalla */
    int total1 = primerNumero+segundoNumero;
    int total2 = primerNumero-segundoNumero;
    int total3 = primerNumero*segundoNumero;
    int total4 = primerNumero/segundoNumero;
    int total5 = primerNumero%segundoNumero;
    System.out.println();
    System.out.printf("%d + %d = %d\n", primerNumero, segundoNumero, total1);
    System.out.printf("%d - %d = %d\n", primerNumero, segundoNumero, total2);
    System.out.printf("%d * %d = %d\n", primerNumero, segundoNumero, total3);
    System.out.printf("%d / %d = %d\n", primerNumero, segundoNumero, total4);
    System.out.printf("%d %% %d = %d\n", primerNumero, segundoNumero, total5);
  }
}
