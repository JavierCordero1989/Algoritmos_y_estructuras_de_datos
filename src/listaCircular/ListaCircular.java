package listaCircular;

public class ListaCircular 
{
    /* Nodo que se usará para controlarlo como el inicio y final de la lista circular. */
    private Nodo lc;
    
    public ListaCircular()
    {
        lc = null;
    }//Fin del constructor.
    
    /* Inserta el nodo en la lista, con el valor de entrada. */
    public ListaCircular insertar(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        
        /* Si el Nodo lc es igual a null, indica que la lista circular esta 
        vacia, por lo tanto, no entraría al if. */
        if(lc != null)
        {
            /* El enlace del nodo nuevo se asocia al enlace del nodo lc y el enlace del
            nodo lc se enlaza al nuevo nodo.*/
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }//Fin del if.
        
        /* El nodo lc pasará a ser el nodo nuevo. */
        lc = nuevo;
        
        /* return sin función alguna. */
        return this;
    }//Fin del metodo insertar.
    
    /**
     * Permite eliminar un nodo de la lista que contenga el parámetro entrada.
     * @param entrada el dato del nodo a eliminar.
     */
    public void eliminar(int entrada)
    {
        /* Crea un Nodo actual. */
        Nodo actual;
        boolean encontrado = false;
        
        /* actual va a ser igual a lc. lc no cambia, solo a la hora de insertar. */
        actual = lc;
        
        /* Mientras el enlace del nodo actual sea diferente del Nodo lc
                    Y
        encontrado sea false.
        Las dos condiciones se tienen que cumplir para que el ciclo se ejecute. */
        while((actual.enlace != lc) && (!encontrado))
        {
            /* Si el dato del nodo siguiente a actual, es igual a la entrada por
            parámetro, encontrado será igual true, lo que detendrá el ciclo y
            no entraría al siguiente if. */
            encontrado = (actual.enlace.dato == entrada);
            
            /* Si el Nodo no se encontró con la instrucción anterior, el Nodo actual
            apuntaría ahora al siguiente nodo en la lista para seguir el ciclo. 
            Si actual.enlace es igual a lc, quiere decir que llegó al final de
            la lista circular. */
            if(!encontrado)
            {
                actual = actual.enlace;
            }//Fin del if.
        }//Fin del while.
        
        /* se vuelve a evaluar si el dato se encuentra en el Nodo actual. */
        encontrado = (actual.enlace.dato == entrada);
        
        /* Si se encontró, entra al if. */
        if(encontrado)
        {
            Nodo p;
            p = actual.enlace; //Nodo a eliminar.
            if(lc == lc.enlace) /* Quiere decir que la lista solo tiene un nodo, lc.*/
            {
                lc = null;
            }//Fin del enlace.
            else
            {
                if( p == lc)/* Si p es el mismo nodo lc. */
                {
                    lc = actual; //Se borra el elemento referenciado por lc,
                                 //el nuevo acceso a la lista es el anterior.
                }//Fin del if.
                
                actual.enlace = p.enlace;
            }//Fin del else.
            
            p = null;
        }//Fin del if.
    }//Fin del metodo eliminar.
    
    /**
     * Muestra la lista de los datos que contienen los nodos. 
     */
    public void visualizar()
    {
        Nodo n;
        int k = 0;

        n = lc;
        
        do{
            System.out.print(n.dato + ", ");
            n = n.enlace;
            k++;
        }while(n != lc);
        System.out.println();
    }//Fin del metodo visualizar.
}//Fin de la clase ListaCircular.
