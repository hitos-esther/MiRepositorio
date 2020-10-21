/*
*BucleEjemploClase.java
 * Ejercicio 5 | Tema 5
 * @author Esther Hitos 1ºDAW
* 
Escribe un programa que calcule la media 
de un conjunto de 10 números positivos
introducidos por teclado. 
Haga que el programa "recuerde" los 10 números introducidos, 
haciendo uso de una concatenación acumulada en un String. 
Los números pueden separarse, en ese String acumulado, por guiones.
*
*/
	import java.util.Scanner;
 public class EjemploBucle05 { // Clase principal
  public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 
		int contar = 0;
		int suma = 0;
		int n;
		String numeros="";
		
		//*se pide numero donde sacamos la potencia
		for (int i = 1; i<=10; i++){
		System.out.print("Introduce un numero porfabor:");
			n=s.nextInt();
			contar++;
			suma=suma+n;
			numeros=numeros+n+"-";
			}
	
	System.out.print("Numeros: "+numeros);
	System.out.print("Contador:"+contar);
	System.out.print("Media:"+(double)suma/contar);
		
	 

      
    }
  }
