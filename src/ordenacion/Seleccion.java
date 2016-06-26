package ordenacion;

/**
 *
 * @author Javi Cordero
 */
public class Seleccion
{
    public Seleccion()
    {
    }/*Fin del constructor.*/

    public static void intercambiar(int[] arreglo, int i, int j)
    {
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }/*Fin del metodo intercambiar*/

    public static void ordenarSeleccion(int[] arreglo)
    {
        int indiceMenor;
        int n_tamanio = arreglo.length;

        for(int i=0; i<n_tamanio-1; i++)
        {
            //Comienzo de la exploracion en indice i
            indiceMenor = i;

            //j explora la sublista arreglo[i+1]...arreglo[n_tamanio-1]
            for(int j=(i+1); j<n_tamanio; j++)
            {
                if(arreglo[j] < arreglo[indiceMenor])
                {
                    indiceMenor = j;
                }
            }

            //Situa el elemento mas pequeno en arreglo[i]
            if(i != indiceMenor)
            {
                intercambiar(arreglo, i, indiceMenor);
            }
        }
    }/*Fin del metodo ordenarSeleccion*/

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
}/*Fin de la clase Seleccion*/