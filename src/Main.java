public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Audi audi = new Audi();
        Mercedes mercedes = new Mercedes();


        bmw.arrancar();
        bmw.conducir();

        audi.arrancar();
        audi.conducir();

        mercedes.arrancar();
        mercedes.conducir();
    }

}
