/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados
        */
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador=0, auxiliar=0;
        
        System.out.println("Por favor ingrese un número mayor a 1");
        numero = leer.nextInt();
        
        while(numero<1){
            System.out.println("Por favor ingrese un número mayor a 0");
            numero = leer.nextInt();
        }
        do{
            auxiliar=numero/10;
            contador+=1;
            numero=auxiliar;
            
        }while(auxiliar!=0);
        System.out.println("El numero tiene "+contador+" digitos.");
    }
    
}
