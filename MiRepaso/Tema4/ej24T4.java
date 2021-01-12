/*
 * ej24T4.java
 * 
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado 
 * según las siguientes condiciones:
 *  
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe 
 *   de proyecto), los días que ha estado de viaje visitando clientes durante el   
 *   mes y su estado civil (1 - Soltero, 2 - Casado). 
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según 
 *   si se trata de un prog. junior, un prog. senior o un jefe de proyecto 
 *   respectivamente. 
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en 
 *   concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de 
 *   un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * @Authora Esther Hitos Garcia
 */


public class ej24T4 {
	
	public static void main (String[] args) {
		System.out.println("1 - Prog. junior");
		System.out.println("2 - Prog. senior");
		System.out.println("3 - Jefe de Proyecto");
		System.out.println("Introduzca el cargo del empleado (1-3): ");
		int cargo = Integer.parseInt(System.console().readLine());
		
		double sueldo=0;
		
		switch(cargo){
			case 1:
				junior = 950;
				break;
			case 2:
				senior = 1200;
				break;
			case 3:
				jefe = 1600;
				default:
				System.out.print("No exixte el cargo prueba otra vez");
			}
		
		System.out.print
	}
}

