package tarea_1;

import java.util.Random;

/**
 * 
 * @author Javi Cordero
 */
public class GrafoAnchuraPrueba 
{
    /**
     * Este metodo recibe dos numeros enteros como parametro, ademas los suma
     * y los divide entre 3. Si el residuo obtenido es igual a cero, entonces
     * el metodo devolvera true; esto indica que ambos numeros sumados son 
     * multiplos de tres. De lo contrario, devolvera false.
     * 
     * @param num1
     * @param num2
     * @return true si la suma de ambos numeros, es multiplo de 3.
     */
    public static boolean esMultiploDeTres(int num1, int num2)
    {
        //Si los dos numeros sumados son multiplos de 3.
        return (((num1 + num2) % 3) == 0);
    }//Fin del metodo esMultiploDeTres.
    
    /**
     * Recibe como parametro un numero entero y un arreglo de numeros enteros.
     * Analiza posicion por posicion del arreglo si el numero entero se encuentra
     * dentro del arreglo. Si se encuentra una coincidencia, el metodo devolvera
     * true, de lo contrario false.
     * 
     * @param numero
     * @param arreglo
     * @return true si el numero esta repetido.
     */
    public static boolean comprobarRepeticion(int numero, int[] arreglo)
    {
        boolean repetido = false;
        
        for(int n : arreglo)
        {
            if(n == numero)//Si el numero del parametro, es igual a algun numero del arreglo.
            {
                repetido = true;
                break;//Si encuentra una coincidencia, rompe el ciclo.
            }
        }
        
        return repetido;
    }//Fin del metodo comprobarRepeticion.
    
    public static void main(String[] args) 
    {
        GrafoMatriz gm = new GrafoMatriz(10);
        Random random = new Random(999);//Genera los mismos numeros siempre.
        int[] numerosAleatorios = new int[10]; //Arreglo de enteros, donde se guardaran los numeros aletorios generados.
        int numAleatorio; //Numero aleatorio que sera generado en cada pasada.
        
        //Genera los numeros aleatorios y los guarda en un arreglo
        for(int i=0; i<numerosAleatorios.length; i++)
        {
            numAleatorio = 11 + random.nextInt(89);
            
            //Comprueba que el numero generado, no se encuentre ya en el arreglo.
            while(comprobarRepeticion(numAleatorio, numerosAleatorios))
            {
                numAleatorio = 11 + random.nextInt(89);
            }
            
            numerosAleatorios[i] = numAleatorio; //Guarda el numero en el arreglo.
        }
        
        //Crea los vertices y les asigna el numero aleatorio del arreglo.
        for(int a : numerosAleatorios)
        {
            Vertice vertice = new Vertice("" + a);
            gm.nuevoVertice(vertice.nomVertice());
        }
        
        int tamanioGM = gm.numeroDeVertices(); //Tamaño del arreglo de vertices en la clase GrafoMatriz.
        
        try
        {
            //Recorre los vertices
            for(int v=0; v<tamanioGM; v++)
            {
                //Compara los vertices buscando adyacencias
                for(int w=0; w<tamanioGM; w++)
                {
                    if(v != w) //Que no sea el mismo vertice.
                    {
                        int valorVertice1 = Integer.parseInt(gm.obtenerVertice(v).nomVertice()); //Almacena el valor del vertice v
                        int valorVertice2 = Integer.parseInt(gm.obtenerVertice(w).nomVertice()); //Almacena el valor del vertice w

                        //Comprueba si los dos valores de los vertices sumados, son multiplos de 3.
                        if(esMultiploDeTres(valorVertice1, valorVertice2))
                        {
                            gm.nuevoArco(""+valorVertice1, ""+valorVertice2); //Crea el arco.
                        }
                    }
                }
            }
            
            gm.imprimirVertices();
            gm.imprimir();//Imprime la matriz de adyacencia del grafo.

            //GrafoMatriz.recorrerProfundidad(gm, gm.obtenerVertice(8).nomVertice());
            //GrafoMatriz.recorrerAnchura(gm, gm.obtenerVertice(8).nomVertice());
        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex);
        }
    }//Fin del metodo main.
}//Fin de la clase GrafoAnchuraPrueba.