/*@authora Esther Hitos
 * 4 
 * 6

 * ****
 * *****
 * ******

 * 6
 * 4
 * ******
 * *****
 * ****
*el usuario introducira 2 valores, y se pintara el trapecio correspondiente
*/


public class EjemploBucle11{
	public static void main ( String args[] ){
	System.out.println("introduzca 2 numeros: ");
	int num1 = Integer.parseInt(System.console().readLine());
	int num2 = Integer.parseInt(System.console().readLine());
	 
	  if (num1 < num2){
		for( int j=num1; j<=num2; j++){
			for( int i=1;i<=j;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	  }else{
		 for( int x=num1; x>=num2; x--){
			for( int y=1;y <=x; y++){
				System.out.print("*");
			}
			System.out.println();
		 } 
		  
	   }
	
	}
 
}
