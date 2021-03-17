package _20_solid._05_dependency_inversion.before;

public class CheckLaptopOfStudent {

    public static void main(String[] args) {
        Student student =
                new Student(1, "Nguyen Van A", "18-11-2020", new LaptopAsus());
        student.getLaptopAsus().startOS();
        student.getLaptopAsus().startApp();

    }
}
