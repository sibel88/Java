package com.sibel.tas.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTwo {
    public static void main(String[] args) {
        printGreatNumber();
    }

    public static void printGreatNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            message("Please enter your first number");
            int num1 = scanner.nextInt();
            message("Please enter6 your second number");
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                message(num1, num2);
            } else {
                message(num2, num1);
            }
        } catch (InputMismatchException e) {
            message("Please enter just number");
        } catch (Exception e) {
            message(e.getMessage());
        }

    }

    public static void message(int max, int min) {
        System.out.println(max + "  greater than " + min);
    }

    public static void message(String msg) {
        System.out.println(msg);
    }

}
