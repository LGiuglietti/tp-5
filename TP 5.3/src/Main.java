import Modulos.Password;
public class Main {
    public static void main(String[] args) {
        Password psw=new Password(15);
        Password psw1=new Password(15);
        Password psw2=new Password(15);
        Password psw3=new Password(15);
        Password psw4=new Password(15);

        Password[] arregloPsw=new Password[5];
        boolean[] arregloBoolean= new boolean[5];
        arregloPsw[0]=psw;
        arregloPsw[1]=psw1;
        arregloPsw[2]=psw2;
        arregloPsw[3]=psw3;
        arregloPsw[4]=psw4;
        arregloBoolean[0]=psw.esFuerte();
        arregloBoolean[1]=psw1.esFuerte();
        arregloBoolean[2]=psw2.esFuerte();
        arregloBoolean[3]=psw3.esFuerte();
        arregloBoolean[4]=psw4.esFuerte();

        for(int i=0;i<5;i++)
        {
            System.out.println(arregloPsw[i].getContrasenia());
            if(arregloBoolean[i]){
                System.out.println("segura");
            }
            else
            {
                System.out.println("insegura");
            }
        }
    }
}