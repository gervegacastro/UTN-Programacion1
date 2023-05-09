package GuiaEjercicios1.ejercicio9;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado una cantidad de minutos y mostrar por
pantalla a cuantas horas y minutos equivalen.
Ejemplo 1: si se ingresan 380 minutos el programa mostrará por pantalla que equivalen a 6
horas y 20 minutos.
Ejemplo 2: si se ingresan 720 minutos el programa mostrará por pantalla que equivalen a 12
horas y 0 minutos.
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        double minutos = scanner.nextDouble();

        double cantidadHoras = calcularHoras(minutos);
        System.out.println("La cantidad de horas son: " + cantidadHoras);
    }

    public static double calcularHoras (double minutos) {
        return minutos / 60;
    }
}
