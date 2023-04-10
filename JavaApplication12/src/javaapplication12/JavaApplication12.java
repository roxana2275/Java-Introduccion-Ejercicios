/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 10
        //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
        //ingresado seguido de tantos asteriscos como indique su valor. 
        
        Scanner leer = new Scanner (System.in);
        
        int contador=1;
        int num;
        
        do{
            
            System.out.println("Por favor ingrese 4 numeros entre 1y 20");
            num = leer.nextInt();
            
            if (num>0 && num<20){
            contador++;
            System.out.print(num);
            for (int i=0; i<num;i++){
                System.out.print("*");
            }
            System.out.println("");
            }
           
        }while(contador<5);
        
    }
    
}
