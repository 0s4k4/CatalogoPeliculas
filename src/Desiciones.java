public class Desiciones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = false;
        String tipoPlan = "Plus";
        double notaDeLaPelciula = 8.2;


//        if(fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas populares");
//        } else {
//            System.out.println("Peliculas no populares");
//        }


        if(incluidoEnPlan && tipoPlan.equals("Plus")){
            System.out.println("Peliculas incluidas, Disfrute de su servicio :)");
        } else{
            System.out.println("Peliculas no incluidas :(( favor de elegir otra pelicula o de actualizar su subscripcion");
        }




    }
}
