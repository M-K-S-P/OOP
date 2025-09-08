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
    void test1() {
        int[] array = new int[]{3, 1, 5, 4, 2};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void test2() {
        int[] array = new int[]{3, 1, 5, 4};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void test3() {
        int[] array = new int[]{3};
        Sort.sort(array);

        assertTrue(isSorted(array));
    }

    @Test
    void test5() {
        int[] array = new int[]{};
        Sort.sort(array);
    }

    @Test
    void test4() {
        Sort.sort(null);
    }
}
