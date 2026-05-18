 package syntaxisBasica;

import java.util.Scanner;

public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raizC = Math.sqrt(7.5);
		
		System.out.println(raizC);
		
		System.out.println("--------------------------------------");
		double RaizCuadrada; // VARIABLE INICIAL
		Scanner numero = new Scanner (System.in); // CREAMOS EL OBJETO SCANNER
		
		System.out.println("Introduce un numero: "); //MENSAJE QUE INDICA QUE HEMOS DE INTRODUCIR UN PARAMETRO POR CONSOLA
		double valor = numero.nextDouble(); // VARIABLE QUE GUARDA EL DATO DEL SCANNER
		
		RaizCuadrada = Math.sqrt(valor); //INICIALIZAMOS LA VARIABLE CREADA
		
		System.out.println("La raiz cuadrada de: " + valor + " es: " + RaizCuadrada);
		
		numero.close(); //CERRAMOS EL BUFFER DEL SCANNER
		

	}

}
