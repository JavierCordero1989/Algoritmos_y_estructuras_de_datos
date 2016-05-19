package arboles_02052016;

/**
 * Clase Nodo, que se enlaza a otros Nodos para formar un arbol.
 * Creada el: 5 de Mayo del 2016.
 * Curso: Algoritmos y Estructuras de Datos.
 * @author Javier Cordero Leon.
 */
public class Nodo 
{
    protected Object dato;
    protected Nodo ramaIzquierda;
    protected Nodo ramaDerecha;
    
    public Nodo(Object valor)
    {
        dato = valor;
        ramaIzquierda = ramaDerecha = null;
    }//Fin del constructor.
    
    public Nodo(Nodo ramaIzquierda, Object valor, Nodo ramaDerecha)
    {
        this(valor);
        this.ramaIzquierda = ramaIzquierda;
        this.ramaDerecha = ramaDerecha;
    }//Fin del constructor.
    
    public Object valorNodo()
    { return dato; }
    
    public Nodo subArbolIzquierdo()
    { return ramaIzquierda; }
    
    public Nodo subArbolDerecho()
    { return ramaDerecha; }
    
    public void nuevoValor(Object dato)
    { this.dato = dato; }
    
    public void ramaIzq(Nodo nodo)
    { this.ramaIzquierda = nodo; }
    
    public void ramaDer(Nodo nodo)
    { this.ramaDerecha = nodo; }
    
    public void visitar()
    {
        System.out.println("Dato del nodo: " + dato);
    }
}//Fin de la clase Nodo.