/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashSet_y_TreeSet;

import java.util.Comparator;

/**
 *
 * @author Javi Cordero
 */
public class Comparador implements Comparator{

    public int compare(Object objeto_1, Object objeto_2) 
    {
        /* Convierte los objetos de los parámetros en objetos de tipo Estudiante
        mediante un casting. */
        Estudiante e1 = (Estudiante)objeto_1;
        Estudiante e2 = (Estudiante)objeto_2;
        
        /* Guarda la cédula de los objetos tipo Estudiante en las variables tipo String. */
        String c1 = e1.getNombre();
        String c2 = e2.getNombre();
        
        /* Convierte las cédulas en mayúsculas para que no exista diferencia. */
        c1 = c1.toUpperCase();
        c2 = c2.toUpperCase();
        
        return c1.compareTo(c2);
    }//Fin del metodo compare.
}//Fin de la clase Comparador. 
