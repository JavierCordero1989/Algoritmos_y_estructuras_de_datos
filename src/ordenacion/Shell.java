package ordenacion;

/**
 *
 * @author Javi Cordero
 */
public class Shell 
{
    public Shell()
    {
        
    }/*Fin del constructor.*/
    
    public static void ordenarShell(int arreglo[])
    {
        int tamanio = arreglo.length;
        int intervalo =  tamanio / 2;
        int j, k;
        
        while(intervalo > 0)
        {
            for(int i=intervalo; i<tamanio; i++)
            {
                j = (i - intervalo);
                
                while(j >= 0)
                {
                    k = (j + intervalo);
                    
                    if(arreglo[j] <= arreglo[k])
                    {
                        j = -1; //Asi termina el bucle, par ordenado
                    }
                    else
                    {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = temp;
                        
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo/2;
        }
    }/*Fin del metodo ordenarShell*/
    
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
}/*Fin de la clase Shell*/
