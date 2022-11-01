/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/
package primera_guia;

import java.util.Scanner;


public class Ejercicio_7 {

   
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese la palabra");
      String word1 = leer.next();
      
      if (!word1.equals("eureka")) {
          System.out.println("Incorrecto");
      }
     else{
          System.out.println("Correcto");
      
    } 
      
    }
    
}
