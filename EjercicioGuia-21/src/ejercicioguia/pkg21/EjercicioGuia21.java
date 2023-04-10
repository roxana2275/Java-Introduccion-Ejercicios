/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg21;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P
         */
        int[][] matrizUno = new int[10][10];
        int[][] matrizDos = new int[3][3];
        int contador=0;
        int contadorTotal=0;
        
        //Generar matriz de 10*10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizUno[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        //Imprimir matriz de 10*10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizUno[i][j] + "]");
            }
            System.out.println("");
        }
        //Imprimir separador de matrices
        System.out.println("");

        //Generar matriz de 3*3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizDos[i][j] =  (int) (Math.random() * 9 + 1);
            }
        }

        //Imprimir matriz de 3*3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizDos[i][j] + "]");
            }
            System.out.println("");
        }
        //Comparar matrices    

        //Fila 1 columna 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("Fila 1 columna 1");contadorTotal+=1;
        }
        contador=0;
        //Fila 1 columna 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 1]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("Fila 1 columna 2");
            contadorTotal+=1;
        }
        contador=0;
        //Fila 1 columna 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 2]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("Fila 1 columna 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 1 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 3]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 1 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 1 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 4]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 1 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 1 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 5]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 1 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 1 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 6]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 1 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 1 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i][j + 7]) {
                    contador+=1; 
                }
            }
        }
        if (contador == 9) {
            System.out.println("fila 1 columa 8");
            contadorTotal+=1;
        }
        contador = 0;
        //fila 2 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 2 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 1]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 2 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 2 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 3]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 2 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila2 columna 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 5]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 2 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 6]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 2 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 2 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 1][j + 7]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 2 columa 8");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 3 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 1]) {
                    contador+=1; 
                }
            }
        }
 if(contador==9){
            System.out.println("fila 3 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 3 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 3]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 3 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 3 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 5]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 3 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 6]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 3 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 3 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 2][j + 7]) {
                    contador+=1; 
                }
            }
        } if(contador==9){
            System.out.println("fila 3 columa 8");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 1]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 3]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 5]) {
                    contador+=1; 
                }
            }
        }
        if(contador==9){
            System.out.println("fila 4 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 6]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 4 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 3][j + 7]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 4 columa 8");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 1]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 3]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 5]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 6]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 5 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 4][j + 7]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 5 columa 8");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 1]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 3]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 5]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 6]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 6 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 5][j + 7]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 6 columa 8");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 1]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 3]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 5]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 6]) {
                   contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 7 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 6][j + 7]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 7 columa 8");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 1");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 1]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 2");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 2]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 3");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 4
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 3]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 4");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 5
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 4]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 5");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 6
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 5]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 6");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 6]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 7");
            contadorTotal+=1;
        }
        contador=0;
        //fila 8 columa 8
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizDos[i][j] == matrizUno[i + 7][j + 7]) {
                    contador+=1; 
                }
            }
        }
         if(contador==9){
            System.out.println("fila 8 columa 8");
            contadorTotal+=1;
        }
       
        System.out.println("La matriz se repite "+contadorTotal+" veces.");
    }
}

