import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota  = 0;
        double mediaEvaluaciones = 0;

        System.out.println("Ingrese la cantidad de usuarios que entraron a ver la pelicula: ");
        int usuarios = teclado.nextInt();

        for (int i = 0; i < usuarios; i++) {
            System.out.println("Ingrese la nota del usuario " + i + ": ");
            nota = teclado.nextDouble();
            mediaEvaluaciones  = mediaEvaluaciones + nota;
        }

        System.out.println("La media de evaluaciones es: " + mediaEvaluaciones/usuarios);
    }
}
