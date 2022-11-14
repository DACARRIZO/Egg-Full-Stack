package Servicio;

import Contructores.Radio;
import java.util.Scanner;

public class RadioServicio {
    public Radio Circunferencia(){
    Radio rd=new Radio();
    Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese el valor del Radio");
         rd.setRadio(leer.nextByte());
         
    return rd;
}
    
}
