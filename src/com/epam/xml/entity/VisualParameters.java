package com.epam.xml.entity;

public class VisualParameters {
    private String stemColor;
    private String leafColor;
    private String size;

    public VisualParameters() {
    }

    public VisualParameters(String stemColor, String leafColor, String size) {
        this.stemColor = stemColor;
        this.leafColor = leafColor;
        this.size = size;
    }

    public String getStemColor() {
        return stemColor;
    }

    public void setStemColor(String stemColor) {
        this.stemColor = stemColor;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VisualParameters{");
        sb.append("stemColor='").append(stemColor).append('\'');
        sb.append(", leafColor='").append(leafColor).append('\'');
        sb.append(", size='").append(size).append('\'');
        sb.append('}');
        return sb.toString();
    }
}