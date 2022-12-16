/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Servicios;

import Entidades.Mascotas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosMascotas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Mascotas> ListaMascotas = new ArrayList();

    public Mascotas CrearMascota() {
        Mascotas mas = new Mascotas();
//        System.out.println("Que cantidad de razas desea ingresar?");
//        int cant = leer.nextInt();
        boolean flag=false;
        String op;
        do {
            System.out.println("Ingrese la Raza");
            mas.setRaza(leer.next());
           ListaMascotas.add(new Mascotas(mas.getRaza()));
            System.out.println("Desea ingresar otra raza?");
            op=leer.next();
            if (op.equalsIgnoreCase("no")) {
                flag=true;
            }
            
        } while (flag!=true);
    return mas;

    }

    public void mostrarMascotas(Mascotas mas) {

        for (Mascotas aux : ListaMascotas) {
            System.out.println("Las Mascotas ingresadas son:" + aux.toString());
        }
    }

    public void menu(Mascotas mas) {
        boolean flag = false;
        do {
            System.out.println("Que desea hacer:\n"
                    + "1- Ingresar una nueva raza\n"
                    + "2- Salir\n"
                    + "3- eliminar alguna raza");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    this.CrearMascota();

                    break;
                case 2:
                    this.mostrarMascotas(mas);
                    flag = true;
                case 3:
                    this.eliminar(mas);
                    
                    break;
            }
        }while(flag==false);
    
    }
    public void eliminar(Mascotas mas){
        System.out.println("Ingrese la raza que desee eliminar");
        String raza=leer.next();
        Iterator<Mascotas>it=ListaMascotas.iterator();
        
        while(it.hasNext()){
            if (it.next().getRaza().equalsIgnoreCase(raza)) {
                it.remove(); 
            }
        }
        System.out.println("Lista nueva");
        for (Mascotas aux : ListaMascotas) {
            System.out.println("Las Mascotas ingresadas son:" + aux.toString());
        }
    }

}
