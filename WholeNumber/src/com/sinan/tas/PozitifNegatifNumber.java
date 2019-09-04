package com.sinan.tas;

import java.util.Scanner;

public class PozitifNegatifNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one number from keyboard ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Your number pozitif");
        } else if (number < 0) {
            System.out.println("Your number negatif");
        } else {
            System.out.println("Your number zero");
        }
    }
}
