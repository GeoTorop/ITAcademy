package com.epam.task.array.services;

import com.epam.task.array.entity.CustomArray;

public interface ArraySortServiceInterface {
    void bubbleSort(CustomArray customArray);
    void selectionSort(CustomArray customArray);
    void insertionSort(CustomArray customArray);
}
