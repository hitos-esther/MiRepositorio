/*
 * ej10T4.java
 * 
 * Escribe un programa que nos diga el horóscopo a partir 
 * del día y el mes de nacimiento.
 * 
 * https://estilonext.com/estilo-de-vida/horoscopo-fechas
 * 
 * @authora Esther Hitos Garcia
 */

import java.util.*;
public class ej10T4 {
	
	public static void main (String[] args) {
		System.out.println("-------JUEGO DEL HOROSCOPO--------");
		System.out.println("Introduce tu fecha de nacimiento en este orden.... ");
		System.out.print("Introduzca el numero del mes de su nacimiento: ");
		int mes = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el numero del dia de su nacimiento: ");
		int dia = Integer.parseInt(System.console().readLine());
		
		
		String horoscopo = "erróneo, revisa los datos porque algo hiciste mal.";
		
		 switch (mes){
      case 1:
        if ((dia >=1)&&(dia <= 19)){
          horoscopo = "Capricornio ♑";
        }
        else if ((dia >=20)&&(dia <= 31)){
          horoscopo = "Acuario ♒";
        }
        break;
      case 2:
        if ((dia >=1)&&(dia <= 18)){System.out.print("Por favor, introduce el mes de nacimiento (número): ");
          horoscopo = "Acuario ♒";
        }
        else if ((dia >=19)&&(dia <= 29)){
          horoscopo = "Piscis ♓";
        }
        break;
      case 3:
        if ((dia >=1)&&(dia <= 20)){
          horoscopo = "Piscis ♓";
        }
        else if ((dia >=21)&&(dia <= 31)){
          horoscopo = "Aries ♈";
        }
        break;
      case 4:
        if ((dia >=1)&&(dia <= 19)){
          horoscopo = "Aries ♈";
        }
        else if ((dia >=20)&&(dia <= 30)){
          horoscopo = "Tauro ♉";
        }
        break;
      case 5:
        if ((dia >=1)&&(dia <= 20)){
          horoscopo = "Tauro ♉";
        }
        else if ((dia >=21)&&(dia <= 31)){
          horoscopo = "Géminis ♊";
        }
        break;
      case 6:
        if ((dia >=1)&&(dia <= 20)){
          horoscopo = "Géminis ♊";
        }
        else if ((dia >=21)&&(dia <= 30)){
          horoscopo = "Cáncer ♋";
        }
        break;
      case 7:
        if ((dia >=1)&&(dia <= 22)){
          horoscopo = "Cáncer ♋";
        }
        else if ((dia >=23)&&(dia <= 31)){
          horoscopo = "Leo ♌";
        }
        break;
      case 8:
        if ((dia >=1)&&(dia <= 22)){
          horoscopo = "Leo ♌";
        }
        else if ((dia >=23)&&(dia <= 31)){
          horoscopo = "Virgo ♍";
        }
        break;
      case 9:
        if ((dia >=1)&&(dia <= 22)){
          horoscopo = "Virgo ♍";
        }
        else if ((dia >=23)&&(dia <= 30)){
          horoscopo = "Libra ♎";
        }
        break;
      case 10:
        if ((dia >=1)&&(dia <= 22)){
          horoscopo = "Libra ♎";
        }
        else if ((dia >=23)&&(dia <= 30)){
          horoscopo = "Escorpio ♏";
        }
        break;
      case 11:
        if ((dia >=1)&&(dia <= 21)){
          horoscopo = "Escorpio ♏";
        }
        else if ((dia >=22)&&(dia <= 30)){
          horoscopo = "Sagitario ♐";
        }
        break;
      case 12:
        if ((dia >=1)&&(dia <= 22)){
          horoscopo = "Sagitario ♐";
        }
        else if ((dia >=22)&&(dia <= 30)){
          horoscopo = "Capricornio ♑";
        }
				break;
			default:
				horoscopo = "no existe ese mes";

		}
		System.out.println("Tu Horoscopo es: "+horoscopo);
	}
}

