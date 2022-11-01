/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_2 {

    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el valor de A");
        int A=leer.nextInt();
        System.out.println("Ingrese el valor de B");
        int B=leer.nextInt();
        System.out.println("Ingrese el valor de C");
        int C=leer.nextInt();
        System.out.println("Ingrese el valor de D");
        int D=leer.nextInt();
        
        int X;
        X=B;
        B=C;
        C=A;
        A=D;
        D=X;
        
        System.out.println("el Valor nuevo de A es:" + A);
        System.out.println("el Valor nuevo de B es:" + B);
        System.out.println("el Valor nuevo de C es:" + C);
        System.out.println("el Valor nuevo de D es:" + D);
    }
    
    
}
