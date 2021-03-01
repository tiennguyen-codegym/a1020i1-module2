package _12_collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
//        Map<Integer, String> hashMapStudent = new HashMap<>();
//
//        hashMapStudent.put(234, "Nguyen Van A");
//        hashMapStudent.put(12, "Nguyen Van B");
//        hashMapStudent.put(9876, "Nguyen Van C");
//
//        System.out.println(hashMapStudent);

//        Map<Integer, String> treeMapStudent = new TreeMap<>();
//
//        treeMapStudent.put(234, "Nguyen Van A");
//        treeMapStudent.put(12, "Nguyen Van B");
//        treeMapStudent.put(9876, "Nguyen Van C");
//
//        System.out.println("Tree map:");
//        System.out.println(treeMapStudent);
//
//
//        Map<Integer, String> linkHashStudent = new LinkedHashMap<>();
//
//        linkHashStudent.put(234, "Nguyen Van A");
//        linkHashStudent.put(12, "Nguyen Van B");
//        linkHashStudent.put(9876, "Nguyen Van C");
//
//        System.out.println("Link hash map:");
//        System.out.println(linkHashStudent);


        // Luu y khi su dung map
        Map<Integer, String> hashMapStudent = new HashMap<>();

        hashMapStudent.put(234, "Nguyen Van A");
        hashMapStudent.put(12, "Nguyen Van B");
        hashMapStudent.put(9876, "Nguyen Van C");
        hashMapStudent.put(12, "Nguyen Van D");

        System.out.println(hashMapStudent);

    }
}
