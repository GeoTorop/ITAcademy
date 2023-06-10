package com.epam.xml.builder;

public enum FlowerXmlTag {
    FLOWERS("Flowers"),
    PLANT("Plant"), //do I need to have PLANT here?
    ID("id"),
    NAME("Name"),
    SOIL("Soil"),
    ORIGIN("Origin"),
    VISUAL_PARAMETERS("VisualParameters"),
    STEM_COLOR("StemColor"),
    LEAF_COLOR("LeafColor"),
    SIZE("Size"),
    GROWING_TIPS("GrowingTips"),
    TEMPERATURE("Temperature"),
    LIGHTING("Lighting"),
    WATERING("Watering"),
    MULTIPLYING("Multiplying"),
    DATE_OF_ADMISSION("DateOfAdmission");

    private final String tagName;

    FlowerXmlTag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}
