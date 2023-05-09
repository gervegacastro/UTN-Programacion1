package GuiaEjercicios1.ejercicio4;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado la cantidad de asientos disponibles en un
avión y la cantidad de pasajes ocupados y luego calcular e informar el porcentaje de
ocupación y el porcentaje de no ocupación del mismo.
Ejemplo si el avión tiene 200 asientos disponibles y se vendieron 80 pasajes, el porcentaje de
ocupación que se informará será de un 40% y el porcentaje de no ocupación será de un 60%
*/
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de asientos disponibles");
        double asientos = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de pasajeros");
        double pasajeros = scanner.nextDouble();

        double porcentajeOcupacion = porcentajeOcupacion(pasajeros, asientos);
        double porcentajeNoOcupacion = porcentajeNoOcupacion(pasajeros, asientos);

        System.out.println("El porcentaje de ocupacion es : " + porcentajeOcupacion + "%");
        System.out.println("El porcentaje de NO ocupacion es : " + porcentajeNoOcupacion + "%");
    }

    public static double porcentajeOcupacion (double pasajeros, double asientos) {
        double resultado = (pasajeros / asientos) * 100;
        return resultado;
    }

    public static double porcentajeNoOcupacion (double pasajeros, double asientos) {
        double asientosLibres = asientos - pasajeros;
        double resultado = (asientosLibres / asientos) * 100;
        return resultado;
    }
}
