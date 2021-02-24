package _11_dsa_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();

        stringQueue.offer("Thuan");
        stringQueue.offer("Thang");
        stringQueue.offer("Ngoc");

        System.out.println("Before 2: ");
        System.out.println(stringQueue.poll());

        System.out.println("Before 1: ");
        System.out.println(stringQueue.peek());

        System.out.println("Result: ");
        System.out.println(stringQueue);

        // Deque
        Deque<String> stringDeque = new ArrayDeque<>();
    }
}
