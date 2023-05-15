package GuiaEjercicios2.ejercicio15;
import java.util.Scanner;

/*
Un año es bisiesto si es múltiplo de 4, exceptuando a los años que son múltiplos de 100
pero que no sean múltiplos de 400. Esto último significa que el año 1900 no es bisiesto, pero
el año 2000 si lo es.
Hacer un programa para que ingresar un año y listar por pantalla si es bisiesto o no lo es.
Ejemplo 1. Si se ingresa el año 2020 se indicará como bisiesto.
Ejemplo 2. Si se ingresa el año 2019 se indicará como no bisiesto.
Ejemplo 3. Si se ingresa el año 1800 o 1900 se indicará como no bisiesto.
Ejemplo 4. Si se ingresa el año 1600 o 2000 se indicará como bisiesto.
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un año: ");
        int anio = scanner.nextInt();

        if (anio % 4 == 0 || anio % 100 == 0 && anio % 400 != 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }


    }
}
