/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg22;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos
        */
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el tamaño de la matriz");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int[][] matriz = new int [num1][num2];
        generarMatriz(matriz, num1,num2);
    }
    public static void generarMatriz (int matriz[][], int num1, int num2){
        int sumador=0;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                sumador = sumador+matriz[i][j];
                
            }
            
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La suma de los números es "+sumador);  
     }
}
