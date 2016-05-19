package listaCircular;

public class Nodo 
{
    int dato;
    Nodo enlace;

    public Nodo(int dato) 
    {
        this.dato = dato;
        this.enlace = this; //Se enlaza a si mismo.
    }//Fin del constructor.

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}//Fin de la clase Nodo.
