/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general
        */
        Scanner leer = new Scanner (System.in);
        double alturaMenor=0;
        double altura=0;
        int cantidadMenor=0, cantidad=0;
        String continuar="S";
        String aux2;
        do{
            System.out.println("Por favor ingrese la altura");
            double aux=leer.nextDouble();
            if(aux<1.6){
                alturaMenor=alturaMenor+aux;
                altura=altura+aux;
                cantidadMenor+=1;
                cantidad+=1;  
            }else{
                altura=altura+aux;
                cantidad+=1;  
            }
            System.out.println("Desea agregar otra altura? Seleccione S/N en mayúscula");
            aux2=leer.next();
        }while(continuar.equals(aux2));
        
        System.out.println("La altrua promedio menor a 1.60 metros: "+(alturaMenor/cantidadMenor));
        System.out.println("La altrua promedio es: "+(altura/cantidad));
    }
    
}
