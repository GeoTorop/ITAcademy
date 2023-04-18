/*
 * George Torop
 * Task_1_Balls
 */
package com.ITAcademy.GeorgeTorop.Task_1_Balls;

import java.util.*;

public class  task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Making balls. Enter the number of balls:");
        int ballsCount = scanner.nextInt();
        scanner.nextLine();

        Basket basket = new Basket();
        for (int i = 0; i < ballsCount; i++) {
            System.out.println("Ball #" + (i + 1));
            System.out.print("Enter the color of the ball: ");
            String color = scanner.nextLine();

            System.out.print("Enter the weight of the ball: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            Ball ball = new Ball(color, weight);
            basket.addBall(ball);
        }

        System.out.println("Overhaul weight of the balls in the basket: " + basket.getTotalWeight());

        System.out.print("Enter the color of the ball: ");
        String color = scanner.nextLine();

        int ballsCountByColor = basket.getBallsCountByColor(color);
        System.out.println("Number of balls color " + color + " in the basket: " + ballsCountByColor);

        scanner.close();
    }
}
