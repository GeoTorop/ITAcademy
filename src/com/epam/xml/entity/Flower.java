package com.epam.xml.entity;

import java.util.Date;

public class Flower {
    private String id;
    private String name;
    private String soil;
    private String origin;
    private VisualParameters visualParameters;
    private GrowingTips growingTips;
    private String multiplying;
    private Date dateOfAdmission;

    public Flower() {
    }

    public Flower(String id, String name, String soil, String origin, VisualParameters visualParameters,
                  GrowingTips growingTips, String multiplying, Date dateOfAdmission) {
        this.id = id;
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.visualParameters = visualParameters;
        this.growingTips = growingTips;
        this.multiplying = multiplying;
        this.dateOfAdmission = dateOfAdmission;
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

    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    public void setVisualParameters(VisualParameters visualParameters) {
        this.visualParameters = visualParameters;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flower{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", soil='").append(soil).append('\'');
        sb.append(", origin='").append(origin).append('\'');
        sb.append(", visualParameters=").append(visualParameters);
        sb.append(", growingTips=").append(growingTips);
        sb.append(", multiplying='").append(multiplying).append('\'');
        sb.append(", dateOfAdmission=").append(dateOfAdmission);
        sb.append('}');
        return sb.toString();
    }
}