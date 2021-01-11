package _02_java_loop_array;

public class TestForEach {

    public static void main(String[] args) {
//        int[] a = {4, 5, 6, 7};
//
//        for (int number : a) {
//            System.out.println(number);
//        }
//
//        for (int i = a.length - 1; i >= 0; i--) {
//
//        }

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int[] arrayOne : a) {
            for (int number : arrayOne) {
                System.out.println(number);
            }
        }
    }
}
