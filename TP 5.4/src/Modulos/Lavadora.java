package Modulos;

public class Lavadora extends Electrodomesticos{
    private int carga;

    public int getCarga() {
        return carga;
    }

    public Lavadora(double precioBase, String color, char consumo, int peso, int carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    @Override
    public double precioFinal() {
        double precio=0;
        if(carga>=30)
        {
           precio+=30;
        }
        return super.precioFinal()+precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                "} " + super.toString();
    }
}
