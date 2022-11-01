/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package primera_guia;

import java.util.Scanner;




public class Ejercicio_10 {

    
    public static void main(String[] args) {
        int num, suma, numlim;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Valor Limite");
        numlim=leer.nextInt();
        suma=0;
        do {
            System.out.println("Ingrese Valor a sumar");
            suma=suma+leer.nextInt();
        } while (suma<numlim);
        
        System.out.println("El valor limite "+numlim+" Fue superado por la suma de los valores ingresados "+suma);
         
              
              
               
    }
    
    
}
