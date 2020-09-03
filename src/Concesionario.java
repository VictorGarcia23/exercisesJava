import java.util.Scanner;

public class Concesionario  {

    public static void marcas(){
        Scanner s = new Scanner(System.in);
        System.out.println("Que marca de coche quieres: Audi, Bmw, Mercedes?");
        String cadena = s.nextLine();
        cadena.toCharArray();
    }

}
