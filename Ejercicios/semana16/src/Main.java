
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        int[] velocidades = {85, 92, 110, 78, 95, 120, 88};
        System.out.println("La suma es: " + sumar(velocidades));
    }

    public static void suma(Scanner lector) {
        System.out.println("Intresa un numero: ");
        int numero1 = lector.nextInt();

        System.out.println("Intresa un numero: ");
        int numero2 = lector.nextInt();
        System.out.println("La suma es: " + (numero1 + numero2));
    }

    public static int sumar(int[] original) {
        int suma = 0;
        for (int velocidad : original) {
            suma = suma + velocidad;
        }
        return suma;
    }

}
