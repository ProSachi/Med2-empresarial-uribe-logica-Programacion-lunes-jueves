import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int edad;
         * int EDADNINIO = 12;
         * int EDADJOVEN = 18;
         * 
         * System.out.println("¿Cuál es tu edad?");
         * edad = sc.nextInt();
         * if (edad < EDADNINIO) {
         * System.out.println("Carril niño");
         * } else if (edad < EDADJOVEN) {
         * System.out.println("Carril Joven");
         * } else {
         * System.out.println("Carril adulto");
         * }
         */
        int opcion = 0;
        do {
            System.out.println("1. Ingresar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Finalizar \n");
            opcion = sc.nextInt();

            /*
             * if (opcion == 1) {
             * System.out.println("Ha seleccionado la opcion 1 \n ");
             * } else if (opcion == 2) {
             * System.out.println("Ha seleccionado la opcion 2 \n");
             * } else if (opcion == 3) {
             * System.out.println("Ha seleccionado la opcion 3 \n");
             * } else {
             * System.out.println("Ha seleccionado la opcion 4 \n");
             * }
             */
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opcion 1 \n ");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opcion 2 \n ");
                case 3:
                    System.out.println("Ha seleccionado la opcion 3 \n ");
                case 4:
                    System.out.println("Ha seleccionado la opcion 4 \n ");
                    break;
                default:
                    System.out.println("Valor incorrecto \n ");
                    break;
            }

        } while (opcion != 4);

    }
}
