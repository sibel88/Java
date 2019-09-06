package com.sinan.tas;

import java.util.Scanner;

public class operatiosOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your operation");
        String operator = scanner.nextLine();
        String val = "";
        int operations1 = 0;
        int operatios2 = 1;
        while (true) {
            try {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter numbers");
                val = scanner1.nextLine();
                int number = Integer.parseInt(val);
                if (operator.equals("+")) {
                    operations1 = operations1 + number;
                } else if (operator.equals("-")) {
                    operations1 = operations1 - number;
                } else if (operator.equals("*")) {
                    operatios2 = operatios2 + number;
                } else if (operator.equals("/")) {
                    operatios2 = operatios2 / number;
                } else {
                    System.out.println();
                }
            } catch (Exception e) {
                if (val.equals("q")) {
                    if (operator.equals("+") || operator.equals("-")) {
                        System.out.println("Result" + operations1);
                    } else {
                        System.out.println("Result" + operatios2);
                    }
                    break;
                } else {
                    System.out.println("Invalid character");
                }
            }

        }
    }


}
