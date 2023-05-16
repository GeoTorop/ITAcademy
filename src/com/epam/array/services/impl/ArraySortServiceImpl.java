package com.epam.array.services.impl;

import com.epam.array.services.ArraySort;
import com.epam.array.services.ArraySortService;
import com.epam.array.entity.CustomArray;


public class ArraySortServiceImpl implements ArraySortService {
    private final ArraySort arraySort;

    public ArraySortServiceImpl() {
        this.arraySort = new ArraySort();
    }

    @Override
    public void bubbleSort(CustomArray customArray) {
        arraySort.bubbleSort(customArray);
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        arraySort.selectionSort(customArray);
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        arraySort.insertionSort(customArray);
    }
}
