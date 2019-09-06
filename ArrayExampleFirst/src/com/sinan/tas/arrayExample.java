package com.sinan.tas;

import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter record size ");
        int size = scanner.nextInt();
        String[] list = new String[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Please enter name ");
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.nextLine();
            list[i] = name;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }

    }
}

