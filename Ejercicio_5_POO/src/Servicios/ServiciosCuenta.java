package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta CrearCuenta(Cuenta c1) {
        

        System.out.println("Ingrese su DNI");
        c1.setDni(leer.nextLong());
        System.out.println("ingrese el importe inicial");
        c1.setSaldoActual(leer.nextInt());
        System.out.println("ingrese el numero de cuenta al que lo ingresará");
        c1.setNumcuenta(leer.nextInt());

        return c1;
    }

    public void Movimientos(Cuenta c1) {
        System.out.println("Indique que operación quiere Realizar");
       // System.out.println("1-Ingresar Dinero  2-Realizar un retiro  3-Extracción Rapida   4-Consultar Saldo  5-Consultar Datos   6-Salir del sistema");
       // int mv = leer.nextInt();
        int count=0;
        do {
            System.out.println("1-Ingresar Dinero  2-Realizar un retiro  3-Extracción Rapida   4-Consultar Saldo  5-Consultar Datos   6-Salir del sistema");
            int mv = leer.nextInt();
            switch (mv) {
                case 1:
                    System.out.println("Indique el monto que ingresará");
                    c1.setSaldoActual(leer.nextInt() + c1.getSaldoActual());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que quiere retirar");
                    int dr = leer.nextInt();
                    if (dr > c1.getSaldoActual()) {
                        System.out.println("El importe que desea retirar supera su Saldo Actual de: " + c1.getSaldoActual());
                    } else {
                        c1.setSaldoActual(c1.getSaldoActual() - dr);
                        System.out.println("Su nuevo saldo es de: " + c1.getSaldoActual());
                    }
                    break;
                case 3:
                    int er;
                    do {
                        System.out.println("ingrese el monto a retirar");
                        er = leer.nextInt();
                        if (er > (c1.getSaldoActual() * 0.2)){
                            System.out.println("El monto ingresado excede la cantidad para retirar, ingrese otro importe");
                        }
                    } while (er > (c1.getSaldoActual() * 0.2));
                    c1.setSaldoActual(c1.getSaldoActual() - er);
                    break;
                case 4:
                    System.out.println("Su saldo actual es de: " + c1.getSaldoActual());
                    break;
                case 5:
                    System.out.println("DNI: " + c1.getDni() + " N° de Cuenta: " + c1.getNumcuenta() + " Saldo Actual: " + c1.getSaldoActual());
                    break;
                case 6:
                    System.out.println("Saliendo del sistema, que tenga buen día");
                    count = 6;

                    

            }

        } while (count != 6);
    }
}