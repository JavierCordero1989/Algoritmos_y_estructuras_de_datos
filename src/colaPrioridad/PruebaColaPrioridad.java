/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class PruebaColaPrioridad {

    public static void main(String[] args) {
        try {
            ColaPrioridadT cpt = new ColaPrioridadT(9);

            Tarea tk1 = new Tarea("proceso0", 0);
            Tarea tk9 = new Tarea("proceso1", 1);
            Tarea tk12 = new Tarea("proceso12", 0);

            Tarea tk3 = new Tarea("proceso3", 3);
            Tarea tk4 = new Tarea("proceso4", 4);
            Tarea tk5 = new Tarea("proceso5", 5);

            Tarea tk20 = new Tarea("proceso20", 3);
            Tarea tk21 = new Tarea("proceso21", 4);
            Tarea tk23 = new Tarea("proceso23", 9);

            cpt.inserEnPrioridad(tk1);
            cpt.inserEnPrioridad(tk9);
            cpt.inserEnPrioridad(tk12);
            cpt.inserEnPrioridad(tk3);
            cpt.inserEnPrioridad(tk4);
            cpt.inserEnPrioridad(tk5);
            
            cpt.inserEnPrioridad(tk20);
            cpt.inserEnPrioridad(tk21);
            cpt.inserEnPrioridad(tk23);
            
            while (!cpt.colaPrioridadVacia())
            {
                System.out.println(cpt.quitarMin());
                
            }
            
            /**
             
             
             
             
             **/
            
            

        } catch (Exception e1) {
            System.out.println("error-> " + e1.toString());
        }

    }
}
