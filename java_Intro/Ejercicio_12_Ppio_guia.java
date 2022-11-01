
package primera_guia;

import java.util.Scanner;

public class Ejercicio_12_Ppio_guia {

   
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
     System.out.println("Ingrese su primer valor");
     int a=read.nextInt();
     System.out.println("Ingrese su segundo valor");
     int b=read.nextInt();
     
     EsMultiplo(a,b);
        
    }
    public static void EsMultiplo(int a, int b){
    
    int resto=(a%b);
    
    if (resto==0){
        System.out.println("Los valores ingresados son Multiplos");
                }else
        System.out.println("Los valores no son multiplos");
}
    
    
}
