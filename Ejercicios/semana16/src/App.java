
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        int[] velocidades = {85, 92, 110, 78, 95, 120, 88};

        for (int velocidad : velocidades) {
            System.out.println("Velocidad: " + velocidad);
        }

        /*       System.out.println(velocidad.length);

        int velocidadMinima = velocidad[0];

        for (int i = 0; i < velocidad.length; i++) {
            if (velocidadMinima > velocidad[i]) {
                velocidadMinima = velocidad[i];
            }
        }
        System.out.println(velocidadMinima);
        System.out.println("Dame un numero a buscar");

        boolean encontrado = false;

        int numero = leer.nextInt();
        
        for (int i = 0; i < velocidad.length; i++) {
            if (numero == velocidad[i]) {
                encontrado = true;
               
            }
        }

        if (encontrado) {
            System.out.println("El numero existe en la posición ");
        } else {
            System.out.println("El numero no existe");
        } */
    }

    public static int suma(int a, int b) {
        return a + b;
    }

     public static int suma(int a, int b, int c) {
        return a + b + c;
    }



}
