package _01_java_overview;

import java.util.Scanner;

public class TestInputOutput {

    public static void main(String[] args) {
        System.out.println("Please input number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please input string: ");
        String b = scanner.nextLine();
        System.out.print("Output 1: " + a);
        System.out.println("Output 2: " + b);
    }
}
