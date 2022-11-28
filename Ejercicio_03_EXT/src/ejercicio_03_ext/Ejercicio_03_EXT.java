
package ejercicio_03_ext;

import Entidades.Pass;
import Servicios.ServiciosPass;


public class Ejercicio_03_EXT {

    public static void main(String[] args) {
       ServiciosPass sp=new ServiciosPass();
       Pass ps=sp.crearPass();
       sp.analizarPass(ps);
       sp.cambioDatos(ps);
    }
    
}
