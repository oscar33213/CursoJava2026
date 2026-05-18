package syntaxisBasica;
import java.util.Scanner;
public class String_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String frase;
		String frase2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indica la contraseña: ");
		
		
		frase = entrada.nextLine();
		
		System.out.println("Indique de nuevo la contraseña: ");
		frase2 = entrada.nextLine();
		
		
		if(frase.equals(frase2)) {
			
			System.out.println("La contraseña coincide");
			String frase_sub = frase.substring(4);
			
			System.out.println(frase_sub);
		} else {
			System.out.println("La contraseña no coincide");
		}
		
		
		
		entrada.close();
	}

}
