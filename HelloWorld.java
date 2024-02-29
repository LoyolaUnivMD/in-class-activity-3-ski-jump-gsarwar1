# Programmers:Gabe.S
# Course:  CS 212 
# Due Date: 
# Lab Assignment: in class assignment 
# Problem Statement:  
# Data In:
# Data Out:  
# Credits: 

import java.util.Scanner;

public class SkiJumpCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input hill type (normal or large)
        System.out.print("Enter hill type (normal or large): ");
        String hillType = scanner.nextLine().toLowerCase();

        // Input jumper's speed at the end of the ramp
        System.out.print("Enter jumper's speed (m/s): ");
        double speed = scanner.nextDouble();

        // Constants for hill types
        int height;
        double pointsPerMeter;
        int parDistance;
        if (hillType.equals("normal")) {
            height = 46;
            pointsPerMeter = 2;
            parDistance = 90;
        } else if (hillType.equals("large")) {
            height = 70;
            pointsPerMeter = 1.8;
            parDistance = 120;
        } else {
            System.out.println("Invalid hill type!");
            return;
        }

        // Calculate time in air
        double timeInAir = Math.sqrt((2 * height) / 9.8);
        
        // Calculate distance traveled
        double distance = speed * timeInAir;

        // Calculate points earned
        double points = 60 + (distance - parDistance) * pointsPerMeter;

        // Output distance and points
        System.out.printf("Distance traveled: %.2f meters\n", distance);
        System.out.printf("Points earned: %.2f\n", points);

        // Determine feedback based on points
        if (points >= 61) {
            System.out.println("Great job for doing better than par!");
        } else if (points < 10) {
            System.out.println("What happened??");
        } else {
            System.out.println("Sorry you didn’t go very far");
        }
    }
}
