/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio
        */
        Scanner leer = new Scanner (System.in);
        char socio;
        int tratamiento;
        double descuento;
        do{
            System.out.println("Por favor ingrese el tipo de socio A, B o C");
            socio= leer.next().charAt(0);
        }while(socio!='A' && socio!= 'B' && socio!= 'C' && socio!='a' && socio!= 'b' && socio!= 'c');
        
        System.out.println("Por favor ingrese el valor del tratamiento a realizar");
        tratamiento=leer.nextInt();
        
        if(socio=='A'||socio=='a'){
            descuento=tratamiento*0.5;
            System.out.println("El descuento es $"+descuento);
        }else if (socio=='B'||socio=='b'){
            descuento=tratamiento*0.35;
            System.out.println("El descuento es $"+descuento);
            
        }else{
            System.out.println("El descuento es de $0");
        }
    }
    
}
