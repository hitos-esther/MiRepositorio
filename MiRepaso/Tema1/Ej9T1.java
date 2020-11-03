/*
 * Ejercicio 9 | tema 1
 * 
 * Escribe un programa que pinte por pantalla alguna escena - el campo, la
 * habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
 * - un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
 * caracteres como *, +, <, #, @, etc. o incluso caracteres Unicode. ¡Échale
 * imaginación!
 * 
 * @authora Esther Hitos Garcia
 * 
 */


public class Ej9T1 {
	
	public static void main (String[] args) {
	String colorReset = "\033[39;49m";
		
	System.out.println("\033[31m    ■■■■■■■■"+ colorReset);
	System.out.println("\033[31m ■■┛        ┗■■"+ colorReset);
	System.out.println("\033[31m█    ●    ●    █"+ colorReset);
	System.out.println("\033[31m█      ╰╯      █"+ colorReset);
	System.out.println("\033[31m█_    ╰✱✱╯   _ █"+ colorReset);
	System.out.println("\033[31m┗■■■       ■■■┛"+ colorReset);
	System.out.println("\033[31m     █■■■■█"+ colorReset);	
	}
}

