package listaSimple;

public class Lista
{
    protected Nodo primero;

    /* El constructor inicializa el nodo primero en nulo. */
    public Lista()
    {
        primero = null;
    }//Fin del constructor.

    /* Inserta siempre al inicio de la lista. */
    public Lista insertarCabezaLista(int entrada)
    {
        Nodo nuevo; //Esta linea es mejor declararla en la linea 4, por eficiencia.
        nuevo = new Nodo(entrada);
        
        /* Asocia el enlace del nuevo nodo, al nodo que esta de primero. */
        nuevo.enlace = primero;
        
        /* Convierte el nodo primero, en el nuevo nodo. */
        primero = nuevo;

        return this;
    }//Fin del metodo insertarCabezaLista.

    /* Permite ver los nodos almacenados en memoria. */
    public void visualizar()
    {
        Nodo n;
        int k = 0;

        /* El nodo n, sera igual al primero. */
        n = primero;
        
        /* Mientras el nodo n no sea nulo, se repetira el codigo dentro del while. */
        while(n != null)
        {
            /* Imprime el dato en el nodo. */
            System.out.print(n.dato + " ");
            
            /* Iguala el nodo n, al nodo que sigue en la lista. */
            /* Cabe señalar que si n.enlace es null, el ciclo while se terminará. */
            n = n.enlace;
            k++;
            
            /* Si k%15 es diferente de cero, imprime un espacio, de lo
            contrario imprime un salto de linea. */
            System.out.print((k%15 != 0 ? " " : "\n"));
        }//Fin del while
    }//Fin del metodo visualizar.
    
    /* Permite buscar un nodo en la posición deseada y lo devuelve al final. */
    public Nodo buscarPosicion(int posicion)
    {
        Nodo indice; /* Nodo que se utilizará para recorrer el for de búsqueda. */
        
        int i; /* El valor inicial para recorrer el for. */
        
        /* Si la posicion es menor que cero, retorna null. */
        if(posicion < 0)
        {
            return null;
        }//Fin del if.
        
        /* Iguala el Nodo indice al primero. */
        indice = primero;
        
        /* Comenzando en 1, y mientras la posicion sea mayor que i y ademas
        el indice sea diferente de null, el ciclo se ejecutará. */
        for(i=1; (i<posicion) && (indice!=null); i++)
        {
            /* Establece el indice al siguiente nodo. Cuando en el for se encuentra
            que la posicion es igual o menor a i, el ciclo se detiene, y en el 
            indice se guarda el Nodo encontrado. Si indice.enlace es igual a null,
            quiere decir que no se encontro el Nodo deseado. */
            indice = indice.enlace;
        }//Fin del for.
        
        return indice;
    }//Fin del metodo buscarPosicion.
    
    /* Permite encontrar un Nodo que contenga entrada como dato. */
    public void eliminar(int entrada)
    {
        /* Declara un Nodo actual y anterior. */
        Nodo actual, anterior;
        
        /* Valor booleano que almacena true si se encuentra el nodo, false si no. */
        boolean encontrado;
        
        /* Inicializa los nodos actual al primero, y el anterior en null, porque
        obviamnete no existe el anterior al primero. */
        actual = primero;
        anterior = null;
        encontrado = false;
        
        /* Mientras el Nodo actual sea diferente a null && encontrado sea false */
        while((actual!=null) && (!encontrado))
        {
            /* Si en el nodo actual.dato es igual a la entrada del usuario, 
            encontrado será igual a TRUE.*/
            encontrado = (actual.dato == entrada);
            
            /* Si encontrado es igual a FALSE. */
            if(!encontrado)
            {
                /* Establece el nodo anterior en el actual, y el actual en 
                el siguiente. */
                anterior = actual;
                actual = actual.enlace;
            }//Fin del if.
        }//Fin del while.
        
        /* Si el nodo actual es diferente de null. */
        if(actual != null)
        {
            /* Si el nodo actual es igual al primero. */
            if(actual == primero)
            {
                /* El primero pasa a apuntar al enlace siguiente de actual. */
                primero = actual.enlace;
            }
            else
            {
                /* El enlace del anterior pasa a apuntar al siguiente enlace del nodo acatual. */
                anterior.enlace = actual.enlace;
            }
            
            /* El nodo actual pasa a ser null. */
            actual = null; //no es necesario al ser una variable local.
        }//Fin del if.
    }//Fin del metodo eliminar.
}//Fin de la clase Lista.
