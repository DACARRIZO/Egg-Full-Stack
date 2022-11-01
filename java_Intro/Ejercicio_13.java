/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Pro favor ingrese el tamaño del cuadrado");
        int squarel=reader.nextInt();
        
        for (int i = 0; i<squarel;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<(squarel-2); i++){
            System.out.print("*");
            for (int j = 0;j<squarel-2; j++){
                System.out.print(" ");          
            }
        }
        System.out.println("*");
    
          for (int i = 0; i<squarel; i++){
            System.out.println("*");
    
          }
    }            
}
