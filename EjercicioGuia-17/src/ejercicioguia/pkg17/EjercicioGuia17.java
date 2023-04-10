/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos)
        */
        Scanner leer = new Scanner(System.in);
        //creacion del vector
        int tamanioVector;
        System.out.println("Por favor ingrese el tramaño del vector");
        //creacion de tamapo de vector
        tamanioVector = leer.nextInt();
        int[] vector= new int[tamanioVector];
        //asignación de valores al vector
        for(int i=0 ; i<tamanioVector ; i++){
            vector[i]=(int)(Math.random()*100000);
        }
        
        //impresión del vector
        for (int i=0 ; i<tamanioVector ; i++){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("-------------------------");
        //contador de dígitos
        int digitos1=0;
        int digitos2=0;
        int digitos3=0;
        int digitos4=0;
        int digitos5=0;
        //int aux=0;
        int aux2=0;
        for (int i=0 ; i<tamanioVector ; i++){
            if(vector[i]/10==0){
                digitos1+=1;
            }else if(vector[i]/100==0){
                digitos2+=1;
            }else if(vector[i]/1000==0){
                digitos3+=1;
            }else if(vector[i]/10000==0){
                digitos4+=1;
            }else{
                digitos5+=1;
            }
            }
        System.out.println("-------------------------");
        System.out.println("La cantidad con 1 digito es: "+digitos1);
        System.out.println("-------------------------");
        System.out.println("La cantidad con 2 digito es: "+digitos2);
        System.out.println("-------------------------");
        System.out.println("La cantidad con 3 digito es: "+digitos3);
        System.out.println("-------------------------");
        System.out.println("La cantidad con 4 digito es: "+digitos4);
        System.out.println("-------------------------");
        System.out.println("La cantidad con 5 digito es: "+digitos5);
        System.out.println("-------------------------");
        }
   
}
