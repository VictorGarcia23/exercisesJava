public class Bmw extends Coche {


    @Override
    public void arrancar() {
        System.out.println("brrrrrmmm");
    }

    @Override
    public void conducir() {
        System.out.println("para adelante");
    }

    @Override
    public void parar() {
        System.out.println("Coche apagado");
    }
    public Bmw(int cv, String modelo, String color){
        super(cv, modelo, color);
    }

}
