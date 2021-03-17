package _20_solid._05_dependency_inversion.after;

public class LaptopAsus implements Laptop {

    public void startOS() {
        System.out.println("Latop Asus khoi dong he dieu khanh KHA nhanh");
    }

    public void startApp() {
        System.out.println("Latop Asus khoi dong ung dung Intellij con HOI cham");
    }
}
