/*
*ejercicio 5 | tema 1
*
*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asigna-
*tura de un color diferente.
*
*@authora Esther Hitos
*
*/

public class Ej5T1{
	public static void main( String args[]){
		System.out.println("\033[31m___________________________________________________________");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[31m|lunes","\033[32m|martes","\033[33m|miercoles","\033[34m|jueves","\033[35m|viernes","|");
		System.out.println("___________________________________________________________");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[31m|PRO" ,"\033[34m|SINF","\033[31m|PRO" ,"\033[31m|PRO" ,"\033[34m|SINF","|");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[31m|PRO" ,"\033[34m|SINF","\033[31m|PRO" ,"\033[31m|PRO" ,"\033[34m|SINF","|");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[32m|BBDD","\033[34m|SINF","\033[32m|BBDD","\033[31m|PRO" ,"\033[34m|SINF","|");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[32m|BBDD","\033[31m|PRO" ,"\033[35m|ED"  ,"\033[32m|BBDD","\033[36m|FOL" ,"|");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[33m|LM"  ,"\033[33m|LM"  ,"\033[35m|ED"  ,"\033[32m|BBDD","\033[36m|FOL" ,"|");
		System.out.printf("%-18s %-13s %-18s %-13s %-16s %-16s\n","\033[33m|LM"  ,"\033[33m|LM"  ,"\033[35m|ED"  ,"\033[32m|BBDD","\033[36m|FOL" ,"|");
	}
	
	
}

