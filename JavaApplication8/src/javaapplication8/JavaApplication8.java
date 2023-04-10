/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
alguno de ellos es mayor a 25*/
        
        Scanner leer = new Scanner(System.in);
        
        int numA, numB;
        
        System.out.println("Por favor ingrese dos números");
        numA= leer.nextInt();
        numB=leer.nextInt();
        
        if (numA>25 || numB>25){
            System.out.println("Alguno de los dos números es mayor a 25");
        }else{
            System.out.println("Ninguno de los números es mayor a 25");
        }
        
    }
    
}
