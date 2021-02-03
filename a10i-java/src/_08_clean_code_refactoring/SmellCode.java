package _08_clean_code_refactoring;

import java.util.Scanner;

public class SmellCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input len: ");
        int a = scanner.nextInt();

        int[] b = new int[a];

        System.out.println("Input: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            int d = 0;
            boolean f = false;

            for (int j = 1; j <= b[i]; j++) {
                if (b[i] % j == 0) {
                    d++;
                }
            }

            if (d == 2) {
                f = true;
            }

            if (f) {
                System.out.println(b[i] + " is prime number.");
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
