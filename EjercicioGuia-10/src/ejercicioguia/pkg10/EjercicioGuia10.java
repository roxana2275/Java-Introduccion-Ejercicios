/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        */
       Scanner leer=new Scanner(System.in);
        System.out.println("Por favor ingrese un limite");
        int limite=leer.nextInt();
        int suma=0;
        
        do{
            System.out.println("Por favor ingrese un numero");
            suma=suma+leer.nextInt();
        }while(suma<limite);
    }
    
}
