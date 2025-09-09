package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Test {

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    void test_even_length() {
        int[] array = new int[]{3, 1, 5, 4, 2};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void test_odd_length() {
        int[] array = new int[]{3, 1, 5, 4};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void test_single_elem() {
        int[] array = new int[]{3};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void test_empty_arr() {
        int[] array = new int[]{};
        Sort.sort(array);
    }

    @Test
    void test_nullptr() {
        Sort.sort(null);
    }
}
