package com.epam.task.array.customreader.impl;

import com.epam.task.array.customreader.CustomArrayReaderInterface;
import com.epam.task.array.exceptions.CustomException;
import com.epam.task.array.validator.CustomValidatorInterface;
import com.epam.task.array.validator.impl.CustomValidatorImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayReaderImpl implements CustomArrayReaderInterface {
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
            CustomValidatorInterface validator = new CustomValidatorImpl();
            for (int i = 0; i < lines.size(); i++) {
                String stringOfNumbers = lines.get(i);
                if(validator.stringArrayValidation(stringOfNumbers)){
                    String[] numberOfArrays = stringOfNumbers.split("\\s+");
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