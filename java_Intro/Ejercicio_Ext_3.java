/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_3 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String letra;
       int tam;
       do{
           System.out.println("Ingrese una sola letra");
           letra=leer.next();
           tam=letra.length();
       }while (tam>1);
       
       if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
        System.out.println("Su letra ingresada "+letra+" es una vocal");
        }else{  
        System.out.println("La letra ingresada "+letra+" no es una vocal");
       }
           
       }
       
    }
    

