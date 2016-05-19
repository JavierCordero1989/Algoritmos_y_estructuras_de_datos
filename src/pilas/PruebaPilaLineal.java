package pilas;

import javax.swing.JOptionPane;

public class PruebaPilaLineal 
{
    public static void main(String args[])
    {
        PilaLineal pilaLineal = new PilaLineal(); /* Inicializa una pila vacía*/
        
        /* Guarda la palabra ingresada por el usuario. */
        String palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra");
        
        /* Guarda el tamaño de la palabra ingresada. */
        int tamanioPalabra = palabra.length();
        
        /* Recorre la palabra letra por letra y la inserta en la pila. */
        for(int contador=0; contador<tamanioPalabra; contador++)
        {
            try
            {
                pilaLineal.insertar(palabra.charAt(contador)); //inserta letra por letra de la palabra en la pila.
            }
            catch(Exception ex)
            {
                System.out.println("Error: " + ex);
            }//Fin del bloque try-catch.
        }//Fin del for.
        
        /* Variable caracter de tipo objeto. */
        Object caracter = null;
        
        /* Recorre tantas veces como tamaño de la palabra. */
        for(int contador=0; contador<tamanioPalabra; contador++)
        {
            try 
            {
                caracter = pilaLineal.quitar(); //lee de la pila de atras para adelante y guarda el caracter en la variable.
                
                //Compara las letras de la pila, con las letras de la palabra una a una.
                //La pila se recorre de atras hacia adelante, y la palabra de adelante hacia atras.
                //Cuando encuentra una diferencia, se detiene y muestra el mensaje.
                if(!(caracter.equals(palabra.charAt(contador)))) 
                {
                    JOptionPane.showMessageDialog(null, "La palabra " + palabra + " NO es un palindromo");
                    break;  
                }//Fin del if.
            } 
            catch (Exception ex) 
            {
                System.out.println("Error: " + ex);
            }//Fin del bloque try-catch.
            
            if(pilaLineal.pilaVacia())//Si la pila esta vacia, quiere decir que todas las letras de la pila y de la palabra, coincidieron.
            {
                JOptionPane.showMessageDialog(null, "La palabra " + palabra + " SI es un palindromo.");
            }//Fin del if.
        }//Fin del for.
        
    }//Fin del metodo main.
}//Fin de la clase PruebaPilaLineal.
