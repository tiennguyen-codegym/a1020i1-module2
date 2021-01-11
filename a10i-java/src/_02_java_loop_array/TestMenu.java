package _02_java_loop_array;

import java.util.Scanner;

public class TestMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = 0;

        do {

            System.out.println("1. Check prime\n" +
                    "2. Input n -> prime\n" +
                    "3. Exit");
            System.out.println("Please choose:");
            choose = input.nextInt();

            switch(choose) {
                case 1:
                    System.out.println("Check prime");
                    break;
                case 2:
                    System.out.println("Input n -> prime");
                    break;
            }

        } while(choose != 3);
    }
}
