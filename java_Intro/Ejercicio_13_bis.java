
package primera_guia;

import java.util.Scanner;


public class Ejercicio_13_bis {

    
    public static void main(String[] args) {
        System.out.println("Ingrese el tamño del cuadrado");
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        
        for (int f=1; f<=num; f++){
            for(int c=1; c<=num; c++){
               if (f>1 && c>1 && f<num && c<num)
                   System.out.print(" ");
               else
                   System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
  
    
}
