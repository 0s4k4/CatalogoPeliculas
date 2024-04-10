public class casting {

    public static void main(String[] args) {

        //la casting nos ayuda  a poder convertir y usar un tipo de dato a otro


        //casting implicito es aquel que es comptible como un int a un double
        int x = 10;

        double y = x;

        System.out.println(y);

        //casting explicito
        //as aquel que no es compatible como un double  aun x

        double a = 10.5;
        int b = (int) x;

        System.out.println(b);


    }
}
