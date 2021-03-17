package _20_solid._05_dependency_inversion.before;

public class Student {
    private int id;
    private String name;
    private String dateOfBirth;
    private LaptopAsus laptopAsus;

    public Student(int id, String name, String dateOfBirth, LaptopAsus laptopAsus) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.laptopAsus = laptopAsus;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public LaptopAsus getLaptopAsus() {
        return laptopAsus;
    }

    public void setLaptopAsus(LaptopAsus laptopAsus) {
        this.laptopAsus = laptopAsus;
    }
}
