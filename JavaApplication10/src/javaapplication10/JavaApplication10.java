/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 8
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
        //pedirá de nuevo hasta que la nota sea correcta. 
        
        Scanner leer = new Scanner (System.in);
                System.out.println("Por favor ingrese un número entre 0 y 10");
        int eleccion = leer.nextInt();
        
        
        while(eleccion<0||eleccion>10){
            System.out.println("Por favor ingrese un número entre 0 y 10");
            eleccion = leer.nextInt();
        }
        
    }
    
}
