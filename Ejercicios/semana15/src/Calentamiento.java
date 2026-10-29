import java.util.Scanner;

public class Calentamiento {

    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt();
        System.out.println("El resultado es: " + calcularCuadrado(numero, numero));
    }
}



    public static int calcularCuadrado(int entrada, int entrada2) {
        return entrada * entrada;
    }
/* El siguiente código intenta usar una función para calcular el cuadrado de un número. No tiene errores de sintaxis y compila perfectamente, pero imprime el valor original en lugar del resultado.  */
