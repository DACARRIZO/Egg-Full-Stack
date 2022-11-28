/*
 Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;


public class ServiciosPass {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pass crearPass(){
        Pass ps=new Pass();
        int cc=10;
        int largo=0;
        ps.setDni(35512008);
        ps.setNombre("Dario Carrizo");
        
        do{
        System.out.println("Por favor ingrese la contraseña, recuerde que para que sea segura debe ser de 10 caracteres entre numeros y letras");
        ps.setPass(leer.next());
        largo=ps.getPass().length();
        
        }while (largo!=cc);
        
      
        return ps;
    }
    public void analizarPass(Pass ps){
        int a=0;
        int z=0;
        int n=0;
        for (int i = 0; i < ps.getPass().length(); i++) {
            if ("a".equalsIgnoreCase(ps.getPass().substring(i, i + 1))) {
                a++;
            }else if ("z".equalsIgnoreCase(ps.getPass().substring(i, i + 1))) {
                z++;
                
            }else{
                n++;
            } 
                
        }
        if (a>=2 && z>=1) {
            System.out.println("Excelente su nivel de seguridad en la contraseña es ALTO");
        }else if (z>=1) {
            System.out.println("Nivel de Seguridad de la contraseña MEDIO");
            
        }else if (n==10) {
            System.out.println("Nivel de seguridad de la contraseña BAJO");
        }
        
    }
    public void cambioDatos(Pass ps){
        String contrasena;
        String cont1;
        int cont=0;
       
        int op=0;
        
//        do{
////        System.out.println("Para modificar los Datos o contraseña se debe ingresar la contraseña actual");
////        contrasena=leer.next();
////        if (contrasena!=ps.getPass()) {
////            System.out.println("La contraseña es incorrecta");
////        }
//        }while (contrasena==ps.getPass());
        System.out.println("Perfecto a ingresado la contraseña correcta");
        
        do{
            System.out.println("Opciones\n"
                + "1- Modificar Nombre\n"
                + "2- Modificar DNI\n"
                + "3- Modificar contraseña\n"
                + "4- Ver seguridad Contraseña\n"
                + "5- ver los Datos\n"
                + "6- Salir del sistema");
        op=leer.nextInt();
        switch (op) {
            
            case 1:
                do{
                System.out.println("Perfecto para poder modificar el nombre de usuario debe ingresar la contraseña");
                cont1=leer.next();
                }while (cont1==ps.getPass());
                System.out.println("Ingrese el nombre nuevo de usuario que desea");
                ps.setNombre(leer.next());
                System.out.println("Correcto su nuevo nombre de Usuario es: "+ps.getNombre());
                break;
            case 2:
                do{
                System.out.println("Para poder modificar el numero de DNI deberá ingresar la Contraseña");
                cont1=leer.next();
                }while(cont1==ps.getPass());
                System.out.println("Ingrese el nuevo numero de DNI");
                ps.setDni(leer.nextInt());
                System.out.println("Dni modificado");
                break;
            case 3:
                 do{
                System.out.println("Para poder modificar su contraseña deberá ingresar la Contraseña actual");
                cont1=leer.next();
                }while(cont1==ps.getPass());
                System.out.println("Perfecto ingrese la contraseña nueva");
                ps.setPass(leer.next());
                System.out.println("Excelente su contraseña fue modificada");
                break;
            case 4:
                this.analizarPass(ps);
                break;
            case 5:
                System.out.println("Sus datos son:\n"
                        + "Nombre de Usuario: "+ps.getNombre()+"\n"
                                + "DNI: "+ps.getDni()+"\n");
                break;
            case 6:
                System.out.println("Saliendo del sistema que tenga buen día");
                   cont=6;
                   break;
                
        }
        
        }while (cont!=6);
    }
}
