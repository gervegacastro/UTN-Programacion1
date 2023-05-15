package GuiaEjercicios2.ejercicio7;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado tres números e informar con una leyenda
aclaratoria si los tres son todos distintos entre sí, caso contrario no emitir nada.
Ayuda: Si A es distinto de B y B es distinto de C, es no sígnica que A y C sean distintos.
Ejemplo: A=8, B=6 y C=8.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 != num2 || num1 != num3 || num2 != num3) {
            System.out.println("Los numeros ingresados son distintos entre si!!");
        }


    }
}
