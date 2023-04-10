/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg20;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
        */
        Scanner leer = new Scanner (System.in);
        int matriz[][]= new int[3][3];
       
        //rellenar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               do{
                   System.out.println("Por favor ingrese el valor de la fila "+i+" columna "+j);
                   matriz[i][j]=leer.nextInt();
               }while(matriz[i][j]<0 || matriz[i][j]>9);
            }
        }
       matrizMagica(matriz);
        
        }
        

    public static void matrizMagica(int[][] matriz){
         int fil1=0,fil2=0,fil3=0,col1=0,col2=0,col3=0,diag1=0,diag2=0;
        //cargar filas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if(i==0){
                    fil1=fil1+matriz[i][j];
                }else if(i==1){
                    fil2=fil2+matriz[i][j];
                    }else{
                        fil3=fil3+matriz[i][j];
                    }    
            }
        }
        //cargar columnas{
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if(j==0){
                   col1=col1+matriz[i][j];
               }else if(j==1){
                   col2=col2+matriz[i][j];
               }else{
                   col3=col3+matriz[i][j];
               }
            }
        }
        //cargar diagonales principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if(i==j){
                   diag1=diag1+matriz[i][j];
                }           
            }
        }
        //cargar diagonal secundaria
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if((i+j)==2){
                   diag2=diag2+matriz[i][j];
               }
            }
        }
        if((col1==col2) && (col2==col3) && (col3==fil1) && (fil1==fil2) && (fil2==fil3) && (fil3==diag1) && (diag1==diag2)){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
    
    }
}


