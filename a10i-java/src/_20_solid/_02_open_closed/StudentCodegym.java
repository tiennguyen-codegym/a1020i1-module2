package _20_solid._02_open_closed;

// subclass
public class StudentCodegym extends Student {
    private String accountJames;

    public StudentCodegym(int id, String name, String dateOfBirth, String accountJames) {
        super(id, name, dateOfBirth);
        this.accountJames = accountJames;
    }

    public String getAccountJames() {
        return accountJames;
    }

    public void setAccountJames(String accountJames) {
        this.accountJames = accountJames;
    }

    @Override
    public void study() {
        System.out.println(this.getName() + " hoc theo mo hinh bootcamp: ly thuyet, thuc hanh, bai tap, quiz...");
    }

    public void testQuiz(String subject) {
        System.out.println(this.getName() + " test " + subject);
    }

//    public int testQuiz(String subject) {
//        System.out.println(this.getName() + " test " + subject);
//    }

    private void testQuiz(String subject, String subjectReview) {
        System.out.println(this.getName() + " test " + subject + " and " + subjectReview);
    }
}
