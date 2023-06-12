package com.epam.xml.builder.impl;

import com.epam.xml.builder.FlowersBuilder;
import com.epam.xml.entity.Flower;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FlowerSaxBuilder extends DefaultHandler implements FlowersBuilder {
    private Set<Flower> flowers;
    private StringBuilder data;
    private Flower currentFlower;

    public FlowerSaxBuilder() {
        flowers = new HashSet<>();
        data = new StringBuilder();
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public void buildSetFlowers(String filename) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(filename, this);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("Plant".equalsIgnoreCase(qName)) {
            currentFlower = new Flower();
            currentFlower.setId(attributes.getValue("id"));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = data.toString().trim();
        switch (qName.toLowerCase()) {
            case "name":
                currentFlower.setName(value);
                break;
            case "soil":
                currentFlower.setSoil(value);
                break;
            case "origin":
                currentFlower.setOrigin(value);
                break;
            case "stemcolor":
                currentFlower.getVisualParameters().setStemColor(value);
                break;
            case "leafcolor":
                currentFlower.getVisualParameters().setLeafColor(value);
                break;
            case "size":
                currentFlower.getVisualParameters().setSize(value);
                break;
            case "temperature":
                currentFlower.getGrowingTips().setTemperature(Integer.parseInt(value));
                break;
            case "lighting":
                currentFlower.getGrowingTips().setLighting(Boolean.parseBoolean(value));
                break;
            case "watering":
                currentFlower.getGrowingTips().setWatering(Integer.parseInt(value));
                break;
            case "multiplying":
                currentFlower.setMultiplying(value);
                break;
            case "plant":
                flowers.add(currentFlower);
                break;
        }
        data.setLength(0);
    }
}