package GuiaEjercicios2.ejercicio12;
import java.util.Scanner;

/*
Hacer un programa para ingresar tres números distintos y listarlos ordenados de menor a
mayor. Ejemplo: si se ingresa 4,-3,7, se debe mostrar -3, 4,7.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres numeros distintos");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int minimo;
        int inter;
        int maximo;

        // Minimo
        if (num1 < num2 && num1 < num3) {
            minimo = num1;
        } else if (num2 < num1 && num2 < num3) {
            minimo = num2;
        } else {
            minimo = num3;
        }

        // Maximo
        if (num1 > num2 && num1 > num3) {
            maximo = num1;
        } else if (num2 > num1 && num2 > num3) {
            maximo = num2;
        } else {
            maximo = num3;
        }

        // Inter
        if (num1 > minimo && num1 < maximo) {
            inter = num1;
        } else if (num2 > minimo && num2 < maximo) {
            inter = num2;
        } else {
            inter = num3;
        }

        System.out.println(minimo + "--" + inter + "--" + maximo);



    }
}
