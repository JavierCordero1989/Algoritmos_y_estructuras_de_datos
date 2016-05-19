package colaCircular;

/**
 *
 * @author Javi Cordero
 */
public class PruebaColaCircular 
{
    public static void main(String args[])
    {
        ColaCircular colaCircular = new ColaCircular();
        
        System.out.println("llenando el arreglo de objetos hasta el tope");
        
        try
        {
            int i=0;
            colaCircular.insertar(i++);
            
            while(!colaCircular.colaLlena())
            {
                colaCircular.insertar(i++);
            }
            System.out.println("Cola llena: " + colaCircular.colaLlena());
            colaCircular.visualizar();
            
            colaCircular.insertar(i++);
        }
        catch(Exception ex)
        {
            System.out.println("Error {excepcion} en el proceso: " + ex);
        }
    }//Fin del main.
}//Fin de la clase PruebaColaCircular.
