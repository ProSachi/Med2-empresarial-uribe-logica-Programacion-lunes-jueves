
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PIN = 1234;
        boolean Nologeado = true;
        int acumulador = 0;
        /*         for (int i = 0; i <= 3; i++) {
            int contrasenaIngresada;
            System.out.println("Ingrese la contraseña");
            contrasenaIngresada = sc.nextInt();

            if (contrasenaIngresada == PIN) {
                System.out.println("Bienvenido a su cuenta bancaria");
                break;
            } else {
                System.out.println("Pin incorrecto, por su seguridad su cuenta se cerrara.");
            }
        } */

 /*     while (Nologeado) {
            int contrasenaIngresada;
            System.out.println("Ingrese la contraseña");
            contrasenaIngresada = sc.nextInt();
            if (contrasenaIngresada == PIN) {
                System.out.println("Bienvenido a su cuenta bancaria");
                Nologeado = false;
            } else {
                System.out.println("Pin incorrecto, por su seguridad su cuenta se cerrara.");
            }
            acumulador++;
            System.out.println("Numero de intento: " + acumulador + " de 3 intentos");
            if(acumulador>=3){
                System.out.println("Intento agotados. Usuario Bloqueado");
                Nologeado = false;
            } 
            
        }*/
        Scanner elpepe = new Scanner(System.in);
        //Declaracion de cajitas
        int numeroFacturas;
        double valorFactura;
        double valorTotalFacturas = 0;

        System.out.println("Ingrese la cantidad de facturas: ");
        numeroFacturas = elpepe.nextInt();

        for (int i = 1; i <= numeroFacturas; i++) {
            System.out.println("Dame el valor de factura: ");
            valorFactura = elpepe.nextDouble();
            valorTotalFacturas = valorTotalFacturas + valorFactura;
            System.out.println("El sub total de las facturas es: " + valorTotalFacturas);
        }
        System.out.println("El valor total de las facturas es: " + valorTotalFacturas);
        elpepe.close();
    }
}
