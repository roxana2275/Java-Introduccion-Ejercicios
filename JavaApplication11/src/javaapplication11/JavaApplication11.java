/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break
        */
        Scanner leer= new Scanner (System.in);
        int numero;
        int contador=1;
        int resultado=0;
        do{
            System.out.println("Por favor ingrese 20 números");
            numero = leer.nextInt();
            
            if(numero!=0){
                    if (numero>0){
                        resultado =resultado+numero;
                        contador++;
                    }else{
                    if(numero<0){
                        contador++;
                    }
                }
            }else{
                break;
            }
            
        }while(contador<21);
        
        System.out.println("La suma de los números mayores a cero es "+resultado);
        
    }
    
}
