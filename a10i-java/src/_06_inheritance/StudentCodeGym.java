package _06_inheritance;

public class StudentCodeGym extends Student {

    private String accountJames;

    public StudentCodeGym(int id, String name, String dateOfBirth, String accountJames) {
        super(id, name, dateOfBirth);
        this.accountJames = accountJames;
    }

    public String getAccountJames() {
        return accountJames;
    }

    public void setAccountJames(String accountJames) {
        this.accountJames = accountJames;
    }

    public void testQuiz() {
        System.out.println("Thi test quiz o hoclaptrinhonline.asia");
    }

    public void testQuiz(String subject) {
        System.out.println("Thi test quiz o bai hoc " + subject);
    }

    public void testQuiz(int subjectId) {
        System.out.println("Thi test quiz o bai hoc co id la " + subjectId);
    }

    @Override
    public void study() {
        System.out.println(this.name + " hoc theo mo hinh bootcamp, hoc web online...");
    }

}
