/*
 * Ex13ehg1.java
 * 
 * Implemente un programa que solicite al usuario la posición en la que se encuentra un caballo en un
tablero de ajedrez. El programa deberá informar de las posiciones a las que puede moverse. Las posiciones
han de indicarse (tanto en la entrada de datos como en la salida) en formato columna-fila, separando ambas
componentes por un guion. Y debe asegurarse de que la coordenada introducida es válida (el programa no
puede reventar), de forma que si el usuario introduce una coordenada incorrecta para la posición del caballo,
le volverá a pedir dicha coordenada hasta que introduzca una que sea válida. Observe los siguientes
ejemplos:
 * 
 * @Authora Esther Hitos Garcia 16/12/2020
 */


public class Ex13ehg1 {
	
	public static void main (String[] args) {
		// se definen constantes para representar el
		// contenido de las celdas
		final String RESET = "\033[0m";
		final String INVERSO = "\033[7m";
		final String BLANCA = " ";
		final String NEGRA = INVERSO + BLANCA + RESET;
		final String CABALLO = "♞ "; 
		final String MOVIMIENTOBLANCO = "◉ "; 
		final String MOVIMIENTONEGRO = INVERSO + MOVIMIENTOBLANCO + RESET;
		String[][] tablero = new String[9][9]; // la fila 0 y la columna 0 no se utilizan
		int fila;
		int columna;
		String casilla;
		
		// pinta el tablero vacío
		System.out.println("\n ��������������������");
		casilla = BLANCA;
		for(fila = 8; fila >= 1; fila--) {
			System.out.print( fila + " ��");
			for(columna = 1; columna <= 8; columna++) {
				if ((fila % 2) == 1) { // fila impar
					if ((columna % 2) == 1) { // columna impar
						casilla = BLANCA;
					} else { // columna par
						casilla = NEGRA;
					}
				} else { // fila par
				if ((columna % 2) == 1) { // columna impar
					casilla = NEGRA;
				} else { // columna par
					casilla = BLANCA;
				}
			}
			System.out.print(casilla);
			tablero[fila][columna] = casilla;
		}
		System.out.println("��");
	}
	System.out.println("��������������������");
	System.out.println("a b c d e f g h");


	// pide las coordenadas
	System.out.print("\nIntroduzca la posición del Caballo, por ejemplo d5: ");
	String posicionCaballo = System.console().readLine();
	int columnaCaballo = (int)(posicionCaballo.charAt(0)) - 96;
	int filaCaballo = (int)(posicionCaballo.charAt(1)) - 48;
	
	if ((((filaCaballo % 2) + (columnaCaballo % 2)) % 2) == 0) {
		tablero[filaCaballo][columnaCaballo] = CABALLO;
	}else {
			tablero[filaCaballo][columnaCaballo] = INVERSO + CABALLO + RESET;
	}

		// pinta el tablero con el Caballo y las posiciones hacia donde puede moverse
		System.out.println("\n ��������������������");
		for(fila = 8; fila >= 1; fila--) {
			System.out.print( fila + " ��");
			for(columna = 1; columna <= 8; columna++) {
				if ((Math.abs(filaCaballo - fila) == Math.abs(columnaCaballo - columna)) && (! ((filaCaballo == fila) && (columnaCaballo == columna)))) {
					if (tablero[fila][columna] == BLANCA) {
						tablero[fila][columna] = MOVIMIENTOBLANCO;
					} else {
						tablero[fila][columna] = MOVIMIENTONEGRO;
					}
			}
			System.out.print(tablero[fila][columna]);
		}
		System.out.println("��");
		}
		System.out.println("��������������������");
		System.out.println("a b c d e f g h");

		System.out.println("\nEl Caballo puede moverse a las siguientes posiciones:");
		
		for(fila = 8; fila >= 1; fila--) {
			for(columna = 1; columna <= 8; columna++) {
				if ((Math.abs(filaCaballo - fila) == Math.abs(columnaCaballo - columna)) && (! ((filaCaballo == fila) && (columnaCaballo == columna)))) {
					System.out.print((char)(columna + 96) + "" + fila + " ");
				}
			}
		}
	}
}

