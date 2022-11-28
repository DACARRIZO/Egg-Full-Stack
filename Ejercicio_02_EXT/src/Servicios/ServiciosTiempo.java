
package Servicios;

import Entidades.Tiempo;
import java.util.Scanner;

public class ServiciosTiempo {
    Scanner leer=new Scanner (System.in);
    public Tiempo CrearTiempo(){
        Tiempo time=new Tiempo();
        System.out.println("Ingrese la hora inicial");
        time.setHora(leer.nextInt());
        System.out.println("Ingrese los minutos");
        time.setMin(leer.nextInt());
        System.out.println("Ingrese los segundo");
        time.setSeg(leer.nextInt());
        
        
        return time;
    }
    private static void delaySegundo(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    public void Horario(Tiempo time){
        int hora=0;
        int min=0;
        int seg=0;
        for (hora = time.getHora();  hora< 24; hora++) {
            if (hora==24) {
                time.setHora(00);
            }
        for (min = time.getMin(); min < 60; min++) {
            if (min==59) {
                time.setMin(00);
            }
            for (seg = time.getSeg(); seg < 60; seg++) {
                if (seg==59) {
                    time.setSeg(00);
                }
                
                System.out.println(hora+":"+min+":"+seg);
                delaySegundo();
            }
            }
            
        }
    }
}
