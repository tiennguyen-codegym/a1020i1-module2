package _11_dsa_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
//        studentList.add("hello world");
//        studentList.add(78);
        studentList.add(new Student());
    }
}
