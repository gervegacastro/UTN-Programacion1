package GuiaEjercicios1.ejercicio13;
import java.util.Scanner;

/*
Hacer un programa para un cajero automático para ingresar un importe a retirar y convertir
el mismo en la cantidad de billetes de $ 1.000, $ 500, $ 200 y $ 100 a entregar.
Ejemplo 1: Si el importe a retirar es $ 2.500 se mostrara por pantalla que se deberán entregar 2
billetes de $ 1.000, 1 billete de $ 500 y 0 billetes de $ 200 y $ 100. SIGUE →
Ejemplo 2: Si el importe a retirar es $ 3.400 se mostrara por pantalla que se deberán entregar 3
billetes de $ 1.000, 2 billetes de $ 200 y 0 billetes de $ 500 y $ 100.
Ejemplo 3: Si el importe a retirar es $ 300 se mostrara por pantalla que se deberán entregar 1
billete de $ 200, 1 billete de $ 100, 0 billetes de $ 1.000 y 0 billetes de $ 500.
- 4 -
Recordatorio. Considerar en todos los casos que el importe a retirar es en todos los casos
múltiplo de $ 100 ya que el cajero no cuenta con billetes de $ 50, $ 20 o $ 10.
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el importe a retirar: ");
        int importe = scanner.nextInt();

        int billetesMil = billetesMil(importe);
        int billetesQuinientos = billetesQuinientos(importe);
        int billetesDoscientos = billetesDoscientos(importe);
        int billetesCien = billetesCien(importe);

        System.out.println("La cantidad de billetes de mil es: " + billetesMil);
        System.out.println("La cantidad de billetes de quinientos es: " + billetesQuinientos);
        System.out.println("La cantidad de billetes de doscientos es: " + billetesDoscientos);
        System.out.println("La cantidad de billetes de cien es: " + billetesCien);

    }

    public static int billetesMil (int importe) {
        int resultado = importe / 1000;
        return resultado;
    }

    public static int billetesQuinientos (int importe) {
        int restoMil = importe % 1000;
        int resultado = restoMil / 500;
        return resultado;
    }

    public static int billetesDoscientos (int importe) {
        int restoMil = importe % 1000;
        int restoQuinientos = restoMil % 500;
        int resultado = restoQuinientos / 200;
        return resultado;
    }

    public static int billetesCien (int importe) {
        int restoMil = importe % 1000;
        int restoQuinientos = restoMil % 500;
        int restoDoscientos = restoQuinientos % 200;
        int resultado = restoDoscientos / 100;
        return resultado;
    }


}
