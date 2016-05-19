package colas;

public class PruebaColaLineal 
{
    public static void main(String args[])
    {
        ColaLineal colaLineal = new ColaLineal(); /* Crea una cola vacía. */
        
        System.out.println("Ingresando datos a array...");
        
        /* Inserta los valores de i en la cola. */
        for(int i=0; i<10; i++)
        {
            try
            {
                colaLineal.insertar(i+1);
            }
            catch(Exception ex)
            {
                System.err.println(ex);
            }
        }
        
        /* Muestra los valores de la cola. */
        System.out.println("Elementos de la cola...");
        colaLineal.visualizar();
        
        System.out.println("Quitando el elemento del frente de la cola...");
        
        /* Se quita dos elementos de la cola y se muestra de nuevo para visualizar los cambios. */
        try 
        {
            System.out.println("Elemento quitado: " + colaLineal.quitar());
            System.out.println("Elemento quitado: " + colaLineal.quitar());
        } 
        catch (Exception ex) 
        {
            System.err.println(ex);
        }
        
        System.out.println("Elementos de la cola despues de quitar los dos del frente.");
        colaLineal.visualizar();        
    }//Fin del metodo main.
}//Fin de la clase PruebaColaLineal.
