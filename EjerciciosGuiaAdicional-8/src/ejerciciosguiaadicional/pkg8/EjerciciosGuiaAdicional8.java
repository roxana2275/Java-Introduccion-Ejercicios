/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break
        */
       Scanner leer = new Scanner (System.in);
       int numero;
       int multiploCinco=1;
       int contador=0;
       int pares=0;
       int impares=0;
       do{
           System.out.println("Por favor ingrese un número");
           numero = leer.nextInt();
           int aux;
           aux=numero%5;
           contador+=1;
           if(aux==0){
               impares+=1;
               multiploCinco=0;
           }else{
               aux=numero%2;
               if(aux==0){
                   pares+=1;
               }else{
                   impares+=1;
               }
           }
       }while(multiploCinco!=0);
        System.out.println("La cantidad de numeros ingresados es "+contador);
        System.out.println("La cantidad de números pares es "+pares);
        System.out.println("La cantidad de números impares es "+impares);
                
    }
    
}
