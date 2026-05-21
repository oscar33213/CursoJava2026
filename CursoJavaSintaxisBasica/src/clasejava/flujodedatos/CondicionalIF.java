package clasejava.flujodedatos;
import javax.swing.*;
public class CondicionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Indica tu edad: "));
		
		
		if (edad < 18 && edad >=0) {
			
			System.out.println("eres menor de edad");
		} else {
			
			System.out.println("Eres mayor de edad");
		}

	}

}
