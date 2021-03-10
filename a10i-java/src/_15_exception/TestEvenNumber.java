package _15_exception;

import java.util.Scanner;

public class TestEvenNumber {

    public static boolean checkEvenNum(int num) throws CheckEvenNumberException {

        if (num % 2 != 0) {
            throw new CheckEvenNumberException();
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number: ");
        int number = scanner.nextInt();

        try {
            if (checkEvenNum(number)) {
                System.out.println("So nay la so chan");
            } else {
                System.out.println("So nay la so le");
            }
        } catch (CheckEvenNumberException e) {
            e.printStackTrace();
        }

    }
}
