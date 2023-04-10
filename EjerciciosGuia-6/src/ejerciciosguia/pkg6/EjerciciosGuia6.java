/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un numero determine si es par o impar.
        
         Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = leer.nextInt();
        if (numero%2==0){
            System.out.println("El numero es PAR");
        }else {
            System.out.println("El numro es IMPAR");
        } 

    }
}
