package Modulos;

public class Television extends Electrodomesticos{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television(double precioBase, String color, char consumo, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }//full

    public Television() { //por defecto
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, int peso) { //precio y peso
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precio=0;
        if(sintonizadorTDT==true)
        {
            precio+=50;
        }
        if(resolucion>=40)
        {
            double aux=super.precioFinal();
            precio+=aux;
            precio*=0.3;
        }
        return precio+super.precioFinal();
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                "} " + super.toString();
    }
}
