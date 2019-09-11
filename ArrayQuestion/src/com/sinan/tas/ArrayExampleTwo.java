package com.sinan.tas;

import java.util.Scanner;

public class ArrayExampleTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter space");
        int size = scanner.nextInt();
        String[] arry = new String[size];
        String reversed = "";
        for (int i = 0; i < arry.length; i++) {
            System.out.println("Please enter your record");
            Scanner scanner1 = new Scanner(System.in);
            arry[i] = scanner1.nextLine();
        }
        for (int i = 0; i < arry.length; i++) {
            String temp = arry[i];
            for (int j = temp.length() - 1; j >= 0; j--) {
                reversed = reversed + temp.charAt(j);
            }
            if (temp.equals(reversed)) {
                System.out.println(temp + " ->" + reversed + "Polindrome");
            } else {
                System.out.println(temp + " ->" + reversed + "Is not Palindrome");
            }
            reversed = "";

        }


    }
}
