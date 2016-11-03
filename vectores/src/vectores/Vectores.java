/*
Los arrays siempre se declaran siempre por referencia
La búsqueda binaria consiste en buscar dentro de un vector binario, dividiendo en intervalos. 
 */
package vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int busqueda;
        int numeroSw;
        String cadenaNumeroSw;
        int[] vectorA = new int[4];
        int[] vectorB = new int[4];
        int[] vectorC = new int[4];

        do {
            cadenaNumeroSw = JOptionPane.showInputDialog("MENU \n 1- Cargar Vector A y Mostrar" //creo un menú
                    + "\n 2- Cargar Vector B y Mostrar"
                    + "\n 3- Sumar vector A+B y Mostrar en Vector C"
                    + "\n 4- Burbuja"
                    + "\n 5- Mostrar vector ordenado"
                    + "\n 6- Busqueda Binaria"
                    + "\n 7- SALIR");
            numeroSw = Integer.parseInt(cadenaNumeroSw);      //parseo los valores del menu
            switch (numeroSw) {                              //agrego una estructura de switch  
                case 1: //cargar vector A y mostrar en un procedimiento a parte
                    cargaMuestraVecA(vectorA); //llamo el procedimiento
                    break;
                case 2: //cargar vector B y mostrar en un procedimiento 
                    cargaMuestraVecB(vectorB); // llamo el procedimiento
                    break;
                case 3: // sumar vector A+B y cargarlo al vector C
                    sumaVecAB(vectorA, vectorB, vectorC); //llamo el procedimiento
                    break;
                case 4: //burbuja
                    burbuja(vectorC);
                    break;
                case 5: // mostrar vector ordenado
                    mostrarOrdenado(vectorC);
                    break;
                case 6: //función búsqueda binaria. 
                    busqueda = busquedaBinaria(vectorC, 40);
                    // Estoy obligado a poner lógica en el main porque debo tomar una decisión en función al dato que me devuelve la Función
                    if (busqueda == -1) {
                        JOptionPane.showMessageDialog(null, "No se encuentra el valor en el vector");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se encontró el valor en el vector");
                    }
                    break;
                case 7: // salir
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Incorrecta");
            }
        } while (numeroSw != 7);

    }

    public static void cargaMuestraVecA(int vector[]) { //capto la referencia en una variable que declaro

        System.out.println("Entré al procedimiento 1"); //muestro que estoy dentro de éste método
        String cadenaVectorA; // declaro un string para ingresar el dato
        int dato; //declaro una variable auxiliar
        for (int i = 0; i < vector.length; i++) {

            cadenaVectorA = JOptionPane.showInputDialog(null, "Ingrese un valor para el Vector A"); //usuario ingresa el dato
            dato = Integer.parseInt(cadenaVectorA); //parseo el dato
            vector[i] = dato; //asigno el valor al vector
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Los nùmeros cargados en el vector A son: " + vector[i]); //muestro los valores cargados a cada uno de los vectores
        }
    }

    public static void cargaMuestraVecB(int vector[]) { //capto la referencia en una variable nueva que declaro

        System.out.println("Entré al procedimiento 2"); //muestro que ingresé al método

        String cadenaVectorB; //declaro un string para ingresar el dato
        int dato; //declaro una variable auxiliar
        for (int i = 0; i < vector.length; i++) {
            cadenaVectorB = JOptionPane.showInputDialog(null, "Ingrese un valor para el Vector B");
            dato = Integer.parseInt(cadenaVectorB);
            vector[i] = dato;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Los números cargados en el vector B son: " + vector[i]);
        }
    }

    public static void sumaVecAB(int vectorA[], int vectorB[], int vectorC[]) {

        System.out.println("Entré al procedimiento 3");
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = (vectorA[i] + vectorB[i]);
        }
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println("La suma de vector A + Vector B es: " + vectorC[i]);
        }

    }

    public static void burbuja(int vector[]) {
        System.out.println("Ingreso a aplicar el método de la burbuja");
        int aux; //declaro una variable auxiliar
        for (int i = 0; i < vector.length - 1; i++) { //creo un for 
            for (int j = 0; j < vector.length - i - 1; j++) { //creo otro for dentro del primero
                if (vector[j + 1] < vector[j]) { //si el siguiente es menor que el actual
                    aux = vector[j + 1]; //guardo el menor en el auxiliar
                    vector[j + 1] = vector[j]; //el mayor lo guardo en la posición siguiente
                    vector[j] = aux; //guardo al auxiliar en el valor inicial
                }

            }

        }

    }

    public static void mostrarOrdenado(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Los vectores ordenados: " + vector[i]);
        }

    }

    private static int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

}
