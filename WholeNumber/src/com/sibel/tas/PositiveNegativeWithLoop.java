package com.sibel.tas;

import java.util.Scanner;

public class PositiveNegativeWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your numbers");
        int numbers = scanner.nextInt();

        for (int i = 0; i < numbers; i++) {
            if (numbers > 0) {
                System.out.println("your number is positive");
            } else if (numbers < 0) {
                System.out.println("your number is negative");
            }

        }

    }


}
