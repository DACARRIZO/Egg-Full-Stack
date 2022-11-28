
package Servicios;

import Entidades.Fraccion;
import java.util.Scanner;

public class ServiciosFraccion {
    Scanner leer=new Scanner(System.in);
    public Fraccion crearFraccion(){
        Fraccion fr=new Fraccion();
        System.out.println("Por favor ingrese el valor que desea como numerador");
        fr.setNum1(leer.nextByte());
        System.out.println("Ingrese el primer denominador");
        fr.setDen1(leer.nextByte());
        System.out.println("Perfecto ahora se deberá de ingresar los valores de la segunda fraccion\n"
                + "Ingrese el Numerador");
        fr.setNum2(leer.nextByte());
        System.out.println("Ingrese el denominador de la segunda fracción");
        fr.setDen2(leer.nextByte());
        
        
        
        return fr;
    }
    public void sumaFraccion(Fraccion fr){
        int den=0;
        int num=0;
        if (fr.getDen1()==fr.getDen2()) {
            den=fr.getDen1();
            num=fr.getNum1()+fr.getNum2();
            System.out.println("La suma de las fracciones es: "+num+"/"+den);
        }else{
            den=fr.getDen1()*fr.getDen2();
            num=(fr.getNum1()*fr.getDen2())+(fr.getNum2()*fr.getDen1());
            System.out.println("La suma de las fracciones es: "+num+"/"+den);
              
        }
    }
    public void restaFraccion(Fraccion fr){
         int den1=0;
         int num1=0;
        if (fr.getDen1()==fr.getDen2()) {
            den1=fr.getDen1();
            num1=fr.getNum1()-fr.getNum2();
            System.out.println("La resta de las fracciones es: "+num1+"/"+den1);
        }else{
            den1=fr.getDen1()*fr.getDen2();
            num1=(fr.getNum1()*fr.getDen2())-(fr.getDen1()*fr.getNum2());
            System.out.println("La resta de las fracciones es: "+num1+"/"+den1);
              
        }
    }
    public void Multiplicacion(Fraccion fr){
        int den2=0;
        int num2=0;
        num2=fr.getNum1()*fr.getNum2();
        den2=fr.getDen1()*fr.getDen2();
        System.out.println("La multiplicacion de ambas fracciones es: "+num2+"/"+den2);
    }
    public void Division(Fraccion fr){
        int num3=0;
        int den3=0;
        num3=fr.getNum1()*fr.getDen2();
        den3=fr.getDen1()*fr.getNum2();
        System.out.println("La división de las fracciones es: "+num3+"/"+den3);
    }
    
}
