import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Audi audi = new Audi();
        Mercedes mercedes = new Mercedes();


        Scanner s = new Scanner(System.in);
        System.out.println("Tiene la llave?");
        String llaves = s.nextLine();

        if (llaves.equals("si")) {
            bmw.arrancar();
            audi.arrancar();
            mercedes.arrancar();
        } else {
            System.out.println("coche kaput");
        }

    }

}
