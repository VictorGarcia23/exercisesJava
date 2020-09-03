public abstract class Coche {

    public abstract void arrancar();

    public abstract void conducir();

    public abstract void parar();


    private int cv;
    private String modelo;
    private String color;
    public  Coche(int cv, String modelo, String color){
        this.cv = cv;
        this.modelo = modelo;
        this.color = color;
    }

    public int getCv() {
        return cv;
    }

    public String getModelo() {
        return modelo;
    }
    public String getColor(){
        return color;
    }

}
