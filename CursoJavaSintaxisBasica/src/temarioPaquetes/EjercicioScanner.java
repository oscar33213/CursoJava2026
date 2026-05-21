package temarioPaquetes;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EjercicioScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner escaner = new Scanner (System.in);
		//EJERCICIO 1: 
		
		
		System.out.println("indica un numero: ");
		
		int numRaiz = escaner.nextInt();
		
		double raiz = Math.sqrt(numRaiz);
		
		System.out.println("La raiz cuadrada de " + numRaiz + " es: " + raiz);
		
		
		//EJERCICIO 2
		
		System.out.println("Indica un nuemro: ");
	
		double raiz2 = Math.sqrt(escaner.nextDouble());
		
		System.out.println("La raiz es: " + raiz2);
		
		
		// EJERCICIO 3
		
		String Inputbase = JOptionPane.showInputDialog("Indica la base: ");
		String Inputexponente = JOptionPane.showInputDialog("Indica el exponente: ");
		
		int base = Integer.parseInt(Inputbase);
		int exponente = Integer.parseInt(Inputexponente);
		
		double potencia = (double)Math.pow(base, exponente);
		
		System.out.println("La potencia con base: " + base + " y exponente: " + exponente + " es: " + potencia);
		
		
		// EJERCICIO 4
		
		int Entradabase = Integer.parseInt(JOptionPane.showInputDialog("Indica la base: "));
		int Entradaexponente = Integer.parseInt(JOptionPane.showInputDialog("Indica el exponente: "));
		
		System.out.println("El resultado es: " + (double)Math.pow(Entradabase, Entradaexponente));

	}

}
