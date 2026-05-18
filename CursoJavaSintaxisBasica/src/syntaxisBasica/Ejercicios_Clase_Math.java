package syntaxisBasica;

import java.util.Scanner;

public class Ejercicios_Clase_Math {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // EJERCICIO 1
        System.out.println("Indica el valor de la Raiz Cuadrada: ");

        double valorScanner = scanner.nextDouble();

        int resultado = (int) Math.sqrt(valorScanner);

        int numero = (int) valorScanner;

        System.out.println("La raiz cuadrada de: " + numero + " es: " + resultado + ".");

        // EJERCICIO 2
        System.out.println("Indica base: ");
        double base = scanner.nextDouble();

        System.out.println("Indica exponente: ");
        double expo = scanner.nextDouble();

        double resultadoPotencia = Math.pow(base, expo);

        System.out.println(base + " elevado a " + expo + " es: " + (long) resultadoPotencia + ".");

        // EJERCICIO 3
        System.out.println("Indica el numero a redondear: ");

        double numeroRedondeo = scanner.nextDouble();

        long redondeo = Math.round(numeroRedondeo);

        System.out.println("El redondeo de " + numeroRedondeo + " es: " + redondeo + ".");

        // Cerrar scanner
        scanner.close();
    }

		
		
		
		
		
		

	}


