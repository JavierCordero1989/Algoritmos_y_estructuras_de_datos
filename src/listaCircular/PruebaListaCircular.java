package listaCircular;

import java.util.Random;

public class PruebaListaCircular 
{
    public static void main(String args[])
    {
        Random r = new Random();
        int d;
        ListaCircular lista;
        int k=10;

//
        lista = new ListaCircular(); //Crea la lista vacia.
        //se insertan elementos en la lista
        for(; k>0; k--)
        {
            d = k;
            lista.insertar(d);
        }//Fin del for.
        //recorre la lista para escribir sus elementos.
        System.out.println("Clase Prueba de Lista Circular\n\nElementos de la lista generados al azar.");
        lista.visualizar();
        System.out.println();

        int valor = 1 + r.nextInt(10);
//        Nodo nodo = lista.buscarPosicion(8);//va a eliminar una posicion aleatoria entre 1 y 10.
//        System.out.println("El valor del nodo en la posicion " + valor + " es: " + nodo.dato);
        
        System.out.printf(">>>Borrando el Nodo #%d<<<\n", valor );
        lista.eliminar(valor);
        System.out.println(">>>Se elimino el nodo<<<");
        lista.visualizar();
    }//Fin del metodo main.
}//Fin de la clase PruebaListaCircular.
