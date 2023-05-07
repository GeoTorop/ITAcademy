package com.epam.tasks.task.array.reader;

import com.epam.tasks.task.array.entity.CustomArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayReader {
    private final String filePath;

    public CustomArrayReader(String filePath) {
        this.filePath = filePath;
    }

    public int[] readArray() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line == null) {
                throw new IOException("File is empty");
            }
            String[] parts = line.split(" ");
            int[] array = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                try {
                    array[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    throw new IOException("Invalid data in file");
                }
            }
            return array;
        }
    }
}
