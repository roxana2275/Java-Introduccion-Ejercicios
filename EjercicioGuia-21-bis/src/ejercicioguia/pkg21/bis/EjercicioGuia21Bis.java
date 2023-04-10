/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg21.bis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia21Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P
         */
        Scanner leer = new Scanner(System.in);
        int[][] matrizPrincipal = new int[10][10];
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese matriz Principal de 10 x 10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizPrincipal[i][j] = (int) (Math.random() * 10);
                //System.out.println("FILA "+ i + "COLUMNA " + j);
                //matrizPrincipal[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizPrincipal[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Ingrese la matriz a buscar de 3 x 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("FILA " + i + " COLUMNA " + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        busqueda(matrizPrincipal, matriz);
    }

    public static void busqueda(int[][] matrizPrincipal, int[][] matriz) {
        int fila = 0;
        int columna = 0;
        int coincidencia = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizPrincipal[i][j] == matriz[0][0]) {
                    for (int k = i; k < (i + 3); k++) {
                        for (int l = j; l < (j + 3); l++) {
                            if (matrizPrincipal[k][l] == matriz[k - i][l - j]) {
                                fila = i;
                                columna = j;
                                coincidencia += 1;
                            } else {
                                coincidencia = 0;
                                k = i + 3;
                                l = j + 3;
                                fila = 0;
                                columna = 0;
                            }
                        }
                    }
                    if (coincidencia > 0) {
                        System.out.println("La matriz principal contiene a la matriz secundaria");
                        System.out.println("Se encuentra ubicada en: ");
                        for (int m = fila; m < fila + 3; m++) {
                            for (int n = columna; n < columna + 3; n++) {
                                System.out.print("[" + m + "," + n + "]");
                            }
                            System.out.println("");
                        }
                        
                    }

                }
            }
        }
    }

}
    
