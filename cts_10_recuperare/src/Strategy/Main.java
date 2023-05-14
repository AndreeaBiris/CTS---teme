package Strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortManager sortManager = new SortManager();

        int array1[] = {6,4,8,1,3};
        sortManager.setSortingStrategy(new BubbleSortStrategy());
        sortManager.sortArray(array1);
        System.out.println("Sorted array: "+ Arrays.toString(array1));
        int array2[] = {1,5,7,2,3};
        sortManager.setSortingStrategy(new QuickSortStrategy());
        sortManager.sortArray(array2);
        System.out.println("Sorted array: "+ Arrays.toString(array2));
    }
}