package GuiaEjercicios3.ejercicio17;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Hacer un programa para ingresar un número y luego informar todos los divisores pares
de ese número.
Ejemplo 1. Si se ingresa 6 se listarán: 2 y 6
Ejemplo 2. Si se ingresa 8 se listarán: 2 y 4.
Ejemplo 3. Si se ingresa 11 no se listará nada.
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero entero");

        int numero = scanner.nextInt();
        List<Integer> divisoresPares = new ArrayList<>();

        for (int i = 2; i <= numero; i = i + 2) {
            if (numero % i == 0) {
                divisoresPares.add(i);
            }
        }

        System.out.println(divisoresPares);
    }

}
