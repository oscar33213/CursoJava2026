package syntaxisBasica;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HAY DOS FORMAS DE DECLARAR E INICIAR UNA VARIABLE
		int manzanas = 20;
		int niños;
		niños = 5;
		
		int manzanaAniños = (manzanas / niños);
		
		System.out.println("El numero de manzanas a cada niño es de: " + manzanaAniños);
		
		niños = 7;
		float dinero = 32.56F;
		
		float DineroTotal = dinero / niños;
		
		System.out.println("Cada niño recibe: " + DineroTotal + "€");
		
		//VARIABLES DE TEXTO
		String nombre = "Oscar";
		String apellido1 = "Hidalgo";
		String apellido2 = "Llopez";
		
		int edad = 29;
		
		System.out.println("Me llamo: " + nombre + " " + apellido1 + " " + apellido2 + " y tengo: " + edad + " años.");
		
		// OTRA MANERA DE DECLARAR VARIABLES, PUEDES DECLARARA VARIAS EN UNA MISMA LINEA PARA LUEGO INICIALIZARLAS
		float valor1 , valor2, valor3;
		
		
		valor1 = 23.32F;
		valor2 = 34.67F;
		valor3 = 21F;
		
		float suma = valor1 + valor2 + valor3;
		
		System.out.println(suma);
		
		
		

	}

}
