package _05_access_modifier_static;

public class Student {

    private int id;
    private String name;
    String nameDefault;
    protected String nameProtected;
    public String namePublic;
    public static double money;

    private String dateOfBirth;

    public Student() {
    }

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

    public String getName(String role) {
        if (role.equals("giang vien")) {
            return name;
        } else {
            return "Khong cho phep xem ten";
        }
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

    public void study(String subject) {
        System.out.println(this.name + " study " + subject);
    }

    public double exam(String subject) {
        return 10;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    private void learn() {

    }

    void learnDefault() {

    }

    protected void learnProtected() {

    }

    public void learnPublic() {

    }
}
