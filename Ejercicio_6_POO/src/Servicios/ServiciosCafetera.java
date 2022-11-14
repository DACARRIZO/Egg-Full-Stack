package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServiciosCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera(Cafetera Cafetera1) {
        System.out.println("Indique la capacidad máxima de la cafetera en ML");
        int capacidadCafetera = leer.nextInt();
        Cafetera1.setCapmaxima(capacidadCafetera);
        Cafetera1.setCantactual(Cafetera1.getCapmaxima());
        System.out.println("Cafetera Llena");
        return Cafetera1;
    }

    public void Menu(Cafetera Cafetera1, int servirTaza, int vaciarCafetera, int agregarCafe) {
        do{
        System.out.println("Menu\n"
                + "1-Desea Servir Cafe?\n"
                + "2-Desea rellenar la Cafetera?\n"
                + "3-Desea vaciar la cafetera?\n"
                + "4-Salir del Menu");
        int op = leer.nextInt();
            switch (op) {
                case 1: 
                    servirTaza(Cafetera Cafetera1);
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }

    public void servirTaza(Cafetera Cafetera1) {
        System.out.println("indique la cantidad en ML de la taza a llenar");
        int Taza1 = leer.nextInt();
        if (Taza1 < Cafetera1.getCantactual()) {
            Cafetera1.setCantactual(Cafetera1.getCantactual() - Taza1);
        } else {
            System.out.println("La Capacidad de la taza es mayor/n"
                    + "igualmente le Servirviremos lo disponible en la cafetera " + Cafetera1.getCantactual());
            Cafetera1.setCantactual(0);
        }
    }
    public void vaciarCafetera (Cafetera Cafetera1){
        Cafetera1.setCantactual(0);
    }
    public int agregarCafe(Cafetera Cafetera1){
        System.out.println("Ingrese la cantidad de cafe que quiera ingresar");
        int cafllena=leer.nextInt();
        if ((Cafetera1.getCapmaxima()+cafllena)<1000){
        Cafetera1.setCantactual(Cafetera1.getCantactual()+cafllena);
        }else 
            System.out.println("La cantidad ingresada es superior a la capacidad de la cafetera");
        return cafllena;
    }
}