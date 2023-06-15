package GuiaEjercicios3.ejercicio1;

/*
Hacer un programa para mostrar por pantalla los números del 1 al 10.
Importante: El programa no tiene ningún ingreso de datos.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int [] contador = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < contador.length; i = i + 1) {
            System.out.println(contador[i]);
        }

    }
}
