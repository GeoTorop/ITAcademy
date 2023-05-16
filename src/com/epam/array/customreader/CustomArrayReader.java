package com.epam.array.customreader;

import com.epam.array.exceptions.CustomException;

import java.util.List;

public interface CustomArrayReader {
    List<int[]> readCustomArray(String filename) throws CustomException;
}
