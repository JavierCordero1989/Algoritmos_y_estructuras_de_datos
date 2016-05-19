package arboles_02052016;

/**
 * Clase PruebaArbolBinario.java
 * Creada el: 5 de Mayo del 2016.
 * Curso: Algoritmos y Estructuras de Datos.
 * @author Javier Cordero Leon.
 */
public class PruebaArbolBinario 
{
    public static void main(String args[])
    {
        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();
        
        try
        {
            a1 = ArbolBinario.nuevoArbol(null, "a", null);
            a = ArbolBinario.nuevoArbol(null, "-", a1);
            pila.insertar(a);
            
            a1 = ArbolBinario.nuevoArbol(null, "x", null);
            a2 = ArbolBinario.nuevoArbol(null, "y", null);
            a = ArbolBinario.nuevoArbol(a1, "+", a2);
            pila.insertar(a);
            
            a2 = (Nodo)pila.quitar();
            a1 = (Nodo)pila.quitar();
            a = ArbolBinario.nuevoArbol(a1, "+", a2);
            pila.insertar(a);
            
            a1 = ArbolBinario.nuevoArbol(null, "b", null);
            a = ArbolBinario.nuevoArbol(a1, "+", null);
            pila.insertar(a);
            
            a1 = ArbolBinario.nuevoArbol(null, "c", null);
            a2 = ArbolBinario.nuevoArbol(null, "d", null);
            a = ArbolBinario.nuevoArbol(a1, "*", a2);
            pila.insertar(a);
            
            a2 = (Nodo)pila.quitar();
            a1 = (Nodo)pila.quitar();
            a = ArbolBinario.nuevoArbol(a1, "*", a2);
            pila.insertar(a);
            
            a2 = (Nodo)pila.quitar();
            a1 = (Nodo)pila.quitar();
            a = ArbolBinario.nuevoArbol(a1, "/", a2);
            arbol = new ArbolBinario(a);
            
            System.out.println("DATOS DEL ARBOL EN PRE-ORDEN: ");
            ArbolBinario.preorden(a);
            System.out.println("\nDATOS DEL ARBOL INORDEN:");
            ArbolBinario.inorden(a);
            System.out.println("\nDATOS DEL ARBOL POST-ORDEN:");
            ArbolBinario.postorden(a);    
            System.out.println("\nCANTIDAD DE NODOS EN EL ARBOL: " + ArbolBinario.numNodos(a));
            
//            //Almacena datos en los nodos con nombres...
//            a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
//            a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
//            a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
//            pila.insertar(a);
//
//            a1 = ArbolBinario.nuevoArbol(null, "Anyora", null);
//            a2 = ArbolBinario.nuevoArbol(null, "Abel", null);
//            a = ArbolBinario.nuevoArbol(a1, "Maria Jesus", a2);
//            pila.insertar(a);
//
//            a2 = (Nodo)pila.quitar();
//            a1 = (Nodo)pila.quitar();
//            a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
//            arbol = new ArbolBinario(a);
//            /* >> Recorrido preorden<< 
//                  Nodo raiz, subarbol izquierdo, subarbol derecho. */
//            
//            /* >> Recorrido enorden << 
//                  subarbol izquierdo, Nodo raiz, subarbol derecho. */
//            
//            /* >> Recorrido postorden << 
//                  subarbol izquierdo, subarbol derecho, Nodo raiz. */
//            
//            /* Imprimir los datos del arbol de las tres maneras. */
            
            //Guarda Nodos con valores: +, *, /, a, b, c, d...
//            a1 = ArbolBinario.nuevoArbol(null, "a", null);
//            a2 = ArbolBinario.nuevoArbol(null, "b", null);
//            a = ArbolBinario.nuevoArbol(a1, "*", a2);
//            pila.insertar(a);
//
//            a1 = ArbolBinario.nuevoArbol(null, "c", null);
//            a2 = ArbolBinario.nuevoArbol(null, "d", null);
//            a = ArbolBinario.nuevoArbol(a1, "/", a2);
//            pila.insertar(a);
//
//            a2 = (Nodo)pila.quitar();
//            a1 = (Nodo)pila.quitar();
//            a = ArbolBinario.nuevoArbol(a1, "+", a2);
//            arbol = new ArbolBinario(a);
//            
//            System.out.println("DATOS DEL ARBOL EN PRE-ORDEN: ");
//            ArbolBinario.preorden(a);
//            System.out.println("\nDATOS DEL ARBOL INORDEN:");
//            ArbolBinario.inorden(a);
//            System.out.println("\nDATOS DEL ARBOL POST-ORDEN:");
//            ArbolBinario.postorden(a);    
//            System.out.println("\nCANTIDAD DE NODOS EN EL ARBOL: " + ArbolBinario.numNodos(a));
        }
        catch(Exception exception)
        {
            System.err.println(exception);
        }
    }//Fin del metodo main.
}//Fin de la clase PruebaArbolBinario.
