import Modulos.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre= teclado.nextLine();
        System.out.println("ingrese edad");
        int edad= teclado.nextInt();
        System.out.println("ingrese peso");
        int peso= teclado.nextInt();
        System.out.println("ingrese altura");
        double altura=teclado.nextDouble();
        System.out.println("ingrese sexo");
        teclado.nextLine();
        String sexo=teclado.nextLine();
        char sexoChar=sexo.charAt(0);

        Persona persona1=new Persona(nombre,peso,altura,edad,sexoChar);
        System.out.println(persona1.toString());
        Persona persona2=new Persona(nombre,edad,sexoChar);
        System.out.println(persona2.toString());
        Persona persona3=new Persona();

        persona3.setAltura(altura);
        persona3.setEdad(edad);
        persona3.setNombre(nombre);
        persona3.setSexo(sexoChar);
        persona3.setPeso(peso);
        System.out.println(persona3.toString());

        int res=persona1.calcularIMC();
        mostrarIMC(res);
        res=persona2.calcularIMC();
        mostrarIMC(res);
        res=persona3.calcularIMC();
        mostrarIMC(res);

    }
    public static void mostrarIMC(int res) //trabaja en conjunto con Persona.calcularIMC()
    {
        if (res==-1)
        {
            System.out.println("bajo de peso");
        } else if (res==0) {
            System.out.println("peso ideal");
        }
        else {
            System.out.println("sobrepeso");
        }
    }
}
