/*
 * ej23T4.java
 * 
 * Escribe un programa que calcule el precio final de un producto según su 
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, 
 * reducido o super reducido) y el código promocional. Los tipos de IVA general, 
 * reducido y super reducido son del 21%, 10% y 4% respectivamente. Los códigos 
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan 
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad, 
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se 
 * muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * @Authora Esther Hitos Garcia
 * 
 */


public class ej23T4 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la base imponible (precio sin iva):  ");
		double baseimp = Double.parseDouble(System.console().readLine());
		
		System.out.print("Introduzca el tipo de IVA (general=21%)(reducido=10%)(super-reducido=4%):  ");
		String tipoIVA = System.console().readLine();
		
		System.out.print("Introduzca el codigo promocional (mitad)(nopro)(meno5)(5porc):  ");
		String promo = System.console().readLine();
		
		//calculo del tipo dse iva
		int tipoIVANum = 0;
		
		switch(tipoIVA){
			case "general":
				tipoIVANum = 21;
			break;
			case "reducido":
				tipoIVANum = 10;
			break;
			case "super-reducido":
				tipoIVANum = 4;
			break;
			default:
			System.out.println("El tipo de IVA introducido no es correcto.");
		}
			double iva = baseimp * tipoIVANum / 100;
			double precioSinDescuento = baseimp + iva;
		
		//calculo de descuentos
		
		double descuento = 0;
		switch(promo){
			case "nopro":
				break;
			case "mitad": // el precio se reduce a la mitad
				descuento = precioSinDescuento / 2;
				break;
			case "meno5": // se descuentan 5 euros
				descuento = 5;
				break;
			case "5porc": // se descuenta el 5%
				descuento = precioSinDescuento * 0.05;
				break;
			default:
				System.out.println("El código promocional introducido no es correcto.");
		}
		double total = precioSinDescuento - descuento;
System.out.printf("Base imponible -------%6.2f\n", baseimp);
System.out.printf("IVA (%2d%%) ------------%6.2f\n", tipoIVANum, iva);
System.out.printf("Precio con IVA -------%6.2f\n", precioSinDescuento);
System.out.printf("Cód. promo. (%5s) --%6.2f\n", promo, descuento);
System.out.printf("TOTAL ----------------%6.2f", total);
	}
}

