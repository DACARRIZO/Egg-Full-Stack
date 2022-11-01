/*
 Crear un programa que dado un numero determine si es par o impar
 */
package primera_guia;

import java.util.Scanner;


public class Ejercicio_6 {

    public static void main(String[] args) {
       int num1;
             
       Scanner leer=new Scanner(System.in);
     System.out.println("Ingrese un Valor");
     num1=leer.nextInt();
    
     if (num1%2 == 0){
      System.out.println("Su Valor es Par");
    }
     else{
      System.out.println("Su Valor es Impar");
     }

          
               
    }
    
}
