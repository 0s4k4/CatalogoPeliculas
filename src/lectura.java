import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento de tu pelicula favorita");
        int fecha = teclado.nextInt();
        System.out.println("Escribe la nota de tu pelicula favorita");
        double nota = teclado.nextDouble();


        System.out.println("Mi pelicula favorita es: "+pelicula);
        System.out.println("Su fecha de lanzamiento es: "+fecha);
        System.out.println("Su nota de tu pelicula favorita es: "+nota);




    }
}
