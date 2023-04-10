/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(
        */
    Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero");
        int num1=leer.nextInt();
        double doble = leer.nextDouble();
        double sqrtValue = Math.sqrt(num1);
        System.out.println("El doble de "+num1+" es "+(num1*2));
        System.out.println("El triple de "+num1+" es "+(num1*3));
        System.out.println("La raíz cuadrada de "+num1+" es "+sqrtValue);
    
    
    }
    
}
