
package ejercicio_14_poo;

import Entidades.Movil;
import Servicios.ServiciosMovil;

public class Ejercicio_14_POO {

    public static void main(String[] args) {
        ServiciosMovil sm=new ServiciosMovil();
        Movil mv=sm.cargarCelular();
        sm.ingresarCodigo(mv);
    }
    
}
