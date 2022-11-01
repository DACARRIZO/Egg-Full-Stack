
package primera_guia;

import java.util.Scanner;


public class Ejercicio_2_ {


    public static void main(String[] args) {
        String nom, apellido;
     Scanner teclado=new Scanner(System.in);
     System.out.print("Ingrese su nombre:");
     nom=teclado.nextLine();
     System.out.print("Ingrese su apellido:");
     apellido=teclado.next();        
     System.out.println("Su nombre completo es: "+nom+" "+apellido);   
    }
    
}
