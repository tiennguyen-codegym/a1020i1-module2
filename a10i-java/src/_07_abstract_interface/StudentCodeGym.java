package _07_abstract_interface;

public class StudentCodeGym extends Student implements Ken, James, Comparable<StudentCodeGym> {

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

    @Override
    protected void test() {
        System.out.println(this.name + " thi ly thuyet, thuc hanh, audit.");
    }

    @Override
    public void updateKenDaily() {
        System.out.println(this.name + " keo block khi co kho khan");
    }

    @Override
    public void tickJames() {
        System.out.println(this.name + " xem bai xong thi phai tick James");
    }

    // 1: neu this > o
    // 0: neu thi == o
    // -1: neu this < o
    @Override
    public int compareTo(StudentCodeGym o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id == o.id) {
            return this.name.compareTo(o.name);
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "StudentCodeGym{" +
                "accountJames='" + accountJames + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "} " + super.toString();
    }
}
