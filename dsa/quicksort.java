package dsa;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            sort(a, low, pi - 1);  
            sort(a, pi + 1, high); 
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(data));
        
        sort(data, 0, data.length - 1);
        
        System.out.println("Sorted Array:   " + Arrays.toString(data));
    }
}
