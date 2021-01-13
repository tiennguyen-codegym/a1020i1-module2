package _03_java_method;

import java.util.Arrays;

public class TestArrayCopy {

    public static void main(String[] args) {

        int[] a = {1, 2, 8, 9, 6};
        int[] b = Arrays.copyOf(a, a.length + 1);
        System.out.println(Arrays.toString(b));
    }
}
