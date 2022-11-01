/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package primera_guia;

import java.util.Scanner;

public class Ejercicio_Ext_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la cantidad de numeros que ingresara");
        int n = leer.nextInt();
        int cont = 0;
        int suma = 0;
        int VM = 0;
        int VMin = 0;
        int cont2=0;
        int sum=0;
        int maximo=0;
        int minimo=0;
                
         
        //int num=0;
        /*for (int i=0;i<n;i++) {
            System.out.println("Ingrese los numeros, quedan por ingresar: " + i + 1);
            vector[i] = leer.nextInt();*/
   
    
        do{
            System.out.println("Ingrese los numeros");
            
        int num = leer.nextInt();
        suma=suma+num;
        
        cont++;
        if(cont==1){
            VMin=num;
        }
        else if(num<VMin){
            VMin=num;
        }
        if (num>VM){
            VM=num;
        }
        
                                
        }while(n>cont);
            System.out.println("El valor Maximo ingresado es: "+VM);
            System.out.println("El valor minimo ingresado es: "+(VMin));
            System.out.println("El promedio de los valores ingresados es: "+suma/cont);
        
      /*  while (n>(cont2+1)){
            
        System.out.println("Ingrese los numeros");
            
        int cant = leer.nextInt();
        sum=sum+cant;
        
        cont2++;
        if(cont==1){
        minimo=num;
        }
        if(cant<minimo){
            minimo=cant;}
        if (cant>maximo){
            maximo=cant;}
        }
         System.out.println("El valor Maximo ingresado es: "+maximo);
         System.out.println("El valor minimo ingresado es: "+(minimo));
         System.out.println("El promedio de los valores ingresados es: "+sum/cont);*/
    }    
}


