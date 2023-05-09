package GuiaEjercicios1.ejercicio11;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado una cantidad de cantidad de minutos y
mostrar por pantalla a cuantos días, horas y minutos equivalen.
Ejemplo 1: si se ingresan 1520 minutos el programa mostrará por pantalla que equivalen a 1
día, 1 hora y 20 minutos.
Ejemplo 2: si se ingresan 480 minutos el programa mostrará por pantalla que equivalen a 0
día, 8 horas y 0 minutos.
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = scanner.nextInt();

        int dias = dias(minutos);
        int horasRestantes = horasRestantes(minutos);
        int minutosRestantes = minutosRestantes(minutos);

        System.out.println("La cantidad de dias son: " + dias);
        System.out.println("La cantidad de horas son: " + horasRestantes);
        System.out.println("La cantidad de minutos son : " + minutosRestantes);


    }

    public static int dias (int minutos) {
        int horas = minutos / 60;
        int dias = horas / 24;
        return dias;
    }

    public static int horasRestantes (int minutos){
        int horas = minutos / 60;
        int horasRestantes = horas % 24;
        return horasRestantes;
    }

    public static int minutosRestantes (int minutos) {
        int minutosRestantes = minutos % 60;
        return minutosRestantes;
    }

}
