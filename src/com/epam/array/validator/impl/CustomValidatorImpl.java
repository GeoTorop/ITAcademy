package com.epam.array.validator.impl;

import com.epam.array.validator.CustomValidator;

public class CustomValidatorImpl implements CustomValidator {
    private static final String INT_ARRAY_REGEX = "([0-9]{1,3}\\s+)+(\\d{1,3})";

    public boolean stringArrayValidate(String stringArray) {
        boolean match = stringArray.matches(INT_ARRAY_REGEX);
        return match;
    }
}
