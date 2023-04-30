package com.epam.tasks.task.array.util;

import com.epam.tasks.task.array.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayUtil {
    private static final Logger LOGGER = LogManager.getLogger();

    public static int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        LOGGER.info("Min element in this array: {}", min);
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
        LOGGER.info("Max element in this array: {}", max);
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
        LOGGER.info("Sum of elements in this array: {}", sum);
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
        LOGGER.info("Count of positive elements in this array: {}", count);
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
        LOGGER.info("Count of negative elements in this array: {}", count);
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
        LOGGER.info("Count of zeros elements in this array: {}", count);
        return count;
    }
}


