package Modulos;

import java.util.Random;

public class Persona {
    private String nombre;
    private String dni;
    private char sexo;
    private int peso;
    private double altura;
    private int edad;


    public Persona()
    {
        nombre="";
        dni="";
        sexo='H';
        peso=0;
        altura=0;
        edad=0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo =sexo;
        this.dni=generaDNI();
        this.altura=0;
        this.peso=0;
    }

    public Persona(String nombre, int peso, double altura, int edad, char sexo) {
        this.nombre = nombre;
        this.dni = generaDNI();
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo =sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }

    public int calcularIMC()
    {
        int res;
        double aux=peso/(altura*altura);
        if(aux<20)
        {
            res=-1;
        } else if (aux>=20 && aux<=25) {
            res=0;
        }else {
            res=1;
        }
        return res;
    }
    public boolean esMayorDeEdad()
    {
        boolean res=false;
        if(edad<=18)
        {
            res=true;
        }
        return res;
    }
    public void comprobarSexo(char sexo){
        if(sexo=='H' || sexo=='M')
        {

        }else {
            sexo='H';
        }
    }
    public String generaDNI(){
        Random rnd=new Random();
        int numeroDni= rnd.nextInt(99999999);
        return String.format("%08d",numeroDni);
    }
}
