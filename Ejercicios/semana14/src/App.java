
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indica el nombre a convertir");
        conversionLower(leer.next());
        conversionUpper(leer.next());
        leer.close();
    }

    public static void conversionLower(String nombre) {
        System.out.println(nombre.toLowerCase());
    }

    public static void conversionUpper(String nombre) {
        System.out.println(nombre.toUpperCase());
    }

}
