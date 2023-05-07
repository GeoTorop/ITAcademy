package com.epam.tasks.task.array.main;

import com.epam.tasks.task.array.entity.CustomArray;
import com.epam.tasks.task.array.reader.CustomArrayReader;
import com.epam.tasks.task.array.services.ArrayCalculation;
import com.epam.tasks.task.array.services.interfaces.ArrayCalculationServiceInterface;
import com.epam.tasks.task.array.services.interfaces.ArraySortServiceInterface;
import com.epam.tasks.task.array.services.impl.ArrayCalculationServiceInterfaceImpl;
import com.epam.tasks.task.array.services.impl.ArraySortServiceInterfaceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final int[] ARRAY_OF_NUM = {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3};

    public static void main(String[] args) throws IOException {
        CustomArray customArray = new CustomArray(ARRAY_OF_NUM);
        ArrayCalculationServiceInterface arrayCalculationServiceInterface = new ArrayCalculationServiceInterfaceImpl();
        ArraySortServiceInterface arraySortServiceInterface = new ArraySortServiceInterfaceImpl();

        arrayCalculationServiceInterface.findMin(customArray);
        arrayCalculationServiceInterface.findMax(customArray);
        arrayCalculationServiceInterface.findAvg(customArray);
        arrayCalculationServiceInterface.findSum(customArray);
        arrayCalculationServiceInterface.countPositive(customArray);
        arrayCalculationServiceInterface.countNegative(customArray);
        arrayCalculationServiceInterface.countZero(customArray);

        arraySortServiceInterface.bubbleSort(customArray);
        arraySortServiceInterface.selectionSort(customArray);
        arraySortServiceInterface.insertionSort(customArray);

        CustomArrayReader reader = new CustomArrayReader("data/array.txt");
        int[] array = reader.readArray();

        System.out.println(Arrays.toString(array));
    }
}
