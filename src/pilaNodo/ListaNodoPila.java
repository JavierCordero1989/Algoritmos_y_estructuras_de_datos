package pilaNodo;

public class ListaNodoPila 
{
    /* Crea un Nodo que funcionará como la cima de la pila. */
    private NodoPila cima;
    
    /* Coloca la cima en null. */
    public ListaNodoPila()
    {
        cima = null;
    }
    
    /* Inserta un nodo nuevo a la pila. */
    public void insertar(Object elemento)
    {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        /* El enlace del nodo nuevo apunta a la cima y la cima pasa a ser ahora
        el nodo nuevo. */
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    
    /* Quita el elemento cima de la pila. */
    public Object quitar() throws Exception
    {
        /* Lanza un mensaje de error si la pila esta vacia. */
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede extraer.");
        }
        
        /* Objeto aux que almacena el dato del Nodo de la cima. */
        Object aux = cima.elemento;
        
        /* cima ahora para a ser el elemento que sigue en la pila después de la cima. */
        cima = cima.siguiente;
        
        return aux;
    }
    
    /* Muestra los elementos de los Nodos en la pila. */
    public void visualizar()
    {
        NodoPila nodoPila;
        int k=0;
        
        nodoPila = cima;
        
        while(nodoPila != null)
        {
            System.out.print(nodoPila.elemento + " ");
            nodoPila = nodoPila.siguiente;
            k++;
            System.out.print((k%15 != 0 ? " " : "\n"));
        }//Fin del while
    }
    
    public boolean pilaVacia()
    {
        return cima == null;
    }
}//Fin de la clase ListaNodoPila.
