
import java.util.Scanner;

public class ControlInventario {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // 1. Declaración e inicialización (Entrada base)
        int stockActual = 50;
        int cantidadRetirar;
        System.out.println("Stock disponible: " + stockActual);
        System.out.print("Ingrese cantidad a retirar: ");
        cantidadRetirar = lector.nextInt();

        // 2. Condicional Doble (if-else) para proteger la consistencia de datos
        // Principio de Clean Code: Condición clara y legible
        if (cantidadRetirar > stockActual) {
            // Camino de fracaso (Regla de negocio no cumplida)
            System.out.println("Error crítico: Inventario insuficiente.");
            System.out.println("Operación cancelada.");
        } else {
            // Camino de éxito
            stockActual = stockActual - cantidadRetirar;
            System.out.println("Retiro aprobado.");
            System.out.println("Nuevo stock disponible: " + stockActual);
        }

        // Cierre del lector para liberar memoria
        lector.close();
    }
}
