package GuiaEjercicios1.ejercicio10;

import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado una cantidad de horas y mostrar por pantalla
a cuantas días y horas equivalen.
Ejemplo 1: si se ingresan 26 horas el programa mostrará por pantalla que equivalen a 1 día y
2 horas.
Ejemplo 2: si se ingresan 72 horas el programa mostrará por pantalla que equivalen a 3 días y
0 horas.
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas");
        int horas = scanner.nextInt();

        int dias = dias(horas);
        int horasRestantes = horasRestantes(horas);
        System.out.println("La cantidad de dias son: " + dias + " y las horas restantes son " + horasRestantes);

    }

    public static int dias (int horas) {
        int dias = horas / 24;
        return dias;
    }

    public static int horasRestantes (int horas) {
        int horasRestantes = horas % 24;
        return horasRestantes;
    }

}
