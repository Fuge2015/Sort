package com.fuge;

/**
 * Created by dongfu on 17-7-10.
 */
public class Sort<T extends Comparable<T>> {
    public void quickSort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int low, int high) {
        if (high > low) {
            int mid = partition(array, low, high);
            quickSort(array, low, mid - 1);
            quickSort(array, mid + 1, high);
        }

    }

    private int partition(T[] array, int low, int high) {
        T pivot = array[low];
        while (low < high) {
            while (low < high && pivot.compareTo(array[high]) <= 0) {
                high--;
            }
            array[low] = array[high];
            while (low < high && pivot.compareTo(array[low]) >= 0) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }
}
