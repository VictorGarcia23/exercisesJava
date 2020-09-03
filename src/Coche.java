public abstract class Coche {

    public abstract void arrancar();

    public abstract void conducir();

    public abstract void parar();
    private int cv;
    private String modelo;
    public  Coche(int cv, String modelo){
        this.cv = cv;
        this.modelo = modelo;
    }
}
