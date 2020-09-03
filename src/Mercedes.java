public class Mercedes extends Coche{
    @Override
    public void arrancar() {
        System.out.println("cloclcolcoc");
    }

    @Override
    public void conducir() {
        System.out.println("para adelante");
    }

    @Override
    public void parar() {
        System.out.println("Coche apagado");
    }
    public Mercedes(int cv, String modelo){
        super(cv, modelo);
    }
}
