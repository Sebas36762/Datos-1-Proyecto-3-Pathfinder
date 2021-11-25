package Sort;

/**
 * Instituto Tecnologico de Costa Rica
 * Area Ingenieria en Computadores
 *
 * Lenguaje: Java
 * Clase: quickSort
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Esta clase contiene el algoritmo de ordenamiento QuickSort el cual se implementa en el apartado de informacion
 * para realizar la busqueda de las locaciones, además de contener alguno metodos que el mismo emplea para el funcionamiento
 */
public class quickSort {
    private String[] names;
    private int name;

    /**
     * Metedo que es llamado y que se emplea para iniciar el ordenamiento (Guarda datos)
     *
     * @param values lista la cual sera ordenada
     *
     * @return names de la lista ordenada
     */
    public String[] sort(String[] values) {
        if (values ==null || values.length==0){
            return null;
        }
        this.names = values;
        name = values.length;
        quicksort(0, name - 1);
        return names;
    }

    /**
     * Metodo que contiene el algoritmo de ordenamiento QuickSort
     *
     * @param low indice del menor elemento de la lista
     * @param high indice del mayor elemento de la lista
     */
    private void quicksort(int low, int high) {
        int i = low, j = high;
        String pivot = names[low + (high-low)/2];
        while (i <= j) {
            while (names[i].compareTo(pivot) < 0) {
                i++;
            }
            while (names[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    /**
     * Metodo que funciona como swap
     *
     * @param i posicion de la lista
     * @param j posicion de la lista
     */
    private void exchange(int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }

}
