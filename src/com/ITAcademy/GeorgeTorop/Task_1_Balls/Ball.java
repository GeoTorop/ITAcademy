package com.ITAcademy.GeorgeTorop.Task_1_Balls;

public class Ball {
    private String color; // Цвет мяча
    private double weight; // Вес мяча

    public Ball(String color, double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative");
        }
        if ((color == null) || color.isEmpty()) {
            throw new IllegalArgumentException("Ball should have a color");
        }
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
