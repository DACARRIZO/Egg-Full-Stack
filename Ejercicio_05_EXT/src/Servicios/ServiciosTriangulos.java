/*
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package Servicios;

import Entidades.Triangulos;
import java.util.Scanner;

public class ServiciosTriangulos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Triangulos CrearTriangulo(){
        Triangulos tr=new Triangulos();
        int cont=0;
        System.out.println("Indique la cantidad de triangulos que quiera se dibujen");
        tr.setCantTri(leer.nextInt());
       
        while (tr.getCantTri()!=cont){
             System.out.println("Ingrese el tamaño del rectangulo Isosceles que desea");
        tr.setTamtri(leer.nextInt());
        cont++;
        }
        return tr;
    }
    public void dibujar(Triangulos tr){
        int aux=0;
        do{
        for (int i = 0; i < tr.getTamtri(); i++) {
            int aux2=0;
            while (aux2<=aux){
                System.out.print(" *");
                aux2++;
            }
        aux++;
        System.out.println(" ");
        }
        }while (tr.getCantTri()==aux);
    }
    public void calcularArea(Triangulos tr){
        int base=tr.getTamtri();
        int altura=tr.getTamtri();
        tr.setArea((base*altura)/2);
        System.out.println("El Area del triangulo es "+tr.getArea());
        
    }
    public void calcularPerim(Triangulos tr){
        tr.setPerim(tr.getTamtri()*3);
        System.out.println("El perimetro del trinagulo es "+tr.getPerim());
    }
    public void MayorSup(Triangulos tr){
        int cant=0;
        for (int i = 0; i < tr.getCantTri(); i++) {
            if (tr.getTamtri()<cant) {
                tr.setMaysup(cant);
            }
        }
        System.out.println("El triangulo más grande es "+tr.getMaysup());
    }
}
