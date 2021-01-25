package _06_inheritance;

public class MainStudent {

    public static void main(String[] args) {
//        Student student =
//                new Student(1, "Nguyen Van A", "25/01/2021");
//        student.study();
//
//        StudentCodeGym studentCodeGym = new StudentCodeGym(2, "Nguyen Van B",
//                "26/01/2021", "bvannguyen");
//        studentCodeGym.study();
//        System.out.println(studentCodeGym.getId());
//
//        studentCodeGym.testQuiz("Java - OOP");
//        studentCodeGym.testQuiz(1234);

        // Ep kieu ngam dinh (Implicit Casting)
        // Cha cha = new Con()
        Student student =
                new Student(1, "Nguyen Van C", "25/01/2021");
        Student student2 = new StudentCodeGym(2, "Nguyen Van D",
                "26/01/2021", "bvannguyen");

        // Ep kieu tuong minh (Explicit Casting)
        StudentCodeGym studentCodeGym2 = ((StudentCodeGym) student2);
        studentCodeGym2.study();
        studentCodeGym2.testQuiz();

        ((StudentCodeGym) student2).testQuiz();
        ((StudentCodeGym) student2).study();
    }

}
