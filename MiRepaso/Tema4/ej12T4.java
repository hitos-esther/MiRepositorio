/*
 * ej12T4.java
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas 
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El 
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a 
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos 
 * en las diferentes asignaturas del curso.
 * 
 * 
 */


public class ej12T4 {
	
	public static void main (String[] args) {
		String respuesta;
		int resultado = 0;
		System.out.println("─━─━─━─━─━─━─━─━─━─━─━─━─━─━─━─━");
		System.out.println("|CUESTIONARIO ASIGNATURA 1ºDAW|");
		System.out.println("─━─━─━─━─━─━─━─━─━─━─━─━─━─━─━─━");
		
		System.out.println("1. ¿Es obligatorio utilizar la sentencia default en una estructura switch?");
		System.out.print("a) Sí si ningún valor cumple la condición\nb) Sí, pero solo para valores enteros\nc) No, no es obligatorio\n");
		System.out.print("Respuesta: ");
		respuesta= System.console().readLine();
		if(respuesta.equals("c")){
			resultado++;
			}
		System.out.println("2. ¿¿Cuál es la precisión de un tipo de dato int?");
		System.out.print("a) 8 bit\nb) 16 bit\nc) 32 bit\n");
		System.out.print("Respuesta: ");
		respuesta= System.console().readLine();
		if(respuesta.equals("c")){
			resultado++;
			}
		System.out.println("2. Si la variable b es de tipo byte y fue declarada anteriormente, ¿Cuál es el valor de b tras esta operación?");
		System.out.println("─━─━─━─━─━─━─━─━─━─━─━─━─");
		System.out.println("b += 2+(2*Byte.MAX_VALUE);");
		System.out.println("─━─━─━─━─━─━─━─━─━─━─━─━─");
		System.out.print("a) Es imposible saberlo sin saber el valor inicial de b\nb) Exception\nc) El valor que tenga inicialmente b\n");
		System.out.print("Respuesta: ");
		respuesta= System.console().readLine();
		if(respuesta.equals("c")){
			resultado++;
			}
		System.out.println("Tu puntuación es :"+resultado);	
	}
}

