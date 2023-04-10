/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
                * * * * 
                *     *
                *     *
                * * * *
        */
        Scanner leer = new Scanner (System.in);
        int tamanio;
        
        System.out.println("Por favor ingrese el tamaño del cuadrado");
        tamanio=leer.nextInt();
        
        for(int i=0;i<tamanio;i++){
            for (int j=0; j<tamanio;j++){
                if(i==0 || i==(tamanio-1)||j==0||j==(tamanio-1)){
                    System.out.print("*");
            }else{
                    System.out.print(" ");
                } 
        }
            System.out.println("");
            
        }
        
    }
    
}
