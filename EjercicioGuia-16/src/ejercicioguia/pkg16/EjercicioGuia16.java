/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
        */
        Scanner leer = new Scanner (System.in);
        int tamanioVector;
        int numeroBuscar;
        System.out.println("Por favor ingrese el tamaño del vector");
        tamanioVector=leer.nextInt();
        System.out.println("Por favor ingrese el numero a buscar");
        numeroBuscar=leer.nextInt();
        int repetido=0;
        
        int[] vector = new int[tamanioVector];
        for(int i=0 ; i<tamanioVector; i++){
            vector[i]= (int) (Math.random()*10);
        }
        for (int i=0 ; i<tamanioVector ; i++){
            if(vector[i]== numeroBuscar){
                System.out.println("El numero "+numeroBuscar+" se encuentra en la posición "+i); 
                repetido+=1;
            }
        }
        if(repetido>0){
            System.out.println("El número "+numeroBuscar+" esta repetido");
        }else{
            System.out.println("El número "+numeroBuscar+" no esta repetido");
        }
        
        
    }
    
}

