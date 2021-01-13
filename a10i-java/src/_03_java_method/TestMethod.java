package _03_java_method;

public class TestMethod {

    static int sum (int a, int b) {
        return a + b;
    }

    static void sumNoReturn (int a, int b) {
        System.out.println(a + b);
    }

    static int sum3 (int a, String b) {
        return a + Integer.parseInt(b);
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 4;
//        System.out.println(sum(m, n));

//        sumNoReturn(m, n);
        System.out.println(sum3(5, "7"));
    }
}
