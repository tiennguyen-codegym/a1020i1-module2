package _15_exception;

public class TestError {

    public static void callMain() {
        main(new String[2]);
    }

    public static void main(String[] args) {
        callMain();
    }
}
