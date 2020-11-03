/*
 * ej3T4.java
 * 
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el 
 * correspondiente nombre del día de la semana.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej3T4 {
	
	public static void main (String[] args) {
		
		
		System.out.println("         MENU SEMANAL               ");
		System.out.print("Elige un numero del 1 al 7 Porfabor: ");
		int dia = Integer.parseInt(System.console().readLine());
		
		String diaSemanal;
		
		switch(dia){
			case 1:
				diaSemanal = "lunes";
				break;
			case 2:
				diaSemanal = "Martes";
				break;
			case 3:
				diaSemanal = "Miercoles";
				break;
			case 4:
				diaSemanal = "Jueves";
				break;
			case 5:
				diaSemanal = "Viernes";
				break;
			case 6:
				diaSemanal = "sabado";
				break;
			case 7:
				diaSemanal = "domingo";
				break;
		default :
				diaSemanal = "No hay mas dias que numerar a la semana!!!";
		}
		System.out.println("El " +dia+ " corresponde a " +diaSemanal);
	}
}

