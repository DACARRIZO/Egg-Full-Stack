/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_5 {

  
    public static void main(String[] args) {
     int num1;
     Scanner leer=new Scanner(System.in);
     System.out.println("Ingrese Valor");
     num1=leer.nextInt();
     
     System.out.println("La raiz cuadrada de su numero es:"+Math.sqrt(num1));
     System.out.println("El Doble del valor ingresado es:"+num1*2);
     System.out.println("La raiz cuadrada de su numero es:"+num1*3);
     
    }
    
}
