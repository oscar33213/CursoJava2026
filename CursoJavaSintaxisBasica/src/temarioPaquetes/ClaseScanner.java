package temarioPaquetes;
import java.util.Scanner; 
public class ClaseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indica la edad: ");
		
		edad = entrada.nextInt();
		
		if (edad >= 0 && edad < 18) {
			
			System.out.println("Eres menor de edad");
		} else if (edad >= 18 && edad < 60) {
			
			System.out.println("Estas en la adultez");
		} else if (edad >= 60 && edad < 101) {
			System.out.println("Estas en la 3ª edad");
		} else {
			
			System.out.println("¿Sigues vivo?");
		}
		
		entrada.close();
		
		

	}
	
	

}
