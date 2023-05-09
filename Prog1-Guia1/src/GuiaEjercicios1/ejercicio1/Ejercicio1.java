package GuiaEjercicios1.ejercicio1;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado la cantidad de horas trabajadas por un
operario y el valor que se le paga por hora trabajada y listar por pantalla el sueldo que le
corresponda.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        double horas = scanner.nextDouble();
        System.out.println("Ingrese el valor por hora trabajada");
        double monto = scanner.nextDouble();

        double resultado = sueldoTotal(horas, monto);
        System.out.println("El sueldo que le corresponde es: " + resultado);

    }

    public static double sueldoTotal (double horas, double monto) {
        double resultado = horas * monto;
        return resultado;
    }
}
