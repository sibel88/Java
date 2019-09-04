package com.sibel.tas;

import java.util.Scanner;

public class MidtermFinalGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your final grade");
        double midterm = scanner.nextInt();
        System.out.println("Please enter your midterm grade");
        double finalgrade = scanner.nextInt();

        if (finalgrade > 45) {
            System.out.println("you are pass");
        } else if (finalgrade * 0.6 + midterm * 0.4 > 50) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are not pass");
        }

    }
}
