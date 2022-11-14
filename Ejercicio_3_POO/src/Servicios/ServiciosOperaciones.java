package Servicios;

import Entidades.Operadores;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ServiciosOperaciones {

    public Operadores crearOperacion() {
        Scanner leer = new Scanner(System.in);
        Operadores op1 = new Operadores();

        System.out.println("Ingrese el primer valor");
        op1.setNum1(leer.nextDouble());

        System.out.println("Ingrese el segundo valor");
        op1.setNum2(leer.nextDouble());

        return op1;

    }

    public void operacionesMatematicas(Operadores op1) {

        double suma = op1.getNum1() + op1.getNum2();
        double resta = op1.getNum1() - op1.getNum2();
        double multiplicacion = op1.getNum1() * op1.getNum2();
        double division = op1.getNum1() / op1.getNum2();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("La suma de " + op1.getNum1() + " + " + op1.getNum2() + " Es igual a= " + suma);
        System.out.println("La resta de " + op1.getNum1() + " - " + op1.getNum2() + " Es igual a= " + resta);
        System.out.println("La multiplicacion de " + op1.getNum1() + " x " + op1.getNum2() + " Es igual a= " + multiplicacion);
        System.out.println("La division de " + op1.getNum1() + " / " + op1.getNum2() + " Es igual a= " + df.format(division));
    }
}
