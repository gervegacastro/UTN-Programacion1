package GuiaEjercicios2.ejercicio8;
import java.util.Scanner;

/*
Basado en los 2 ejercicios anteriores, hacer un programa para ingresar por teclado la
longitud de los tres lados de un triángulo y luego listar que tipo de triángulo es:
- Equilátero: si los tres lados son iguales
- Isósceles: si dos de los tres lados son iguales
- Escaleno: si los tres lados son distintos entre sí
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud de los 3 lados de un triangulo: ");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es un equilátero");
        }
        if (lado1 == lado2 && lado1 != lado3) {
            System.out.println("El triangulo es un isosceles");
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("El triangulo es un ecaleno");
        }


    }
}
