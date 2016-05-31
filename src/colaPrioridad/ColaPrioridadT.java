/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class ColaPrioridadT {

    protected ColaLista[] tabla;
    protected int maxPrioridad;
//El constructor es el responsable de establecer el número de prioridades y
    //definir el array:

    public ColaPrioridadT(int n) throws Exception {
        if (n < 1) {
            throw new Exception("Error en prioridad: " + n);
        }
        maxPrioridad = n;
        tabla = new ColaLista[maxPrioridad + 1];
        for (int i = 0; i <= maxPrioridad; i++) {
            tabla[i] = new ColaLista();
        }
    }
    //  La operación añade una nueva tarea, un elemento, a la cola de prioridades.
    //La tarea se inserta en la cola tabla[prioridad], siendo prioridad la 
    //asociada a la tarea.

    public void inserEnPrioridad(Tarea t) throws Exception {
        int p = t.numPrioridad();
        if (p >= 0 && p <= maxPrioridad) {
            tabla[p].insertar(t);
        } else {
            throw new Exception("Tarea con prioridad fuera de rango");
        }
    }

//La operaciones elementoMin y quitarMin buscan, en primer lugar, el elemento de máxima prioridad; 
//es una búsqueda de un elemento mínimo, ya que el convenio establecido es que la máxima prioridad se 
//corresponde con 0, y así sucesivamente.
    public Tarea elementoMin() throws Exception {
        int i = 0;
        int indiceCola = -1;
// búsqueda de la primera cola no vacía
        do {
            if (!tabla[i].colaVacia()) {
                indiceCola = i;
                i = maxPrioridad + 1; // termina el bucle
            } else {
                i++;
            }
        } while (i <= maxPrioridad);
        if (indiceCola != -1) {
            return (Tarea) tabla[indiceCola].frenteCola();
        } else {
            throw new Exception(
                    "Cola de prioridades vacía");
        }
    }

    
    public Tarea quitarMin() throws Exception {
        int i = 0;
        int indiceCola = -1;
// búsqueda de la primera cola no vacía
        do {
            if (!tabla[i].colaVacia()) {
                indiceCola = i;
                i = maxPrioridad + 1; // termina el bucle
            } else {
                i++;
            }
        } while (i <= maxPrioridad);
        if (indiceCola != -1) {
            return (Tarea) tabla[indiceCola].quitar();
        } else {
            throw new Exception(
                    "Cola de prioridades vacía");
        }
    }

    //La operación colaPrioridadVacia comprueba que cada una de las colas está vacía. 
    public boolean colaPrioridadVacia() {
        int i = 0;
        while (tabla[i].colaVacia() && i < maxPrioridad) {
            i++;
        }
           return tabla[i].colaVacia();
    }
 
    
    
}
