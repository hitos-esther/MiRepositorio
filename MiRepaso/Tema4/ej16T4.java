/*
 * ej16T4.java
 * 
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos 
 * está siendo infiel. El programa irá haciendo preguntas que el usuario contestará 
 * con verdadero o falso. Cada pregunta contestada como verdadero sumará 3 
 * puntos. Las preguntas contestadas con falso no suman puntos. A continuación 
 * se listan las preguntas del test.
 * 
 * @authora Esther Hitos Garcia
 */


public class ej16T4 {
	
	public static void main (String[] args) {
		
		String respuesta;
		int puntos= 0;
		
		System.out.println("JUEGO DE LA FIDELIDAD");
		System.out.println("Introduzca -V- para Verdadero y -F- para Falso");
		System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("2. Ha aumentado sus gastos de vestuario");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("9. Has notado que últimamente se perfuma más");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		System.out.print("Respuesta: \n");
		respuesta = System.console().readLine();
		if(respuesta.equals("v")){
			puntos +=3;
			}
		if (puntos<=10){	
		System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		if ((puntos > 11) && (puntos <= 22)){
		System.out.println("Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");	
		}
		if ((puntos > 23) && (puntos<=30)){
		System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");	
		}		
	}
}

