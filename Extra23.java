/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().**/
    String matriz [][]= new String [20][20];   
    String palabra[]=new String [5];
    double fila []= new double[5];
    double columna[]=new double [5];
    ingresopalabras(palabra);
    ubicacionpalabras(matriz,palabra,fila,columna); //defini la posicion inicial de cada palabra en cuanto fila y columna
    rellenomatriz(matriz,palabra,fila,columna);
    mostrarmatriz(matriz);
    
        System.out.println("FIN DEL PROGRAMA. LAL");
    }
    public static void ingresopalabras(String [] palabra){
        boolean validacion=false;
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese palabra " + (i + 1) + " de entre 3 y hasta 5 caracteres:");
                String ingreso=leer.nextLine();
                if ((ingreso.length() > 2) && (ingreso.length() < 6)) {
                    palabra[i] = ingreso;
                    validacion = true;
                } else {
                    System.out.println("La longitud de la palabra no es válida. REINGRESE...");
                            i--;
                              validacion=false ;

                }

            } while (validacion == false);
            
              
                
            
        }
    }//fin ingresopalabras
    public static void ubicacionpalabras(String[][]matriz,String []palabra,double[]fila,double [] columna){
        filaAleatoria(fila);
        columnaAleatoria(columna,palabra);
        mostrarubicacion(fila,columna);
        
    }
    public static void filaAleatoria(double[] fila) {
        double a;
        double b;
        double c;
        boolean repeticion;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i+1); j++) {
            a = Math.random() * 10;
            b = Math.random() * 10;
            c = ((a - (a % 1)) + (b - (b % 1)));
            
                if ((fila[0] != c)&&(fila[1] != c)&&(fila[2] != c)&&(fila[3] != c)&&(fila[4] != c)) {
                    fila[i]=c;
            } else {
                    j--;
                }
            }
        }
    }
    public static void columnaAleatoria(double[]columna,String[]palabra){
        int largo;
         double a;
         double b;
         double c;
         boolean validacion=true;
         
         for (int i = 0; i < 5; i++) {
             largo=palabra[i].length();
             do {
                  a=Math.random()*10;
                  b=Math.random()*10;
                  c=((a-(a%1))+(b-(b%1)));
                  if (largo+c>19){validacion=false;} else {
                      validacion=true;
                      columna[i]=c;
                  }
                  
                 
             }while (validacion==false);
        }
    
}
    public static void mostrarubicacion(double[]fila, double[]columna){
    int j=0;
    for (int i = 0; i < 5; i++) {
        
            System.out.println("Fila "+fila[i]+" Columna "+columna[i]);
        }
    
}
    public static void rellenomatriz(String [][] matriz,String[] palabra, double []fila,double []columna){
        double a;
        int b;
        String c;
        int inicial;
        int fin;
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                a=Math.random() * 10;
                b = (int)a; //pasa double a entero
                c= String.valueOf(b); //pasa entero a String
                matriz[i][j]= c; //rellena mtriz con enteros
            }
            
        }
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < palabra[i].length(); j++) {
                
               
                matriz [(int)fila[i]][(int)columna[i]+j]= palabra[i].substring(j,j+1);
                
               
            }
        }
            
        }
   

    public static void mostrarmatriz(String[][]matriz){
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
               
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
}
}