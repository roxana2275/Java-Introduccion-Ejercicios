/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        */
   /*
        EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
        */
    
    Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el tamapo del arreglo");
        int tamanio = leer.nextInt();
        String[] equipo= new String[tamanio];
        // asignar el tamapo del equipo
        System.out.println("El tamaño del array equipo es "+equipo.length);
        //asignar valores al equipo   
        for(int i=0; i<equipo.length-1;i++){
            System.out.println("Por favor ingrese el equipo "+i);
            equipo[i]=leer.next();
        }
        //Mostrar valores en equipo
        for(int i=0; i<equipo.length-1;i++){
            System.out.println("El equipo "+i+" es "+equipo[i]);
        }
    }
    
}
