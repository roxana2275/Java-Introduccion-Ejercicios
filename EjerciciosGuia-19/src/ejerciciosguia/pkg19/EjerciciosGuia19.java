/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia.pkg19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuia19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        . Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa
        */
         Scanner leer= new Scanner(System.in);
        int [][] matriz= new int[3][3];
        int[][] matriz2= new int [3][3];
        boolean bol2; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Ingrese los valores de la fila " +i+ " columa " + j);
                matriz[i][j]=leer.nextInt();
               
            }
           
        }
               
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz2[j][i]= matriz[i][j];
                       
                    }
                            
        }
        imprimir(matriz);
        System.out.println(" " );
            imprimir(matriz2);
            
            bol2= compara(matriz,matriz2);
            System.out.println("¿La matriz es antisimética? " + bol2);
            
            
        }
        
        public static void imprimir(int[][] matriz){
            
            
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("[ "+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
                System.out.println("  ");
        
        }
        
        public static boolean compara(int [][]matriz,int[][]matriz2){
           boolean bol=false; 
           int cont=0; 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j]*-1== matriz2[i][j]) {
                        cont=cont+1;
                        
                    }
                }
                
            }
            if (cont==9) {
               bol=true; 
            }
        return bol;
        }
    
    

    }
    

