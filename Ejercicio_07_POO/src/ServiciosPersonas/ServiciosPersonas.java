package ServiciosPersonas;

import Entidades.Personas;
import java.util.Scanner;

public class ServiciosPersonas {

    Scanner leer = new Scanner(System.in);

    public Personas crearPersona() {
        
        Personas pr = new Personas();
        System.out.println("El nombre de la persona");
        pr.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        pr.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo de la persona\n"
                    + "(H)ombre"
                    + "(M)ujer"
                    + "(O)tro");
            pr.setSexo(leer.next());
        }while(!"h".equalsIgnoreCase(pr.getSexo()) &&!"m".equalsIgnoreCase(pr.getSexo()) &&!"o".equalsIgnoreCase(pr.getSexo()));
        System.out.println("Ingrese el peso de la persona");
        pr.setAltura(leer.nextInt());
        System.out.println("Ingrese la altura de la persona");
        pr.setAltura(leer.nextInt());

        return pr;
    }
    public int calcularIMC(Personas pr){
        int imc1=0;
        pr.setIMC(pr.getPeso()/(pr.getAltura()*pr.getAltura()));
        
        if (pr.getIMC()>20){
            imc1=-1;
            return pr.getIMC(imc1);
        }else if ((pr.))
        } 
    }

}


