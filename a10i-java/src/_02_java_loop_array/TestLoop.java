package _02_java_loop_array;

import java.util.Scanner;

public class TestLoop {

    static boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        int number = 6;
//        int count = 0;

//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//
//        if (count == 2) {
//            System.out.println("a prime number!");
//        } else {
//            System.out.println("not a prime number!");
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please input n: ");
        int n = input.nextInt();

        int count = 0;
        int i = 1;

        while (true) {

            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }

            if (count == n) {
                break;
            }

            i++;
        }

    }
}
