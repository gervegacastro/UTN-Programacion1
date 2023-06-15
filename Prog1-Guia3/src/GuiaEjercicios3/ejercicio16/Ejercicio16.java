package GuiaEjercicios3.ejercicio16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Hacer un programa para ingresar un número y luego informar todos los divisores de ese
número.
Ejemplo 1. Si se ingresa 6 se listarán: 1, 2, 3 y 6
Ejemplo 2. Si se ingresa 9 se listarán: 1, 3 y 9.
Ejemplo 3. Si se ingresa 11 se listarán 1 y 11.
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        int numero = scanner.nextInt();
        List<Integer> divisores = new ArrayList<>();
         for (int i = 1; i <= numero; i = i + 1) {
             if (numero % i == 0) {
                 divisores.add(i);
             }
         }

        System.out.println(divisores);


    }
}
