package com.epam.tasks.task.array.customexceptions;

public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("Array is empty");
    }
}
