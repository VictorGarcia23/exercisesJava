public class Audi extends Coche {

    @Override
    public void arrancar() {
        System.out.println("brrmmwwwbbbrrrr");
    }

    @Override
    public void conducir() {
        System.out.println("para adelante");
    }

    @Override
    public void parar() {
        System.out.println("Coche apagado");
    }
    public Audi(int cv, String modelo){
        super(cv, modelo);
    }
}
