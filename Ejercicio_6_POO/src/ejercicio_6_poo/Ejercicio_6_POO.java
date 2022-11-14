package ejercicio_6_poo;

import Entidades.Cafetera;
import Servicios.ServiciosCafetera;


public class Ejercicio_6_POO {

    public static void main(String[] args) {
       ServiciosCafetera sc = new ServiciosCafetera();
       Cafetera Cafetera1=new Cafetera();
       sc.llenarCafetera(Cafetera1);
       sc.Menu(Cafetera1);
       sc.servirTaza(Cafetera1);
       
       
    }
    
}
