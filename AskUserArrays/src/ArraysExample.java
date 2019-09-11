import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int size = scanner.nextInt();
        String[] array = new String[size];
        String reverse = "";
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter your name");
            Scanner newscanner = new Scanner(System.in);
            array[i] = newscanner.nextLine();

        }
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            for (int j = temp.length() - 1; j >= 0; j--) {
                reverse += temp.charAt(j);

            }

            if (reverse.equals(temp)) {
                System.out.println(temp + "->" + reverse + "->" + " polindrome");
            } else {
                System.out.println(temp + "->" + reverse + "->" + " is not polindrome");
            }
            reverse = "";

        }


    }


}

