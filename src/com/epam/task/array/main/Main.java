package com.epam.task.array.main;

import com.epam.task.array.creator.CustomArrayCreator;
import com.epam.task.array.customreader.CustomArrayReaderInterface;
import com.epam.task.array.customreader.impl.CustomArrayReaderImpl;
import com.epam.task.array.entity.CustomArray;
import com.epam.task.array.exceptions.CustomException;
import com.epam.task.array.services.ArrayCalculationServiceInterface;
import com.epam.task.array.services.ArraySortServiceInterface;
import com.epam.task.array.services.impl.ArrayCalculationServiceInterfaceImpl;
import com.epam.task.array.services.impl.ArraySortServiceInterfaceImpl;
import com.epam.task.array.validator.CustomValidatorInterface;
import com.epam.task.array.validator.impl.CustomValidatorImpl;
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
        CustomArrayReaderInterface reader = new CustomArrayReaderImpl();
        List<int[]> numbers;
        List<CustomArray> customArrays = new ArrayList<>();
        try {
            numbers = reader.readCustomArray(fileName);
            customArrays = CustomArrayCreator.createCustomArrayList(numbers);
            ArrayCalculationServiceInterface calc = new ArrayCalculationServiceInterfaceImpl();
            ArraySortServiceInterface sort = new ArraySortServiceInterfaceImpl();
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
