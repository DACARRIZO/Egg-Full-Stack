
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscarloha
 */
public class P2Ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
        */
        
       Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Cuantos numeros fibonacci desea ver?");
        int n = leer.nextInt();
        
        int [] vector = new int [n];
        
        
        for (int i = 0 ; i<n ; i++){
            
            if (i<=1){
                vector[i] = 1;
            }else{
                vector[i]= vector[i-1]+vector[i-2];
            }
            
        }
        System.out.println("");
        System.out.println("[ NUMERO FIBONACCI]");
       
        for (int i = 0 ; i<n ; i++){
            
            System.out.print(vector[i] + " ");
            
        }
        
        
    }
    
}
