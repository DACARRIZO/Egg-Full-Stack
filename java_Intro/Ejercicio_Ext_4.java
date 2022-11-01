/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do {            
              System.out.println("Ingrese un numero del 1 al 10: ");
              num=leer.nextInt();
        } while (num<=1||num>10);
       
        String numLetra,newNum;
        numLetra=String.valueOf(num);
         
        if(num<10){
        newNum=numLetra.replace("1", "I").replace("2", "II").replace("3", "III").replace("4", "IV").replace("5", "V").replace("6", "VI").replace("7", "VII").replace("8", "VIII").replace("9", "IX");
        }else{
          newNum="X";
        }
        System.out.println("El numero ingresado "+num+" en numero romano es: "+newNum);


    }
    

}
