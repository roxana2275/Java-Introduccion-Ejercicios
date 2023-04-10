/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”
         */
        Scanner leer = new Scanner(System.in);
        int cantidad;
        int maximo;
        int minimo;
        int total = 0;

        do {
            //pido el tamaño del vector
            System.out.println("Por favor ingrese la cantidad de números que va a ingresar");
            cantidad = leer.nextInt();
        } while (cantidad < 1);
        //genero el vector y le asigno la dimensión
        int[] num = new int[cantidad];
        //pregunto valores a cargar al vector
        for (int i = 0; i < cantidad; i++) {
            do {
                System.out.println("Por favor ingrse el número " + i);
                num[i] = leer.nextInt();

                //sumo para sacar promedio
                total = total + num[i];
            } while (num[i] < 0);

        }
        //asigno valor al maximo para poder comparar
        maximo = num[1];
        //bucle para recorrer el vector y saber cual es el número mas grande
        for (int i = 0; i < cantidad; i++) {
            if (num[i] > maximo) {
                maximo = num[i];
            }
        }
        //asigno valor al minimo para poder comparar
        minimo = num[1];
        //bucle para recorrer el vector y sacar cual es el valor mas chico
        for (int i = 0; i < cantidad; i++) {
            if (num[i] < minimo) {
                minimo = num[i];
            }
        }
        System.out.println("El valor maximo es: " + maximo);
        System.out.println("El valor minimo es: " + minimo);
        System.out.println("El promedio es: " + (total / cantidad));
        System.out.println("-----------------------------------------------");

        int cantidad2;
        System.out.println("Por favor ingrese la cantidad de datos que va a ingresar");
        cantidad2 = leer.nextInt();
        while (cantidad2 < 1) {
            System.out.println("Por favor ingrese la cantidad de datos que va a ingresar");
            cantidad2 = leer.nextInt();
        }
        int[] num2 = new int[cantidad2];
        int total2 = 0;

        for (int i = 0; i < cantidad2; i++) {
            System.out.println("Por favor ingrese el valor " + (i + 1));
            num2[i] = leer.nextInt();
            while (num2[i] < 0) {
                System.out.println("El valor debe ser mayor a 0");
                num2[i] = leer.nextInt();
            }
            total2 = total2 + num2[i];
        }
        //asigno valor al maximo para poder comparar
        int maximo2 = num2[1];
        //bucle para recorrer el vector y saber cual es el número mas grande
        for (int i = 0; i < cantidad2; i++) {
            if (num2[i] > maximo2) {
                maximo2 = num2[i];
            }
        }
        //asigno valor al minimo para poder comparar
        int minimo2 = num2[1];
        //bucle para recorrer el vector y sacar cual es el valor mas chico
        for (int i = 0; i < cantidad2; i++) {
            if (num2[i] < minimo2) {
                minimo2 = num2[i];
            }
        }
        System.out.println("El valor maximo es: " + maximo2);
        System.out.println("El valor minimo es: " + minimo2);
        System.out.println("El promedio es: " + (total2 / cantidad2));

    }
    
}
