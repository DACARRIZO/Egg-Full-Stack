package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class ServiciosMovil {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {
        Movil mv = new Movil();
        System.out.println("Ingrese la marca del dispositivo");
        mv.setMarca(leer.next());
        System.out.println("Ingrese el modelo del dispositivo");
        mv.setModelo(leer.next());
        System.out.println("Ingrese la capacidad de almacenamiento");
        mv.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese la memoria RAM");
        mv.setMemRam(leer.nextInt());
        System.out.println("Indique el valor del Dispositivo");
        mv.setPrecio(leer.nextFloat());

        return mv;
    }   

    public void ingresarCodigo(Movil mv) {
        int aux[]=new int [7];
        
        System.out.println("Ingrese el ID del Celular");
        int id=(leer.nextInt());
        String cade=String.valueOf(id);
        for (int i = 0; i < mv.getCodigo().length; i++) {
            aux[i]=Integer.parseInt(cade.substring(i, i+1));
        }
        mv.setCodigo(aux);
        System.out.println("El codigo ingresado es: "+ id);

    }

}
