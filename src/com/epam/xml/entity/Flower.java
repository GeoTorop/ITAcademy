package com.epam.xml.entity;

import java.util.StringJoiner;

public class Flower {
    private String id;
    private String name;
    private String soil;
    private String origin;
    private String visualParameters;
    private String growingTips;
    private String multiplying;

    public Flower(String id, String name, String soil, String origin, String visualParameters, String growingTips, String multiplying) {
        this.id = id;
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.visualParameters = visualParameters;
        this.growingTips = growingTips;
        this.multiplying = multiplying;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoil() {
        return soil;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getVisualParameters() {
        return visualParameters;
    }

    public void setVisualParameters(String visualParameters) {
        this.visualParameters = visualParameters;
    }

    public String getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(String growingTips) {
        this.growingTips = growingTips;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flower.class.getSimpleName() + "[", "]")
                .add("Id: '" + id + "'")
                .add("Name: '" + name + "'")
                .add("Soil: '" + soil + "'")
                .add("Origin: '" + origin + "'")
                .add("Visual Parameters: '" + visualParameters + "'")
                .add("Growing Tips: '" + growingTips + "'")
                .add("Multiplying: '" + multiplying + "'")
                .toString();
    }
}
