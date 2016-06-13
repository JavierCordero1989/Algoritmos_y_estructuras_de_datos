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
public class MonticuloOrdenamientoPrueba {
  
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tarea tk1 = new Tarea("proceso->", 6);
        Tarea tk2 = new Tarea("proceso->", 5);
        Tarea tk3 = new Tarea("proceso->", 3);

        Tarea tk4 = new Tarea("proceso->", 1);
        Tarea tk5 = new Tarea("proceso->", 8);
        Tarea tk6 = new Tarea("proceso->", 7);
        Tarea tk7 = new Tarea("proceso->", 2);

        Tarea tk8 = new Tarea("proceso->", 4);
      

        Monticulo mon = new Monticulo(8);
        
        Comparador[] v = new Comparador[8];
        v[0] = tk1;
        v[1] = tk2;
        v[2] = tk3;
        v[3] = tk4;
        v[4] = tk5;
        v[5] = tk6;
        v[6] = tk7;
        v[7] = tk8;
    
        
        System.out.println("Antes") ;
        Monticulo.imprimir(v);
          System.out.println("Despues") ;
       Monticulo.ordenacionMonticulo(v, 8);
  
        
        

        try {
          //  System.out.println(mon.eliminarMinimo());
        } catch (Exception e1) {
            System.out.println(e1);    
        }

        // TODO code application logic here
    }  
}
