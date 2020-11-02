/*
 * ej8T3.java
 * 
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base a 
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @authora Esther Hitos Garcia
 */

 import java.util.Scanner;
public class ej8T3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hora = 12;
		
		System.out.print("Cuantas horas trabajaste esta semana?\n");
		System.out.print("Lunes? ");
		int lunes = s.nextInt();
		System.out.print("Martes? ");
		int martes = s.nextInt();
		System.out.print("Miercoles? ");
		int miercoles = s.nextInt();
		System.out.print("Jueves? ");
		int jueves = s.nextInt();
		System.out.print("Viernes? ");
		int viernes = s.nextInt();
		int totalhoras = lunes+martes+miercoles+jueves+viernes;
		int horasTrabajadas = totalhoras*hora;
		
		System.out.print("Esta semana trabajaste " +totalhoras+ " Horas.\n");
		System.out.print("Se pagara a " +hora+ " euros la hora.\n");
		System.out.println("Tu sueldo de esta semana es: " +horasTrabajadas+ " Euros.");
		
	}
}

