package listaSimple;

public class Nodo
{
    int dato;
    Nodo enlace;

    public Nodo(int dato)
    {
            this.dato = dato;
            this.enlace = null;
    }//Fin del constructor.

    public void setDato(int dato)
    {
            this.dato = dato;
    }//Fin del metodo setDato.

    public int getDato()
    {
            return dato;
    }//Fin del metodo getDato.

    public void setEnlace(Nodo enlace)
    {
            this.enlace = enlace;
    }//Fin del metodo setEnlace.

    public Nodo getEnlace()
    {
            return enlace;
    }//Fin del metodo getEnlace.
}//Fin de la clase Nodo
