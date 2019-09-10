package com.sinan.tas;

public class palindromeExample {
    public static void main(String[] args) {

        String[] names = {"asude", "omur", "ensar", "azra", "dad", "mam"};
        String newReversed = "";
        for (int i = 0; i < names.length; i++) {
            String temp = names[i];
            for (int j = temp.length() - 1; j >= 0; j--) {
                newReversed = newReversed + temp.charAt(j);
            }
            if (temp.equals(newReversed)) {
                System.out.println(temp + " Palindrome");
            } else {
                System.out.println(temp + " Is not Palindrome");
            }

            newReversed = "";

        }


    }
}

