package pilaVector;

import javax.swing.JOptionPane;

/* Esta clase realiza lo mismo que la del ejemplo de pilas. */
public class PruebaPilaVector 
{
    public static void main(String args[])
    {
        PilaVector pilaLineal = new PilaVector();
        
        String palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra");
        
        int tamanioPalabra = palabra.length();
        
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
        
        Object caracter = null;
        
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
}//Fin de la clase PruebaPilaVector.
