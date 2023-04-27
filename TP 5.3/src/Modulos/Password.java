package Modulos;

import java.util.Random;

public class Password {
    private int longitud;
    private String contrasenia;

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Password(int longitud, String contrasenia) {
        this.longitud = longitud;
        this.contrasenia = contrasenia;
    }
    public Password(int longitud)
    {
        this.longitud=longitud;
        generarContrasenia();
    }

    public Password()
    {
        this.contrasenia="";
        this.longitud=0;
    }
    public boolean esFuerte()
    {
        boolean res=false;
        if(longitud>=8)
        {
            int cantMayus=0;
            int cantMin=0;
            int cantNumeros=0;
            int aux=0;
            while(aux!=longitud)
            {
                char c=contrasenia.charAt(aux);
                if(c>='A' && c<='Z')
                {
                    cantMayus++;
                }
                if (c>='a' && c<='z')
                {
                    cantMin++;
                }
                if(Character.isDigit(c))
                {
                    cantNumeros++;
                }
               aux++;
            }

            if(cantNumeros>=5 && cantMayus>=2 && cantMin>=1)
            {
                res=true;
            }
        }
        return res;
    }
    public void generarContrasenia()
    {
        String poolDeCaracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd=new Random();
        String s =new String();
        StringBuffer contraNueva=new StringBuffer(s);
        int validos;
        int n;
        char caracterEscogido;
        for(validos=0;validos<longitud;validos++){
            n=rnd.nextInt(60);
            caracterEscogido=poolDeCaracteres.charAt(n);
            contraNueva.insert(validos,caracterEscogido);
        }
        contrasenia=contraNueva.toString();
    }


}
