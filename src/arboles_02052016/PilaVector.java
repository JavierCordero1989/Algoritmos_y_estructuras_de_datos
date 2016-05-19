package arboles_02052016;

/**
 * Clase PilaVector.java
 * Creada el: 5 de Mayo del 2016.
 * Curso: Algoritmos y Estructuras de Datos.
 * @author Javier Cordero Leon.
 */
import java.util.Vector;

/* Recordar que Vector es una clase como ArrayList. */
public class PilaVector 
{
    private int cima;
    private Vector listaPilaVector; /* Funciona muy parecido a un ArrayList. */
    
    public PilaVector()
    {
        cima = -1; //condicion de pila vacia.
        listaPilaVector = new Vector();
    }//Fin del constructor.
    
    //Operaciones que modifican la pila
    public void insertar(Object objeto) throws Exception
    {
        /* Incrementa la cima en uno y agrega el objeto a vector. */
        cima++;
        listaPilaVector.addElement(objeto);
    }//Fin del metodo insertar.
    
    /**
     * Este metodo devuelve el objeto de la cima, y disminuye la cima de la
     * pila en 1 con cada ejecucion.
     * @return
     * @throws Exception 
     */
    public Object quitar() throws Exception
    {
        Object aux; /* Valor auxiliar: será el objeto a quitar. */
        
        /* Si la pila esta vacia lanza un mensaje de error. */
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede extraer.");
        }//Fin del if.
        
        //guarda elemento de la cima.
        aux = listaPilaVector.elementAt(cima);
        listaPilaVector.removeElementAt(cima); //Elimina el elemento de la cima.
        
        //decrementar cima y devolver elemento.
        cima--;
        
        return aux;
    }//Fin del metodo quitar.
    
    public void limpiarPila()
    {
        /* Limpia todo el vector. */
        listaPilaVector.removeAllElements();
        cima = -1;
    }//Fin del metodo limpiarPila.
    
    /* Devuelve la cima de la pila. */
    public Object cimaPila() throws Exception
    {
        /* Si la pila esta vacia lanza un mensaje de error. */
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no hay elementos.");
        }//Fin del if.
        
        return listaPilaVector.elementAt(cima);
    }//Fin del metodo cimaPila.
    
    //Verificacion estado de la pila.
    public boolean pilaVacia()
    {
        return cima==-1;
    }//Fin del metodo pilaVacia.
    public boolean pilaLlena()
    {
        int tamanioVector = listaPilaVector.size(); /* El tamaño máximo será el tamaño del vector. */
        return cima == (tamanioVector-1);
    }//Fin del metodo pilaLlena
}//Fin de la clase PilaVector.
