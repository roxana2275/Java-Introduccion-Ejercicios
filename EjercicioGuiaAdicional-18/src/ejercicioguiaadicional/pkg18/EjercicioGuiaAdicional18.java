/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        . Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario
        */
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el tamaño del vector");
        int tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        int sumador = 0;
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Por favor ingrese el valor "+(i+1)+" del vector.");
            vector[i]=leer.nextInt();
            sumador =sumador+vector[i];
        }
        System.out.println("La suma del vector es "+sumador);
        
        
    }
    
}
