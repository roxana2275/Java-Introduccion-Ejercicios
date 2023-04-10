/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú
        */
        
       Scanner leer = new Scanner(System.in);

        boolean bandera = false;
        System.out.println("Ingrese un numero :");
        int num = leer.nextInt();
        System.out.println("Ingrese un numero :");
        int num1 = leer.nextInt();

        do {

            System.out.println("Elija una de las sgtes opciones: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(num + num1);
                    break;
                case 2:
                    System.out.println(num - num1);
                    break;
                case 3:
                    System.out.println(num * num1);
                    break;
                case 4:
                    System.out.println(num / num1);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    char prog = leer.next().charAt(0);
                    if (prog == 's' || prog == 'S') {
                        bandera = true;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (bandera == false);
        
    }
    
}
