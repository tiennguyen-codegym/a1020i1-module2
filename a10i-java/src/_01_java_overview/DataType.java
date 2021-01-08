package _01_java_overview;

public class DataType {

    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        float b = (float) 3.14;
        float c = 3.14f;
        System.out.println("b = " + b + " c = " + c);
        double d = 5.5;
        System.out.println("d = " + d);

        char symbol = 'e';
        System.out.println(symbol);

        // object
        String str = "Hello";
        System.out.println(str);

        HelloWorld helloWorld = new HelloWorld();

        final double PI = 3.14;
    }
}
