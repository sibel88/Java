package com.sibel.tas;

import java.util.Scanner;

public class PolindromExample {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String scanner1= scanner.nextLine();*/

        String[] array = {
                "dad",
                "Asude",
                "mam",
                "Sibel"

        };
        String reverse = "";
        for (int i = 0; i < array.length; i++) {
            String name = array[i];
            for (int j = name.length() - 1; j >= 0; j--) {
                reverse = reverse + name.charAt(j);

            }
            if (name.equals(reverse)) {
                System.out.println(name + " is  polindrom");

            } else {
                System.out.println(name + " is  not polindrom");
            }

            reverse = "";

        }


    }
}

