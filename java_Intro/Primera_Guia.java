
package primera_guia;

import java.util.Scanner;

public class Primera_Guia {

    public static void main(String[] args) {
       int num1, num2, suma;
       Scanner leer = new Scanner(System.in);
       System.out.println("escriba el primer numero");
       num1=leer.nextInt();
       System.out.println("escriba el Segundo numero");
       num2=leer.nextInt();
       suma=num1 + num2;
       System.out.println("El resultado de la suma de los numero es: "+ suma);
           
    }
    
}
