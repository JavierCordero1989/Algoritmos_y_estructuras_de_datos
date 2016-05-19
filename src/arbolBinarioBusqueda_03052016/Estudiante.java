package arbolBinarioBusqueda_03052016;

/**
 *
 * @author Javi Cordero
 */
public class Estudiante implements Comparador
{
    int numMat;
    String nombre;

    public boolean igualQue(Object object) 
    {
        Estudiante estudiante = (Estudiante)object;
        return numMat == estudiante.numMat;
    }

    public boolean menorQue(Object object) 
    {
        Estudiante estudiante = (Estudiante)object;
        return numMat < estudiante.numMat;
    }

    public boolean menorIgualQue(Object object) 
    {
        Estudiante estudiante = (Estudiante)object;
        return numMat <= estudiante.numMat;
    }

    public boolean mayorQue(Object object) 
    {
        Estudiante estudiante = (Estudiante)object;
        return numMat > estudiante.numMat;
    }

    public boolean mayorIgualQue(Object object) 
    {
        Estudiante estudiante = (Estudiante)object;
        return numMat >= estudiante.numMat;
    }
}//Fin de la clase Estudiante.