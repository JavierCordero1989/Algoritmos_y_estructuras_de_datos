package tarea_1;

/**
 * 
 * @author Javi Cordero
 */

public class GrafoMatriz 
{
    int numVerts;
    static int maxVerts = 20;
    Vertice[] verts;
    int[][] matAd;

    public GrafoMatriz() {
        this(maxVerts);
    }

    public GrafoMatriz(int mx) 
    {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) 
        {
            for (int j = 0; j < mx; j++) 
            {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }
    /**
     * La operación recibe la etiqueta (String) de un vértice del grafo,
     * comprueba si ya está en la lista de vértices, en caso negativo incrementa
     * el número de vértices y lo asigna a la lista.*/
    public void nuevoVertice(String nom)
    {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) 
        {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }/* busca el vértice en el array. Devuelve -1 si no lo encuentra:*/
    
    public int numVertice(String vs)
    {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for ( ;(i < numVerts) && !encontrado;) {
            encontrado = verts[i].equals(v);
            if (!encontrado) {
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
    }

    public int numeroDeVertices() {
        return numVerts;
    }
    /**
     * El método recibe el nombre de cada vértice del arco, busca, en el array,
     * el número de vértice asignado a cada uno de ellos y marca la matriz de
     * adyacencia.
     */
    public void nuevoArco(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
    }
    /**
     * El método recibe el nombre de cada vértice del arco, busca, en el array,
     * el número de vértice asignado a cada uno de ellos y 
     * determina si b es adyacente de a*/
    public boolean adyacente(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb] == 1;
    }
    public boolean adyacente(int va, int vb) throws Exception {
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb] == 1;
    }

    public void imprimir() {
        for (int i = 0; i < verts.length; i++) {
            for (int j = 0; j < verts.length; j++) {
                System.out.print(" " + matAd[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int[] recorrerAnchura(GrafoMatriz grafoMatriz, String origen) throws Exception 
    {
        int w, v;
        int[] m;
        int CLAVE = 4444;
        v = grafoMatriz.numVertice(origen);//Posicion del vertice origen en la matriz.
        
        if (v < 0) //La posicion es menor a cero.
        {
            throw new Exception("Vértice origen no existe");
        }
        
        ColaLista cola = new ColaLista();
        m = new int[grafoMatriz.numeroDeVertices()];//Crea el arreglo con la cantidad de vertices del grafo.
        
        // inicializa los vértices como no marcados
        for (int i = 0; i < grafoMatriz.numeroDeVertices(); i++) 
        {
            m[i] = CLAVE; //CLAVE=4444.
        }
        m[v] = 0; // vértice origen queda marcado 
        
        cola.insertar(new Integer(v));//Se inserta el origen en la cola.
        
        while (!cola.colaVacia()) 
        {
            Integer cw;
            cw = (Integer) cola.quitar(); //Quita el vertice de la cola.
            w = cw.intValue();
            
            System.out.println("Vértice " + grafoMatriz.verts[w] + "visitado"); //Visita el vertice.
            
            //inserta en la cola los adyacentes de w no marcados
            for (int u = 0; u < grafoMatriz.numeroDeVertices(); u++) 
            {
                if((grafoMatriz.matAd[w][u] == 1) && (m[u] == CLAVE))//Se comprueba la adyacencia y que el vertice no este marcado.
                {
                    //se marca vertice u con número de arcos hasta el
                    m[u] = m[w] + 1;
                    cola.insertar(new Integer(u));//Se inserta el dayacente en la cola.
                }
            }
        }
        return m;
    }
    
    public static int[] recorrerProfundidad(GrafoMatriz grafoMatriz, String origen) throws Exception 
    {
        int w, v;
        int[] m;
        int CLAVE = 4444;
        v = grafoMatriz.numVertice(origen);//Posicion del vertice origen en la matriz.
        
        if (v < 0) //La posicion es menor a cero.
        {
            throw new Exception("Vértice origen no existe");
        }
        
        PilaLineal pila = new PilaLineal();
        m = new int[grafoMatriz.numeroDeVertices()];//Crea el arreglo con la cantidad de vertices del grafo.
        
        // inicializa los vértices como no marcados
        for (int i = 0; i < grafoMatriz.numeroDeVertices(); i++) 
        {
            m[i] = CLAVE; //CLAVE=4444.
        }
        m[v] = 0; // vértice origen queda marcado 
        
        pila.insertar(new Integer(v));//Se inserta el origen en la cola.
        
        while (!pila.pilaVacia()) 
        {
            Integer cw;
            cw = (Integer) pila.quitar(); //Quita el vertice de la cola.
            w = cw.intValue();
            
            System.out.println("Vértice " + grafoMatriz.verts[w] + "visitado"); //Visita el vertice.
            
            //inserta en la cola los adyacentes de w no marcados
            for (int u = 0; u < grafoMatriz.numeroDeVertices(); u++) 
            {
                if((grafoMatriz.matAd[w][u] == 1) && (m[u] == CLAVE))//Se comprueba la adyacencia y que el vertice no este marcado.
                {
                    //se marca vertice u con número de arcos hasta el
                    m[u] = m[w] + 1;
                    pila.insertar(new Integer(u));//Se inserta el dayacente en la cola.
                }
            }
        }
        return m;
    }
    
    public Vertice obtenerVertice(int posicion)
    {
        return verts[posicion];
    }
    
    public void imprimirVertices()
    {
        for(Vertice v : verts)
        {
            System.out.printf("Valor del vertice %d: %s\n", v.numVertice, v.nombre );
        }
    }

}
