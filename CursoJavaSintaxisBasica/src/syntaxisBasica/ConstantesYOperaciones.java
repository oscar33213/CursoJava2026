package syntaxisBasica;

public class ConstantesYOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CONSTANTES
		
		final double CONVERSION_EURO =  0.85;
		System.out.println(CONVERSION_EURO);
		
		// OPERADORES
		
		int num1 = 7;
		int num2 = 5;
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multi);
		System.out.println(div);
		
		num1++;
		
		System.out.println(num1);
		
		
		num2--;
		
		System.out.println(num2);
		
		System.out.println(num1 + num2);

	}

}
