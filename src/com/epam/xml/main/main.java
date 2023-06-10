package com.epam.xml.main;

import com.epam.xml.builder.impl.FlowerDomBuilder;
import com.epam.xml.builder.impl.FlowerSaxBuilder;
import com.epam.xml.validator.FlowerValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {
    private static final Logger LOGGER = LogManager.getLogger(main.class);
    private static final String PATH = "data_xml/flowers.xml";

    public static void main(String[] args) {
        FlowerValidator flowerValidator = new FlowerValidator();
        flowerValidator.validate();

        FlowerDomBuilder domBuilder = new FlowerDomBuilder();
        domBuilder.buildSetFlowers(PATH);
        FlowerSaxBuilder saxBuilder = new FlowerSaxBuilder();
        saxBuilder.buildSetFlowers(PATH);

        LOGGER.info("Info about: {}", domBuilder.getFlowers());
        LOGGER.info("Info about: {}", saxBuilder.getFlowers());
    }
}
