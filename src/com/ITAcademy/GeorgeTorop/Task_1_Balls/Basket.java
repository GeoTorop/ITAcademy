package com.ITAcademy.GeorgeTorop.Task_1_Balls;

import java.util.*;

public class Basket {
    private List<Ball> balls = new ArrayList<>(); // Список мячей в корзине

    // Метод для добавления мяча в корзину
    public void addBall(Ball ball) {
        balls.add(ball);
    }

    // Метод для вычисления общего веса мячей в корзине
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    // Метод для вычисления количества мячей заданного цвета в корзине
    public int getBallsCountByColor(String color) {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
}
