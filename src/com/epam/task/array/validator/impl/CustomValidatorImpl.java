package com.epam.task.array.validator.impl;

import com.epam.task.array.validator.CustomValidatorInterface;

public class CustomValidatorImpl implements CustomValidatorInterface {
    private static final String INT_ARRAY_REGEX = "([0-9]{1,3}\\s+)+(\\d{1,3})";

    public boolean stringArrayValidation(String stringArray) {
        boolean match = stringArray.matches(INT_ARRAY_REGEX);
        return match;
    }
}
