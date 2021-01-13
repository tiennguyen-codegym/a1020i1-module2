package _03_java_method;

import java.util.Arrays;

public class TestPassBy {

    static void changeValue(int a) {
        a = 100;
    }


    public static void main(String[] args) {
//        int number = 7;
//
//        changeValue(number);
//
//        System.out.println(number);

//        int[] b = {7};
//        System.out.println("Before " + b);
//        changeValuePassByReference(b);
//        System.out.println("After " + b);
//        System.out.println(b[0]);


    }

    static void changeValuePassByReference(int[] a) {
        a[0] = 100;
    }
}
