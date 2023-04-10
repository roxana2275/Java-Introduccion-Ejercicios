/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
        */
        Scanner leer = new Scanner (System.in);
        boolean continuar = true;
        char respuesta;
        do{
           ingresarDatos();
            System.out.println("Quiere ingresar otra persona?");
            respuesta = leer.next().charAt(0);
            if(respuesta=='N'||respuesta=='n'){
                continuar=false;
            }else if(respuesta!='N'||respuesta!='S'||respuesta=='n'||respuesta=='s'){
                System.out.println("Opción no valida");
                continuar=true;
            }
        }while(continuar==true);
    }
    public static void ingresarDatos(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Por favor ingrese la edad de la persona");
        int edad = leer.nextInt();
        if(edad<18){
            System.out.println("La persona "+nombre+" es menor de edad");
        }else{
            System.out.println("La persona "+nombre+" es mayor de edad");
        }
    }
    
}
