/**
 * Haz un programa que pida tres artículos y los memorice. Para cada artículo, pedirá:

- nombre
- precio por unidad
- cantidad de unidades


El programa debe memorizar esos datos de cada artículo. El progrma presentará en pantalla la información así:

Artículo	Cantidad	Precio unidad	Subtotal
-----------------------------------------------------------
Articulo1	x		y		z
Articulo2	a		b		c
Articulo3	m		n		o
-----------------------------------------------------------
TOTAL						p

sabiendo que los subtotales se calculan multiplicando cada cantidad de artículo por el precio por unidad, y que el TOTAL
es la suma de todos los subtotales


profesorjim@gmail.com

ASUNTO: Ticket compra
* 
*/
public class TiketCompra { // Clase principal
  public static void main(String[] args) {

	  
    
    
    String nombreArticulo1, nombreArticulo2, nombreArticulo3;
    float precioArticulo1, precioArticulo2, precioArticulo3;
    int cantidadArticulo1, cantidadArticulo2, cantidadArticulo3;
    
	 /*recoge el nombre,precio,cantidad articulo1*/
	System.out.print("introduce el nombre articulo 1 : ");
    nombreArticulo1 = System.console().readLine();
    
    System.out.print("introduce el precio articulo 1 : ");
    precioArticulo1 = Float.parseFloat(System.console().readLine());
  
    
    System.out.print("introduce la cantidad articulo 1 : ");
    cantidadArticulo1 = Integer.parseInt(System.console().readLine());
   
	
	/*recoge el nombre,precio,cantidad articulo2*/
	System.out.print("introduce el nombre articulo 2 : ");
    nombreArticulo2 = System.console().readLine();
    
    System.out.print("introduce el precio articulo 2 : ");
    precioArticulo2 = Float.parseFloat(System.console().readLine());
  
    
    System.out.print("introduce la cantidad articulo 2 : ");
    cantidadArticulo2 = Integer.parseInt(System.console().readLine());
	
	
	/*recoge el nombre,precio,cantidad articulo3*/
	System.out.print("introduce el nombre articulo 3 : ");
    nombreArticulo3 = System.console().readLine();
    
    System.out.print("introduce el precio articulo 3 : ");
    precioArticulo3 = Float.parseFloat(System.console().readLine());
  
    
    System.out.print("introduce la cantidad articulo 3 : ");
    cantidadArticulo3 = Integer.parseInt(System.console().readLine());
	
	/*calculos de subtotal de cada articulo y total*/
	float subtotal1 = precioArticulo1 * cantidadArticulo1;
	float subtotal2 = precioArticulo2 * cantidadArticulo2;
	float subtotal3 = precioArticulo3 * cantidadArticulo3;
	float total = (subtotal1 + subtotal2 + subtotal3);

  System.out.print(" Nombre , Precio , Cantidad, Subtotal\n" );
  System.out.println("----------------------------------------------");
  System.out.printf("%-10s | %-10.2f | %-10d | %-10.2f\n" , nombreArticulo1, precioArticulo1, cantidadArticulo1, subtotal1 );
  System.out.printf("%-10s | %-10.2f | %-10d | %-10.2f\n" , nombreArticulo2, precioArticulo2, cantidadArticulo2, subtotal2 );
  System.out.printf("%-10s | %-10.2f | %-10d | %-10.2f\n" , nombreArticulo3, precioArticulo3, cantidadArticulo3, subtotal3 );
  System.out.println("----------------------------------------------");
	System.out.printf ( "El total de todos tus productos es: %10.2f \n",total);

}
	
}

   
    
    

