package com.sibel.tas;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String scanner1 = scanner.nextLine();
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            Scanner scanner2 = new Scanner(System.in);
            String name = scanner.nextLine();
            array[i] = name;

        }
    }
}
