package _20_solid._03_liskov_substitution.before;

public class StudentAbc extends Student {

    public StudentAbc(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }

    @Override
    public boolean readBeforeJoinTheory() {
        System.out.println("KHONG them doc bai truoc khi tham gia hoc ly thuyet ");
        return false;
    }
}
