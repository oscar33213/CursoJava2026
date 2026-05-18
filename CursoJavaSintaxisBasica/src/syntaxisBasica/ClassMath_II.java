package syntaxisBasica;

public class ClassMath_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CASTING: SE USA PARA TRANFORMAR UN TIPO DE VARIABLE A OTRO
		
		// EJEMPLO DE USO:
		
		
		System.out.println(Math.sqrt(9));
		
		int resultado = (int)Math.sqrt(9); //AL AÑADIR ENTRE () EL TIPO AL QUE QUEREMOS CASTEAR, EN ESTE CASTO A INTEGER
		
		System.out.println(resultado);
		
		int suma = resultado + (int)Math.round(20);
		
		System.out.println("La Suma es de: " + (float)suma);
		
		System.out.println((float)Math.PI);

	}

}
