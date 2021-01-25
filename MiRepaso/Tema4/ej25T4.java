/*
 * ej25T4.java
 * 
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la 
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio 
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de 
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio 
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío 
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 * 
 * Ejemplo 1: 
 * Introduzca la altura de la bandera en cm: 20 
 * Ahora introduzca la anchura: 35 
 * ¿Quiere escudo bordado? (s/n): n 
 * Gracias. Aquí tiene el desglose de su compra. 
 * Bandera de 700 cm2: 7,00 €
 * Sin escudo: 0,00 € 
 * Gastos de envío: 3,25 € 
 * Total: 10,25 € 
 * 
 * Ejemplo 2: 
 * Introduzca la altura de la bandera en cm: 10 
 * Ahora introduzca la anchura: 15 
 * ¿Quiere escudo bordado? (s/n): s 
 * Gracias. Aquí tiene el desglose de su compra. 
 * Bandera de 150 cm2: 1,50 € 
 * Con escudo: 2,50 € 
 * Gastos de envío: 3,25 € 
 * Total: 7,25 €
 * 
 * @Authora Esther Hitos Garcia
 */
import java.util.Scanner;

public class ej25T4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la altura de la bandera en cm: ");
		int altura = Integer.parseInt(s.nextLine());
		System.out.print("Ahora introduzca la anchura: ");
		int anchura = Integer.parseInt(s.nextLine());
		System.out.print("¿Quiere escudo bordado? (s/n): ");
		boolean conEscudo = ((s.nextLine()).toLowerCase()).equals("s");
		
		String escudoCadena;
		float precioEscudo;
		
		if (conEscudo){
		escudoCadena = "Con escudo";
		precioEscudo= 2.50f;
		} else {
		escudoCadena= "Sin escudo";
		precioEscudo	= 0;
		}
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
		System.out.printf("%s:%5.2f €\n", escudoCadena, precioEscudo);
		System.out.printf("Gastos de envío:%5.2f €\n", 3.25);
		System.out.printf("Total:%5.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);
		}
}

