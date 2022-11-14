/**
 
 */
package ejercicio_9_poo;

import Entidades.Matematica;
import Servicios.ServiciosMatematica;

public class Ejercicio_9_POO {
    public static void main(String[] args) {
       ServiciosMatematica sm=new ServiciosMatematica();
       Matematica mt=new Matematica();
       
       mt.setNum1(Math.random()*100);
       mt.setNum2(Math.random()*100);
        System.out.println("Numero 1: "+mt.getNum1());
        System.out.println("Numero 2: "+mt.getNum2());
       
       
       sm.DevolverMayor(mt);
       sm.CalcPot(mt);
       sm.CalcRaiz(mt);
    }
    
}
