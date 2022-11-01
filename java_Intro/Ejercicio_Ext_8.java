/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package primera_guia;

public class Ejercicio_Ext_8 {
   
    public static void main(String[] args) {
     int n=0;
     int cant=0;
     int par=0;
     int impar=0;
     
     do{
         n=(int)(Math.random()*100+1);
         System.out.println(n);
         cant++;
         if (n%2==0){
             par++;
         }
         if (n%3==0){
             impar++;
         }
     }while(n%5!=0);
     
        System.out.println("La cantidad de valores leidos fue de: "+cant);
        System.out.println("La cantidad de numeros pares leidos fue de: "+par);
        System.out.println("La cantidad de numeros impares leidos fue de: "+impar);
    }
    
}
