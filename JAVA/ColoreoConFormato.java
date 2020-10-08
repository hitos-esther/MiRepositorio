public class ColoreoConFormato {
	public static void main ( String[] args) {
  System.out.printf("%-10s | %6.2\n","Articulo","Precio");
  System.out.println (".................");
  System.out.printf(" %-10s | %6.2f\n","\033[36m", "Raton", "\033[37m",10.0);
  System.out.printf(" %-10s | %6.2f\n","\033[36m", "Webcam", "\033[37m",10.0);
  System.out.printf(" %-10s | %6.2f\n","\033[36m", "Raton", "\033[37m",10.0);
  }
}
