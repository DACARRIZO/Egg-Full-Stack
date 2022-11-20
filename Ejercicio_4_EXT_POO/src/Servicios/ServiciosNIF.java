package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class ServiciosNIF {

    Scanner leer = new Scanner(System.in);

    public NIF crearNIF() {
        NIF nif=new NIF();
        String letras[]=new String [23];
        System.out.println("Ingrese su numero de DNI");
        nif.setDNI(leer.nextInt());
        String ln="TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < 22; i++) {
            letras[i]=ln.substring(i, i+1);
            
        }
        
         int resto=(nif.getDNI()%23);
        
         System.out.println("Su NIF es: "+nif.getDNI()+"-"+letras[resto]);

    return nif;
    }
}
