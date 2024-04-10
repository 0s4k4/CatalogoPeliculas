public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a  screen match");

        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incloidoEnElPlan = true;

        double notaDeLaPelciula = 8.2;

        double media =( 8.2 + 6.0 + 9.0) / 3;

        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Nota de la pelicula "+notaDeLaPelciula);
        System.out.println("Media: " + media);

        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio
                Fue lanzada en  """ +" "+ fechaDeLanzamiento;

        System.out.println("Sinopsis: "+sinopsis);


        //casting
        int clasificacion  = (int) (media / 2);

        System.out.println("Clasificacion: "+clasificacion);


    }
}