/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg20;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        . Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamanio del vecto");
        int tamanio = leer.nextInt();
        llenarVector(tamanio);
    }
    public static void llenarVector(int dimension){
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i]=(int)(Math.random()*10);
        }
        impirmirVector(vector);
    }
    public static void impirmirVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]"+" ");
        }
        System.out.println("");
    }
}
