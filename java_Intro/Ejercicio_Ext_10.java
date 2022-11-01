/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package primera_guia;

import java.util.Scanner;


public class Ejercicio_Ext_10 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int n1=(int)(Math.random()*10+1);
     int n2=(int)(Math.random()*10+1);
     int Resultado=n1*n2;
     int respuesta=0;
     
     while (Resultado==respuesta){
            System.out.println("Ingrese un posible resultado de la multiplicación de 2 numeros del 1 al 10");
            respuesta=leer.nextInt();
     }
        System.out.println("Correcto el resulta es; "+Resultado);
    }
    
    
}
