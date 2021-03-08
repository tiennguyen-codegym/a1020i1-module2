package _14_sorting_algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {5, 9, 1, 3, 2, 6, 7};

        for (int i = 0; i < a.length - 1; i++) {
            int iMin = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[iMin]) {
                    iMin = j;
                }
            }

            // swap a[j], a[iMin]
            if (iMin != i) {
                int tmp = a[i];
                a[i] = a[iMin];
                a[iMin] = tmp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
