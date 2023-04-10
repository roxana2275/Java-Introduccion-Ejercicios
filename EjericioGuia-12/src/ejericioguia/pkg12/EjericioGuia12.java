/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericioguia.pkg12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjericioGuia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals()
        */
        Scanner leer = new Scanner(System.in);
        String cadena;
        boolean fin=false;
        String fde="&&&&&";
        int correctas=0;
        int incorrectas=0;
        int largo;
        char parametroInicio;
        char parametroFinal;
        do{
            System.out.println("Ingrese cadena");
            cadena=leer.nextLine();
            //lee largo de cadena
            largo=cadena.length();
            //lee primer caracter cadena
            parametroInicio=cadena.substring(0).charAt(0);
            //lee ultimo caracter de la cadena
            parametroFinal=cadena.substring(largo-1).charAt(0);
            //control de fin de cadena
            if(cadena.equals(fde)){
            fin=true;
            //control de tamaño de cadena
            }else if(largo!=5){
               incorrectas+=1; 
            //control de formato de cadena
            }else if( parametroInicio=='X' && parametroFinal=='O'){
                correctas=correctas+1;
            }else{
                incorrectas+=1;
            }
        }while(fin==false);
        
        System.out.println("Correctas: "+correctas);
        System.out.println("Incorrectas: "+incorrectas);
    }
    
}
