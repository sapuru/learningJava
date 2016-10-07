/*
 * Un estudiante desea saber cuál fue su promedio en Matemática I, 
para ello dispone de la siguiente información: 
tiene 3 exámenes, con una ponderación del 20% cada uno y 
2 laboratorios con una ponderación del 30% cada uno. 
Diseñe un programa que dadas las notas calcule 
el promedio del alumno y 
muestre en pantalla si el alumno esta reprobado o no 
(para aprobar esta  materia se requiere de una nota mayor o igual a 6.00).
 */
package promediomatematicas;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class PromedioMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notaExamen;
        String cadenaNotaExamen;
        double notaLaboratorio;
        String cadenaNotaLaboratorio;
        double acumuladorExamen = 0;
        double acumuladorLaboratorio = 0;
        double promedioExamen;
        double promedioLab;
        double promedio;

        for (int i = 1; i <= 3; i++) {
            cadenaNotaExamen = JOptionPane.showInputDialog(null, "Ingrese nota de examen: ");
            notaExamen = Double.parseDouble(cadenaNotaExamen);
            acumuladorExamen = acumuladorExamen + notaExamen;
        }
        for (int i = 1; i <= 2; i++) {
            cadenaNotaLaboratorio = JOptionPane.showInputDialog(null, "Ingrese nota de laboratorio:");
            notaLaboratorio = Double.parseDouble(cadenaNotaLaboratorio);
            acumuladorLaboratorio = acumuladorLaboratorio + notaLaboratorio;
        }

        promedioExamen = acumuladorExamen / 3;
        promedioLab = acumuladorLaboratorio / 2;
        promedio = (promedioExamen + promedioLab) / 2;

        JOptionPane.showMessageDialog(null, "El promedio de exámenes es " + promedioExamen
                + "\n El promedio de Laboratorio es: " + promedioLab
                + "\n El promedio general es: " + promedio);

        if (promedio >= 6) {
            JOptionPane.showMessageDialog(null, "Alumno Aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno Desaprobado");
        }
    }

}
