package GuiaEjercicios2.ejercicio14;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado la fecha de nacimiento de una persona,
ingresando día, mes y año como 3 datos individuales. Luego ingresar la fecha actual
ingresando día, mes y año como 3 datos individuales. Calcular luego la edad en años de esa
persona y listarlo por pantalla.
Ejemplo 1. Si se ingresa como fecha de nacimiento: 3/12/2000 y la fecha actual es 26/2/2019
la edad de esa persona es 18 ya que los 19 recién los cumple en diciembre.
Ejemplo 2. Si se ingresa como fecha de nacimiento: 3/1/2000 y la fecha actual es 26/2/2019 la
edad de esa persona es 19.
Ejemplo 3. Si se ingresa como fecha de nacimiento: 28/2/2000 y la fecha actual es 26/2/2019
la edad de esa persona es 18 ya que le faltan 2 días para cumplir los 19 años
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el dia de la fecha actual: ");
        int diaActual = scanner.nextInt();
        System.out.println("Ingrese el mes de la fecha actual: ");
        int mesActual = scanner.nextInt();
        System.out.println("Ingrese el año de la fecha actual: ");
        int anioActual = scanner.nextInt();

        int edad = 0;

        if (anioActual > anio && mesActual >= mes && diaActual >= dia) {
            edad = anioActual - anio;
        } else if (anioActual > anio && mesActual == mes && diaActual < dia) {
            edad = anioActual - anio - 1;
        } else if (anioActual > anio && mesActual < mes) {
            edad = anioActual - anio - 1;
        }

        System.out.println(edad);
    }

}

