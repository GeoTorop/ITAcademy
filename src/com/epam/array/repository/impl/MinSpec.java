package com.epam.array.repository.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.Specification;

import java.util.Arrays;

public class MinSpec implements Specification {
    private int minElement;

    public MinSpec(int minElement) {
        this.minElement = minElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int minInArray = Arrays.stream(customArray.getArray()).min().orElseThrow();
        boolean result = false;
        if (minInArray >= minElement){
            result = true;
        }
        return result;
    }
}
