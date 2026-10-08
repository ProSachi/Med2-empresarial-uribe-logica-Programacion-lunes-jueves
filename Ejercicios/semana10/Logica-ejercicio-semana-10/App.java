
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indicame cual es el saldo");
        double saldo = leer.nextDouble();
        if (saldo < 0) {
            System.out.println("Cuenta en mora");
        } else if (saldo >= 0 && saldo <= 100000) {
            System.out.println("Cuenta básica");
        } else {
            System.out.println("Cuenta Preferencia");
        }
    }
}
