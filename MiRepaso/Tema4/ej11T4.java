/*
 * ej11T4.java
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule 
 * los segundos que faltan para llegar a la medianoche.
 * 
 * 
 * @authora Esther Hitos Garcia
 */


public class ej11T4 {
	
	public static void main (String[] args) {
		
		
		System.out.println("Introduce la hora porfabor: ");
		int hora =Integer.parseInt(System.console().readLine());
		System.out.println("Introduce los minutos porfabor: ");
		int minu =Integer.parseInt(System.console().readLine());
		
		int segundosHora = (hora * 3600) + (minu * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosHora;
            
    System.out.println("Desde las " + hora + ":" + minu + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    //System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos\n", hora, minu, segundosHastaMedianoche);
	}
}

