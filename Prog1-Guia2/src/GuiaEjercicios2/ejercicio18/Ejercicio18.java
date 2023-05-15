package GuiaEjercicios2.ejercicio18;
import java.util.Scanner;

/*
Una empresa de electricidad cobra el servicio a sus clientes de acuerdo a la siguiente
escala:
$ 10 por kilovatio por el consumo hasta los primeros 100 kilovatios de consumo.
$ 12 por kilovatio por el consumo excedente de 101 a 200 kilovatios.
$ 15 por kilovatio por el consumo excedente de 201 kilovatios en adelante.
Hacer un programa para que, dado el consumo en kilovatios de un determinado cliente, el
programa calcule e informe el total a pagar por el mismo.
Ejemplo 1: Un consumo de 55 kilovatios, se calculará: $ 10 x 55= $ 550
Ejemplo 2: Un consumo de 125 kilovatios, se calculará: $ 10 x 100 + $ 12 x 25=$ 1300
Ejemplo 3: Un consumo de 250 kilovatios, se calculará: $ 10 x 100 + $ 12 x 100 + $ 15 x 50 = $ 2950
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilovatios consumidos: ");
        double kilovatios = scanner.nextDouble();

        double precio = 0;

        if (kilovatios <= 100) {
            precio = kilovatios * 10;
            System.out.println("El precio es: " + precio);
        } else if (kilovatios > 100 && kilovatios <= 200) {
            precio = (100 * 10) + ((kilovatios - 100) * 12);
            System.out.println("El precio es " + precio);
        } else if (kilovatios > 200) {
            precio = (100 * 10) + (100 * 12) + ((kilovatios - 200)* 15);
            System.out.println("El precio es " + precio);
        }


    }
}
