package grafos;

public class PilaLineal 
{
    private static final int TAM_PILA = 49; /* Tamaño que tendrá la pila. */
    private int cima; /* Indica la posición donde se ubicará el elemento más arriba en la pila. */
    private Object listaPila[]; /* Arreglo de objetos, que simula una pila. */
    
    public PilaLineal()
    {
        cima = -1; //condicion de pila vacia.
        listaPila = new Object[TAM_PILA]; /* Inicia el arreglo con el tamaño máximo. */
    }//Fin del constructor.
    
    /* Inserta elementos en la pila, lanza un mensaje cuando la pila esta llena
    y no se puede insertar más elementos. */
    public void insertar(Object objeto) throws Exception
    {
        /* Muestra un mensaje si la pila esta llena. */
        if(pilaLlena())
        {
            throw new Exception("Desbordamiento de la pila");
        }//Fin del if.
        
        /* Como al inicio la cima es igual a -1, aumentará cima en uno, para
        guardar el objeto recibido por parámetro en esa posición de la pila. 
        Así lo hará en cada ingreso... El -1 solo indica que la pila está vacía. */
        cima++;
        listaPila[cima] = objeto;
    }//Fin del metodo insertar.
    
    /*
     * Este metodo devuelve el objeto de la cima, y disminuye la cima de la
     * pila en 1 con cada ejecucion.
     */
    public Object quitar() throws Exception
    {
        Object aux; /* Guarda el objeto a quitar en la pila. */
        
        /* Muestra un mensaje si la pila esta vacia, es decir, que no se podría 
        sacar nada. */
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede extraer.");
        }//Fin del if.
        
        //guarda elemento de la cima.
        aux = listaPila[cima];
        
        //decrementar cima y devolver elemento.
        cima--;
        
        return aux;
    }//Fin del metodo quitar.
    
    /* Coloca la cima en -1, para limpiarla. */
    public void limpiarPila()
    {
        cima = -1;
    }//Fin del metodo limpiarPila.
    
    /* Devuelve el objeto que esta más arriba en la pila. */
    public Object cimaPila() throws Exception
    {
        /* Lanza un mensaje si la pila esta vacia, ya que obviamente no tendría elementos. */
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no hay elementos.");
        }//Fin del if.
        
        return listaPila[cima];
    }//Fin del metodo cimaPila.
    
    /* Si la cima es igual a -1, retorna true, indicando que la pila esta vacía. */
    public boolean pilaVacia()
    {
        return cima==-1;
    }//Fin del metodo pilaVacia.
    
    /* Si la cima es igual al tamaño máximo menos uno, retorna true indicando que
    la lista está llena. */
    public boolean pilaLlena()
    {
        return cima == (TAM_PILA-1);
    }//Fin del metodo pilaLlena
}//Fin de la clase PilaLineal.
