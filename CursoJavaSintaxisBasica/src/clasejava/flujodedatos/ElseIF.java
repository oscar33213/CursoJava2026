package clasejava.flujodedatos;

import javax.swing.*;

public class ElseIF {

    public static void main(String[] args) {

        double media = (Double.parseDouble(JOptionPane.showInputDialog("Indica la primera nota: ")) +
                Double.parseDouble(JOptionPane.showInputDialog("Indica la segunda nota: ")) +
                Double.parseDouble(JOptionPane.showInputDialog("Indica la tercera nota: "))) / 3;

        try {

            
            if (media > 10 || media < 0) {
                throw new Exception("La media no puede ser mayor que 10 ni menor que 0");
            }

            if (media < 5) {

                System.out.println("SUSPENSO");

            } else if (media >= 5 && media < 7) {

                System.out.println("APROBADO");

            } else if (media >= 7 && media < 9) {

                System.out.println("NOTABLE");

            } else {

                System.out.println("SOBRESALIENTE");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            
            return;
            

        }

        System.out.println("Tu nota final es: " + media);
    }
}