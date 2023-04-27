package com.epam.tasks.Task_0_Array.services;

import com.epam.tasks.Task_0_Array.entity.CustomArray;

public interface ArrayService {
    int findMax(CustomArray customArray);
    int findMin(CustomArray customArray);
    double findAvg(CustomArray customArray);
    int findSum(CustomArray customArray);
    int countPositive(CustomArray customArray);
    int countNegative(CustomArray customArray);
    int countZero(CustomArray customArray);
}
