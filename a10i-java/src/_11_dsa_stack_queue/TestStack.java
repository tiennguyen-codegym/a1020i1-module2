package _11_dsa_stack_queue;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Van");
        stringStack.push("Anh");
        stringStack.push("Java");
        stringStack.push("Truyen");

        System.out.println("Before 2: ");
        System.out.println(stringStack.peek());

        System.out.println("Before 1: ");
        System.out.println(stringStack.pop());

        System.out.println("Result: ");
        System.out.println(stringStack);
    }
}
