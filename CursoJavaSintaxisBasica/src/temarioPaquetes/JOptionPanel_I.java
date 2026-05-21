package temarioPaquetes;
import javax.swing.JOptionPane;
public class JOptionPanel_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		
		
		//INTRODUCIR VALORES NUMERICOS
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Indica tu edad"));
		
		 
		System.out.println("Hola " + nombre + " y tu edad es " + edad + " años");
		

	}

}
