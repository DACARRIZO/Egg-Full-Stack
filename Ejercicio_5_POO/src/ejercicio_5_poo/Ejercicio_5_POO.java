
package ejercicio_5_poo;

import Entidades.Cuenta;
import Servicios.ServiciosCuenta;


public class Ejercicio_5_POO {

    
    public static void main(String[] args) {
       ServiciosCuenta sc=new ServiciosCuenta();
       Cuenta ct=new Cuenta();
       
       sc.CrearCuenta(ct);
       
       sc.Movimientos(ct);
       
    }
    
}
