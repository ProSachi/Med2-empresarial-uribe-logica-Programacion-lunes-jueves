
import java.util.Scanner;

public class ValidadorPositivos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroIngresado = -1;

        do {
            System.out.print("Ingrese un valor estrictamente positivo: ");

            if (lector.hasNextInt()) {
                numeroIngresado = lector.nextInt();
                if (numeroIngresado > 0) {
                    System.out.println("Dato validado correctamente: " + numeroIngresado);
                } else {
                    System.out.println("Error. El número debe ser mayor a cero.");
                }
            } else {
                System.out.println("Error. Debe ingresar un número entero válido.");
                lector.next(); // descarta el token inválido
            }
        } while (numeroIngresado <= 0);
        lector.close();
    }
}
