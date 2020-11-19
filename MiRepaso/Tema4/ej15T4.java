/*
 * ej15T4.java
 * 
 * Copyright 2020 esther <esther@esther-PC>
 * 
 * 
 * 
 */


public class ej15T4 {
	
	public static void main (String[] args) {
	System.out.println("Este programa pinta una pirámide.");
	System.out.print("Introduzca un carácter de relleno: ");
	String a = System.console().readLine();
	
	System.out.println("1.dibujar caracteres hacia izquierda.");
	System.out.println("2.dibujar caracteres hacia abajo.");
	System.out.println("3.dibujar caracteres hacia derecha.");
	System.out.println("4.dibujar caracteres hacia arriba.");
	int dibujo = Integer.parseInt(System.console().readLine());
	
	
		switch(dibujo){
			
				case 1 :
				System.out.println("   "+a);
				System.out.println("  "+a+a);
				System.out.println(" "+a+a+a);
				System.out.println("  "+a+a);
				System.out.println("   "+a);
				break;
				
				case 2 :
				System.out.println(" "+a+a+a+a+a);
				System.out.println("  "+a+a+a);
				System.out.println("   "+a);
				break;
				
				case 3 :
				System.out.println(" "+a);
				System.out.println(" "+a+a);
				System.out.println(" "+a+a+a);
				System.out.println(" "+a+a);
				System.out.println(" "+a);
				break;
				
				case 4 :
				System.out.println("   "+a);
				System.out.println("  "+a+a+a);
				System.out.println(" "+a+a+a+a+a);
				break;
				}
			
	}
}

