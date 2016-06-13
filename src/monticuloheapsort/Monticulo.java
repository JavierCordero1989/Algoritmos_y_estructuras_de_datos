/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monticuloheapsort;

public class Monticulo {

    static int TAMINI = 20;
    private int numElem;
    private Comparador[] v;

    public Monticulo(int tamano) {
        numElem = 0;
        TAMINI = tamano;
        v = new Comparador[TAMINI];
    }

    public static int padre(int i) {
        return (i - 1) / 2;
    }

    public static int hijoIzq(int i) {
        return (2 * i + 1);
    }

    public static int hijoDer(int i) {
        return (2 * i + 1) + 1;
    }

    private void flotar(int i) {
        Comparador nuevaClave = v[i];
        while ((i > 0) && (v[padre(i)].mayorQue(nuevaClave))) {
            v[i] = v[padre(i)]; // baja el padre al hueco
            i = padre(i); // sube un nivel en el árbol
             v[i] = nuevaClave; 
        }
       // v[i] = nuevaClave; // sitúa la clave en su posición
    }

    private boolean monticuloLleno() {
        return (numElem == v.length);
    }

    private void ampliar() {
        Comparador[] anteriorV = v;
        v = new Comparador[numElem + TAMINI];
        for (int j = 0; j < numElem; j++) {
            v[j] = anteriorV[j];

        }
    }

    public void insertar(Comparador clave) {
        if (monticuloLleno()) {
            ampliar();
        }
        v[numElem] = clave;
        flotar(numElem);
        numElem++;
    }

    public boolean esVacio() {
        return numElem == 0;
    }

    public Comparador buscarMinimo() throws Exception {
        if (esVacio()) {
            throw new Exception("Acceso a montículo vacío");
        }
        return v[0];
    }

    public Comparador eliminarMinimo() throws Exception {
        if (esVacio()) {
            throw new Exception("Acceso a montículo vacío");
        }
        Comparador menor;
        menor = v[0];
        v[0] = v[numElem - 1];
        criba(0);
        numElem--;
        return menor;
    }
    public void criba(int raiz) {
        boolean esMonticulo;
        int hijo;
        esMonticulo = false;
        while ((raiz < numElem / 2) && !esMonticulo) { // determina el índice del hijo menor
            if (hijoIzq(raiz) == (numElem - 1)) // único descendiente
            {
                hijo = hijoIzq(raiz);
            } else if (v[hijoIzq(raiz)].menorQue(v[hijoDer(raiz)])) {
                hijo = hijoIzq(raiz);
            } else {

                hijo = hijoDer(raiz);
            }
            if (v[hijo].menorQue(v[raiz])) {
                Comparador t = v[raiz];
                v[raiz] = v[hijo];
                v[hijo] = t;
                raiz = hijo;
                /* continua por la rama de claves mínimas */
            } else {
                esMonticulo = true;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i <numElem; i++) {
            System.out.println(v[i].toString() + " ");
        }
    }

    public static void criba2(Comparador v[], int raiz, int ultimo) {
        boolean esMonticulo;
        int hijo;
        int numElem = ultimo + 1;
        esMonticulo = false;
        while ((raiz < numElem / 2) && !esMonticulo) {
            //determina el índice del hijo mayor
            if (Monticulo.hijoIzq(raiz) == (numElem - 1)) {
                hijo = Monticulo.hijoIzq(raiz);
            } else if (v[Monticulo.hijoIzq(raiz)].mayorQue(v[Monticulo.hijoDer(raiz)])) {
                hijo = Monticulo.hijoIzq(raiz);
            } else {
                hijo = Monticulo.hijoDer(raiz);
            }
            if (v[hijo].mayorQue(v[raiz])) {
                Comparador t = v[raiz];
                v[raiz] = v[hijo];
                v[hijo] = t;
                raiz = hijo;
                /* continua por la rama de claves máximas */
            } else {
                esMonticulo = true;
            }
        }
    }
    public static void ordenacionMonticulo(Comparador v[], int n) {
        int j;
        int i=0;
        for (j = n / 2; j >= 0; j--) {
            criba2(v, j, n - 1);
            System.out.println("paso "+i++ +" inicia j"+ n / 2 + " sigue j "+j+" sigue n "+n );
            Monticulo.imprimir(v);
        }
        System.out.println("---------------------------sigue------------------------------ ");
        i = 0;
        for (j = n - 1; j >= 1; j--) {
             System.out.println("paso "+i++ +" inicia j"+ (n - 1) + " sigue j "+j );
            Comparador t;
            t = v[0];
            v[0] = v[j];
            v[j] = t;
            criba2(v,0, j-1);
            Monticulo.imprimir(v);
        }
    }
      public  static void imprimir(Comparador v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].toString() + " ");
        }
    }
    
}
