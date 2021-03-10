package _15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUncheckedException {

    public static void main(String[] args) {

//        Student student = null;
//        System.out.println(student.name);

//        int[] a = new int[10];
//        System.out.println(a[12]);

        Scanner input = new Scanner(System.in);

        int result = 0;

        try {
            System.out.println("Please input number a: ");
            int a = input.nextInt();
            System.out.println("Please input number b: ");
            int b = input.nextInt();

            result = a/b;
        } catch (InputMismatchException e) {
            System.err.println("Loi nay da duoc xu ly!!!");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Result: " + result);
        System.out.println("End program.");
    }
}
