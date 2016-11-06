/*
Leer 10 números e imprimir cuantos son  positivos, cuantos negativos y cuantos neutros.
 */
package positivosnegativosneutros;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class PositivosNegativosNeutros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        String cadenaNumero;
        int positivo=0;
        int negativo=0;
        int neutro=0;
        
        for (int i = 0; i < 10; i++) {
            cadenaNumero=JOptionPane.showInputDialog(null,"Ingrese un nùmero");
            numero=Integer.parseInt(cadenaNumero);
            if (numero>0) {
                positivo=positivo+1;
            } else if (numero<0) {
                negativo=negativo+1;
            } else {
                neutro=neutro+1;
            }
        }
        
        JOptionPane.showMessageDialog(null,"ingresó :"+positivo+" positivos"+
                                        "\n los negativos son: "+negativo+
                                         "\n los neutros: "+neutro);
    }
    
}
