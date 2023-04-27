package Modulos;

public class Electrodomesticos {
    private double precioBase;
    private String color;
    private char consumo;
    private int peso;

    //son heredables


    public Electrodomesticos(double precioBase, String color, char consumo, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    public Electrodomesticos()
    {
        this.color="blanco";
        this.consumo='F';
        this.precioBase=100;
        this.peso=5;
    }

    public Electrodomesticos(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color="blanco";
        this.consumo='F';
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }
    public boolean comprobarConsumoEnergetico(char letra)
    {
        letra=Character.toUpperCase(letra);
        boolean res=false;
        if(letra=='A') {
            res=true;
        } else if (letra=='B') {
            res=true;
        } else if (letra=='C') {
            res=true;
        } else if (letra=='D'){
            res=true;
        } else if (letra=='E'){
            res=true;
        } else if (letra=='F') {
            res=true;
        }
        return res;
    }
    public boolean comprobarColor(String color)
    {
        boolean res=false;
        if(color.equalsIgnoreCase("blanco")){
            res=true;
        } else if (color.equalsIgnoreCase("negro")) {
            res=true;
        } else if (color.equalsIgnoreCase("rojo")) {
            res=true;
        } else if (color.equalsIgnoreCase("azul")) {
            res=true;
        } else if (color.equalsIgnoreCase("gris")) {
            res=true;
        }
        return res;
    }
    public double precioFinal()
    {
        double precio=0;
        switch(this.consumo){
            case 'A':
                precio+=100;
            case 'B':
                precio+=80;
            case 'C':
                precio+=60;
            case'D':
                precio+=50;
            case 'E':
                precio+=30;
            case 'F':
                precio+=10;
        }
        if (peso>=80)
        {
            precio+=100;
        } else if (79>=peso && peso>=50) {
            precio+=80;
            
        } else if (49>=peso && peso>=20) {
            precio+=50;
        }else{
            precio+=10;
        }
        return precio+precioBase;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
