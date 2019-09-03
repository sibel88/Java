package com.sibel.tas.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first number");
            int num = scanner.nextInt();
            System.out.println("Please enter your second number");
            int num2 = scanner.nextInt();

            if (num > num2) {
                System.out.println(num + " grather than " + num2);
            } else {
                System.out.println(num2 + " grather than " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Plase enter just number ! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

