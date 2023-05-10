package com.epam.task.array.services;

import com.epam.task.array.entity.CustomArray;

public interface ArrayCalculationServiceInterface {
    int findMax(CustomArray customArray);
    int findMin(CustomArray customArray);
    double findAvg(CustomArray customArray);
    int findSum(CustomArray customArray);
    int countPositive(CustomArray customArray);
    int countNegative(CustomArray customArray);
    int countZero(CustomArray customArray);
}
