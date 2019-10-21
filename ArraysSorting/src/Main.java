import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String lastname = scn.nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        User user = new User();
        user.setName(name);
        System.out.println(user.getName());
        user.setLastname(lastname);
        System.out.println(user.getLastname());
        user.setAge(age);
        System.out.println(user.getAge());

    }
}
