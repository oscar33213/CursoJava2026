package syntaxisBasica;
import java.util.Scanner;
public class String_II {

	public static void main(String[] args) {
		
		String correo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indica el correo: ");
		
		correo = entrada.nextLine();

		// Cuenta cuántas veces aparece @
		int cantidadArrobas = correo.length() - correo.replace("@", "").length();
		
		/* Cuenta todos los caracteres del correo, para luego crear otro sin @ ni espacios, los cuales compara entre longitud y resta, dando como resultado
		 * el numero de @
		 */
		
		System.out.println(cantidadArrobas);

		if (cantidadArrobas == 1 && correo.contains(".")) {

			System.out.println("El correo: " + correo + " es valido.");

		} else {

			System.out.println("El correo: " + correo + " no es valido.");
		}
		
		int posicionArroba = correo.indexOf('@'); //Indica la posicion de X caracter
		
		System.out.println("El @ se encuentra en la posicion: " + posicionArroba);
		
		//ACCERDER AL ULTIMO CARACTER:
		int ultimaLetra = correo.length(); 
		System.out.println("La ultima letra de: " + correo + " es: " + correo.charAt(ultimaLetra - 1));
		
		
		entrada.close();
	}
}