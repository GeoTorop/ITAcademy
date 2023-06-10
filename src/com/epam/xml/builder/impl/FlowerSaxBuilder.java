package com.epam.xml.builder.impl;

import com.epam.xml.entity.Flower;
import com.epam.xml.handler.FlowerHandler;
import com.epam.xml.validator.FlowerErrorHandler;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Set;

public class FlowerSaxBuilder {
    static Logger LOGGER = LogManager.getLogger();
    private Set<Flower> flowers;
    private FlowerHandler handler = new FlowerHandler();
    private XMLReader reader;

    public FlowerSaxBuilder() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            reader = saxParser.getXMLReader();
        } catch (ParserConfigurationException | SAXException e) {
            LOGGER.warn(e);
            reader.setErrorHandler(new FlowerErrorHandler());
            reader.setContentHandler(handler);
        }
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public void buildSetFlowers(String filename) {
        try {
            reader.parse(filename);
        } catch (IOException | SAXException e) {
            LOGGER.warn(e);
        }
        flowers = handler.getFlowers();
    }
}