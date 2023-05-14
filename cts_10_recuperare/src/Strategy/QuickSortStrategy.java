package Strategy;

public class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
        System.out.println("Quick Sort");
    }
    private void quickSort(int[]array, int low, int high){
        if (low >= high) {
            return;
        }
        int pivot=partition(array,low,high);
        quickSort(array, low, pivot-1);
        quickSort(array, pivot+1, high);
    }
    private int partition(int[] array, int low, int high) {
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= array[high]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }



}