package _02_java_loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        // do dai cua mang
        int[] a = new int[5];
//        int d[] = new int[6];
//        String[] e = new String[7];

        // gan truoc cac phan tu
//        int[] b = {1, 2, 3, 4};
//        int[] c = new int[]{1, 2, 3, 4};

        Scanner input = new Scanner(System.in);
        System.out.println("Please input array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Output array: ");
        System.out.println(a);
        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
    }
}
