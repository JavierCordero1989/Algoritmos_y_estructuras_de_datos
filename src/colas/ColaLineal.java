package colas;

public class ColaLineal 
{
    private static final int MAXTAM = 39; /* Tamaño máximo para la cola. */
    protected int frente; /* Elemento primero de la cola. */
    protected int fin; /* Elemento último de la cola. */
    protected Object[] listaCola; /* Arreglo de objetos */
    
    /* Inicializa el frente en 0, el fin en -1. */
    public ColaLineal()
    {
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAM];
    }
    
    /* Inserta valores al arreglo de objetos. Los insertá al fin de la cola. */
    public void insertar(Object elemento) throws Exception
    {
        /* Si la cola NO está llena. */
        if(!colaLlena())
        {
            listaCola[++fin] = elemento;
        }
        else
        {
            throw new Exception("Overflow en la cola");
        }
    }
    
    /* Quita elementos de la cola, especificamente del frente. */
    public Object quitar() throws Exception
    {
        /* Si la cola no está vacía. */
        if(!colaVacia())
        {
            /* Devuelve el elemento del frente de la cola y aumenta el frente. */
            return listaCola[frente++];
        }
        else
        {
            throw new Exception("Cola vacia");
        }
    }//Fin del metodo quitar
    
    /* Muestra la lista de elementos de la cola desde el frente hasta el fin. */
    public void visualizar()
    {
        for(int i=frente; i<fin; i++)
        {
            System.out.print(listaCola[i] + " ");
        }
        System.out.println();
    }//Fin del metodo visualizar.
    
    /* Sobra decir lo que hace. */
    public void borrarCola()
    {
        frente = 0;
        fin = -1;
    }
    
    /* Devuelve el objeto que esta al frente de la cola. */
    public Object frenteCola() throws Exception
    {
        /* Si la NO está vacía. */
        if(!colaVacia())
        {
            return listaCola[frente];
        }
        else
        {
            throw new Exception("Cola vacia");
        }
    }
    
    //Metodos de verificacion del estado de la cola.
    
    /* Si el valor de frente es mayor al de fin, la cola está vacía. */
    public boolean colaVacia()
    {
        return frente > fin;
    }
    
    /* Si el valor del fin es igual al tamaño máximo menos uno, la cola esta llena. */
    public boolean colaLlena()
    {
        return fin == (MAXTAM-1);
    }
}//Fin de la clase ColaLineal.
