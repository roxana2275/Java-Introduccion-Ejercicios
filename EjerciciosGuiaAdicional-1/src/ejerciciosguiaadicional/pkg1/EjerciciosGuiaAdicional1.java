/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
        */
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el tiempo en minutos");
        int minutos=leer.nextInt();
        int horas=minutos/60;
        int dias=horas/24;
        int horasMenor=horas-dias*24;
        
        System.out.println("El equivalente es a "+dias+" día "+horasMenor+" minutos ");
        
    }
    
}
