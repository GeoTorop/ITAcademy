package com.epam.xml.builder.impl;

import com.epam.xml.builder.FlowersBuilder;
import com.epam.xml.entity.Flower;
import com.epam.xml.entity.GrowingTips;
import com.epam.xml.entity.VisualParameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FlowerDomBuilder implements FlowersBuilder {
    private static final Logger logger = LogManager.getLogger(FlowerDomBuilder.class);

    private Set<Flower> flowers;
    private DocumentBuilder docBuilder;

    public FlowerDomBuilder() {
        flowers = new HashSet<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            logger.warn(e);
        }
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public void buildSetFlowers(String filename) {
        Document doc;
        try {
            doc = docBuilder.parse(filename);
            Element root = doc.getDocumentElement();
            NodeList flowerList = root.getElementsByTagName("Plant");
            for (int i = 0; i < flowerList.getLength(); i++) {
                Element flowerElement = (Element) flowerList.item(i);
                Flower flower = buildFlower(flowerElement);
                flowers.add(flower);
            }
        } catch (IOException | SAXException e) {
            logger.warn(e);
        }
    }

    private Flower buildFlower(Element flowerElement) {
        Flower flower = new Flower();
        flower.setId(flowerElement.getAttribute("id"));
        flower.setName(getElementTextContent(flowerElement, "Name"));
        flower.setSoil(getElementTextContent(flowerElement, "Soil"));
        flower.setOrigin(getElementTextContent(flowerElement, "Origin"));
        VisualParameters visualParameters = new VisualParameters();
        Element visualParametersElement = (Element) flowerElement.getElementsByTagName("VisualParameters").item(0);
        visualParameters.setStemColor(getElementTextContent(visualParametersElement, "StemColor"));
        visualParameters.setLeafColor(getElementTextContent(visualParametersElement, "LeafColor"));
        visualParameters.setSize(getElementTextContent(visualParametersElement, "Size"));
        flower.setVisualParameters(visualParameters);
        GrowingTips growingTips = new GrowingTips();
        Element growingTipsElement = (Element) flowerElement.getElementsByTagName("GrowingTips").item(0);
        growingTips.setTemperature(Integer.parseInt(getElementTextContent(growingTipsElement, "Temperature")));
        growingTips.setLighting(Boolean.parseBoolean(getElementTextContent(growingTipsElement, "Lighting")));
        growingTips.setWatering(Integer.parseInt(getElementTextContent(growingTipsElement, "Watering")));
        flower.setGrowingTips(growingTips);
        flower.setMultiplying(getElementTextContent(flowerElement, "Multiplying"));
        return flower;
    }

    private static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        Node node = nList.item(0);
        String text = node.getTextContent();
        return text;
    }
}