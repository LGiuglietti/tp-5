import Modulos.Electrodomesticos;
import Modulos.Lavadora;
import Modulos.Television;

public class Main {
    public static void main(String[] args) {
        Electrodomesticos[] arreglo = new Electrodomesticos[5];
        Electrodomesticos aux = new Lavadora(100,"blanco",'A',50,30);
        Electrodomesticos aux1 = new Television(1500,"negro",'F',12,50,true);
        Electrodomesticos aux2 = new Lavadora(250,"azul",'D',35,12);
        Electrodomesticos aux3 = new Television(1000,"gris",'B',5,35,false);
        Electrodomesticos aux4 = new Lavadora(500,"rojo",'E',25,100);

        arreglo[0]=aux;
        arreglo[1]=aux1;
        arreglo[2]=aux2;
        arreglo[3]=aux3;
        arreglo[4]=aux4;

        for(int i=0;i<5;i++)
        {
            System.out.println(arreglo[i].toString());
            System.out.println("precio final: $"+arreglo[i].precioFinal());
        }

    }
  }