package GuiaEjercicios3.ejercicio4;

import java.util.Scanner;

/*
Hacer un programa para que el usuario ingrese un número positivo y que luego se
muestren por pantalla los números entre el 1 y el número ingresado por el usuario.
Ejemplo. Si el usuario ingresa 15, se mostrarán los números entre el 1 y el 15.
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número positivo");

        int num = scanner.nextInt();
        int minimo = 1;

        while (minimo <= num) {
            System.out.println(minimo);
            minimo = minimo + 1;
        }
    }
}
