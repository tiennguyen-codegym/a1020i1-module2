package _20_solid._05_dependency_inversion.after;

public class LaptopAsusGaming implements Laptop {
    public void startOS() {
        System.out.println("Latop Asus khoi dong he dieu khanh QUA muot");
    }

    public void startApp() {
        System.out.println("Latop Asus khoi dong ung dung Intellij QUA dinh");
    }
}
