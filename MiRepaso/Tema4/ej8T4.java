/*
 * ej8T4.java
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente, 
 * suficiente, bien, notable o sobresaliente).
 * 
 * 
 * @authora Esther Hitos Garcia
 */


public class ej8T4 {
	
	public static void main (String[] args) {
		
		
		System.out.println("Introduce la nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce la nota del segundo examen: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduce la nota del tercer examen: ");
		double nota3 = Double.parseDouble(System.console().readLine());
		
		double media = (nota1+nota2+nota3)/3;
		
		System.out.printf("El calculo de la media de las tres notas es: %.2f ",media);
		
		if (media <  5 ) {
			System.out.println("Insuficiente");
		}
		
		if ((media >=  5 ) && (media <  6 )) {
			System.out.println("Suficiente");
		}
		
		if ((media >=  6 ) && (media <  7 )) {
			System.out.println("Bien");
		}
		
		if ((media >=  7 ) && (media <  9 )) {
			System.out.println("Notable");
		}
		
		if (media >= 9 ) {
			System.out.println("Sobresaliente");
		}
		
	}
}

