
public class Arrays {

    public static void main(String[] args) {
        /*         int[] numeros = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 30) {
                System.out.println("Existe el numero en la posición " + i);

                System.out.println(numeros[i]);
            }
        } */
 /*         String[] mejoresVendedores = new String[3];
        mejoresVendedores[0] = "Andres";
        mejoresVendedores[1] = "Maria";

        for (int i = 0; i < mejoresVendedores.length; i++) {
            System.out.println("El vendedor " + mejoresVendedores[i] + ", se encuentra en el puesto " + (i + 1));
        } */

 /*        double[] notas = {3.5, 4.0, 2.8, 5.0};
        double sumaTotal = 0.0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            sumaTotal = sumaTotal + notas[i];
        }

        System.out.println("El promedio de notas es: " + (sumaTotal / notas.length));
        System.out.printf("El promedio de notas es: %.1f", (sumaTotal / notas.length));
         */
        double[] ventas = {120.5, 450.0, 95.8, 600.2, 310.0};
        double ventaMayor = ventas[0];
// Implementa el ciclo for para comparar el resto de elementos
        for (int i = 0; i < ventas.length; i++) {
            if (ventaMayor < ventas[i]) {
                ventaMayor = ventas[i];
            }
        }
        System.out.println("Valor mayor es: " + ventaMayor);

    }
}
