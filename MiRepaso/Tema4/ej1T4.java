/*
 * ej1T4.java
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué 
 * asignatura toca a primera hora ese día.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej1T4 {
	
	public static void main (String[] args) {
		
		String dia;
		
		System.out.println("¿Quieres saber que asignatura toca a primera hora ?");
		System.out.println("introduce el dia de la semana:");
		dia = (System.console().readLine());
		
		dia.toLowerCase(); // convierto a minúsculas todas las letras como en el ejemplo del libro
		
		switch(dia){
			case "lunes":
				System.out.println("Programacion");
				break;
			
			case "martes":
				System.out.println("sistemas informaticos");
				break;
		
			case "miercoles":
				System.out.println("Programacion");
				break;
				
			case "jueves":
				System.out.println("Programacion");
				break;
			
			case "viernes":
				System.out.println("sistemas informaticos");
				break;
			
			default:
			System.out.println("El dia introducido no es dia lectivo");	
				
		}
		
	}
}

