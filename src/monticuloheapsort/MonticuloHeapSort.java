/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monticuloheapsort;

/**
 *
 * @author juan
 */
public class MonticuloHeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Tarea tk1 = new Tarea("proceso->", 15);
//        Tarea tk2 = new Tarea("proceso->", 39);
//        Tarea tk3 = new Tarea("proceso->", 18);
//
//        Tarea tk4 = new Tarea("proceso->", 41);
//        Tarea tk5 = new Tarea("proceso->", 72);
//        Tarea tk6 = new Tarea("proceso->", 37);
//        Tarea tk7 = new Tarea("proceso->", 19);
//
//        Tarea tk8 = new Tarea("proceso->", 56);
//        Tarea tk9 = new Tarea("proceso->", 32);

        Tarea tk1 = new Tarea("proceso->", 6);
        Tarea tk2 = new Tarea("proceso->", 5);
        Tarea tk3 = new Tarea("proceso->", 3);

        Tarea tk4 = new Tarea("proceso->", 1);
        Tarea tk5 = new Tarea("proceso->", 8);
        Tarea tk6 = new Tarea("proceso->", 7);
        Tarea tk7 = new Tarea("proceso->", 2);

        Tarea tk8 = new Tarea("proceso->", 4);
        Monticulo mon = new Monticulo(8);
        mon.insertar(tk1);
        mon.insertar(tk2);
        mon.insertar(tk3);
        mon.insertar(tk4);
        mon.insertar(tk5);
        mon.insertar(tk6);
        mon.insertar(tk7);
        mon.insertar(tk8);
        mon.imprimir();

        try {
           System.out.println(mon.eliminarMinimo());
          System.out.println("--------eliminar----------------------") ;
          mon.imprimir();
           
        } catch (Exception e1) {
            System.out.println(e1);        }

        // TODO code application logic here
    }

}
