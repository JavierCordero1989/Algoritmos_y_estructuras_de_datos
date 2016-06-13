package monticulos;

/**
 * 
 * @author Javi Cordero
 */
public class PruebaMonticulo 
{
    public static void main(String args[])
    {
        int prioridades[] = {6,5,3,1,8,7,2,4};
        Tarea tareas[] = new Tarea[8];
        
        /*Crea las tareas y las guarda en un arreglo*/
        for(int i=0; i<tareas.length; i++)
        {
            Tarea tarea = new Tarea("Proceso-->", prioridades[i]);
            tareas[i] = tarea;
        }/*Fin del for.*/
        
        Monticulo monticulo = new Monticulo(tareas.length);
        
        /*Inserta las tareas al monticulo guardadas en el arreglo*/
        for(int j=0; j<tareas.length; j++)
        {
            monticulo.insertar(tareas[j]);
        }
        
        monticulo.imprimir();
        
        try
        {
            System.out.println("\nElemento eliminado: " + monticulo.eliminarMinimo() + "\n");
            monticulo.imprimir();
        }
        catch(Exception ex)
        {
            System.out.println("Excepcion: " + ex);
        }
    }
}/*Fin de la clase PruebaMonticulo*/
