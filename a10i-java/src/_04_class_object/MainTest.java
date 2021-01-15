package _04_class_object;

public class MainTest {

    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println(student.name);

        Student student2 =
                new Student(2, "Nguyen Van B", "14-01-2021");

//        student2.study("Java");
//        System.out.println(student2.exam("JavaScript"));
        student2.setName("B Van Nguyen");

        // su dung toString() de in ra toan bo thuoc tinh
        System.out.println(student2.toString());
        System.out.println(student2.hashCode());

        // cach so sanh String
//        String str = new String("abc");
//        System.out.println(str.equals("abc"));

    }
}
