/*
 * Examen|ej2Ex.java
 * 
 * Implementa un programa que solicite al usuario un número entero largo y positivo. Dicho programa obtendrá
 * dos enteros largos a partir de él, y los presentará por pantalla. Uno de ellos contendrá los dígitos pares
 * en el mismo orden en el que aparecen en el número de partida, y el otro contendrá los digitos impares en 
 * orden inverso al que aparecen en el número de partida.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej2Ex {
  public static void main (String[] args) {
    long numero;
    long pares=0;
    long impares=0;
    
    System.out.print("Introduzca el número largo positivo: ");
    numero = Long.parseLong(System.console().readLine());
    
    long aux = numero;
    int digito;
    long potencia10=1;
    
    while (aux > 0) {
      digito = (int)(aux % 10);
      if (digito %2 == 0) {
        pares = pares + digito*potencia10;
        potencia10 = potencia10*10;
      } else {
        impares = impares * 10 + digito;
      }      
      aux = aux / 10;
    }
	}
}

/*
 * entero numero
entero estiramiento

cadena de caracteres resultado=""


repetir
  captar numero
  si numero es 0
    mensajito		
mientras numero sea 0

si numero <0
 numero lo multiplico por -1
 mensajito2

repetir
  captar estiramiento
  si estiramiento es <=0
    mensajito3
mientras estiramiento sea <=0

auxiliar = numero

para cada digito de numero, mientras numero >0
  digito = resto del numero entre 10
  repetir estiramiento veces lo siguiente
    resultado = digito + resultado
  numero = cociente de numero entre 10

presentar resultado

 */
