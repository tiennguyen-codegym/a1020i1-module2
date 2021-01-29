package _07_abstract_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainAbstractInterface {

    public static void main(String[] args) {

//        Student studentCodeGym1 =
//                new StudentCodeGym(1, "Nguyen Van A",
//                        "29/01/2021", "a.nguyen");
//
//        StudentCodeGym studentCodeGym2 =
//                new StudentCodeGym(2, "Nguyen Van B",
//                        "29/01/2021", "b.nguyen");

//        Student student = new Student(3, "Nguyen Van C", "29/01/2021");

//        studentCodeGym2.updateKenDaily();
//        studentCodeGym2.tickJames();
//        System.out.println("So cot trong Ken " + studentCodeGym2.NUMBER_OF_COLUMN);

        // Comparable, Comparator
        StudentCodeGym studentCodeGym1 =
                new StudentCodeGym(42, "Nguyen Van A",
                        "29/01/2021", "a.nguyen");

        StudentCodeGym studentCodeGym2 =
                new StudentCodeGym(8, "Nguyen Van B",
                        "29/01/2021", "b.nguyen");

        StudentCodeGym studentCodeGym3 =
                new StudentCodeGym(789, "Nguyen Van C",
                        "29/01/2021", "c.nguyen");

        StudentCodeGym studentCodeGym4 =
                new StudentCodeGym(8, "Nguyen Van D",
                        "29/01/2021", "c.nguyen");

        List<StudentCodeGym> studentCodeGymList = new ArrayList<>();
        studentCodeGymList.add(studentCodeGym3);
        studentCodeGymList.add(studentCodeGym1);
        studentCodeGymList.add(studentCodeGym2);
        studentCodeGymList.add(studentCodeGym4);

        Collections.sort(studentCodeGymList, new Comparator<StudentCodeGym>() {
            @Override
            public int compare(StudentCodeGym o1, StudentCodeGym o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (StudentCodeGym studentCodeGym : studentCodeGymList) {
            System.out.println(studentCodeGym);
        }


    }
}
