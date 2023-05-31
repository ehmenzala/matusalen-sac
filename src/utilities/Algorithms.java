package utilities;

public class Algorithms {
    public static int[] OrdenamientoBurbuja(int[] arreglo) {
        int auxiliar;
        for (int i = 1; i < arreglo.length; i++) { //i=1 1=2 1=3
            for (int j = 0; j < arreglo.length - i; j++) { //j=0 j=1 j=2     j=0 j=1    j=0
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
        return arreglo;
    }
    
    
    public static int[] seleccion(int[] array) {
        for (int i = 0; i < array.length; i++) { //i=0 i=1 i=2 i=3 
            int posimenor = i;
            for (int j = i + 1; j < array.length; j++) { // j=1 j=2 j=3
                if (array[j] < array[posimenor]) {
                    posimenor = j;
                }
            }

            int aux = array[i];
            array[i] = array[posimenor];
            array[posimenor] = aux;
        }
        return array;
    }
    
    
    public static void quicksort(int A[], int izq, int der) {
        int pivote = A[izq], i = izq, j = der;
        int aux;
        while (i < j) {
            while (A[i] >= pivote && i < j) {
                i++;
            }
            while (A[j] < pivote) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            quicksort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);
        }
    }
    
    
    public static int busquedaSecuencial(String vector[], String elemento){
        int n=vector.length;
        int i=0;
        
        while (i <=n-1) {
            if (elemento.equals(vector[i])) {
                return i;
            }
            i=i+1;
        }
        return -1;
    }
    
    
    public static String [] insercion(String [] arre ){
        for (int i = 1; i < arre.length; i++) {
            String value=arre[i];
            int j = i;
            
            while (j>0 && arre[j-1].compareTo(value)>0) {
                arre[j] = arre[j-1];
                j--;
            }
            arre[j]=value;
        }
        
        return arre;
    }
}
