/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematica;
import java.text.DecimalFormat;

public class ServiciosMatematica {

   // Matematica mt = new Matematica();
   

    public Matematica DevolverMayor(Matematica mt) {
        mt.setMayor(Math.max(mt.getNum1(),mt.getNum2()));
        mt.setMenor(Math.min(mt.getNum1(), mt.getNum2()));
        System.out.println("El numero mayor es: "+mt.getMayor());
        System.out.println("El numero menor es: "+mt.getMenor());
       
        return mt;
    }

    public void CalcPot(Matematica mt) {
        //double base=mt.getMayor();
        //double pot=mt.getMenor();
        double base = Math.round(mt.getMayor());
        double pot = Math.round(mt.getMenor());
       
        
        if (mt.getMayor()> mt.getMenor()) {
            double pot1 = Math.pow(base,pot);
            System.out.println("El Numero mayor es: " + base + " elevado a: "+pot+" Es igual a: " + pot1);
        } else {
            double pot2 = Math.pow(pot, base);
            System.out.println("El Numero mayor es: " + pot+ " elevado a: "+base+" Es igual a: " + pot2);
        }
    }
    public void CalcRaiz(Matematica mt){
        DecimalFormat df = new DecimalFormat("###.##");
        double n1=Math.abs(mt.getMenor());
             
        double raiz = Math.sqrt(n1);
        
        System.out.println("El menor numero es: "+n1+" y su raiz cuadrada es:" + raiz);
        
    }

}
