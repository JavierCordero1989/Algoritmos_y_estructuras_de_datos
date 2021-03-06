package ordenacion;

/**
 *
 * @author Javi Cordero
 */
public class Quicksort 
{
    public Quicksort()
    {
    }/*Fin del constructor.*/
    
    public static void quick(int[] vector, int primero, int ultimo)
    {
        int i, j, central, pivote;
        central = (primero + ultimo)/2;
        System.out.println("Central: " + central);
        
        pivote = vector[central];
        System.out.println("Pivote: " + pivote);
        
        i = primero;
        j = ultimo;
        
        do
        {
            while(vector[i] < pivote)
            {
                i++;
            }
            while(vector[j] > pivote)
            {
                j--;
            }
            
            if(i<=j)
            {
                int aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                i++;
                j--;
            }
        }while(i <= j);
        
        if(primero < j)
        {
            quick(vector, primero, j);
        }
        if(i < ultimo)
        {
            quick(vector, i, ultimo);
        }
    }
    public static void ordenarQuicksort(int[] vector, int izq, int der)
    {
        int pivote = vector[izq]; //Tomamos el primer elemento como pivote.
        System.out.println("Pivote: " + pivote);
        int i = izq; //i realiza la busqueda de izquierda a derecha.
        int d = der; //d realiza la busqueda de derecha a izquierda.
        int aux;
        
        while(i < d) //Mietras no se crucen las busquedas.
        {
            while(vector[d] > pivote) //Busca elemento menor que pivote. 
            {
                d--;
            }
            while(vector[i] <= pivote && i < d) //Busca elemento mayor que pivote.
            {
                i++;
            }
            
            if(i < d)
            {
                aux = vector[i];
                vector[i] = vector[d];
                vector[d] = aux;
            }
        }
        vector[izq] = vector[d]; //Se coloca el pivote en su lugar de forma que tendremos
        vector[d] = pivote; // los menores a su izquierda y los mayores a su derecha.
        if(izq < d-1)
        {
            ordenarQuicksort(vector, izq, d-1);
        }
        if(d+1 < der)
        {
            ordenarQuicksort(vector, d+1, der);
        }
    }/*Fin del metodo quicksort*/
    
    public static void imprimir(int[] arreglo)
    {
        int tamanio = arreglo.length; //Tamanio del arreglo
        
        for(int contador=0; contador<tamanio; contador++)
        {
            mostrarMensaje("Valor en [" + contador + "] es: " + arreglo[contador]);
        }
    }/*Fin del metodo imprimir*/
    
    public static void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }/*Fin del metodo mostrarMensaje*/
}/*Fin de la clase Quicksort*/
