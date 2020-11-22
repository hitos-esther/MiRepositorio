/**
 * Ejercicio 10 | Tema 5
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos 
 * introducidos por teclado. A priori, el programa no sabe cuántos números se 
 * introducirán. El usuario indicará que ha terminado de introducir los datos 
 * cuando meta un número negativo.
 * 
 * @authora Esther Hitos Garcia
 */
public class ej10T5 {
	public static void main (String[] args) {

    double num = 0;
    double dividendo = 0;
    double contador = 0;
      
      do{
        System.out.print("Introduce un número: ");
        num = Double.parseDouble(System.console().readLine());
        dividendo = dividendo + num;
        contador++;
      } while (num > 0);
      double media = (dividendo-num)/(contador-1);
      System.out.println("La media es: "+ media +" .");
  }
}
	


