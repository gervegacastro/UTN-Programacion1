package GuiaEjercicios3.ejercicio18;
import java.util.Scanner;

/*
Hacer un programa para ingresar un número y luego informar la cantidad de divisores
de ese número.
Ejemplo 1. Si se ingresa 6 se listarán: 4 divisores.
Ejemplo 2. Si se ingresa 9 se listarán: 3 divisores.
Ejemplo 3. Si se ingresa 11 se listará: 2 divisores.
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        int numero = scanner.nextInt();
        int cantidadDivisores = 0;

        for (int i = 1; i <= numero; i = i + 1) {
            if (numero % i == 0) {
                cantidadDivisores = cantidadDivisores + 1;
            }
        }

        System.out.println(cantidadDivisores);

    }
}
