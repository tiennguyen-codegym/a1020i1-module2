package _07_abstract_interface;

public abstract class Student {

    protected int id;
    protected String name;
    protected String dateOfBirth;

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

    protected void study() {
        System.out.println(this.name + " hoc theo cach truyen thong.");
    }

    protected abstract void test();
}
