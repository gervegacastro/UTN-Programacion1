package GuiaEjercicios2.ejercicio17;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado cuatro números. Si los valores que se
ingresaran están ordenados en forma creciente, emitir el mensaje “Conjunto Ordenado”, caso
contrario emitir el mensaje: “Conjunto Desordenado”.
Ejemplo 1: si los números que se ingresan son 8,10, 12 y 14, entonces están ordenados.
Ejemplo 2: si los números que se ingresan son 8,12, 12 y 14, entonces están ordenados.
Ejemplo 3: si los números que se ingresan son 10, 8,12 y 14, entonces están desordenados.
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cuatro numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 <= num2 && num2 <= num3 && num3 <= num4) {
            System.out.println("Conjunto Ordenado");
        } else {
            System.out.println("Conjunto Desordenado");
        }


    }
}
