package _15_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestCheckedException {

    public static void main(String[] args) throws FileNotFoundException {

        File fileStudent = new File("D:/a1020i1_student.txt");
        FileReader fileReader = new FileReader(fileStudent);
    }
}
