package _20_solid._02_open_closed;

import java.util.ArrayList;
import java.util.List;

public class TestInheritance {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nguyen Van A", "07/08/2020"));
        studentList.add(new StudentIViettech(2, "Le Van B", "18/11/2020"));
        studentList.add(new StudentCodegym(3, "Tran Van C", "18/11/2020", "tranvanc@gmail.com"));

        for (Student student : studentList) {
            student.study();
        }
    }
}
