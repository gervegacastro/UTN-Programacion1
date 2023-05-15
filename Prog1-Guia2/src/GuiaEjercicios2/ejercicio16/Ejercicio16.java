package GuiaEjercicios2.ejercicio16;
import java.util.Scanner;

/*
Hacer un programa para ingresar por teclado las cuatro notas de los exámenes obtenidas
por un alumno y luego emitir uno solo de los cartel de acuerdo a las siguientes condiciones:
- “Promociona”, si obtuvo en los cuatro exámenes nota 7 o más.
- “Rinde examen final”, si obtuvo nota 4 o más en por lo menos tres exámenes.
- “Recupera Parciales”, si obtuvo nota 4 o más en por lo menos uno de los exámenes.
- “Recursa la materia”, si no aprobó ningún examen parcial.
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese la tercer nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Ingrese la cuarta nota: ");
        int nota4 = scanner.nextInt();

        if (nota1 >= 7 && nota2 >= 7 && nota3 >= 7 && nota4 >= 7) {
            System.out.println("Promociona");
        } else if (nota1 >= 4 && nota2 >= 4 && nota3 >= 4 && nota4 < 7 || nota1 >= 4 && nota2 >= 4 && nota3 < 4 && nota4 >= 7
                    || nota1 >= 4 && nota2 < 4 && nota3 >= 4 && nota4 >= 7 || nota1 < 4 && nota2 >= 4 && nota3 >= 4 && nota4 >= 7) {
            System.out.println("Rinde examen final");
        } else if (nota1 >= 4 && nota2 < 4 && nota3 < 4 && nota4 < 4 || nota1 < 4 && nota2 >= 4 && nota3 < 4 && nota4 < 4
                    || nota1 < 4 && nota2 < 4 && nota3 >= 4 && nota4 < 4 || nota1 < 4 && nota2 < 4 && nota3 < 4 && nota4 >= 4){
            System.out.println("Recupera parciales");
        } else if (nota1 < 4 && nota2 < 4 && nota3 < 4 && nota4 < 4){
            System.out.println("Recursa la materia");
        }

    }
}



