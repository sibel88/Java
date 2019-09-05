package com.sibel.tas;

import java.util.Scanner;

public class PositiveNegativeNumber {
    /*
     * Kullanıcıdan değer alınacak
     *  Değerin negetif ya da pozitif olduğunu hesaplayacak
     *
     * Hesaplama sonrasında Did you want cotinue? y
     * h-> programın kaç kere çalıştığını yazsın, kaç tane pozitif, kaç tane, kaç tane sıfır
     *
     * */
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your number");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Your number is positive");
            } else if (number < 0) {
                System.out.println("Your number is negative");
            }

            System.out.println("Do you want to continue");
            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();
            if (answer.equals("n")) {
                System.out.println("you can not continue");
                break;
            } else if (!answer.equals("y")) {
                System.out.println("Fatal error");
                break;

            }


        }

    }
}
