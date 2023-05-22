package com.epam.array.repository.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.Specification;

import java.util.Arrays;

public class SumSpec implements Specification {
    private int sum;

    public SumSpec(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = Arrays.stream(customArray.getArray()).sum() == sum;
        return result;
    }
}
