/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
segundo, sino informe que no lo son
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el primer número");
        int num1=leer.nextInt();
        System.out.println("Por favor ingrese el segundo número");
        int num2=leer.nextInt();
        int resto;
        if (num1>num2){
            resto=num2%num1;
            if(resto==0){
            System.out.println("El número "+num2+" es múltiplo de "+num1);
            }else{
                System.out.println("El número "+num2+" no es múltiplo de "+num1);
            }
        }else{
            resto=num2%num1;
            if(resto==0){
            System.out.println("El número"+num1+" es múltiplo de "+num2);
            }else{
                System.out.println("El número"+num1+" no es múltiplo de "+num2);
            }
        }
     }
    
}
