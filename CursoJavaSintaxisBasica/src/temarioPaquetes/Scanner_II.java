package temarioPaquetes;
import java.util.Scanner;
public class Scanner_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1;
		double nota2;
		double nota3;
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Indica tu primera nota:");
		
		nota1 = dato.nextDouble();
		
		System.out.println("Indica tu segunda nota:");
		
		nota2 = dato.nextDouble();
		
		System.out.println("Indica tu tercera nota:");
		
		nota3 = dato.nextDouble();
		
		float media = (float)(nota1 + nota2 + nota3)/3;
		
		if (media < 5) {
		    System.out.println("Suspenso");
		} else if (media < 9.5) {
		    System.out.println("Aprobado");
		} else {
		    System.out.println("MATRICULA DE HONOR");
		}
		
		System.out.println("Tu media es de: " + media);
		
		dato.close();
	}

}
