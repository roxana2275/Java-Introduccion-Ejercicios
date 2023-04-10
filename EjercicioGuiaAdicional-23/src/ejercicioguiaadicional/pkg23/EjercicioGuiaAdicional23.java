/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg23;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().
        */
        
       
    
        char[][] matriz = new char[20][20];
        
        String[] generarLista = generarLista();
        
        
        
        int[][] ubicacion = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            ubicacion[i] = (int)(Math.random()*20);
            for (int j = 0; j < 5; j++) {
                ubicacion[i][j] = (int)(Math.random()*20);
            }
            for (int j = 5; j < 0; j--) {
                if(ubicacion[i]==ubicacion[j]){
                ubicacion[i] = (int)(Math.random()*20);
                }
            }
        }
        
        
        
        for (int i = 0; i < 5; i++) {
            aleatorioColumna[i] = (int)(Math.random()*15);
        }
        
        
        for (int i = 0; i < 20; i++) {
            int aleatorio;
            do{
               aleatorio = (int)(Math.random()*20);
            }while(aleatorio<i);
            for (int j = 0; j < 20; j++) {
                if(aleatorio==i){
                    System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                    int aleatorio2 = (int)(Math.random()*15);
                    
                }
                
            }
            
        }
    }
    public static String[] generarLista (){
    Scanner leer = new Scanner (System.in);
    String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra entre 3 y 5 letras");
                palabras[i]=leer.next();
            } while (palabras[i].length()<3||palabras[i].length()>5);
        }
        return palabras;
    }
    
    
    
}
    

