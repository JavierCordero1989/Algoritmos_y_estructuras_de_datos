package ordenacion;

/**
 *
 * @author Javi Cordero
 */
public class Pruebas 
{
    public static void main(String args[])
    {
        int[] arregloIntercambio = {8,4,6,2,9,1,3};
        
        /*---------------------------------------------------------*/
        /*-------------------ORDENA POR INTERCAMBIO----------------*/
        Intercambio.mostrarMensaje("ORDENAMIENTO POR INTERCAMBIO");
        Intercambio.mostrarMensaje("Datos del arreglo desordenado");
        Intercambio.imprimir(arregloIntercambio);
        
        Intercambio.mostrarMensaje("\nDatos del arreglo ya ordenado");
        Intercambio.ordenarIntercambio(arregloIntercambio);
        Intercambio.imprimir(arregloIntercambio);
        /*---------------------------------------------------------*/
        
        int arregloSeleccion[] = {7,5,8,2,6,0,1};
        /*---------------------------------------------------------*/
        /*---------------ORDENA POR SELECCION----------------------*/
        Seleccion.mostrarMensaje("\nORDENAMIENTO POR SELECCION");
        Seleccion.mostrarMensaje("Datos del arreglo desordenado");
        Seleccion.imprimir(arregloSeleccion);
        
        Seleccion.mostrarMensaje("\nDatos del arreglo ya ordenado");
        Seleccion.ordenarSeleccion(arregloSeleccion);
        Seleccion.imprimir(arregloSeleccion);
        /*---------------------------------------------------------*/
        
        int arregloBurbuja[] = {9,0,6,3,8,1,2};
        /*---------------------------------------------------------*/
        /*---------------ORDENA POR BURBUJA----------------------*/
        Burbuja.mostrarMensaje("\nORDENAMIENTO POR BURBUJA");
        Burbuja.mostrarMensaje("Datos del arreglo desordenado");
        Burbuja.imprimir(arregloBurbuja);
        
        Burbuja.mostrarMensaje("\nDatos del arreglo ya ordenado");
        Burbuja.ordenarBurbuja(arregloBurbuja);
        Burbuja.imprimir(arregloBurbuja);
        /*---------------------------------------------------------*/
        
        int arregloShell[] = {6,1,5,2,3,4,0};
        /*---------------------------------------------------------*/
        /*---------------ORDENA POR BURBUJA----------------------*/
        Shell.mostrarMensaje("\nORDENAMIENTO POR SHELL");
        Shell.mostrarMensaje("Datos del arreglo desordenado");
        Shell.imprimir(arregloShell);
        
        Shell.mostrarMensaje("\nDatos del arreglo ya ordenado");
        Shell.ordenarShell(arregloShell);
        Shell.imprimir(arregloShell);
        /*---------------------------------------------------------*/
        
        int arregloQuicksort[] = {79,21,15,99,88,65,75,85,76,46,84,24};
        /*---------------------------------------------------------*/
        /*---------------ORDENA POR QUICKSORT----------------------*/
        Quicksort.mostrarMensaje("\nORDENAMIENTO POR QUICKSORT");
        Quicksort.mostrarMensaje("Datos del arreglo desordenado");
        Quicksort.imprimir(arregloQuicksort);
        
        Quicksort.mostrarMensaje("\nDatos del arreglo ya ordenado");
        Quicksort.ordenarQuicksort(arregloQuicksort, 0, arregloQuicksort.length-1);
        Quicksort.imprimir(arregloQuicksort);
        /*---------------------------------------------------------*/
    }/*Fin del metodo main*/
}/*Fin de la clase Pruebas*/