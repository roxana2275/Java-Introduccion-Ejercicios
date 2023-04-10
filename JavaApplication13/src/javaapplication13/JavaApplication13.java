/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario singresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10
        
        */
    Scanner leer = new Scanner(System.in);
    String fraseInicial;
    System.out.println("Por favor ingrese una frase finalizando con un .");
    fraseInicial = leer.nextLine();
    String resultado;
    resultado = encriptar(fraseInicial);
    System.out.println(resultado);
       }
    public static String encriptar (String frase){  
        String fraseNueva="";
        char letra;
        
    for(int i=0; i<frase.length(); i++) {
        letra=frase.charAt(i);
        if (letra=='.'){
            fraseNueva=fraseNueva.concat(".");
            break;
            }else if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||
                      letra=='u'||letra=='A'||letra=='E'||letra=='I'||
                      letra=='O'||letra=='U'){
                switch(letra){
                    case 'a':case 'A':
                        fraseNueva=fraseNueva.concat("@");
                        break;
                    case 'e':case 'E':
                        fraseNueva=fraseNueva.concat("#");
                        break;
                    case 'i':case 'I':
                        fraseNueva=fraseNueva.concat("%");
                        break;
                    case 'o':case 'O':
                        fraseNueva=fraseNueva.concat("$");
                        break;
                    case 'u':case 'U':
                        fraseNueva=fraseNueva.concat("*");
                        break;
                }
            }else{
                String str = Character.toString(letra);
                fraseNueva=fraseNueva.concat(str);
            }

        }   
      return fraseNueva;
    }
}
    
    
    
 
