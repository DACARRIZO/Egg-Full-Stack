
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;


public class ServiciosPuntos {
    Scanner leer=new Scanner(System.in);
    Puntos pts=new Puntos();
    public Puntos crearPuntos(){
        System.out.println("Ingrese el valor de X1");
        pts.setX1(leer.nextInt());
        System.out.println("Ingrese el valor de X2");
        pts.setX2(leer.nextInt());
        System.out.println("Ingrese el valor de Y1");
        pts.setY1(leer.nextInt());
        System.out.println("Ingrese el valor de Y2");
        pts.setY2(leer.nextInt());
        
        return pts;
    }
    public void calcular(Puntos pts){
        int RX=(pts.getX2()-pts.getX2());
        int RY=(pts.getY2()-pts.getY1());
        double PX=Math.pow(RX, 2);
        double PY=Math.pow(RY, 2);
        double SXY=PX+PY;
        double Coord=Math.sqrt(SXY);
        System.out.println("Las coordenadas de los numeros ingresados es: "+ Coord);
    }
    
}
