/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
        */
        
        Scanner leer = new Scanner (System.in);
        int numeroUno, numeroDos, aux1, numeroMayor,numeroMenor;
        do{
            System.out.println("Por favor ingrese dos numeros naturales mayores a 0");
            numeroUno = leer.nextInt();
            numeroDos = leer.nextInt();
        }while(numeroUno<2 && numeroDos<2);
        
        if (numeroUno>numeroDos){
                numeroMayor = numeroUno;
                numeroMenor = numeroDos;
            }else{
                numeroMayor = numeroDos;
                numeroMenor = numeroUno;
            }
        
        do{
        
            aux1=numeroMayor-numeroMenor;
            System.out.println(numeroMayor+" - " + numeroMenor+" = "+aux1);
            if(aux1>=numeroMenor){
                numeroMayor = aux1;
            }
        }while(aux1>=numeroMayor);
       
    }
    
}
