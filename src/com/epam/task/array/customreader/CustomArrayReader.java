package com.epam.task.array.customreader;

import com.epam.task.array.exceptions.CustomException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayReader {
    private static Logger LOGGER = LogManager.getLogger();

    public Optional<String> read(String filename) throws CustomException {
        Optional<String> data = Optional.empty();
        Path path = Paths.get(filename);
        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            Stream<String> fileStream = null;
            try {
                fileStream = Files.lines(path);
                data = fileStream.reduce((s1, s2) -> s1 + " " + s2);
            } catch (IOException e) {
                throw new CustomException("Failed to read file!", e);
            } finally {
                if (fileStream != null) {
                    fileStream.close();
                }
            }
        } else {
            LOGGER.error("Invalid path!" + filename);
        }
        return data;
    }
}