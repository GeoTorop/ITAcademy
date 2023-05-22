package com.epam.array.service;

import com.epam.array.entity.CustomArray;

public interface ArraySortService {
    void bubbleSort(CustomArray customArray);
    void selectionSort(CustomArray customArray);
    void insertionSort(CustomArray customArray);
}
