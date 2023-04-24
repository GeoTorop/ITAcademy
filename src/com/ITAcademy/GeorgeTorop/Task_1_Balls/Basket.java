package com.ITAcademy.GeorgeTorop.Task_1_Balls;

import java.util.*;

public class Basket {
    private List<Ball> balls = new ArrayList<>(); // Number of the balls

    // Method for adding ball into the basket
    public void addBall(Ball ball) {
        balls.add(ball);
    }

    // Method for calc. total weight of the balls
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    // Method for calc. number of balls of a given color in the basket
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
