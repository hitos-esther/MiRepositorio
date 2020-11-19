/*
 * ej1.1Ex.java
 * 
 * 
 * @authora Esther Hitos Garcia
 */


public class ej3V2Ex{
	
	public static void main (String[] args) {
		 String nombreArticulo1;
			double precioArticulo1;
			int cantidadArticulo1;
    
	 /*recoge el nombre,precio,cantidad articulo1*/
	System.out.print("introduce el nombre articulo 1 : ");
    nombreArticulo1 = System.console().readLine();
    
    System.out.print("introduce el precio articulo 1 : ");
    precioArticulo1 = Double.parseDouble(System.console().readLine());
  
    
    System.out.print("introduce la cantidad articulo 1 : ");
    cantidadArticulo1 = Integer.parseInt(System.console().readLine());
   
	
	
	
			/*calculos de subtotal de cada articulo y total*/
		double subtotal1 = precioArticulo1 * cantidadArticulo1 - 1.21;
		double subtotal2 = precioArticulo1 * cantidadArticulo1 - 1.10;
		double subtotal3 = (precioArticulo1 * cantidadArticulo1)-1.04;
		double total = (subtotal1 + subtotal2 + subtotal3);

		System.out.print(" Nombre , Tipo-IVA , Cantidad, Subtotal\n" );
		System.out.println("----------------------------------------------");
		System.out.printf("%-10s |   %21 | %-10d | %-10.2f\n" , nombreArticulo1,  cantidadArticulo1, subtotal1 );
		System.out.printf("%-10s |   %10 | %-10d | %-10.2f\n" , nombreArticulo1,  cantidadArticulo1, subtotal2 );
		System.out.printf("%-10s |   %4  | %-10d | %-10.2f\n" , nombreArticulo1,  cantidadArticulo1, subtotal3 );
		System.out.println("----------------------------------------------");
		System.out.printf ( "El total de todos tus productos es: %10.2f \n",total);

	}
	
}

   
    
	


