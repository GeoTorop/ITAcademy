package com.epam.task.array.services.impl;

import com.epam.task.array.services.ArrayCalculation;
import com.epam.task.array.entity.CustomArray;
import com.epam.task.array.services.ArrayCalculationService;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {
    private final ArrayCalculation arrayCalculation;

    public ArrayCalculationServiceImpl() {
        this.arrayCalculation = new ArrayCalculation();
    }
    @Override
    public int findMax(CustomArray customArray) {
        return arrayCalculation.findMax(customArray);
    }

    @Override
    public int findMin(CustomArray customArray) {
        return arrayCalculation.findMin(customArray);
    }

    @Override
    public double findAvg(CustomArray customArray) {
        return arrayCalculation.findAvg(customArray);
    }

    @Override
    public int findSum(CustomArray customArray) {
        return arrayCalculation.findSum(customArray);
    }

    @Override
    public int countPositive(CustomArray customArray) {
        return arrayCalculation.countPositive(customArray);
    }

    @Override
    public int countNegative(CustomArray customArray) {
        return arrayCalculation.countNegative(customArray);
    }

    @Override
    public int countZero(CustomArray customArray) {
        return arrayCalculation.countZero(customArray);
    }
}
