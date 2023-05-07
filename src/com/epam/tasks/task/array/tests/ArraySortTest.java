package com.epam.tasks.task.array.tests;

import com.epam.tasks.task.array.entity.CustomArray;
import com.epam.tasks.task.array.services.ArraySort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortTest {
    ArraySort arraySort = new ArraySort();
    CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});

    @Test
    void bubbleSort() {
        int[] expected = { -6, -5, 0, 0, 2, 3, 10, 20, 70, 1000 };
        arraySort.bubbleSort(customArray);
        Assertions.assertArrayEquals(expected, customArray.getArray());
    }

    @Test
    void selectionSort() {
        int[] expected = { -6, -5, 0, 0, 2, 3, 10, 20, 70, 1000 };
        arraySort.selectionSort(customArray);
        Assertions.assertArrayEquals(expected, customArray.getArray());
    }

    @Test
    void insertionSort() {
        int[] expected = { -6, -5, 0, 0, 2, 3, 10, 20, 70, 1000 };
        arraySort.insertionSort(customArray);
        Assertions.assertArrayEquals(expected, customArray.getArray());
    }
}