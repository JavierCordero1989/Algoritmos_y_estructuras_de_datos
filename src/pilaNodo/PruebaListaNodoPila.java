package pilaNodo;

import java.util.Random;

public class PruebaListaNodoPila 
{
    public static void main(String args[])
    {
        Random random = new Random(); /* Objeto para números aleatorios. */
        ListaNodoPila listaNodoPila = new ListaNodoPila(); /* Crea una pila de Nodos vacia. */
        int elemento;
        
        System.out.println("Insertar nodos a la lista...");
        
        /* Inserta 10 Nodos a la pila. */
        for(int ingresos=0; ingresos<10; ingresos++)
        {
            /* El valor del dato del Nodo a insertar será de entre 1 y 50. */
            elemento = 1 + random.nextInt(50);
            listaNodoPila.insertar(ingresos);//Inserta un elemento en la pila.
        }//Fin del for.
        
        /* Imprime los nodos de la pila. */
        System.out.println("Lista de elementos en la pila");
        listaNodoPila.visualizar();
        
        System.out.println("Eliminado nodos desde la cima...\nSe eliminan los ultimos tres.");
        
        /* Elimina los tres nodos desde la cima y muestra los Nodos restantes en la pila. */
        try
        {
            System.out.println("Elemento cima: " + (listaNodoPila.quitar()));
            System.out.println("Elemento cima: " + (listaNodoPila.quitar()));
            System.out.println("Elemento cima: " + (listaNodoPila.quitar()));
            listaNodoPila.visualizar();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }//Fin del main.
}//Fin de la clase PruebaListaNodoPila.
