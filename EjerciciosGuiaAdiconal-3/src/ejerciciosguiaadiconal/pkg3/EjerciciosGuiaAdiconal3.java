/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadiconal.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdiconal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
        */
        
        Scanner leer=new Scanner (System.in);
        System.out.println("Por favor ingrese una letra:");
        char letra=leer.next().charAt(0);
        switch(letra){
            case'a':case'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
                System.out.println("Ha ingresado una vocal");
                break;
            default:
                System.out.println("Gracias");
                break;
        
    }
        
    }
    
}
