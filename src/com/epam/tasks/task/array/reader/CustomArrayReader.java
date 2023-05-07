package com.epam.tasks.task.array.reader;

import com.epam.tasks.task.array.entity.CustomArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayReader {
    public static CustomArray readArrayFromFile(String filePath) {
        List<Integer> array = new ArrayList<>();
        BufferedReader reader = null;

        try {
            File file = new File(filePath);
            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    int num = Integer.parseInt(line);
                    array.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Error reading data: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int[] arr = new int[array.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array.get(i);
        }

        return new CustomArray(arr);
    }
}
