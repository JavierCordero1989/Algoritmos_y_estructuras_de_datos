package PilaConCola;

/* Utiliza las mismas clases que la pila, no es necesario esplicarlas. */
public class PilaCapicua 
{    
    private static final int TAM_PILA = 49;
    private int cima;
    private Object listaPila[];
    
    public PilaCapicua()
    {
        cima = -1; //condicion de pila vacia.
        listaPila = new Object[TAM_PILA];
    }//Fin del constructor.
    
    //Operaciones que modifican la pila
    public void insertar(Object objeto) throws Exception
    {
        if(pilaLlena())
        {
            throw new Exception("Desbordamiento de la pila");
        }//Fin del if.
        
        //incrementar puntero cima y copia elemento.
        cima++;
        listaPila[cima] = objeto;
    }//Fin del metodo insertar.
    
    /**
     * Este metodo devuelve el objeto de la cima, y disminuye la cima de la
     * pila en 1 con cada ejecucion.
     * @return
     * @throws Exception 
     */
    public Object quitar() throws Exception
    {
        Object aux;
        
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
    
    public void limpiarPila()
    {
        cima = -1;
    }//Fin del metodo limpiarPila.
    
    //Operacion de acceso a la pila.
    public Object cimaPila() throws Exception
    {
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no hay elementos.");
        }//Fin del if.
        
        return listaPila[cima];
    }//Fin del metodo cimaPila.
    
    //Verificacion estado de la pila.
    public boolean pilaVacia()
    {
        return cima==-1;
    }//Fin del metodo pilaVacia.
    public boolean pilaLlena()
    {
        return cima == (TAM_PILA-1);
    }//Fin del metodo pilaLlena
}//Fin de la clase.
