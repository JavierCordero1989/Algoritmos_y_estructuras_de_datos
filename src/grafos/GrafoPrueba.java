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
public class GrafoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GrafoMatriz gm = new GrafoMatriz(5);
        Vertice ver1 = new Vertice("Alicante");

        Vertice ver2 = new Vertice("Barcelona");

        Vertice ver3 = new Vertice("Cartagena");

        Vertice ver4 = new Vertice("Murcia");

        Vertice ver5 = new Vertice("Reus");

        gm.nuevoVertice(ver1.nomVertice());
        gm.nuevoVertice(ver2.nomVertice());
        gm.nuevoVertice(ver3.nomVertice());
        gm.nuevoVertice(ver4.nomVertice());
        gm.nuevoVertice(ver5.nomVertice());
        try {
            //Alicante
            gm.nuevoArco(ver1.nomVertice(), ver2.nomVertice());
            gm.nuevoArco(ver1.nomVertice(), ver4.nomVertice());
            gm.nuevoArco(ver1.nomVertice(), ver3.nomVertice());
            //Barcelona
            gm.nuevoArco(ver2.nomVertice(), ver3.nomVertice());
            gm.nuevoArco(ver2.nomVertice(), ver4.nomVertice());
            gm.nuevoArco(ver2.nomVertice(), ver5.nomVertice());
            //Cartagena
            gm.nuevoArco(ver3.nomVertice(), ver1.nomVertice());
            //Murcia
            gm.nuevoArco(ver4.nomVertice(), ver2.nomVertice());
            //Reus
            gm.nuevoArco(ver5.nomVertice(), ver2.nomVertice());

            gm.imprimir();

        } catch (Exception e1) {
            System.out.println("error" + e1);
        }

        // TODO code application logic here
    }

}
