package com.epam.tasks.Task_0_Array.util;

import com.epam.tasks.Task_0_Array.entity.CustomArray;

public class ArrayUtil {
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double findAvg(CustomArray customArray) {
        int[] array = customArray.getArray();
        double sum = findSum(customArray);

        return sum / array.length;
    }

    public int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int countPositive(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegative(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public int countZero(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }
}


