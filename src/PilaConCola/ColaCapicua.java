package PilaConCola;

/* Utiliza las mismas clases que la cola, no es necesario esplicarlas. */
public class ColaCapicua 
{
    private static final int MAXTAM = 39; 
    protected int frente;
    protected int fin;
    protected Object[] listaCola;
    
    public ColaCapicua()
    {
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAM];
    }
    
    //operaciones de modificacion de cola.
    public void insertar(Object elemento) throws Exception
    {
        if(!colaLlena())
        {
            listaCola[++fin] = elemento;
        }
        else
        {
            throw new Exception("Overflow en la cola");
        }
    }
    
    public Object quitar() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente++];
        }
        else
        {
            throw new Exception("Cola vacia");
        }
    }//Fin del metodo quitar
    
    public void visualizar()
    {
        for(int i=frente; i<fin; i++)
        {
            System.out.print(listaCola[i] + " ");
        }
        System.out.println();
    }//Fin del metodo visualizar.
    
    //Vacia la cola.
    public void borrarCola()
    {
        frente = 0;
        fin = -1;
    }
    
    //Acceso a la cola.
    public Object frenteCola() throws Exception
    {
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
    public boolean colaVacia()
    {
        return frente > fin;
    }
    public boolean colaLlena()
    {
        return fin == (MAXTAM-1);
    }
}//Fin de la clase ColaCapicua.
