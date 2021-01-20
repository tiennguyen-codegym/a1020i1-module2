package _05_access_modifier_static;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please age: ");
        int age = input.nextInt();
        System.out.println("Please name: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Please email: ");
        String email = input.nextLine();
    }
}
