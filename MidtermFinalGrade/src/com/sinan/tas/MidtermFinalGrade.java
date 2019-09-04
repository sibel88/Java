package com.sinan.tas;

import java.util.Scanner;

public class MidtermFinalGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your final grade");
        double finalGrade = scanner.nextInt();
        System.out.println("Please enter your midterm grade");
        double midterm = scanner.nextInt();
        if (finalGrade < 45) {
            System.out.println("Your are  not pass");
        } else if (finalGrade * 0.6 + midterm * 0.4 > 50) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }

    }
}
