package com.epam.xml.entity;

public class GrowingTips {
    private int temperature;
    private boolean lighting;
    private int watering;

    public GrowingTips() {
    }

    public GrowingTips(int temperature, boolean lighting, int watering) {
        this.temperature = temperature;
        this.lighting = lighting;
        this.watering = watering;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isLighting() {
        return lighting;
    }

    public void setLighting(boolean lighting) {
        this.lighting = lighting;
    }

    public int getWatering() {
        return watering;
    }

    public void setWatering(int watering) {
        this.watering = watering;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GrowingTips{");
        sb.append("temperature=").append(temperature);
        sb.append(", lighting=").append(lighting);
        sb.append(", watering=").append(watering);
        sb.append('}');
        return sb.toString();
    }
}
