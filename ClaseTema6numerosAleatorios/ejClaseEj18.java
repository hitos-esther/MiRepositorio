/*
 * ejClaseEj18.java
 * 
 * Hacer un programa que repita 1000 veces lo sigueinte: 
 * elegir aleatoriamente 3 números entre el 1 y el 6 sin que se repitan, y contabilizarlos.
 * Al final, el programa debe decirnos cuántas veces ha salido el 1, el 2, ... y el 6. 
 * Para elegir aleatoriamente 3 números, utilice una de las siguientes opciones: 
 * OPCION A: 
 * - Repetir la generación de 3 números aleatorios entre 1 y 6 mientras haya coincidencias.
 * OPCION B: 
 * - Generar un número aleatorio entre 1 y 6 
 * - Repetir la generación un segundo número aleatorio entre 1 y 6 mientras se repita con el primero 
 * - Repetir la generación de un terecer número aleatorio entre 1 y 6 mientras se repita con el primero o con el segundo.
 * 
 * @authora Esther Hitos Garcia
 */


public class ejClaseEj18 {
	
	public static void main(String[] args) {
	
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int cuentanumeros = 0;
	
		do {
			num1=(int)(Math.random()*6+1);
			num2=(int)(Math.random()*6+1);
			num3=(int)(Math.random()*6+1);
			
		} while (!(cuentanumeros == a) || (cuentanumeros == b) || (cuentanumeros == c));
		for (int i = 0; i < 3; i++) {
	
			switch(a) {
			case 0:
			;
			break;
			case 1:
			;
			break;
			case 2:
			;
			break;
			default:
			}
			
			switch(b) {
			case 0:
			;
			break;
			case 1:
			;
			break;
			case 2:
			;
			break;
			case 3:
			;
			break;
			case 4:
			;
			break;
			case 5:
			;
			break;
			default:
			}
			switch(c) {
			case 0:
			;
			break;
			case 1:
			;
			break;
			case 2:
			;
			break;
			default:
			}
		}
	System.out.print(a+ ", " + b + ", " + c);
	}
}	


