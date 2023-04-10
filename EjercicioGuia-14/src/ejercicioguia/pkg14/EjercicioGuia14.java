/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
        */
       
       Scanner leer = new Scanner (System.in);
       double euros;
       int moneda;
        System.out.println("Por favor ingrese la cantidad euros");
        euros = leer.nextDouble();
        boolean eleccion=false;
        do{
        System.out.println("Por favor ingrese: ");
        System.out.println("1-Conversión a dolares");
        System.out.println("2-Conversion a yenes");
        System.out.println("3-Conversión a libras");
        moneda = leer.nextInt();
        if(moneda==1 || moneda==2 || moneda==3){
            eleccion=true;
        }
        }while(eleccion==false);
        conversion(euros,moneda);
    } 
    public static void conversion(double valor, int resultado){
        double conv=0;
        switch (resultado){
            case 1:
                conv=valor*0.86;
                break;
            case 2:
                conv=valor*1.28611;
                break;
            case 3 :
                conv=valor*129.852;
                break;
        }
        System.out.println(conv);
    }
}
