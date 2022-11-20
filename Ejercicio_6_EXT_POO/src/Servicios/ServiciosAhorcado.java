/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author dacar
 */
public class ServiciosAhorcado {
     Scanner leer=new Scanner (System.in);
    public Ahorcado crearPalabra(){
        Ahorcado ca=new Ahorcado();
        System.out.println("__________________________________________________");
        System.out.println("Jugador 1");
        ca.setPalabra(leer.next());
        ca.setTamPalabra(ca.getPalabra().length());
        System.out.println("Indique la cantidad de jugadas máximas");
        ca.setJugadas(leer.nextInt());
        
        
        //ca.setVectorPalabra() =new String [ca.getTamPalabra()];
        
             
        return ca;
    }
    public void crearJuego(Ahorcado ca){
     String VPalabra []=new String[ca.getTamPalabra()];
     String PP;   
        for (int i = 0; i < ca.getTamPalabra(); i++) {
            VPalabra[i]=ca.getPalabra().substring(i, i+1);
            
        }
        do {
            System.out.println("Indique la letra para jugar");
            PP=leer.next();
            for (int i = 0; i < ca.getTamPalabra(); i++) {
                if (PP == VPalabra[i]) {
                    ca.getJugadas()-1;
                    
                    
                }
    
                
            }
        }while   
    }
}   
