package com.epam.array.main;

import com.epam.array.customreader.impl.CustomArrayReaderImpl;
import com.epam.array.creator.CustomArrayCreator;
import com.epam.array.customreader.CustomArrayReader;
import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomException;
import com.epam.array.services.ArrayCalculationService;
import com.epam.array.services.ArraySortService;
import com.epam.array.services.impl.ArrayCalculationServiceImpl;
import com.epam.array.services.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    //private static final int[] ARRAY_OF_NUM = {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3};

    public static void main(String[] args) {
        String fileName = "data/array.txt";
        LOGGER.info("test");
        CustomArrayReader reader = new CustomArrayReaderImpl();
        List<int[]> numbers;
        List<CustomArray> customArrays = new ArrayList<>();
        try {
            numbers = reader.readCustomArray(fileName);
            customArrays = CustomArrayCreator.createCustomArrayList(numbers);
            ArrayCalculationService calc = new ArrayCalculationServiceImpl();
            ArraySortService sort = new ArraySortServiceImpl();
            for (CustomArray customArray : customArrays) {
                LOGGER.info("Original array: {}", customArray);
                LOGGER.info("Calculations: ");
                calc.findMin(customArray);
                calc.findMax(customArray);
                calc.findAvg(customArray);
                calc.findSum(customArray);
                calc.countPositive(customArray);
                calc.countNegative(customArray);
                calc.countZero(customArray);

                sort.bubbleSort(customArray);
                sort.selectionSort(customArray);
                sort.insertionSort(customArray);
            }
        } catch (CustomException e) {
            System.err.println(e);
            throw new RuntimeException(e);
        }
    }
}
        /*//CustomArray customArray = new CustomArray(ARRAY_OF_NUM);
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
         */
