
public class App {

    public static void main(String[] args) {
/* //el main solo en la principal
        System.out.println("Hola Mundo");
//Definir
        String nombre = "Santiago";
        int edad = 18;
        boolean puedeEntrar;
//Proceso
        puedeEntrar = edad >= 18;
//Salida
        System.out.println(nombre + " Puede entrar " + puedeEntrar);
 */
        //Definición
        //Entrada
        double PRECIOUNITARIO = 1000;
        double PESOKILOGRAMOS = 15;
        int UNIDADESPRODUCTO = 48;
        double SALDODISPONIBLE = 100000;
        boolean esPedidoViable;

          // proceso
        esPedidoViable = (UNIDADESPRODUCTO > 40) && ((PRECIOUNITARIO * UNIDADESPRODUCTO) <= SALDODISPONIBLE) && ((PESOKILOGRAMOS * UNIDADESPRODUCTO) <= 750);
        System.out.println(UNIDADESPRODUCTO > 40);
        System.out.println((PRECIOUNITARIO * UNIDADESPRODUCTO) <= SALDODISPONIBLE);
        System.out.println((PESOKILOGRAMOS * UNIDADESPRODUCTO) <= 750);
        System.out.println("El pedido es viable: " + esPedidoViable);


    }
}
