package listaSimple;

import java.util.Random;

/* Si desea ejecutar esta clase en NetBeans, dé clic derecho sobre el archivo
y haga clic en Run File. */
public class ListaEnOrden 
{
    public static void main(String args[])
    {
        Random r = new Random(); //generador de numeros aleatorios.
        int d; //Es el valor entero que se agregara al nodo. 
        ListaOrdenada lista = new ListaOrdenada(); //crea lista vacia
        
        /* Numero aleatorio de nodos que habra en la lista. Puede ser desde 1 hasta 99. 
        Esto obviamente puede cambiar a gusto del programador. Con solo variar 
        el numero 99. */
        int k = r.nextInt(99)+1;

        //inserta elementos en la lista.
        for(; k>=0; k--)
        {
            /* El numero aleatorio que se guardara en el nodoo ira desde 1 hasta 1000.
            Esto puede cambiar a gusto del programador, cambiando el numero 1000. */
            d = 1 + r.nextInt(1000);
            
            /* Inserta el elemento d, como valor en el nodo. Para ver como se
            inserta, ver el metodo en la clase ListaOrdenada. */
            lista.insertaOrden(d);
        }//Fin del for.
        
        /* Imprime los elementos de las lista*/
        System.out.println("Elementos de la lista ordenada:");
        lista.visualizar();
    }//Fin del main.
}//Fin de la clase ListaEnOrden.
