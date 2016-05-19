package listaDobleEnlace;

import java.util.Random;

public class PruebaListaDoble 
{
    public static void main(String args[])
    {
        Random r = new Random(); /* Objeto para numeros aleatorios. */
        int d;
        ListaDoble lista = new ListaDoble(); //Crea la lista vacia.
        
        int k=10; /* Cantidad de Nodos que tendrá la lista. */

        //se insertan elementos en la lista
        for(; k>0; k--)
        {
            d = k;
            lista.insertarCabezaLista(d);
        }//Fin del for.
        //recorre la lista para escribir sus elementos.
        System.out.println("Elementos de la lista.");
        lista.visualizar();
        System.out.println();

        int valor = r.nextInt(10);
        Nodo nodo = lista.buscarPosicion(valor);//va a eliminar una posicion aleatoria entre 1 y 10.
        System.out.println("El valor del nodo en la posicion " + valor + " es: " + nodo.dato);
        
        System.out.println(">>>Borrando el Nodo #"+valor+"<<<");
        lista.eliminar(valor);
        System.out.println(">>>Se elimino el nodo<<<");
        lista.visualizar();
    }//Fin del metodo main.
    
}
