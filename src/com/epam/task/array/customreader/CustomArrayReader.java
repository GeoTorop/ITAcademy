package com.epam.task.array.customreader;

import com.epam.task.array.exceptions.CustomException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayReader {
    private static Logger LOGGER = LogManager.getLogger();

    public String read(String filename) throws CustomException {
        String data = null;
        Path path = Paths.get(filename);
        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            Stream<String> fileStream = null;
            try {
                fileStream = Files.lines(path);
                data = fileStream.reduce((s1, s2) -> s1 + " " + s2).orElse("empty");
            } catch (IOException e) {
                throw new CustomException("Failed to read file!", e);
            } finally {
                if (fileStream != null) {
                    fileStream.close();
                }
            }
        } else {
            LOGGER.info("Invalid path!");
        }
        return data;
    }
}