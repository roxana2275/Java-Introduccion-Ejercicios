/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg15;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("Vamos a calcular");
        System.out.println("----------------");
        
       
        int num1,num2,opcion,respuesta;
        
        do{
            System.out.println("Por favor ingrese dos números enteros mayores a 0");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        }while(num1<1 || num2<1);
        
        
        System.out.println("Por favor ingrese:");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicación");
        System.out.println("4-Division");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                sumar(num1,num2);
                break;
            case 2:
                restar(num1,num2);
                break;
            case 3:
                multiplicar(num1,num2);
                break;
            case 4:
                dividir(num1,num2);
                break;
            default:
                System.out.println("Opción no valida");
                break;
                
        }  
    }
    public static void sumar(int numero1, int numero2){
        System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
    }
    public static void restar(int numero1, int numero2){
        if(numero1>numero2){
            System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
        }else{
            System.out.println(numero2+" - "+numero1+" = "+(numero2-numero1));
        }
    }
    public static void multiplicar(int numero1, int numero2){
        System.out.println(numero1+" x "+numero2+" = "+(numero1*numero2));
    }
    public static void dividir(int numero1, int numero2){
        if(numero1>numero2){
            System.out.println(numero1+" / "+numero2+" = "+(numero1/numero2));
        }else{
            System.out.println(numero2+" / "+numero1+" = "+(numero2/numero1));
        }
    }
}
