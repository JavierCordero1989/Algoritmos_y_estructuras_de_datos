package listaSimple;

import java.util.Random;

/* Si desea ejecutar esta clase en NetBeans, dé clic derecho sobre el archivo
y haga clic en Run File. */
public class ListaAleatoria
{
    public static void main(String args[])
    {
        Random r = new Random(); /* Objeto para numeros aleatorios. */
        int d;
        Lista lista = new Lista(); //Crea la lista vacia.
        int k = Math.abs(r.nextInt() % 55); //Tamaño del que será la lista de Nodos. 

        //se insertan elementos en la lista
        for(; k>0; k--)
        {
            d = r.nextInt() % 99;
            lista.insertarCabezaLista(d);
        }//Fin del for.
        
        //recorre la lista para imprimir sus elementos.
        System.out.println("Elementos de la lista generados al azar.");
        lista.visualizar();
        System.out.println();/* Imprime una linea en blanco. */

        /* Con el metodo buscar posicion, buscara y traera el nodo que este 
        en la posicion especificada por parámetros, en este caso el 6. Puede
        cambiar al gusto del programador. */
        Nodo nodo = lista.buscarPosicion(6);
        
        System.out.println("El valor del nodo en la posicion 6 es: " + nodo.dato);
        
        /* Elimina el nodo con el valor especificado en el parámetro del método
        eliminar de la clase Lista. */
        System.out.println(">>>Borrando el Nodo #6<<<");
        lista.eliminar(nodo.dato);
        
        /* Imprime la lista de nuevo, para que se pueda apreciar que el nodo fue eliminado. */
        System.out.println(">>>Se elimino el nodo<<<");
        lista.visualizar();
    }//Fin del metodo main.
}//Fin de la clase ListaAleatoria.
