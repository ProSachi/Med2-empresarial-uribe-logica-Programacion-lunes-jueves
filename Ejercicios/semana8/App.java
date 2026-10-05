
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*         boolean tienePermiso = true;
        int nivelAcceso = 4;

// La siguiente línea arroja error:
        System.out.println((nivelAcceso == 5) && (tienePermiso == true)); */
        double saldo = 100, montoRetiro;
        String donacion;
        Scanner pepe = new Scanner(System.in);

        System.out.println("¿Cuánto vas a retirar?");
        montoRetiro = pepe.nextDouble();

        System.out.println("¿Quieres hacer una donación? Si o No");
        donacion = pepe.next().toLowerCase();

        // Fase de evaluación (Proceso lógico)
        if (saldo >= montoRetiro) {
            // Este bloque (Scope) solo se ejecuta si la condición es TRUE
            saldo = saldo - montoRetiro;
            System.out.println("Retiro exitoso.");
        } else if (donacion.equals("si") || donacion.equals("sí")) {
            System.out.println("Aplico donación: " + donacion);
        } else {
            System.out.println("Saldo insuficiente");
        }
// El programa continúa aquí pase lo que pase
        System.out.println("Gracias por usar el cajero.");

        pepe.close();
    }

}
