package clasejava.flujodedatos;

import javax.swing.JOptionPane;

public class CondicionalIf_III {

    public static void main(String[] args) {

        // OPERADOR NEGACION (!)
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Indica tu edad: "));

        try {

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser menor a 0");
            }

            if (!(edad < 18 && edad >= 0)) {
                System.out.println("Eres menor de edad");
            } else {
                System.out.println("Eres mayor de edad");
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return;
        }

        // -----------------------------------
        
        // OPERADOR (&) Y (|)

        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Indica distancia en KM: "));

        double renta_familiar = Double.parseDouble(
                JOptionPane.showInputDialog("Indica ingresos anuales del padre: "))
                + Double.parseDouble(
                JOptionPane.showInputDialog("Indica ingresos anuales de la madre: "))
                + Double.parseDouble(
                JOptionPane.showInputDialog("Indica ingresos de otro familiar (Si no los hay, indique 0): ")
        );

        byte num_hermano = Byte.parseByte(
                JOptionPane.showInputDialog("Indique numero de hermanos")
        );

        try {

            if (renta_familiar < 0 || num_hermano < 0 || distancia < 0) {
                throw new IllegalArgumentException(
                        "La renta no puede ser menor a 0, tener menos de 0 hermanos ni tener distancia en negativo");
            }

            if (distancia > 10 | renta_familiar < 20000 | num_hermano > 2) {
                System.out.println("Tienes derecho a beca");
            } else {
                System.out.println("No tienes derecho a beca");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        

    }
}
	
	
