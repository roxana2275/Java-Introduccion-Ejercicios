/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiaadicional.pkg21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Modulo de Alumnos EGG");
        System.out.println("---------------------");
        boolean salir = false;
        do{
            System.out.println("--------------------------");
            System.out.println("          Menu            ");
            System.out.println("--------------------------");
            System.out.println("1-Cargar Nota Alunnos");
            System.out.println("2-Consultar Cantidad de aprobados");
            System.out.println("3-Consultar Alumnos aprobados");
            System.out.println("4-Consultar Cantidad de desaprobados");
            System.out.println("5-Consultar Alumnos desaprobados");
            System.out.println("6-Salir");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de alumnos");
                    int largo = leer.nextInt();
                    String[][] notas = new String [largo][6];
                    cargarDatos(notas,largo);
                    break;
                case 2:
                    if(vacio(notas,largo)!=false){
                        System.out.println("Primero debe ingresar los datos");
                    }else{
                        aprobados(notas,largo);
                    }                    
                    break;
                case 3:
                    listaAprobados(notas,largo);
                    break;
                case 4:
                    if(vacio(notas,largo)==false){
                        System.out.println("Primero debe ingresar los datos");
                    }else{
                        desaprobados(notas,largo);
                    }    
                    break;
                case 5:
                    listaDesaprobados(notas,largo);
                    break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            
        }while(salir==true);
                
    }
    public static void cargarDatos(String[][] notas,int largo){
        Scanner leer = new Scanner (System.in);
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        do{
                        System.out.println("Ingrese el nombre el alumno ");
                        notas[i][j] = leer.next();
                        } while (notas[i][j].equals(""));
                        break;
                    case 1:
                        int auxiliar1;
                        do{
                        System.out.println("Ingrese la nota del primer trabajo practivo de "+notas[i][0]);
                        notas[i][j] = leer.next();
                        auxiliar1= Integer.parseInt(notas[i][j]);
                        } while (auxiliar1<0||auxiliar1>10);
                        break;
                    case 2:
                        int auxiliar2;
                        do{
                        System.out.println("Ingrese la nota del segundo trabajo practivo de "+notas[i][0]);
                        notas[i][j] = leer.next();
                        auxiliar2= Integer.parseInt(notas[i][j]);
                        } while (auxiliar2<0||auxiliar2>10);
                        break;
                    case 3:
                        int auxiliar3;
                        do{
                        System.out.println("Ingrese la nota del primer integrador de "+notas[i][0]);
                        notas[i][j] = leer.next();
                        auxiliar3= Integer.parseInt(notas[i][j]);
                        } while (auxiliar3<0||auxiliar3>10);
                        break;
                    case 4:
                        int auxiliar4;
                        do{
                        System.out.println("Ingrese la nota del segundo integrador de "+notas[i][0]);
                        notas[i][j] = leer.next();
                        auxiliar4= Integer.parseInt(notas[i][j]);
                        } while (auxiliar4<0||auxiliar4>10);
                        break;
                    case 5:
                        notas[i][j] = String.valueOf(Integer.parseInt(notas[i][1])*10/100+Integer.parseInt(notas[i][2])*15/100+Integer.parseInt(notas[i][3])*25/100+Integer.parseInt(notas[i][4])*50/100);
                        break;
                }
            }
        }
    }
   
    public static Boolean vacio (String[][] matriz, int largo){
        int contador = 0;
        Boolean resultado = false;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < 5; j++) {
                if(!"".equals(matriz[i][j])){
                    contador +=1;
                }
            } 
        }
        if (contador==0){
            resultado=true;
        }
        return resultado;
    }
    public static int aprobados(String[][] notas, int largo){
        int cantidad=0;
        for (int i = 0; i < largo; i++) {
            for (int j = 5; j < 6; j++) {
                if(j>=7){
                    cantidad +=1;
                }
            } 
        }
        return cantidad;
    }
    public static int desaprobados(String[][] notas, int largo){
        int cantidad=0;
        for (int i = 0; i < largo; i++) {
            for (int j = 5; j < 6; j++) {
                if(j<7){
                    cantidad +=1;
                }
            } 
        }
        return cantidad;
    }
    public static void listaAprobados(String[][]matriz, int largo){
        for (int i = 0; i < largo; i++) {
            for (int j = 5; j < largo; j--) {
                int auxiliar = Integer.parseInt(matriz[i][j]);
                    if(auxiliar>=7){
                        System.out.print(matriz[i][0]+" ");
                    }

            } 
        }
    }
    public static void listaDesaprobados(String[][]matriz, int largo){
        
        for (int i = 0; i < largo; i++) {
            for (int j = 5; j < largo; j--) {
                int auxiliar = Integer.parseInt(matriz[i][j]);
                if(auxiliar<7){
                    System.out.print(matriz[i][0]+" ");
                }

            } 
        }
            
    }
}
