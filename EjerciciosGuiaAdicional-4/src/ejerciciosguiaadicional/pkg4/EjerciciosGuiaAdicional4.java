/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano
        */
        Scanner leer = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Por favor ingrese un numero entre 1 y 10");
            numero=leer.nextInt();
        }while(numero<0||numero>10);
        switch(numero){
            case 1:
                System.out.println("El equivalente es numeros romanos es I");
                break;
            case 2:
                System.out.println("El equivalente es numeros romanos es II");
                break;
            case 3:
                System.out.println("El equivalente es numeros romanos es III");
                break;
            case 4:
                System.out.println("El equivalente es numeros romanos es IV");
                break;
            case 5:
                System.out.println("El equivalente es numeros romanos es V");
                break;
            case 6:
                System.out.println("El equivalente es numeros romanos es VI");
                break;
            case 7:
                System.out.println("El equivalente es numeros romanos es VII");
                break;
            case 8:
                System.out.println("El equivalente es numeros romanos es VIII");
                break;
            case 9:
                System.out.println("El equivalente es numeros romanos es IX");
                break;
            case 10:
                System.out.println("El equivalente es numeros romanos es X");
                break;
        }
        
    }
    
}
