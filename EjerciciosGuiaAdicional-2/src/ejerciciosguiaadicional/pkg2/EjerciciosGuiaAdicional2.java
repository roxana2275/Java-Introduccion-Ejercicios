/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiaadicional.pkg2;

/**
 *
 * @author Usuario
 */
public class EjerciciosGuiaAdicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar
        */
       int A,B,C,D,aux;
       A=1;
       B=2;
       C=3;
       D=4;
       aux=B;
        System.out.println("A:"+A+" B:"+B+" C:"+C+" D:"+D);
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Ahora cambié los valores A:"+A+" B:"+B+" C:"+C+" D:"+D);
    }
    
}
