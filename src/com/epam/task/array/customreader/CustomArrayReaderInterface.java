package com.epam.task.array.customreader;

import com.epam.task.array.exceptions.CustomException;

import java.util.List;

public interface CustomArrayReaderInterface {
    List<int[]> readCustomArray(String filename) throws CustomException;
}
