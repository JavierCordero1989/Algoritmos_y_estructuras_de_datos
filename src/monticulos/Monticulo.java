package monticulos;

public class Monticulo 
{
    private int TAMANIO;
    private int numElems;
    private Comparador[] v;
    
    /**
     * Constructor que inicializa los datos de la clase.
     * @param tamanio 
     */
    public Monticulo(int tamanio)
    {
        TAMANIO = tamanio;
        numElems = 0;
        v = new Comparador[TAMANIO];
    }/*Fin del constructor.*/
    
    public void imprimir()
    {
        for(int i=0; i<numElems; i++)
        {
            System.out.println(v[i].toString() + " ");
        }
    }/*Fin del metodo imprimir*/
    
    public void cribaMin(int raiz)
    {
        boolean esMonticulo;
        int hijo;
        esMonticulo = false;
        
        while((raiz < numElems/2) && !esMonticulo)
        {
            /*Determina el indice del hijo menor.*/
            if(hijoIzquierdo(raiz) == (numElems - 1))/*Unico descendiente*/
            {
                hijo = hijoIzquierdo(raiz);
            }
            else
            {
                if(v[hijoIzquierdo(raiz)].menorQue(v[hijoDerecho(raiz)]))
                {
                    hijo = hijoIzquierdo(raiz);
                }
                else
                {
                    hijo = hijoDerecho(raiz);
                }
            }
            /*Compara raiz con el menor de los hijos*/
            if(v[hijo].menorQue(v[raiz]))
            {
                Comparador t = v[raiz];
                v[raiz] = v[hijo];
                v[hijo] = t;
                raiz = hijo; /*Continua por la rama de claves minima*/
            }
            else
            {
                esMonticulo = true;
            }
        }/*Fin del while*/
    }/*Fin del metodo cribaMin*/
    
    public void cribaMax(Comparador[] v, int raiz, int ultimo)
    {
        boolean esMonticulo;
        int hijo;
        int numElem = (ultimo + 1);
        esMonticulo = false;
        
        while((raiz < numElem/2) && !esMonticulo)
        {
            /*Determina el indice del hijo menor.*/
            if(hijoIzquierdo(raiz) == (numElem - 1))/*Unico descendiente*/
            {
                hijo = hijoIzquierdo(raiz);
            }
            else
            {
                if(v[hijoIzquierdo(raiz)].mayorQue(v[hijoDerecho(raiz)]))
                {
                    hijo = hijoIzquierdo(raiz);
                }
                else
                {
                    hijo = hijoDerecho(raiz);
                }
            }
            /*Compara raiz con el menor de los hijos*/
            if(v[hijo].mayorQue(v[raiz]))
            {
                Comparador t = v[raiz];
                v[raiz] = v[hijo];
                v[hijo] = t;
                raiz = hijo; /*Continua por la rama de claves minima*/
            }
            else
            {
                esMonticulo = true;
            }
        }/*Fin del while*/
    }/*Fin del metodo cribaMin*/
    
    public Comparador eliminarMinimo() throws Exception
    {
        if(esVacio())
        {
            throw new Exception("Acceso a monticulo vacio");
        }
        Comparador menor;
        menor = v[0];
        v[0] = v[numElems-1];
        cribaMin(0);
        numElems--;
        
        return menor;
    }/*Fin del metodo eliminarMinimo*/
    
    /**
     * Devuelve el elemento que esta mas arriba en el arbol, la raiz.
     * 
     * @return el elemento minimo.
     * @throws Exception en caso de que el monticulo este vacio
     */
    public Comparador buscarMinimo() throws Exception
    {
        if(esVacio())
        {
            throw new Exception("Acceso a monticulo vacio");
        }
        return v[0];
    }/*Fin del metodo buscarMinimo*/
    
    /**
     * Pregunta si el monticulo esta vacio.
     * @return true: el monticulo esta vacio. false: el monticulo tiene elementos.
     */
    public boolean esVacio()
    {
        return numElems == 0;
    }/*Fin del metodo esVacio*/
    
    /**
     * Pregunta si el monticulo esta lleno.
     * @return true: el monticulo esta lleno, false: el monticulo esta vacio.
     */
    public boolean monticuloLleno()
    {
        return (numElems == v.length);
    }/*Fin del metodo monticuloLleno*/
    
    /**
     * Amplia el vector de los nodos del arbol.
     */
    private void ampliar()
    {
        Comparador[] anteriorV = v;
        v = new Comparador[numElems + TAMANIO];
        
        for(int j=0; j<numElems; j++)
        {
            v[j] = anteriorV[j];
        }
    }/*Fin del metodo ampliar*/
    
    public void insertar(Comparador clave)
    {
        if(monticuloLleno())
        {
            ampliar();
        }
        v[numElems] = clave;
        flotar(numElems);
        numElems++;
    }
    
    private void flotar(int i)
    {
        Comparador nuevaClave = v[i];
        while((i > 0) && (v[padre(i)].mayorQue(nuevaClave)))
        {
            v[i] = v[padre(i)]; //Baja el padre al hueco.
            i = padre(i); //Sube un nivel en el arbol.
        }/*Fin del while*/
        
        v[i] = nuevaClave; //situa la clave en su posicion.
    }/*Fin del metodo flotar*/
    
    public int padre(int i)
    {
        return (i - 1) / 2;
    }/*Fin del metodo padre*/
    
    public int hijoIzquierdo(int i)
    {
        return (2 * i + 1);
    }/*Fin del metodo hijoIzquierdo*/
    
    public int hijoDerecho(int i)
    {
        return (2 * i + 1) + 1;
    }/*Fin del metodo hijoDerecho*/
}/*Fin de la clase Monticulo*/
