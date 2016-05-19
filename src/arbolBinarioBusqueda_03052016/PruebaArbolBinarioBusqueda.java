package arbolBinarioBusqueda_03052016;

import java.util.ArrayList;

/**
 *
 * @author Javi Cordero
 */
public class PruebaArbolBinarioBusqueda 
{
    public static void main(String args[])
    {
        ArbolBinarioBusqueda arbol_bb = new ArbolBinarioBusqueda();
        String nombres[] = {"Javier","Jackeline","Alexandra","Juan","Andrey","Llasuara","Oldemar","Patricia"};
        int valores[] = {40,20,60,50,45,55,54,70};
        ArrayList lista = new ArrayList();
        
        try
        {
            Estudiante estudiante;//Crea un estudiante.
            
            //Agrega los estudiantes al arbol uno a uno.
            for(int contador=0; contador<8; contador++)
            {
                estudiante = new Estudiante();
                estudiante.numMat = valores[contador];//Le establece el valor con los del arreglo.
                estudiante.nombre = nombres[contador];
                lista.add(estudiante);//Agrega el estudiante a una lista.
                arbol_bb.insertar(estudiante);
            }
            
            System.out.println("ELEMENTOS DEL NODO EN PRE-ORDEN");
            ArbolBinario.preorden(arbol_bb.raiz);
            System.out.println("ELEMENTOS DEL NODO EN EN-ORDEN");
            ArbolBinario.inorden(arbol_bb.raiz);
            System.out.println("ELEMENTOS DEL NODO EN POST-ORDEN");
            ArbolBinario.postorden(arbol_bb.raiz);
            
            //System.out.println("Cantidad de hojas antes de eliminar: " + cantNodos(arbol_bb.raiz));
            System.out.println("\nEliminar el nodo con el valor 60.");
            arbol_bb.eliminar(lista.get(7));
            
            System.out.println("\nElementos despues de borrar el Nodo con el valor 70...\n");
            
            System.out.println("ELEMENTOS DEL NODO EN PRE-ORDEN");
            ArbolBinario.preorden(arbol_bb.raiz);
            System.out.println("ELEMENTOS DEL NODO EN EN-ORDEN");
            ArbolBinario.inorden(arbol_bb.raiz);
            System.out.println("ELEMENTOS DEL NODO EN POST-ORDEN");
            ArbolBinario.postorden(arbol_bb.raiz);
            
            System.out.println("Cantidad de hojas: " + cantNodosHojas(arbol_bb.raiz));
        }
        catch(Exception ex)
        {
            System.err.println("Excepcion lanzada: " + ex);
        }
    }//Fin del main.
    
    /**
     * Cuenta la cantidad de hojas que contiene un arbol binario x, y devuelve el
     * total como un entero.
     * 
     * @param raiz el nodo que contiene la raiz.
     * @return la cantidad de hojas del arbol.
     */
    public static int cantNodosHojas(Nodo raiz)
    {
        if(raiz == null)
        {
            return 0;
        }
        else if(raiz.ramaDerecha == null && raiz.ramaIzquierda == null)
        {
            return 1;
        }
        else
        {
            return (cantNodosHojas(raiz.subArbolIzquierdo())) + (cantNodosHojas(raiz.subArbolDerecho()));
        }
    }//Fin del metodo cantNodosHojas.
}//Fin de la clase PruebaArbolBinarioBusqueda.