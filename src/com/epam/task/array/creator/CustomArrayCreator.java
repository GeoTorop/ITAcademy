package com.epam.task.array.creator;

import com.epam.task.array.entity.CustomArray;
import com.epam.task.array.exceptions.CustomException;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreator {
    public static CustomArray createCustomArray(int[] array) throws CustomException {
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }

    public static List<CustomArray> createCustomArrayList(List<int[]> arrays) throws CustomException {
        List<CustomArray> customArrays = new ArrayList<>();
        for (int[] array : arrays) {
            if (array != null) {
                CustomArray customArray = new CustomArray(array);
                customArrays.add(customArray);
            } else {
                throw new CustomException("Array is null!");
            }

        }
        return customArrays;
    }
}