package com.epam.tasks.task.array.main;

import com.epam.tasks.task.array.entity.CustomArray;
import com.epam.tasks.task.array.services.interfaces.ArrayServiceInterface;
import com.epam.tasks.task.array.services.interfaces.ArraySortServiceInterface;
import com.epam.tasks.task.array.services.impl.ArrayServiceInterfaceImpl;
import com.epam.tasks.task.array.services.impl.ArraySortServiceInterfaceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final int[] ARRAY_OF_NUM = {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3};

    public static void main(String[] args) {
        CustomArray customArray = new CustomArray(ARRAY_OF_NUM);
        ArrayServiceInterface arrayServiceInterface = new ArrayServiceInterfaceImpl();
        ArraySortServiceInterface arraySortServiceInterface = new ArraySortServiceInterfaceImpl();

        arrayServiceInterface.findMin(customArray);
        arrayServiceInterface.findMax(customArray);
        arrayServiceInterface.findAvg(customArray);
        arrayServiceInterface.findSum(customArray);
        arrayServiceInterface.countPositive(customArray);
        arrayServiceInterface.countNegative(customArray);
        arrayServiceInterface.countZero(customArray);

        arraySortServiceInterface.bubbleSort(customArray);
        arraySortServiceInterface.selectionSort(customArray);
        arraySortServiceInterface.insertionSort(customArray);
    }
}
