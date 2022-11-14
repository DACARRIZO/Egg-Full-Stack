package ServiciosCadena;

import Entidades.Cadena;
import java.util.Scanner;

public class ServiciosCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase(Cadena cd) {
        //Cadena cd = new Cadena();

        System.out.println("Ingrese una frase");
        cd.setFrase(leer.nextLine());
        cd.setLog(cd.getFrase().length());
        return cd;
    }

    public void vocales(Cadena cd) {
        int vocal = 0;
        for (int i = 0; i < cd.getLog(); i++) {
            if ("a".equalsIgnoreCase(cd.getFrase().substring(i, i + 1)) || "e".equalsIgnoreCase(cd.getFrase().substring(i, i + 1)) || "i".equalsIgnoreCase(cd.getFrase().substring(i, i + 1)) || "o".equalsIgnoreCase(cd.getFrase().substring(i, i + 1)) || "u".equalsIgnoreCase(cd.getFrase().substring(i, i + 1))) {

                vocal++;

            }
            }
        System.out.println("La frase contiene " + vocal + " vocales");
    }

    public void invertir(Cadena cd) {
        System.out.println("Su Frase invertida es: ");
        for (int i = (cd.getLog() - 1); i >= 0; i--) {
            System.out.print(cd.getFrase().substring(i, i + 1));
        }
        System.out.println(" ");
        
    }

    public void repetido(Cadena cd) {
        int rep = 0;
        System.out.println("Ingrese el caracter que quiera buscar");
        String car = leer.nextLine();
        for (int i = 0; i < cd.getFrase().length(); i++) {
            if (car.equalsIgnoreCase(cd.getFrase().substring(i, i + 1))) {

                rep++;

            }
        }
        if (rep == 0) {
            System.out.println("No se encontro coincidencia del caracter" + car + " ingresado");
        } else {
            System.out.println("Su caracter " + car + "se repite: " + rep + " Veces");
        }

    }

    public void compararLong(Cadena cd) {
        System.out.println("Ingrese una nueva frase");
        String nf = leer.next();
        int largof1 = cd.getLog();
        int largonf = nf.length();
        if (largof1 > largonf) {
            System.out.println("La frase original es mas larga:\n"
                    + "Frase 1: " + largof1 + "\n"
                    + "Frase 2: " + largonf);

        } else {
            System.out.println("La frase nueva es mas larga: \n"
                    + "Frase 1: " + largof1 + "\n"
                    + "Frase 2: " + largonf);
        }

    }

    public void UnirFrases(Cadena cd) {
        System.out.println("Ingrese una Frase nueva para agregar a la frase original");
        String nf1 = leer.nextLine();

        System.out.println(cd.getFrase() + nf1);
    }

    public void CambioCar(Cadena cd) {
        System.out.println("Ingrese el caracter por el que desea cambiar todas las letras A");
        String cn = leer.next();
        String f1 = cd.getFrase().replace("a", cn).replace("A", cn);

        System.out.println("Frase modificada: " + f1);
    }

    public void Contiene(Cadena cd) {
        System.out.println("Ingrese la letra que se buscará en la frase");
        String fb = leer.next();
        for (int i = 0; i < cd.getLog(); i++) {
            if (fb.equalsIgnoreCase(cd.getFrase().substring(i, i + 1))) {
                System.out.println("Verdadero");
            } else {
                System.out.println("Falso");

            }
        }
    }
}
