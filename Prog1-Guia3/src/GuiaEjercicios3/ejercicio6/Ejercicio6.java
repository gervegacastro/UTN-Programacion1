package GuiaEjercicios3.ejercicio6;

import java.util.Scanner;

/*
Hacer un programa para ingresar un N valor que indica la cantidad de números que
componen una lista y luego solicitar se ingresen esos N números. Se pide informar cuantos
son positivos.
Ejemplo: Se ingresa como valor N un 5, y luego se ingresa: 10, -3, 2, 5, 4. Se listará
Cantidad de Positivos: 4
Ejemplo: Se ingresa como valor N un 6, y luego se ingresa: -10, -3, -2, 0, -5, -4. Se listará
Cantidad de Positivos: 0

 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que conformarán la lista: ");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese los " + cantidad + " numeros q conformarán la lista. Debes ser enteros: ");

        int positivos = 0;

        for (int i = 0; i < cantidad; i = i +1) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                positivos = positivos + 1;
            }
        }
        System.out.println("La cantidad de numeros positivos es: " + positivos);

    }
}
