package listaSimple;

/* Esta clase hereda de la clase Lista, por lo que se puede usar todos los metodos
y variables de esa clase. */
public class ListaOrdenada extends Lista 
{
    public ListaOrdenada()
    {
        /* Llama al contructor de la clase Lista, inicializando al Nodo primero
        en null. */
        super();
    }//Fin del constructor.
    
    /* Inserta los nodos, segun el valor de entrada. */
    public ListaOrdenada insertaOrden(int entrada)
    {
        /* Crea un nodo nuevo y le asigna el valor de entrada. */
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        
        /* Si el Nodo primero esta en null, la lista esta vacia. Lo que hace 
        que el nodo primero de la lista, sea el recien ingresado. */
        if( primero == null) //lista vacia
        {
            primero = nuevo;
        }
        /* Si el valor de entrada es menor que el valor en el nodo primero,
        entonces el enlace del nodo recien creado apuntara al nodo primero,
        y el nodo primero pasara a ser ahora el nodo recien ingresado. */
        else if(entrada < primero.getDato())
        {
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
        /* Si ninguna de las dos condiciones anteriores(línea 23 y 30) se
        cumple, se realizara lo que sigue. */
        else
        {
            /* Crea dos Nodos, anterior y p. Ambos se igualan al nodo primero. */
            Nodo anterior, p;
            anterior = p = primero;
            
            /* Mientras el enlace del Nodo p sea diferente de null
                                Y
            la entrada sea mayor que el dato del Nodo p.
            IMPORTANTE: Se deben cumplir ambas condiciones para entrar al ciclo. */
            while((p.getEnlace() != null) && (entrada > p.getDato()))
            {
                /* El Nodo anterior pasa a ser igual al Nodo p, y el Nodo p pasa 
                a ser igual al siguiente Nodo en la lista. */
                anterior = p;
                p = p.getEnlace();
            }
            
            /* Si la entrada es mayor que el dato del Nodo p. Se inserta el nuevo 
            Nodo despues del ultimo nodo. */
            if(entrada > p.getDato())
            {
                anterior = p;
            }//Fin del if.
            
            /* Se establecen los enlaces. El nodo nuevo se enlaza al que se encuentra
            enlazado el nodo anterior, y el nodo anterior se enlaza al nuevo nodo. */
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }//Fin del else.
        
        /* No haga caso de este return. */
        return this;
    }//Fin del metodo insertaOrden.

}//Fin de la clase ListaOrdenada.
