package _16_io_text_file;

import java.io.*;

public class TestReadWriteObject {

    public static void main(String[] args) throws IOException {

        // write, read object

//        Student student = new Student(777, "Nguyen Van Y", "12/12/2012");
//
//        BufferedWriter bufferedWriter
//                = new BufferedWriter(new FileWriter(new File(
//                "src/_16_io_text_file/list_student.csv"), true));
//
//        String line = student.getId() + "," + student.getName() + "," + student.getDateOfBirth();
//
//        bufferedWriter.write(line);
//        bufferedWriter.close();

        BufferedReader bufferedReader
                = new BufferedReader(new FileReader(new File(
                "src/_16_io_text_file/list_student.csv")));

        String lineRead;
        String[] lineReadArray;
        Student studentRead;
        while ((lineRead = bufferedReader.readLine()) != null) {
            studentRead = new Student();
            lineReadArray = lineRead.split(",");
            studentRead.setId(Integer.parseInt(lineReadArray[0]));
            studentRead.setName(lineReadArray[1]);
            studentRead.setDateOfBirth(lineReadArray[2]);

            System.out.println(studentRead);
        }

    }
}
