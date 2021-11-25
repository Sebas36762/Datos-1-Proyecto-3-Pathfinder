package Sort;

public class quickSort {
    private String[] names;
    private int name;

    public String[] sort(String[] values) {
        if (values ==null || values.length==0){
            return null;
        }
        this.names = values;
        name = values.length;
        quicksort(0, name - 1);
        return names;
    }
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
    private void exchange(int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }

}
