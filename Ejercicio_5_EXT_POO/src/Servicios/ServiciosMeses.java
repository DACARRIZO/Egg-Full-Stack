package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class ServiciosMeses {

    Scanner leer = new Scanner(System.in);
    String aux[] = new String[12];
    Meses ms = new Meses();
    public Meses CrearJuego() {
        aux[0] = "Enero";
        aux[1] = "Febrero";
        aux[2] = "Marzo";
        aux[3] = "Abril";
        aux[4] = "Mayo";
        aux[5] = "Junio";
        aux[6] = "Julio";
        aux[7] = "Agosto";
        aux[8] = "Septiembre";
        aux[9] = "Octubre";
        aux[10] = "Noviembre";
        aux[11] = "Diciembre";
        ms.setAnio(aux);
        ms.setMesSecreto(aux[(int) (Math.random() * 12)]);
        System.out.println("Mes Secreto: " + ms.getMesSecreto());
        return ms;
    }

    public void jugar(Meses ms) {
        boolean encontrado = false;
        System.out.println(ms.getMesSecreto());
        do {
            System.out.println("Vamos a jugar..!!!Adivina el mes Secreto, cual se te ocurre que puede ser");
            ms.setBuscar(leer.next());  
                   
           if (ms.getBuscar().equalsIgnoreCase(ms.getMesSecreto())) {
                System.out.println("Felicitaciones ah descubierto el mes secreto!");
                encontrado = true;
            } else {
                System.out.println("El mes secreto NO es: " + ms.getBuscar());
            }
             System.out.println(encontrado);
        }while (encontrado == false);  
    
    }
}