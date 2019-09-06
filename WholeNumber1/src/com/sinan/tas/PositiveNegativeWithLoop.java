package com.sinan.tas;

import java.util.Scanner;

public class PositiveNegativeWithLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter one number ");
        int numbers= scanner.nextInt();
        while (true){
            if(numbers>0){
                System.out.println("Your number is positive");
            }

            else if(numbers<0){
                System.out.println("Your number is negative");

            }
            else{
                System.err.println("Do you want to continue");
                String ask = scanner.nextLine();
                if(ask.equals("n")){
                    System.out.println("You can not continue");
                    break;
                }
                else if (ask.equals("y")){
                    System.out.println("Please continue");

                }

            }
        }

            }

        }


