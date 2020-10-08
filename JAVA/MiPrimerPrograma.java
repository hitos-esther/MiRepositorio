public class MiPrimerPrograma {
	public static void main ( String[] args) {
  System.out.println("Hola, es mi primer programa.");
	System.out.print("La suma de 3 y 5 es:");
	System.out.print(3+5);
  
  System.out.println();
  /*
  System.out.print("\033[33m mandarina");
  System.out.print("\033[32m hierba");
  System.out.print("\033[31m tomate");
  System.out.print("\033[37m sábanas");
  System.out.print("\033[36m cielo");
  System.out.print("\033[35m nazareno");
  System.out.print("\033[34m mar");
  
  System.out.println();
  */
  System.out.printf("El número entero:%d - Valor segundo entero: %6.2f\n",3,58.0);
  
  System.out.println();
  
  System.out.println(" Artículo Precio/caja Nº cajas");
  System.out.println("-----------------------------------------");
  System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
  System.out.printf("%-10s %8.2f %6d\n", "peras", 2.75, 120);
  System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
}
  
}


