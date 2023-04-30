package com.epam.tasks.task.array.services;

import com.epam.tasks.task.array.entity.CustomArray;
import com.epam.tasks.task.array.util.ArrayUtil;

public class ArrayServiceImpl implements ArrayService {
    private ArrayUtil arrayUtil;

    public ArrayServiceImpl() {
        this.arrayUtil = new ArrayUtil();
    }
    @Override
    public int findMax(CustomArray customArray) {
        return arrayUtil.findMax(customArray);
    }

    @Override
    public int findMin(CustomArray customArray) {
        return arrayUtil.findMin(customArray);
    }

    @Override
    public double findAvg(CustomArray customArray) {
        return arrayUtil.findAvg(customArray);
    }

    @Override
    public int findSum(CustomArray customArray) {
        return arrayUtil.findSum(customArray);
    }

    @Override
    public int countPositive(CustomArray customArray) {
        return arrayUtil.countPositive(customArray);
    }

    @Override
    public int countNegative(CustomArray customArray) {
        return arrayUtil.countNegative(customArray);
    }

    @Override
    public int countZero(CustomArray customArray) {
        return arrayUtil.countZero(customArray);
    }
}
