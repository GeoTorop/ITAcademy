package com.epam.tasks.Task_0_Array.main;

import com.epam.tasks.Task_0_Array.entity.CustomArray;
import com.epam.tasks.Task_0_Array.services.ArrayService;
import com.epam.tasks.Task_0_Array.services.ArrayServiceImpl;

public class main {
    private static final int[] ARRAY_OF_NUM = {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3};
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray(ARRAY_OF_NUM);
        ArrayService arrayService = new ArrayServiceImpl();

        final int min = arrayService.findMin(customArray);
        final int max = arrayService.findMax(customArray);
        final double avg = arrayService.findAvg(customArray);
        final int sum = arrayService.findSum(customArray);
        final int countPos = arrayService.countPositive(customArray);
        final int countNeg = arrayService.countNegative(customArray);
        final int countZer = arrayService.countZero(customArray);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
        System.out.println("Sum:" + sum);
        System.out.println("CountPositive: " + countPos);
        System.out.println("CountNegative: " + countNeg);
        System.out.println("CountZeros: " + countZer);
    }
}
