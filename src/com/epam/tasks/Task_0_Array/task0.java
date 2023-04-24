package com.epam.tasks.Task_0_Array;

import java.util.Scanner;

public class task0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int min = findMin(array);
        int max = findMax(array);
        double avg = findAvg(array);
        int sum = findSum(array);
        int positiveCount = countPositive(array);
        int negativeCount = countNegative(array);
        int zeroCount = countZero(array);

        System.out.println("Min value: " + min);
        System.out.println("max value: " + max);
        System.out.println("Avg value: " + avg);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Count of positive elements: " + positiveCount);
        System.out.println("Count of negative elements: " + negativeCount);
        System.out.println("Count of zero's: " + zeroCount);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double findAvg(int[] array) {
        double sum = findSum(array);
        return sum / array.length;
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int countPositive(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegative(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }
}