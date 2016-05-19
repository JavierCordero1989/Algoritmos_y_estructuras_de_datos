package colaConListaEnlazada;

/**
 *
 * @author Javi Cordero
 */
public class NodoCola 
{
    private int elemento;
    private NodoCola siguiente;

    public NodoCola(int elemento) 
    {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}//Fin de la clase NodoCola.
