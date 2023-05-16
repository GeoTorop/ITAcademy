package com.epam.task.array.services;

import com.epam.task.array.entity.CustomArray;

public interface ArraySortService {
    void bubbleSort(CustomArray customArray);
    void selectionSort(CustomArray customArray);
    void insertionSort(CustomArray customArray);
}
