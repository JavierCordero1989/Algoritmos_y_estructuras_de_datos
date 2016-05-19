/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaCircular;

/**
 *
 * @author Javi Cordero
 */
public class ColaCircular 
{
    private static final int MAXTAM = 10; /* Crea un tamaño máximo para la cola. */
    int frente, fin; /* Crea un frente y un fin para la cola. */
    private Object listaCola[]; /* Crea un arreglo donde se insertarán los elementos de la cola. */
    //Avanza una posicion.
    
    public ColaCircular()
    {
        frente = 0;
        fin = (MAXTAM-1); /* Igual a 9 */
        listaCola = new Object[MAXTAM];
    }
    
    public void insertar(Object elemento) throws Exception
    {
        /* Si la cola NO está llena. */
        if(!colaLlena())
        {
            /* fin va a ser igual a los que devuelva el método siguiente con el parámetro fin. */
            fin = siguiente(fin);
            
            /* Inserta el elemento en el final de la cola. */
            listaCola[fin] = elemento;
        }
        else
        {
            throw new Exception("Overflow de la cola.");
        }
    }//Fin del metodo insertar.
    
    /* Quita el ultimo elemento de la cola y corre el frente una posicion hacia adelante. */
    public Object quitar() throws Exception
    {
        /* Si la cola NO está vacía. */
        if(!colaVacia())
        {
            /* Guarda el objeto del frente de la cola en el Object tm. */
            Object tm = listaCola[frente];
            
            /* Cambia la posicion del frente. */
            frente = siguiente(frente);
            return tm;
        }
        else
        {
            throw new Exception("Cola vacia.");
        }
    }//Fin del metodo quitar.
    
    /* Limpia la cola y la deja vacía */
    public void borrarCola()
    {
        frente = 0;
        fin = MAXTAM - 1;
    }//Fin del metodo borrarCola.
    
    /* Retorna el frente de la cola. */
    public Object frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente];
        }
        else
        {
            throw new Exception("Cola vacia");
        }
    }//Fin del metodo frenteCola.
    
    /* Si el frente es igual a lo que devuelve el metodo siguiente con el parámetro fin, devuelve true. */
    public boolean colaVacia()
    {
        return (frente == siguiente(fin));
    }//Fin del metodo colaVacia.
    
    /* Muestra los elementos de la cola. desde el frente hasta el fin. */
    public void visualizar()
    {
        System.out.println("Elementos del arreglo de Objectos");
        
        for(int i=frente; i<=fin; i++)
        {
            System.out.print( listaCola[i] + " ");
        }
        System.out.println();
    }
    
    public boolean colaLlena()
    {
//        System.out.println(" fin " + siguiente(fin));
//        System.out.println(" siguiente fin " + siguiente(siguiente(fin)));
        
        return ( frente == siguiente(siguiente(fin)) );
    }//Fin del metodo colaLlena.
    
    public int siguiente(int r)
    {
        return ((r+1) % MAXTAM);
    }//Fin del metodo siguiente.
}//Fin de la clase circular.
