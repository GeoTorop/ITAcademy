package com.epam.xml.handler;

import com.epam.xml.builder.FlowerXmlTag;
import com.epam.xml.entity.Flower;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class FlowerHandler extends DefaultHandler {
    private Set<Flower> flowers;
    private Flower current;
    private FlowerXmlTag currentXmlTag;
    private EnumSet<FlowerXmlTag> withText;
    private static final String ELEMENT_FLOWER = "flower";

    public FlowerHandler() {
        flowers = new HashSet<>();
        withText = EnumSet.range(FlowerXmlTag.NAME, FlowerXmlTag.MULTIPLYING);
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if (ELEMENT_FLOWER.equals(qName)) {
            current = new Flower();
            current.setId(attrs.getValue("id"));
        } else {
            FlowerXmlTag temp = FlowerXmlTag.valueOf(qName.toUpperCase());
            if (withText.contains(temp)) {
                currentXmlTag = temp;
            }
        }
    }

    public void endElement(String uri, String localName, String qName) {
        if (ELEMENT_FLOWER.equals(qName)) {
            flowers.add(current);
        }
    }

    public void characters(char[] ch, int start, int length) {
        String data = new String(ch, start, length).strip();
        if (currentXmlTag != null) {
            switch (currentXmlTag) {
                case NAME -> current.setName(data);
                case SOIL -> current.setSoil(data);
                case ORIGIN -> current.setOrigin(data);
                case STEM_COLOR -> current.getVisualParameters().setStemColor(data);
                case LEAF_COLOR -> current.getVisualParameters().setLeafColor(data);
                case SIZE -> current.getVisualParameters().setSize(data);
                case TEMPERATURE -> current.getGrowingTips().setTemperature(Integer.parseInt(data));
                case LIGHTING -> current.getGrowingTips().setLighting(Boolean.parseBoolean(data));
                case WATERING -> current.getGrowingTips().setWatering(Integer.parseInt(data));
                case MULTIPLYING -> current.setMultiplying(data);
                default -> throw new EnumConstantNotPresentException(
                        currentXmlTag.getDeclaringClass(), currentXmlTag.name());
            }
        }
        currentXmlTag = null;
    }
}