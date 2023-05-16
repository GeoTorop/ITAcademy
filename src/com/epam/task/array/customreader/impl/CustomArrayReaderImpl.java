package com.epam.task.array.customreader.impl;

import com.epam.task.array.customreader.CustomArrayReader;
import com.epam.task.array.exceptions.CustomException;
import com.epam.task.array.validator.CustomValidator;
import com.epam.task.array.validator.impl.CustomValidatorImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayReaderImpl implements CustomArrayReader {
    private static final String REGEX_DELIMM = "\\s+";
    public List<int[]> readCustomArray(String filename) throws CustomException {
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            throw new CustomException("File does not exist. ");
        }
        int[] oneArray;
        List<int[]> resultList = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
            CustomValidator validator = new CustomValidatorImpl();
            for (int i = 0; i < lines.size(); i++) {
                String stringOfNumbers = lines.get(i);
                if(validator.stringArrayValidate(stringOfNumbers)){
                    String[] numberOfArrays = stringOfNumbers.split(REGEX_DELIMM);
                    oneArray = new int[numberOfArrays.length];
                    for (int j = 0; j < numberOfArrays.length; j++) {
                        oneArray[j] = Integer.parseInt(numberOfArrays[j]);
                    }
                    resultList.add(oneArray);
                }
            }
            return resultList;
        } catch (IOException e) {
            throw new CustomException(e);
        }
    }

}