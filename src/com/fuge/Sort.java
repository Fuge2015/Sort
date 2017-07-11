package com.fuge;

/**
 * Created by dongfu on 17-7-10.
 */
public class Sort<T extends Comparable<T>> {
    public void quickSort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int low, int high) {
        if (array != null && high > low ) {
            int mid = partition(array, low, high);
//            int mid = partition2(array, low, high);
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

    private int partition2(T[] array, int low, int high) {
        int small = low - 1;
        for (int index = low; index < high; index++) {
            if (array[index].compareTo(array[high]) < 0) {
                small++;
                if (array[index].compareTo(array[small]) < 0) {
                    T temp = array[index];
                    array[index] = array[small];
                    array[small] = temp;
                }
            }
        }
        small++;
        T temp = array[high];
        array[high] = array[small];
        array[small] = temp;
        return small;
    }
}
