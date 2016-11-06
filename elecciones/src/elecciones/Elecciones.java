/*
ELECCIONES

En un país hubo elecciones para elegir al presidente. 
El país consta de 7 provincias o regiones, de las cuales se han levantado actas que contiene el total de votos 
obtenidos por los 4 partidos políticos en dicha región. 
Diseñe un programa en c, que lea las actas de las 7 provincias, 
muestre que partido ganó las elecciones y en caso de empate, lo especifique con un mensaje.
 */
package elecciones;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class Elecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int partidoUno;
        String cadenaPartidoUno;
        int partidoDos;
        String cadenaPartidoDos;
        int partidoTres;
        String cadenaPartidoTres;
        int partidoCuatro;
        String cadenaPartidoCuatro;
        int sumaUno=0;
        int sumaDos=0;
        int sumaTres=0;
        int sumaCuatro=0;
        int provincias=0;
        
        do {     
            cadenaPartidoUno=JOptionPane.showInputDialog(null,"Ingrese los votos del partido Uno");
            partidoUno=Integer.parseInt(cadenaPartidoUno);
            cadenaPartidoDos=JOptionPane.showInputDialog(null,"Ingrese los votos del partido Dos");
            partidoDos=Integer.parseInt(cadenaPartidoDos);
            cadenaPartidoTres=JOptionPane.showInputDialog(null,"Ingrese los votos del partido Tres");
            partidoTres=Integer.parseInt(cadenaPartidoTres);
            cadenaPartidoCuatro=JOptionPane.showInputDialog(null,"Ingrese los votos del partido Cuatro");
            partidoCuatro=Integer.parseInt(cadenaPartidoCuatro);
            sumaUno=sumaUno+partidoUno;
            sumaDos=sumaDos+partidoDos;
            sumaTres=sumaTres+partidoTres;
            sumaCuatro=sumaCuatro+partidoCuatro;
            provincias=provincias+1;
        } while (provincias<7);
        
        if (sumaUno>sumaDos && sumaUno>sumaTres && sumaUno>sumaCuatro) {
            JOptionPane.showMessageDialog(null,"Ganó el partido Uno con un total de: "+sumaUno+" votos");
        } else if (sumaDos>sumaUno && sumaDos>sumaTres && sumaDos>sumaCuatro) {
            JOptionPane.showMessageDialog(null,"Ganó el partido Dos con un total de: "+sumaDos+" votos");
        } else if (sumaTres>sumaUno && sumaTres>sumaDos && sumaTres>sumaCuatro) {
            JOptionPane.showMessageDialog(null,"Ganó el partido Tres con un total de: "+sumaTres+" votos");
        } else if (sumaCuatro>sumaUno && sumaCuatro>sumaDos && sumaCuatro>sumaTres) {
            JOptionPane.showMessageDialog(null,"Ganó el partido Cuatro con un total de: "+sumaCuatro+" votos");
        } else if (sumaUno==sumaDos && sumaDos==sumaTres && sumaTres==sumaCuatro) {
            JOptionPane.showMessageDialog(null,"Hubo empate entre todos los partidos");
        } else if (sumaUno==sumaDos && sumaUno>sumaTres && sumaDos>sumaCuatro) {
            JOptionPane.showMessageDialog(null,"Hubo empate entre el Partido Uno y el Partido Dos con "+sumaUno+" votos");
        } else if (sumaUno==sumaTres && sumaUno>sumaDos && sumaTres>sumaCuatro){
            JOptionPane.showMessageDialog(null,"Hubo empate entre el Partido Uno y el Partido Tres con "+sumaUno+" votos");
        } else if (sumaUno==sumaCuatro && sumaUno>sumaDos && sumaCuatro>sumaTres) {
            JOptionPane.showMessageDialog(null,"Hubo empate entre el Partido Uno y el Partido Cuatro con "+sumaUno+" votos");
        } else if (sumaDos==sumaTres && sumaDos>sumaUno && sumaTres>sumaCuatro){
            JOptionPane.showMessageDialog(null,"Hubo empate entre el Partido Dos y el Partido Tres con "+sumaDos+" votos");
        } else if (sumaDos==sumaCuatro && sumaDos>sumaUno && sumaCuatro>sumaTres){
            JOptionPane.showMessageDialog(null,"Hubo empate entre el Partido Dos y el Partido Cuatro con "+sumaDos+" votos");
        } else if (sumaTres==sumaCuatro && sumaTres>sumaDos && sumaCuatro>sumaUno){
            JOptionPane.showMessageDialog(null,"Hubo empate entre el Partido Tres y el Partido Cuatro con "+sumaTres+" votos");
        }
        
    }
    
}
