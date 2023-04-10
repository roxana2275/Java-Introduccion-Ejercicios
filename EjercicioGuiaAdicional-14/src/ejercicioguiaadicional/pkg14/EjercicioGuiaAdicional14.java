/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias
        */
       Scanner leer = new Scanner (System.in);
       int N,M,cantidad=0,edades=0;
        System.out.println("Por favor ingrese la cantidad de familias ");
        N = leer.nextInt();
        for (int i = 1; i < N+1; i++) {
            System.out.println("Por favor ingrese la cantidad de hijos de la familia "+i);
            M = leer.nextInt();
            cantidad = cantidad+M;
            for (int j = 1; j < M+1; j++) {
                System.out.println("Por favor ingrese de la familiar "+i+" la edad del hijo "+j);
                edades = edades + leer.nextInt();
            }
            
        }
        System.out.println("El promedio de edades es "+(edades/cantidad));
        
    }
    
}
