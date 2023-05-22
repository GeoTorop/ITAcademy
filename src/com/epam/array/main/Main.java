package com.epam.array.main;

import com.epam.array.reader.impl.ArrayReaderImpl;
import com.epam.array.creator.ArrayCreator;
import com.epam.array.reader.ArrayReader;
import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomException;
import com.epam.array.repository.Repository;
import com.epam.array.service.ArrayCalculationService;
import com.epam.array.service.ArraySortService;
import com.epam.array.service.impl.ArrayCalculationServiceImpl;
import com.epam.array.service.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        String fileName = "data/array.txt";
        ArrayReader reader = new ArrayReaderImpl();
        List<int[]> numbers;
        List<CustomArray> customArrays;
        try {
            numbers = reader.readCustomArray(fileName);
            customArrays = ArrayCreator.createCustomArrayList(numbers);
            ArrayCalculationService calc = new ArrayCalculationServiceImpl();
            ArraySortService sort = new ArraySortServiceImpl();
            for (CustomArray customArray : customArrays) {
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
            LOGGER.error("An error occurred during custom array reading!", e);
            throw new CustomException("An error occurred during custom array reading!", e);
        }

        Repository arrayRepository = new Repository();
        for (CustomArray customArray : customArrays){
            arrayRepository.add(customArray);
        }
    }
}
