/*
Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Diseño Estructurado de Algoritmos
 */
package promediosietenotas;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class PromedioSieteNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        String cadenaNota;
        double acumuladorNota=0;
        double promedio;
        
            for (int i = 1; i <= 7; i++) {
            cadenaNota = JOptionPane.showInputDialog(null, "Ingrese nota de examen: ");
            nota = Double.parseDouble(cadenaNota);
            acumuladorNota = acumuladorNota + nota;
        }
            promedio=acumuladorNota/7;
            
            JOptionPane.showMessageDialog(null,"El promedio es "+promedio);
    }
    
}
