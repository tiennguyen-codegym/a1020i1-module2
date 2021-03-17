package _20_solid._02_open_closed;

public class StudentIViettech extends Student {

    public StudentIViettech(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    void study() {
        System.out.println(this.getName() + " dang hoc theo cach cua trung tam IViettech");
    }
}
