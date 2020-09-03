public abstract class Coche {
    protected boolean arrancar = false;
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
    int velocidad = 0;
    public void acelerar(){
        if (arrancar == true){
            this.velocidad++;
        } else{
            System.out.println("deber primero arranca el coche");
        }
    }
    public void estacionar(){
        if (velocidad==0){
            System.out.println("coche estacionado");
        } else {
            System.out.println("sigue conduciendo");
        }
    }
}
