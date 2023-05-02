package com.epam.tasks.task.array.main;

import com.epam.tasks.task.array.entity.CustomArray;
import com.epam.tasks.task.array.services.ArrayService;
import com.epam.tasks.task.array.services.impl.ArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final int[] ARRAY_OF_NUM = {0, 2, 10, 20, 70, 1000, 0, -5, -6, 3};

    public static void main(String[] args) {
        CustomArray customArray = new CustomArray(ARRAY_OF_NUM);
        ArrayService arrayService = new ArrayServiceImpl();
    }
}
