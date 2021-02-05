package _10_dsa_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        // Test ARRAYLIST
//        List<String> stringList = new ArrayList<>();
//
//        stringList.add("a");
//        stringList.add("z");
//        stringList.add("b");

//        for (String str : stringList) {
//            System.out.println(str);
//        }

//        System.out.println("Before: ");
//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }
//
//        stringList.remove(1);
//
//        System.out.println("After: ");
//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }

        // Example WRAPPER CLASS
        int a = 3;
        // auto-boxing
        Integer b = a;
        // unboxing
        int c = b;
//        System.out.println(c);

        // Example LINKEDLIST
//        List<Integer> listInt = new LinkedList<>();
//        listInt.add(3);
//        listInt.add(100);
//        listInt.add(3);
//        listInt.remove(new Integer(3));
//        for (Integer in : listInt) {
//            System.out.println(in);
//        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(100);
        arrayList.add(3);

        // EXAMPLE CLONE
        ArrayList<Integer> arrayList2 = (ArrayList<Integer>) arrayList.clone();
        arrayList2.add(6);

        System.out.println(arrayList.size());
        System.out.println(arrayList2.size());
    }
}
