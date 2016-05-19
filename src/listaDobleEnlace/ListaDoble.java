package listaDobleEnlace;

public class ListaDoble 
{
    /* Crea un nodo que será el que se use para controlar el inicio de
    la lista doblemente enlazada. */
    Nodo cabeza;

    /* Inicializa la cabeza en null. */
    public ListaDoble()
    {
        cabeza = null;
    }//Fin del constructor.
    
    /**
     * Permite ver la lista de nodos que estan enlazados, sus valores. 
     */
    public void visualizar()
    {
        /* Crea el Nodo n, y le asigna la referencia del Nodo cabeza. */
        Nodo n = cabeza;
        int k = 0;

        /* Mientras el Nodo n sea diferente de null. */
        while(n != null)
        {
            /* Imprime el dato del nodo y un espacio. */
            System.out.print(n.dato + " ");
            
            /* Pasa la referencia del Nodo n, al nodo que sigue en la lista. Cabe
            señalar que si n.enlace es igual a null, el ciclo while se terminará. */
            n = n.adelante;
            
            /* La variable k, solo es un control para el System.out.print() siguiente.*/
            k++;
            
            /* Cuando k es igual a 15,30,45,60..., entonces se imprime un salto de linea, 
            esto es solo para que sea más agradable a la hora de visualizarlo. 
            Mientras k no sea 15,30,45,60... entonces se imprimirá un espacion
            en blanco. */
            System.out.print((k%15 != 0 ? " " : "\n"));
        }//Fin del while
    }//Fin del metodo visualizar.
    
    /**
     * Permite buscar un nodo que esté en la posicion enviada por parámetros.
     * Se supone que se ha de enviar un valor dentro del rango de la lista, de
     * no ser así, el programa se caerá debido a un NullPointerException.
     * 
     * @param posicion la posicion del nodo que se desea buscar.
     * @return el nodo que se encontró.
     */
    public Nodo buscarPosicion(int posicion)
    {
        /* Crea un nodo. */
        Nodo indice;
        
        /* Variable i para empezar a recorrer el ciclo for. */
        int i;
        
        /* Esto nunca deberia pasar. Pero si la posicion enviada es menor
        que cero, inmediatamente retorna un valor nulo. */
        if(posicion < 0)
        {
            return null;
        }//Fin del if.
        
        /* Iguala el Nodo indice a cabeza, para comenzar a recorrer la lista
        desde ese nodo. */
        indice = cabeza;
        
        /* Recorre la lista hasta la posicion donde se encuentre el Nodo buscado,
        o hasta que el Nodo indice sea igual a null. */
        for(i=1; (i<posicion) && (indice!=null); i++)
        {
            /* Mientras no se encuentre una coincidencia, el Nodo indice apuntará
            al Nodo siguiente en la lista. */
            indice = indice.adelante;
        }//Fin del for.
        
        return indice;
    }//Fin del metodo buscarPosicion.
    
    /**
     * Inserta un nuevo Nodo al inicio de la lista.
     * @param entrada el valor que tendrá el Nodo nuevo que se insertará a la lista.
     * @return this.
     */
    public ListaDoble insertarCabezaLista(int entrada)
    {
        /* Crea un Nodo nuevo con el dato entrada y que apuntará al Nodo cabeza.*/
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = cabeza;
        
        /* Si el Nodo cabeza es diferente de null, hace que el enlace de atras
        del nodo cabeza, apunte al nuevo nodo. */
        if(cabeza != null)
        {
            cabeza.atras = nuevo;
        }//Fin del if.
        
        /* El nodo Cabeza ahora pasara a ser el nodo nuevo. */
        cabeza = nuevo;
        
        /* Omitir este return. */
        return this;
    }//Fin del metodo insertarCabezaLista.
    
    /**
     * Permite eliminar el nodo que contenga el valor de entrada enviado por
     * parametro. 
     * 
     * @param entrada el valor del nodo que se desea eliminar.
     */
    public void eliminar(int entrada)
    {
        /* Crea un Nodo actual y se le asigna la referencia del nodo cabeza. */
        Nodo actual = cabeza;
        boolean encontrado = false;
        
        /* Mientras actual sea diferente de null y encontrado sea false. */
        while((actual != null) && (!encontrado))
        {
            /* Si la entrada es igual al dato del nodo actual, encontrado=true.*/
            encontrado = (actual.dato == entrada);
            
            /* Si encontrado es igual al false. */
            if(!encontrado)
            {
                /* actual va a ser igual al nodo al que apunta el enlace de adelante
                del nodo actual. */
                actual = actual.adelante;
            }//Fin del if.
        }//Fin del while.
        
        /* Si el nodo actual es diferente de null. */
        if(actual != null)
        {
            /* Si el Nodo actual es igual al Nodo cabeza. */
            if(actual == cabeza)
            {
                /* El Nodo cabeza apuntará al Nodo de adelante. */
                cabeza = actual.adelante;
                
                /* Si el enlace de adelante del Nodo actual es diferente de null. */
                if(actual.adelante != null)
                {
                    /* Hace que el Nodo actual sea igual a null. */
                    actual.adelante.atras = null;
                }//Fin del if.
            }
            /* Si el enlace de adelante del Nodo actual es diferente de null. */
            else if(actual.adelante != null)
            {
                /* Por asi decirlo, hace que el nodo detrás del Nodo actual,
                apunté hacia al Nodo adelante del Nodo actual.*/
                actual.atras.adelante = actual.adelante;
                
                /* Dicho de otra forma, hace que el Nodo adelante del Nodo actual,
                apunte al que está detrás del Nodo actual. */
                actual.adelante.atras = actual.atras;
            }//Fin del else-if.
            else //ultimo nodo.
            {
                /* Elimina el ultimo Nodo. */
                actual.atras.adelante = null;
            }//Fin del else.
            
            /* Elimina el ultimo Nodo apuntandolo a null. */
            actual = null;
        }//Fin del if.
    }//Fin del metodo eliminar.
}//Fin de la clase ListaDoble.
