package _14_sorting_algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 9, 1, 3, 2, 6, 7};

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
