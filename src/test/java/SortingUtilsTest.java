import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Brian Morillo
 * Description: Sorting Utilities Tests
 */
class SortingUtilsTest {

    @Test
    void bubbleSortTest() {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int[] expected = {-2, 1, 2, 2, 3, 3, 5, 6, 12, 14};
        SortingUtils.bubbleSort(list);

        assertArrayEquals(list, expected);
    }

    @Test
    void radixSortTest() {
        int[] list = { 59, 30, 2, 33, 58, 65, 86, 48, 97 };
        int[] expected = {2, 30, 33, 48, 58, 59, 65, 86, 97};
        SortingUtils.radixSort(list);

        assertArrayEquals(list, expected);
    }

    @Test
    void selectionSortTest() {
        int[] list = { 35, 71, 12, 86, 2, 50, 7, 42, 22, 67 };
        int[] expected = {2, 7, 12, 22, 35, 42, 50, 67, 71, 86};
        SortingUtils.selectionSort(list);

        assertArrayEquals(list, expected);
    }

    @Test
    void quickSort() {
        int[] list = { 80, 40, 51, 22, 52, 97, 84, 89, 20, 29 };
        int[] expected = {20, 22, 29, 40, 51, 52, 80, 84, 89, 97};
        SortingUtils.quickSort(list);

        assertArrayEquals(list, expected);
    }

    @Test
    void mergeSort() {
        int[] list = { 71, 76, 42, 32, 100, 97, 51, 44 };
        int[] expected = {32, 42, 44, 51, 71, 76, 97, 100};
        SortingUtils.mergeSort(list);

        assertArrayEquals(list, expected);
    }
}