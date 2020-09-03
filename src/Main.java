
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(345, "M5", "Azul");
        Audi audi = new Audi(450, "RS4", "Negro");
        Mercedes mercedes = new Mercedes(221, "GLA 220", "Plata");
        System.out.println(bmw.getCv() + " " + bmw.getModelo() + " " + bmw.getColor() );
        System.out.println(audi.getCv() + " " + audi.getModelo() + " " + audi.getColor());
        System.out.println(mercedes.getCv() + " " + mercedes.getModelo() + " " + mercedes.getColor());

        Scanner s = new Scanner(System.in);
        System.out.println("Tiene la llave?");
        String llaves = s.nextLine();

        if (llaves.equals("si")) {
            bmw.arrancar();
            audi.arrancar();
            mercedes.arrancar();
        } else {
            System.out.println("Coche kaputt");
        }
        System.out.println("Quieres apagar el coche?");
        String apagar = s.nextLine();
        if (apagar.equals("si")) {
            bmw.parar();
            audi.parar();
            mercedes.parar();
        } else {
            System.out.println("usted está en la pelicula Speed");
        }
    }

}
