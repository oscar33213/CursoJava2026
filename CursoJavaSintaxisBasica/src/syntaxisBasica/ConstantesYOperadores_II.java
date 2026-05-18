package syntaxisBasica;

import java.util.Scanner;

public class ConstantesYOperadores_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CONCATENACION DE STRINGS
		
		double salario = 1200.00;
		String nombre = "Manuel";
		double SalarioDolares = salario * 1.18;
		
		System.out.println("El salario de " + nombre + " es de: " + salario + "€");
		System.out.println("El salario en dolares de " + nombre + " es de: " + "$" + SalarioDolares);
		
		System.out.println(nombre + " a obtenido un incremento de 300€ que se le queda en: " + (salario + 300) + "€" + 
		" Que en dolares equivale a: " + "$" + (SalarioDolares + 300));
		
		
		
		//INPUT TECLADO - INTRODUCIR DATOS POR TECLADO
		int edad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		
		edad = entrada.nextInt();
		System.out.println("La edad es: " + edad + " años");
		
		entrada.close();

	}

}
