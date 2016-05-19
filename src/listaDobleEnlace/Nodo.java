package listaDobleEnlace;

public class Nodo 
{
    /* Este es un nodo con dos enlaces, uno que apunta hacia el nodo de adelante,
    y el otro hacia el nodo de atras, como su nombre de variable lo indica. */
    int dato;
    Nodo adelante;
    Nodo atras;

    /* El constructor inicializa el nuevo nodo con el dato enviado por parámetro, 
    y los dos enlaces en null. */
    public Nodo(int dato) 
    {
        this.dato = dato;
        adelante = null;
        atras = null;
    }//Fin del constructor.

    /* Continuan los metodos set y get de cada variable. Como las variables de
    esta clase no son privadas, esos metodos siguientes ni siquiera hacen falta. */
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getAdelante() {
        return adelante;
    }

    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }    
}//Fin de la clase Nodo.
