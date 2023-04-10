/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java
        */
        Scanner leer = new Scanner (System.in);
        int num1,num2,num3,numRespuesta;
        
        num1=(int) (Math.random()*9+1);
        num2=(int) (Math.random()*9+1);
        num3=num1*num2;
        char respuesta;
        boolean pregunta=false;
        do{
            System.out.println("Ingrese el resultado de multiplicar dos números del 1 al 9");
            numRespuesta = leer.nextInt();
            if(numRespuesta==num3){
                System.out.println("Respuesta correcta. Los números son "+num1+" y "+num2);
                pregunta=true;
            }else{
                System.out.println("La respuesta es incorrecta. Quiere seguir intentando?(S/N)");
                respuesta=leer.next().charAt(0);
                if(respuesta=='n'||respuesta=='N'){
                    System.out.println("Los números son "+num1+" y "+num2+" y el resultado "+num3);
                    pregunta=true;
                }
            }
        }while(pregunta==false);
        
    }
    
}
