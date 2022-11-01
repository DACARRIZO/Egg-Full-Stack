/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). * and open the template in the editor.
 */
package primera_guia;

import java.util.Scanner;


public class Ejercicio_4 {

   
    public static void main(String[] args) {
    float temp1, temp2;
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese Temperatura en Grados Centígrados");
    
    temp1=leer.nextFloat();
    temp2=32 + (9 * temp1 / 5);
    
    System.out.println("La temperatura en grado Fahrenheit es:"+temp2);
    }
    
}
