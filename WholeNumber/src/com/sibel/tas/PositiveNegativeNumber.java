package com.sibel.tas;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number zero");
        }
    }
}
