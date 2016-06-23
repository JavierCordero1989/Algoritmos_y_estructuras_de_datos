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
     
    public void MergeSort(int inputArr[]) 
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }//Fin del metodo MergeSort.
   
    private void doMergeSort(int lowerIndex, int higherIndex) 
    {
        if (lowerIndex < higherIndex) 
        {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }//Fin del metodo doMergeSort
   
    /**
     * Método que se encarga de ir separando el vector en sub vectores más
     * pequeños hasta llegar a un estado donde todos los elementos estén
     * separados.
     *
     */
    private void mergeParts(int lowerIndex, int middle, int higherIndex) 
    {

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
}//Fin de la clase Merge