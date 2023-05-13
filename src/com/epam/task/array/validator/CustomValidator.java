package com.epam.task.array.validator;

public class CustomValidator {
    private static final String INT_NUMBER_REGEX = "-?\\d{1,9}";
    private static final String INT_ARRAY_REGEX = "([0-9]{1,3}\\s+)+(\\d{1,3})";

    public boolean NumValidate(String stringNum) {
        boolean match = stringNum.matches(INT_NUMBER_REGEX);
        return match;
    }

    public boolean ArrValidate(String stringArray) {
        return stringArray.matches(INT_ARRAY_REGEX);
    }
}
