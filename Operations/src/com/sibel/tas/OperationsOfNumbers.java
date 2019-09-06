package com.sibel.tas;

import java.util.Scanner;

public class OperationsOfNumbers {
    public static void main(String[] args) {
        System.out.println("please enter your operations");
        Scanner scanner1 = new Scanner(System.in);
        String operator = scanner1.nextLine();
        String val = "";
        int store1 = 0;
        int store2 = 1;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your number ");
                val = scanner.nextLine();
                int number = Integer.parseInt(val);
                if (operator.equals("+")) {
                    store1 = store1 + number;
                } else if (operator.equals("-")) {
                    store1 = store1 - number;
                } else if (operator.equals("*")) {
                    store2 = store2 * number;
                } else if (operator.equals("/")) {
                    store2 = store2 / number;
                } else {
                    System.out.println();
                }
            } catch (Exception e) {
                if (val.equals("q")) {
                    if (operator.equals("+") || operator.equals("-")) {
                        System.out.println("Result : " + store1);
                    } else {
                        System.out.println("Result : " + store2);
                    }
                    break;
                } else {
                    System.out.println("Invalid charecter");
                }
            }
        }


    }

    public static void addNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void dividedNumber(double num3, double num4) {
        System.out.println(num3 / num4);
    }

    public static void multipleNumber(int num5, int num6) {
        System.out.println(num5 * num6);
    }

    public static void subrtions(int num7, int num8) {
        System.out.println(num7 - num8);
    }
}
