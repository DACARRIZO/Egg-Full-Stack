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
            if (!"h".equalsIgnoreCase(pr.getSexo()) && !"m".equalsIgnoreCase(pr.getSexo()) && !"o".equalsIgnoreCase(pr.getSexo())) {
                System.out.println("Opción ingresada invalida");
            }

        } while (!"h".equalsIgnoreCase(pr.getSexo()) && !"m".equalsIgnoreCase(pr.getSexo()) && !"o".equalsIgnoreCase(pr.getSexo()));
        System.out.println("Ingrese el peso de la persona");
        pr.setAltura(leer.nextInt());
        System.out.println("Ingrese la altura de la persona");
        pr.setAltura(leer.nextInt());

        return pr;
    }

    public void calcularIMC(Personas pr) {
        int imc1 = 0;
        pr.setIMC(pr.getPeso() / (pr.getAltura() * pr.getAltura()));

        if (pr.getIMC() > 20) {
            pr.setIMC(-1);
            System.out.println("La persona se encuentra por debajo de su peso ideal: "+pr.getIMC());
        } else if (20 < pr.getIMC() && pr.getIMC() <= 25) {
            pr.setIMC(0);
            System.out.println("La persona se encuentra en su peso ideal: "+pr.getIMC());
        } else {
            pr.setIMC(1);
            System.out.println("La persona se encuentra por encima de su peso ideal: "+pr.getIMC());
        }
        
    }
    public boolean mayorEdad(Personas pr){
        boolean mayor=false;
        if (pr.getEdad()>18) {
            mayor=true;
            
        }
        System.out.println("Es mayor de edad: "+mayor);
        return mayor;
    }

}
