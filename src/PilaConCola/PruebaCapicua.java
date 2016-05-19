package PilaConCola;

import javax.swing.JOptionPane;

/* Se usan la cola y la pila para saber si un número es capicúa. */
public class PruebaCapicua 
{
    public static void main(String args[])
    {
        String numeroCapicua = "0";
        
        /* Se repite hasta que el usuario ingrese un cero */
        do{
            ColaCapicua colaCapicua = new ColaCapicua();
            PilaCapicua pilaCapicua = new PilaCapicua();
            
            numeroCapicua = JOptionPane.showInputDialog(null, "Ingrese un numero\nCero para salir.", "", JOptionPane.PLAIN_MESSAGE);
        
            //Insertar los elementos de la cadena en la pila y la cola.
            int tamanioCadena = numeroCapicua.length();

            try
            {
                for(int i=0; i<tamanioCadena; i++)
                {
                    pilaCapicua.insertar(numeroCapicua.charAt(i));
                    colaCapicua.insertar(numeroCapicua.charAt(i));
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error ejecutado: " + ex);
            }

            //Comparar los caracteres de la cadena.
            boolean esCapicua = true;

            for(int i=0; i<tamanioCadena; i++)
            {
                try
                {
                    Object caracterPila = pilaCapicua.quitar();
                    Object caracterCola = colaCapicua.quitar();

                    if(!caracterPila.equals(caracterCola))
                    {
                        JOptionPane.showMessageDialog(null, "El número no es capicúa.");
                        esCapicua = false;
                        break;
                    }
                }
                catch(Exception ex)
                {
                    System.out.println("Error generado: " + ex);
                }
            }//Fin del for.

            if(esCapicua)
            {
                JOptionPane.showMessageDialog(null, "El numero es capicúa");
            }
        }while(Integer.parseInt(numeroCapicua) != 0);
    }
}//Fin de la clase PruebaCapicua.
/* Investigar sobre HashSet y TreeSet*/