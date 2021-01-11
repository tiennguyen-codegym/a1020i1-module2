package _02_java_loop_array;

import java.util.Scanner;

public class TestPrint {

    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Please input array: ");
        for (int i = 0; i < a.length; i++) {
//            System.out.println("Please input a[" + i + "]: ");
            System.out.printf("Please input a[%d]:, %s", i, "hello");
            a[i] = input.nextInt();
        }
    }
}
