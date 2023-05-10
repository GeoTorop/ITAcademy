package com.epam.task.array.tests;

import com.epam.task.array.services.ArrayCalculation;
import com.epam.task.array.entity.CustomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayCalculationTest {
    ArrayCalculation arrayCalculation = new ArrayCalculation();
    CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});

    @Test
    void findMin() {
        int actualMin = arrayCalculation.findMin(customArray);
        int expectedMin = -6;
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    void findMax() {
        int actualMax = arrayCalculation.findMax(customArray);
        int expectedMax = 1000;
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    void findAvg() {
        double actualAvg = arrayCalculation.findAvg(customArray);
        double expectedAvg = 109.4;
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    void findSum() {
        int actualSum = arrayCalculation.findSum(customArray);
        int expectedSum = 1094;
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void countPositive() {
        int actualCountPos = arrayCalculation.countPositive(customArray);
        int expectedCountPos = 6;
        Assertions.assertEquals(expectedCountPos, actualCountPos);
    }

    @Test
    void countNegative() {
        int actualCountNeg = arrayCalculation.countNegative(customArray);
        int expectedCountNeg = 2;
        Assertions.assertEquals(expectedCountNeg, actualCountNeg);
    }

    @Test
    void countZero() {
        int actualCountZer = arrayCalculation.countZero(customArray);
        int expectedCountZer = 2;
        Assertions.assertEquals(expectedCountZer, actualCountZer);
    }
}