package org;

import java.util.Arrays;

/**
 * Implementation of heapsort algorithm.
 */
public class Sort {

    private static int leftChildIndex(int i) {
        return (i + 1) * 2 - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void siftDown(int[] arr, int i, int end) {
        while (leftChildIndex(i) < end) {
            int child = leftChildIndex(i);
            if (child + 1 < end && arr[child] < arr[child + 1]) {
                child = child + 1;
            }

            if (arr[i] < arr[child]) {
                swap(i, child);
                i = child;
            } else {
                break;
            }
        }
    }

    /** comms
     *
     */
    private static void heapify(int[] arr) {
        for (int i = arr.length - 1; i >= 0; --i) {
            siftDown(arr, i, arr.length - i);
        }
    }

    /**
     * 
     *
     * @param items - array to sort.
     */
    public static void sort(int[] items) {
        if (items == null) {
            return;
        }
        heapify();
        for (int i = items.length - 1; i > 0; --i) {
            swap(items, 0, i);
            siftDown(items, 0, i);
        }
    }

    /**
     * example usage.
     *
     * @param args - cmd arguments, none handled.
     */
    public static void main(String[] args) {
        int[] array = new int[] {3, 1, 5, 4, 2};
        Sort.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
