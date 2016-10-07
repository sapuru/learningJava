/*
Calcule el promedio de edades de un grupo de estudiantes, de los cuales no se conoce la cantidad.
 */
package promedioedad;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class PromedioEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 1;
        String cadenaEdad;
        int cantidad = 0;
        int acumulador = 0;
        int promedio;

        cadenaEdad = JOptionPane.showInputDialog(null, "ingrese edad: "
                + "\n (ingrese 0 para calcular promedio)");
        edad = Integer.parseInt(cadenaEdad);

        while (edad > 0) {
            cantidad = cantidad + 1;
            acumulador = acumulador + edad;
            cadenaEdad = JOptionPane.showInputDialog(null, "ingrese edad: "
                    + "\n (ingrese 0 para calcular promedio)");
            edad = Integer.parseInt(cadenaEdad);
        }
        promedio = acumulador / cantidad;
        JOptionPane.showMessageDialog(null, "el promedio de edad es:" + promedio);
    }
    
}
