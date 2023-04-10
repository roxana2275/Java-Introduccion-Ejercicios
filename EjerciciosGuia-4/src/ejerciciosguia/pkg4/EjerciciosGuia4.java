/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de grados en centigrados");
        double grados=leer.nextDouble();
        double conversionF=32+(9*grados/5);
        double conversionK=grados+273.15;
        System.out.println("El equivalente en Fahrenheit es "+conversionF);
        System.out.println("El equivalente en Kelvin es "+conversionK);
        
    }
    
}
