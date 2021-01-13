package _03_java_method;

public class TestRecursion {

    static void print1To10(int number) {
        System.out.println(number);

        if(number == 10) {
            return;
        }

        number++;
        print1To10(number);
    }

    public static void main(String[] args) {
        print1To10(1);
    }
}
