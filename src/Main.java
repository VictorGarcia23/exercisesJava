import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(345, "M5");
        Audi audi = new Audi(450, "RS4");
        Mercedes mercedes = new Mercedes(221, "GLA 220");


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

    }

}
