package com.epam.tasks.Task_0_Array.util;

import com.epam.tasks.Task_0_Array.entity.CustomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {

    @Test
    void findMin() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        int actualMin = ArrayUtil.findMin(customArray);
        int expectedMin = -6;
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    void findMax() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        int actualMax = ArrayUtil.findMax(customArray);
        int expectedMax = 1000;
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    void findAvg() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        double actualAvg = ArrayUtil.findAvg(customArray); //Can I?
        double expectedAvg = 109.4;
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    void findSum() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        int actualSum = ArrayUtil.findSum(customArray);
        int expectedSum = 1094;
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void countPositive() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        int actualCountPos = ArrayUtil.countPositive(customArray);
        int expectedCountPos = 6;
        Assertions.assertEquals(expectedCountPos, actualCountPos);
    }

    @Test
    void countNegative() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        int actualCountNeg = ArrayUtil.countNegative(customArray);
        int expectedCountNeg = 2;
        Assertions.assertEquals(expectedCountNeg, actualCountNeg);
    }

    @Test
    void countZero() {
        CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});
        int actualCountZer = ArrayUtil.countZero(customArray);
        int expectedCountZer = 2;
        Assertions.assertEquals(expectedCountZer, actualCountZer);
    }
}