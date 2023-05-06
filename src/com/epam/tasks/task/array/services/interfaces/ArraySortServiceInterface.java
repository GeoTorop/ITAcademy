package com.epam.tasks.task.array.services.interfaces;

import com.epam.tasks.task.array.entity.CustomArray;

public interface ArraySortServiceInterface {
    void bubbleSort(CustomArray customArray);
    void selectionSort(CustomArray customArray);
    void insertionSort(CustomArray customArray);
}
