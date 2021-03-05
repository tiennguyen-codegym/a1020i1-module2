package _13_searching_algorithm;

import java.util.Arrays;

public class SearchingAlogrithm {

    public static int binarySearch(int[] a, int numberNeedFind) {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while (low <= high) {

            mid = (low + high) / 2;

            if (a[mid] == numberNeedFind) {
                return mid;
            } else if (numberNeedFind < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int sequenceSearching(int[] a, int numberNeedFind) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == numberNeedFind) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 23, 12, 7, 32, 19};
        int number = 32;

//        System.out.println(sequenceSearching(a, number));

        Arrays.sort(a);

        System.out.println("After sort: " + Arrays.toString(a));
        System.out.println(binarySearch(a, number));

    }
}
