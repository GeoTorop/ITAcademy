package com.epam.array.reader;

import com.epam.array.exception.CustomException;

import java.util.List;

public interface ArrayReader {
    List<int[]> readCustomArray(String filename) throws CustomException;
}
