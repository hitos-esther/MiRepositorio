/**
 * BanderaAndalucia.java
 * 
 * Ejercicio Bandera | Trabajo en clase
 *  Crear una bandera ( BANDERA ITALIA )
 *@autora Esther Hitos 1º DAW
 */
/**
public class BanderaAndalucia{
  public  static  void  main ( String [] args ) { 
  System.out.println("  Bandera De Andalucia" );
   System.out.println("\033[42;30m");
   System.out.println("\033[47;30m");
   System.out.println("\033[42;30m");
  }
}
*/
public class BanderaAndalucia{
  public  static  void  main ( String [] args ) {


    String v ="\033[42m";
    String b ="\033[47m";
    String V= "\033[42m";
    
  
    
  System.out.println( "Bandera De Andalucia");
  System.out.println(v+"_______");
  System.out.println(v+"_______");
  System.out.println(b+"_______");
  System.out.println(v+"_______");  
  }
}


