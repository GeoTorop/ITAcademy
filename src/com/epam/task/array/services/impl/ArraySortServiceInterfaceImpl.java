package com.epam.task.array.services.impl;

import com.epam.task.array.services.ArraySort;
import com.epam.task.array.entity.CustomArray;
import com.epam.task.array.services.ArraySortServiceInterface;


public class ArraySortServiceInterfaceImpl implements ArraySortServiceInterface {
    private final ArraySort arraySort;

    public ArraySortServiceInterfaceImpl() {
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
