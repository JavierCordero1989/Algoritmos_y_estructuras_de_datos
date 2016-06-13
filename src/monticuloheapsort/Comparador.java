/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monticuloheapsort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public interface Comparador {

    boolean igualQue(Object q);

    boolean menorQue(Object q);

    boolean menorIgualQue(Object q);

    boolean mayorQue(Object q);
}