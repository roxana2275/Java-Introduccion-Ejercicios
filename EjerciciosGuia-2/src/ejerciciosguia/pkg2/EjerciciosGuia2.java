/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla
        */
    Scanner leer=new Scanner (System.in);
        System.out.println("Por favor ingrese su nombre ");
        String nombre=leer.next();
        System.out.println("Hola "+nombre+" como estas?");
    
    
    }
    
}
