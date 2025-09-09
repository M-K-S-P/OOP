package org;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HeapSortTest {

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    void testEvenLength() {
        int[] array = new int[]{3, 1, 5, 4, 2};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void testOddLength() {
        int[] array = new int[]{3, 1, 5, 4};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void testSingleElem() {
        int[] array = new int[]{3};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void testEmptyArr() {
        int[] array = new int[]{};
        Sort.sort(array);
    }

    @Test
    void testNullptr() {
        Sort.sort(null);
    }
}
