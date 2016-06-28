/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

/**
 *
 * @author juan
 */
public class Merge
{
     /**
     * Algoritmo recursivo que permite ordenar el vector por medio del
     * MergeSort.
     *
     */
    private int tempMergArr[];
    private int length;
    private int array[];
    
    private int sort = 0;
    private int parts = 0;
    
    public void MergeSort(int inputArr[]) 
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        
        dormir();
        System.out.println("length: " + length);
        dormir();
        
        doMergeSort(0, length - 1);
    }//Fin del metodo MergeSort.
   
    private void doMergeSort(int lowerIndex, int higherIndex) 
    {
        sort++;
        
        dormir();
        System.out.println("Entro a doMergeSort\nlowerIndex: " + lowerIndex + ", higherIndex: " + higherIndex);
        dormir();
        
        if (lowerIndex < higherIndex) 
        {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            dormir();
            System.out.println("middle: " + middle);
            dormir();
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
        System.out.println("Entro a doMergeSort: " + sort);
        System.out.println("Entro a mergeParts: " + parts);
    }//Fin del metodo doMergeSort
   
    /**
     * Método que se encarga de ir separando el vector en sub vectores más
     * pequeños hasta llegar a un estado donde todos los elementos estén
     * separados.
     *
     */
    private void mergeParts(int lowerIndex, int middle, int higherIndex) 
    {
        parts++;
        dormir();
        System.out.println("Entro a MERGE_PARTS\nlowerIndex: " + lowerIndex + ", middle: " + middle + ", higherIndex: " + higherIndex);
        dormir();
        
        for (int i = lowerIndex; i <= higherIndex; i++) 
        {
            tempMergArr[i] = array[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        while (i <= middle && j <= higherIndex) 
        {
            if (tempMergArr[i] <= tempMergArr[j]) 
            {
                array[k] = tempMergArr[i];
                i++;
            } 
            else
            {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        
        while (i <= middle) 
        {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }//Fin del metodo mergeParts
    
    public void dormir()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException interruptedException)
        {
            System.err.println("Error en la pausa: " + interruptedException);
        }
    }
}//Fin de la clase Merge