package com.epam.tasks.task.array.tests;

import com.epam.tasks.task.array.entity.CustomArray;
import com.epam.tasks.task.array.util.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayUtilTest {
    ArrayUtil arrayUtil = new ArrayUtil();
    CustomArray customArray = new CustomArray(new int[] {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3});

    @Test
    void findMin() {
        int actualMin = arrayUtil.findMin(customArray);
        int expectedMin = -6;
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    void findMax() {
        int actualMax = arrayUtil.findMax(customArray);
        int expectedMax = 1000;
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    void findAvg() {
        double actualAvg = arrayUtil.findAvg(customArray);
        double expectedAvg = 109.4;
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    void findSum() {
        int actualSum = arrayUtil.findSum(customArray);
        int expectedSum = 1094;
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void countPositive() {
        int actualCountPos = arrayUtil.countPositive(customArray);
        int expectedCountPos = 6;
        Assertions.assertEquals(expectedCountPos, actualCountPos);
    }

    @Test
    void countNegative() {
        int actualCountNeg = arrayUtil.countNegative(customArray);
        int expectedCountNeg = 2;
        Assertions.assertEquals(expectedCountNeg, actualCountNeg);
    }

    @Test
    void countZero() {
        int actualCountZer = arrayUtil.countZero(customArray);
        int expectedCountZer = 2;
        Assertions.assertEquals(expectedCountZer, actualCountZer);
    }
}