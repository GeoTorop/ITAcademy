package com.epam.tasks.task.array.services;

import com.epam.tasks.task.array.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySort {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void bubbleSort(CustomArray customArray) {
        int[] arr = customArray.getArray();
        int n = arr.length;
        int swap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        LOGGER.info("Bubble sort: ");
        for (int num : arr) {
            LOGGER.info(num);
        }
    }

    public static void selectionSort(CustomArray customArray) {
        int[] arr = customArray.getArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int pos = i;
            int min = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
        LOGGER.info("Selection sort: ");
        for (int num : arr) {
            LOGGER.info(num);
        }
    }

    public static void insertionSort(CustomArray customArray) {
        int[] arr = customArray.getArray();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        LOGGER.info("Insertion sort: ");
        for (int num : arr) {
            LOGGER.info(num);
        }
    }
}