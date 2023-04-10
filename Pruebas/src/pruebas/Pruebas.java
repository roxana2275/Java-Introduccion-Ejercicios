/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] num = new int[3][3];
        int fila1 = 0, fila2 = 0, fila3 = 0, columna1 = 0, columna2 = 0, columna3 = 0, diagonal1 = 0, diagonal2 = 0, contador = 0;
        boolean control = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Ingrese numeros del 1 al 9");
                num[i][j] = leer.nextInt();

            }
        }
        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        diagonal1 = diagonal1 + num[i][j];

                    }

                }

            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i + j == 2) {
                        diagonal2 = diagonal2 + num[i][j];

                    }

                }

            }
            System.out.println(diagonal1 + "-" + diagonal2);
            if (diagonal1 != diagonal2) {
                control = false;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 0) {
                        fila1 = fila1 + num[i][j];

                    } else if (i == 1) {
                        fila2 = fila2 + num[i][j];

                    } else if (i == 2) {
                        fila3 = fila3 + num[i][j];
                    }
                }

            }
            System.out.println(fila1 + "-" + fila2 + "-" + fila3);
            if (fila1 != fila2 || fila2 != fila3 || fila3 != diagonal1 || fila1 != diagonal1) {
                control = false;
            }
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    if (j == 0) {
                        columna1 = columna1 + num[i][j];

                    } else if (j == 1) {
                        columna2 = columna2 + num[i][j];

                    } else if (j == 2) {
                        columna3 = columna3 + num[i][j];
                    }
                }
            }
            System.out.println(columna1 + "-" + columna2 + "-" + columna3);
            if (columna1 != columna2 || columna2 != columna3 || columna3 != diagonal1 || columna1 != diagonal1) {
                control = false;
            }
        } while (control == true);

        if (control == true) {
            System.out.println("La matriz es magica");

        } else {
            System.out.println("La matriz no es magica");
        }

    }

    
    }
    
