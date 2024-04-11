import java.util.Scanner;

public class ActividadLectura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //desarolla un programa que te permita obtener el promedio de 5 materias
        System.out.println("Ingrese la calificacion de la  materia de matematicas");
        int CalificacionMatematicas = teclado.nextInt();
        System.out.println("Ingrese la calificacion de la materia de espanol");
        int CalificacionEspanol = teclado.nextInt();
        System.out.println("Ingrese la calificacion de la materia de geografia");
        int CalificacionGeografia = teclado.nextInt();
        System.out.println("Ingrese la calificacion de la materia de ciencias");
        int CalificacionCiencias = teclado.nextInt();
        System.out.println("Ingrese la calificacion de la materia de valores");
        int CalificacionValores = teclado.nextInt();

        System.out.println("----------CALIFICACIONES FINALES----------");
        System.out.println("Calificacion de matematicas es "+CalificacionMatematicas);
        System.out.println("Calificacion de espanol es "+CalificacionEspanol);
        System.out.println("Calificacion de geografia es "+CalificacionGeografia);
        System.out.println("Calificacion de ciencias es "+CalificacionCiencias);
        System.out.println("Calificacion de valores es "+CalificacionValores);

        System.out.println("----------PROMEDIO FINAL----------");
        int promedioFinal = (CalificacionCiencias+CalificacionValores+CalificacionMatematicas+CalificacionEspanol+CalificacionGeografia)/5;
        System.out.println("Promedio final es "+promedioFinal);


    }
}
