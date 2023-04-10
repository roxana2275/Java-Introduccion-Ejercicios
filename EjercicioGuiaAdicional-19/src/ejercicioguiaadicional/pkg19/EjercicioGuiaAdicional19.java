/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)
        */
        Scanner leer = new Scanner (System.in);
        int tamanio;
        System.out.println("Por favor ingrese el tamanio del los vectores");
        tamanio = leer.nextInt();
        int[] vectorA = new int[tamanio];
        int[] vectorB = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Inngrese el valor del vectorA la posición "+i);
            vectorA[i] = leer.nextInt();
        }
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Inngrese el valor del vectorB la posición "+i);
            vectorB[i] = leer.nextInt();
        }
        int contador=0;
        for (int i = 0; i < tamanio; i++) {
            if(vectorA[i]!=vectorB[i]){
                System.out.println("Los vectores no son iguales");
                break;
            }else{
                contador+=1;
            }
            
        }
        if(contador==tamanio){
            System.out.println("Los vectores son iguales");
        }
    }
    
}
