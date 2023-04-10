/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del 
Scanner. 
DETECCIÓN DE ERRORES
Arreglar la siguiente porción de codigo.
public static void main(String[] args) { 
 Scanner leer = new Scanner(); 
 System.out.println("Ingresa tu edad");
 String nombre = leer.nextInt();
 
 System.out.println("Ingresa tu nombre");
 int edad = leer.next();*/
       
       Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese si es false o true");
        boolean resultado=leer.nextBoolean();
        System.out.println("Escribiste "+resultado);
        System.out.println("Por favor ingrese un numero con decimales");
        double numero = leer.nextDouble();
        System.out.println("Escribiste "+numero);
        System.out.println("Por favor ingrese un entero");
        char variable=leer.next().charAt(0);
        System.out.println("Escribiste "+variable);
                
        System.out.println("----------------------");
        
        

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        System.out.println("Ingresa tu nombre");
 
        String nombre = leer.nextLine();
    }
    
    
}
