package com.epam.tasks.Task_0_Array.util;

import com.epam.tasks.Task_0_Array.entity.CustomArray;

public class ArrayUtil {
    public static int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double findAvg(CustomArray customArray) {
        int[] array = customArray.getArray();
        double sum = findSum(customArray);

        return sum / array.length;
    }

    public static int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int countPositive(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegative(CustomArray customArray) {
        int[] array = customArray.getArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZero(CustomArray customArray) {
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


