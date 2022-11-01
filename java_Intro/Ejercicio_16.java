/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int num=leer.nextInt();
        int vector[] =new int[num];
        int cont=0;
        for(int i=0;i<num;i++){
         vector[i]=(int)(Math.random()*10);        
        }
        for(int i=0;i<num;i++){
         System.out.print(vector[i]+" | ");
        }
        System.out.println(" ");
        System.out.println("Ingrese el numero del 1 al 10 que quiera buscar en el Vector");
        int VB=leer.nextInt();
        
          for (int i=0;i<num;i++){
            if(VB==vector[i]){
              System.out.println("Su numero: "+VB+" se encuentra en la posicion: "+"["+(i+1)+"] del vector");              
            cont++;
          }
          
        }      
          if (cont>1){
          System.out.println("El numero se encuentra "+cont+" en el vector");
          }else 
              System.out.println("El Valor ingresado no se repite en el vector");
            
                  
        }
    }
        
        

