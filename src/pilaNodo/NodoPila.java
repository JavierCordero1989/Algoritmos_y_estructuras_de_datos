package pilaNodo;

public class NodoPila
{
    Object elemento;
    NodoPila siguiente;
    
    public NodoPila(Object elemento)
    {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}//Fin de la clase NodoPila.
