package com.epam.array.creator;

import com.epam.array.exception.CustomException;
import com.epam.array.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    public static CustomArray createCustomArray(int[] array) throws CustomException {
        if (array == null) {
            throw new CustomException("Cannot create CustomArray: Array is null!");
        }
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
                throw new CustomException("Cannot create CustomArray: Array is null!");
            }

        }
        return customArrays;
    }
}
