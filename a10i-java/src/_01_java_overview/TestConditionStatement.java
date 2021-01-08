package _01_java_overview;

import java.util.Scanner;

public class TestConditionStatement {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please input grade: ");
//        double grade = input.nextDouble();
//
//        if (grade >= 75) {
//            System.out.println("PASSED");
//        } else {
//            System.out.println("FAILED");
//        }

        int number = 2;

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }
    }
}
