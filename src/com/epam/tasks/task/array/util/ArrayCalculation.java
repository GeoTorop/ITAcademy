package com.epam.tasks.task.array.util;

import com.epam.tasks.task.array.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculation {
    private static final Logger LOGGER = LogManager.getLogger();

    public int findMin(CustomArray customArray) {
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

    public int findMax(CustomArray customArray) {
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

    public double findAvg(CustomArray customArray) {
        int[] array = customArray.getArray();
        double avg = 0;

        double sum = findSum(customArray);
        avg = sum / array.length;

        LOGGER.info("Avg of elements in this array: {}", avg);
        return avg;
    }

    public int findSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        LOGGER.info("Sum of elements in this array: {}", sum);
        return sum;
    }

    public int countPositive(CustomArray customArray) {
        int[] array = customArray.getArray();
        int countPos = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPos++;
            }
        }
        LOGGER.info("Count of positive elements in this array: {}", countPos);
        return countPos;
    }

    public int countNegative(CustomArray customArray) {
        int[] array = customArray.getArray();
        int countNeg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNeg++;
            }
        }
        LOGGER.info("Count of negative elements in this array: {}", countNeg);
        return countNeg;
    }

    public int countZero(CustomArray customArray) {
        int[] array = customArray.getArray();
        int countZer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZer++;
            }
        }
        LOGGER.info("Count of zeros elements in this array: {}", countZer);
        return countZer;
    }
}


