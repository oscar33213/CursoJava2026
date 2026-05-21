package clasejava.flujodedatos;

import javax.swing.*;

public class ClaseIf_IV {

    public static void main(String[] args) {

        // IF ANIDADO

        int edad;

        try {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Indica tu edad: "));

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser menor a 0");
            }

            if (edad > 18) {

                String carnet = JOptionPane.showInputDialog("¿Tienes carnet de conducir? (S/N)");

                if (!carnet.equalsIgnoreCase("S") && !carnet.equalsIgnoreCase("N")) {
                    throw new IllegalArgumentException("Solo S o N");
                }

                if (carnet.equalsIgnoreCase("S")) {
                    JOptionPane.showMessageDialog(null, "Puedes comprarte el coche");
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes comprarte el coche");
                }

            } else {
                JOptionPane.showMessageDialog(null, "No puedes comprarte el coche");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
