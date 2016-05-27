package grafos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class GrafoAnchuraPrueba 
{
    public static void main(String[] args) 
    {
        GrafoMatriz gm = new GrafoMatriz(5);
        
        //Vertices del ejercicio 15.5 de las practicas
        Vertice ver1 = new Vertice("A");
        Vertice ver2 = new Vertice("B");
        Vertice ver3 = new Vertice("C");
        Vertice ver4 = new Vertice("D");
        Vertice ver5 = new Vertice("E");
        
        gm.nuevoVertice(ver1.nomVertice());
        gm.nuevoVertice(ver2.nomVertice());
        gm.nuevoVertice(ver3.nomVertice());
        gm.nuevoVertice(ver4.nomVertice());
        gm.nuevoVertice(ver5.nomVertice());
        
        try 
        {
            //Se crean los nuevos arcos entre vertices.
            //A con B, C, D
            gm.nuevoArco(ver1.nomVertice(), ver2.nomVertice());//A con B
            gm.nuevoArco(ver1.nomVertice(), ver3.nomVertice());//A con C
            gm.nuevoArco(ver1.nomVertice(), ver4.nomVertice());//A con D
            
            //B con A, C, E
            gm.nuevoArco(ver2.nomVertice(), ver1.nomVertice());//B con A
            gm.nuevoArco(ver2.nomVertice(), ver3.nomVertice());//B con C
            gm.nuevoArco(ver2.nomVertice(), ver5.nomVertice());//B con E
            
            //C con A, B, D, E
            gm.nuevoArco(ver3.nomVertice(), ver1.nomVertice());//C con A
            gm.nuevoArco(ver3.nomVertice(), ver2.nomVertice());//C con B
            gm.nuevoArco(ver3.nomVertice(), ver4.nomVertice());//C con D
            gm.nuevoArco(ver3.nomVertice(), ver5.nomVertice());//C con E
            
            //D con B, C, E
            gm.nuevoArco(ver4.nomVertice(), ver2.nomVertice());//D con B
            gm.nuevoArco(ver4.nomVertice(), ver3.nomVertice());//D con C
            gm.nuevoArco(ver4.nomVertice(), ver5.nomVertice());//D con E
            
            //E con B, C
            gm.nuevoArco(ver5.nomVertice(), ver2.nomVertice());//E con B
            gm.nuevoArco(ver5.nomVertice(), ver3.nomVertice());//E con C
            
            gm.imprimir();//Imprime la matriz de adyacencia del grafo.
            
            System.out.println("Recorrido de Anchura:");
            GrafoMatriz.recorrerAnchura(gm, ver4.nomVertice());
            
            System.out.println("\nRecorrido de Profundidad:");
            GrafoMatriz.recorrerProfundidad(gm, ver4.nomVertice());
        } 
        catch (Exception e1) 
        {
            System.out.println("Error" + e1);
        }
    }//Fin del metodo main.
}//Fin de la clase GrafoAnchuraPrueba.
