/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre="Roxana";
    int edad=47;
    System.out.println("Mi nombre es "+nombre+" tengo "+edad+" años.");
    
    Scanner leer=new Scanner(System.in);
    
    System.out.println("Por favor ingrese su nombre");
    String nombre2=leer.nextLine();
    System.out.println("Por favor ingrese su edad");
    int edad2=leer.nextInt();
    
    System.out.println("Su nombre es "+nombre2+" y tiene "+edad2+" años.Mal");
    
    }
    
}
