/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
       System.out.println("Ingrese cantidad de euros");
       Scanner leer=new Scanner(System.in);
       int euros=leer.nextInt();
       System.out.println("Ingrese el tipo de moneda a convertir");
       
       
       String tipo=leer.next();
       
       TipoCambio(euros,tipo);
        
              
        
        
    }
    public static void TipoCambio(int euros, String tipo){
        double libra=0.86;
        double dolar=1.28611;
        double yenes=129.852;
        switch(tipo){
            case "libra":
                System.out.println("El importe en libras es: "+(euros*libra));
                break;
            case "dolar":
                System.out.println("El valor en dolares es:"+(euros*dolar));
                break;
            case "yenes":
                System.out.println("El valor en Yenes es: "+(euros*yenes));
             
        }             
        
       
    }
            
    
}
