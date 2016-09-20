/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
En una Obra Social, dada la edad de una persona, 
de le asignará una determinada categoría; que será 
“Recién Nacido” (menos de 1 año), 
“Infante” (hasta 5 años), 
“Niño” (de 6 a 12 años), 
“Pre-adolescente” (más de 12 años, hasta 18); 
“Adolescente” (más de 18 años, hasta 25), 
“Adulto joven” (más de 25, hasta 35 años); 
“Adulto” (más de 35, hasta 50 años) 
o “Adulto mayor” (más de 50 años). 
Dada la edad de una persona, informar su categoría.
 */
package obrasocial;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad;
        String cadenaEdad;
        
        cadenaEdad=JOptionPane.showInputDialog(null,"Ingrese la edad de la persona: ");
        edad=Integer.parseInt(cadenaEdad);
        
        if (edad >= 0 && edad<=1) {
            JOptionPane.showMessageDialog(null, "La categoría es Recién Nacido");
        } else {
            if (edad>=1 && edad<=5) {
            JOptionPane.showMessageDialog(null, "La categoría es Infante");
            } else {
                if (edad>=6 && edad<=12) {
                    JOptionPane.showMessageDialog(null, "La categoría es Niño");
                } else {
                    if (edad>12 && edad<=18) {
                        JOptionPane.showMessageDialog(null, "La categoría es Pre-Adolescente");
                    } else {
                        if (edad>18 && edad<=25) {
                                JOptionPane.showMessageDialog(null, "La categoría es Adolescente");
                        } else {
                            if (edad>25 && edad <=35) {
                                JOptionPane.showMessageDialog(null, "La categoría es Adulto Jóven");
                            } else {
                                if (edad>35 && edad<=50) {
                                    JOptionPane.showMessageDialog(null, "La categoría es Adulto");
                                } else {
                                    JOptionPane.showMessageDialog(null, "La categoría es Adulto Mayor");
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
