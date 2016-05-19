package arboles_02052016;

/**
 * Clase ArbolBinario.java
 * Creada el: 5 de Mayo del 2016.
 * Curso: Algoritmos y Estructuras de Datos.
 * @author Javier Cordero Leon.
 */
public class ArbolBinario 
{
    protected Nodo raiz;
    
    /* Constructor #1*/
    public ArbolBinario()
    {
        raiz = null;
    }//Fin del constructor.
    
    /* Constructor #2*/
    public ArbolBinario(Nodo raiz)
    {
        this.raiz = raiz;
    }//Fin del constructor.
    
    public Nodo raizArbol()
    {
        return raiz;
    }//Fin del metodo raizArbol.
    
    /* Comprueba el estatus del arbol. */
    
    public boolean esVacio()
    {
        return raiz == null;
    }//Fin del metodo esVacio.
    
    public static void preorden(Nodo r)
    {
        if(r != null)
        {
            r.visitar();
            preorden(r.subArbolIzquierdo());
            preorden(r.subArbolDerecho());
        }//Fin del if.
    }//Fin del metodo recursivo preorden.
    
    public static void inorden(Nodo r)
    {
        if(r != null)
        {
            inorden(r.subArbolIzquierdo());
            r.visitar();
            inorden(r.subArbolDerecho());
        }//Fin del if.
    }//Fin del metodo recursivo inorden.
    
    public static void postorden(Nodo r)
    {
        if(r != null)
        {
            postorden(r.subArbolIzquierdo());
            postorden(r.subArbolDerecho());
            r.visitar();
        }
    }//Fin del metodo recursivo postorden.
    
    public static int numNodos(Nodo raiz)
    {
        if(raiz == null)
        {
            return 0;
        }
        else
        {
            return 1 + (numNodos(raiz.subArbolIzquierdo())) + (numNodos(raiz.subArbolDerecho()));
        }
    }//Fin del metodo recursivo numNodos.
    
    /**
     * Crea un Nodo nuevo.
     * 
     * @param ramaIzquierda el enlace al nodo de la izquierda.
     * @param dato el dato que tendra el nodo.
     * @param ramaDerecha el enlace al nodo de la derecha.
     * @return el nuevo nodo creado.
     */
    public static Nodo nuevoArbol(Nodo ramaIzquierda, Object dato, Nodo ramaDerecha)
    {
        return new Nodo(ramaIzquierda, dato, ramaDerecha);
    }//Fin del metodo nuevoArbol.
    
}//Fin de la clase ArbolBinario.
