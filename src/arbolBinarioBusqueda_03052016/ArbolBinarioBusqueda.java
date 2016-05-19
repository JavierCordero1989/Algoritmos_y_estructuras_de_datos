package arbolBinarioBusqueda_03052016;

/**
 *
 * @author Javi Cordero
 */
public class ArbolBinarioBusqueda extends ArbolBinario
{
    public ArbolBinarioBusqueda()
    {
        super();
    }//Fin del metodo ArbolBinarioBusqueda.
    
//    public ArbolBinarioBusqueda(Nodo raiz)
//    {
//        super(raiz);
//    }//Fin del metodo ArbolBinarioBusqueda.
    
    public void insertar(Object valor) throws Exception
    {
        Comparador dato = (Comparador)valor;
        raiz = insertar(raiz, dato);
    }//Fin del metodo insertar.
    
    protected Nodo insertar(Nodo raizSub, Comparador dato) throws Exception
    {
        if(raizSub == null)
        {
            raizSub = new Nodo(dato);
        }
        else if(dato.menorQue(raizSub.valorNodo()))
        {
            Nodo izquierda = insertar(raizSub.subArbolIzquierdo(), dato);
            raizSub.ramaIzq(izquierda);
        }
        else if(dato.mayorQue(raizSub.valorNodo()))
        {
            Nodo derecho = insertar(raizSub.subArbolDerecho(), dato);
            raizSub.ramaDer(derecho);
        }
        else
        {
            throw new Exception("Nodo duplicado.");
        }
        
        return raizSub;
    }//Fin del metodo sobrecargado #1 insertar.
    
    public Nodo buscar(Object buscado)
    {
        Comparador dato;
        dato = (Comparador)buscado;
        
        if(raiz  == null)
        {
            return null;
        }
        else
        {
            return localizar(raizArbol(), dato);
        }
    }//Fin del metodo buscar.
    
    public Nodo buscarIterativo(Object buscado) 
    {
        Comparador dato = (Comparador) buscado;
        boolean encontrado = false;
        Nodo raizSub = raiz;
        
        while (!encontrado && raizSub != null) 
        {
            if (dato.igualQue(raizSub.valorNodo())) 
            {
                encontrado = true;
            } 
            else if (dato.menorQue(raizSub.valorNodo())) 
            {
                raizSub = raizSub.subArbolIzquierdo();
            } 
            else 
            {
                raizSub = raizSub.subArbolDerecho();
            }
        }
        return raizSub;
    }//Fin del metodo buscarIterativo.
    
    protected Nodo localizar(Nodo raizSub, Comparador buscado)
    {
        if(raizSub == null)
        {
            return null;
        }
        else if(buscado.igualQue(raizSub.valorNodo()))
        {
            return raiz;
        }
        else if(buscado.menorQue(raizSub.valorNodo()))
        {
            return localizar(raizSub.subArbolIzquierdo(), buscado);
        }
        else
        {
            return localizar(raizSub.subArbolDerecho(), buscado);
        }
    }//Fin del metodo localizar.
    
    public void eliminar(Object valor) throws Exception
    {
        Comparador dato;
        dato = (Comparador)valor;
        raiz = eliminar(raiz, dato);
    }//Fin del metodo eliminar.
    
    //Metodo interno para realizar la operacion.
    protected Nodo eliminar(Nodo raizSub, Comparador dato) throws Exception
    {
        if(raizSub == null)
        {
            throw new Exception("No encontrado el nodo con la clave.");
        }
        else if(dato.menorQue(raizSub.valorNodo()))
        {
            Nodo izq;
            izq = eliminar(raizSub.subArbolIzquierdo(), dato);
            raizSub.ramaIzq(izq);
        }
        else if(dato.mayorQue(raizSub.valorNodo()))
        {
            Nodo der;
            der = eliminar(raizSub.subArbolDerecho(), dato);
            raizSub.ramaDer(der);
        }
        else
        {
            Nodo q;
            q = raizSub; //Nodo a quitar del arbol.
            
            if(q.subArbolIzquierdo() == null)
            {
                raizSub = q.subArbolDerecho();
            }
            else if(q.subArbolDerecho() == null)
            {
                raizSub = q.subArbolIzquierdo();
            }
            else
            {
                q = reemplazar(q);
            }
            q = null;
        }
        
        return raizSub;
    }//Fin del metodo eliminar.
    
    //metodo interno para sustituir por el mayor de los menores.
    private Nodo reemplazar(Nodo act)
    {
        Nodo a, p;
        
        p = act;
        a = act.subArbolIzquierdo(); //Rama de nodos menores.
        
        while(a.subArbolDerecho() != null)
        {
            p = a;
            a = a.subArbolDerecho();
        }//Fin del while.
        
        act.nuevoValor(a.valorNodo());
        
        if(p == act)
        {
            p.ramaIzq(a.subArbolIzquierdo());
        }
        else
        {
            p.ramaDer(a.subArbolIzquierdo());
        }
        
        return a;
    }//Fin del metodo reemplazar.
    
    public static int contarHijosprimero(Nodo subRaiz)
    {
        int valor;
        valor = contarHijos(subRaiz);
        
        if (valor != 0)
        {
          return valor-1;
        }
        
        return valor;
    }
    
    public static int contarHijos(Nodo subRaiz) 
    {
        if(subRaiz == null) 
        {
            return 0;
        }
        else
        {
           return 1 + contarHijos(subRaiz.subArbolIzquierdo())+ contarHijos(subRaiz.subArbolDerecho());
        }  
    }//Fin del metodo contarHijos.
}//Fin de la clase ArbolBinarioBusqueda.
