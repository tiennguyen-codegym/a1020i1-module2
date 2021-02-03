package _08_clean_code_refactoring;

import java.util.Scanner;

public class CleanCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input len: ");
        int lenArray = scanner.nextInt();

        int[] arrayInt = new int[lenArray];

        System.out.println("Input: ");
        inputArray(scanner, arrayInt);

        for (int i = 0; i < arrayInt.length; i++) {
            boolean flagCheckPrimeNumber = isPrimeNumber(arrayInt, i);

            if (flagCheckPrimeNumber) {
                System.out.println(arrayInt[i] + " is prime number.");
            }
        }

        System.out.println("Output: ");
        outputArray(arrayInt);

    }

    private static boolean isPrimeNumber(int[] arrayInt, int i) {
        int count = 0;
        boolean flagCheckPrimeNumber = false;

        for (int j = 1; j <= arrayInt[i]; j++) {
            if (arrayInt[i] % j == 0) {
                count++;
            }
        }

        if (count == 2) {
            flagCheckPrimeNumber = true;
        }
        return flagCheckPrimeNumber;
    }

    private static void outputArray(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }

    private static void inputArray(Scanner scanner, int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scanner.nextInt();
        }
    }
}
