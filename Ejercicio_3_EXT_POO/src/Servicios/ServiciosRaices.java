
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServiciosRaices {
    Scanner leer=new Scanner (System.in);
   public Raices crearNumeros(){
       Raices numeros=new Raices();
       System.out.println("Ingrese numero A >");
       numeros.setA(leer.nextInt());
       System.out.println("Ingrese numero B >");
       numeros.setB(leer.nextInt());
       System.out.println("Ingrese numero C >");
       numeros.setC(leer.nextInt());
       
       
       return numeros;
   }
   /* Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
   */
   public void discriminante (Raices numeros){
       numeros.setDisc(Math.pow(numeros.getB(), 2)-4*numeros.getA()*numeros.getC());
   }
   /*  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
*/
   public boolean tieneRaices(Raices numeros){
       boolean raices=false;
       double a=numeros.getA()%2;
       double b=numeros.getB()%2;
       double c=numeros.getC()%2;
       if (a>=0 || b%2>=0 || c%2>=0) {
           System.out.println("los tres numeros tienen raices");
           raices=true;
       }else
           System.out.println("Uno de los numeros no tiene raices");
       return raices;
   }
   public void obtenerRaices(Raices numeros){
       
   }
}
