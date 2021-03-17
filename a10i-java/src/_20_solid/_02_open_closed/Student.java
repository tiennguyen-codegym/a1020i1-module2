package _20_solid._02_open_closed;

// superclass
public class Student {
    private int id;
    private String name;
    private String dateOfBirth;

    public Student(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void study() {
        System.out.println(this.name + " dang hoc theo cach kieu truyen thong");
    }

    public void test() {
        System.out.println("Thi giua ki, cuoi kia");
    }
}
