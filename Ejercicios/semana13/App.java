
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double numero1 = 0.0, numero2 = 0.0;
        double resultado = 0.0;

        System.out.println("Dame un numero");
        numero1 = leer.nextDouble();

        System.out.println("Dame otro numero");
        numero2 = leer.nextDouble();

        sumar(numero1, numero2);

        resultado = restar(numero1, numero2);
        System.out.println("La resta es " + resultado);

        multiplicar(numero1, numero2);

        resultado = numero1 / numero2;
        System.out.println("La división es " + resultado);

        leer.close();

    }

    public static void sumar(double numero1, double numero2) {
        System.out.println("La suma es " + (numero1 + numero2));
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static void multiplicar(double numero1, double numero2) {
        System.out.println("La Multiplicación es " + (numero1 * numero2));
    }


    
}
