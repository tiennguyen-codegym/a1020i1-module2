package _12_collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
//        Set<String> hashSetStr = new HashSet<>();
//
//        hashSetStr.add("A");
//        hashSetStr.add("Z");
//        hashSetStr.add("B");
//
//        System.out.println(hashSetStr);

//        Set<String> linkedHashSetStr = new LinkedHashSet<>();
//
//        linkedHashSetStr.add("A");
//        linkedHashSetStr.add("Z");
//        linkedHashSetStr.add("B");
//
//        System.out.println(linkedHashSetStr);

//        Set<String> treeSetStr = new TreeSet<>();
//
//        treeSetStr.add("A");
//        treeSetStr.add("Z");
//        treeSetStr.add("B");
//
//        System.out.println("Tree Set A");
//        System.out.println(treeSetStr);
//
//        Set<String> treeSetStrAA = new TreeSet<>();
//
//        treeSetStrAA.add("AA");
//        treeSetStrAA.add("ZZ");
//        treeSetStrAA.add("BB");
//
//        System.out.println("Tree Set AA");
//        System.out.println(treeSetStrAA);

        // Luu y khi su dung set
        Set<String> hashSetStr = new HashSet<>();

        hashSetStr.add("A");
        hashSetStr.add("Z");
        hashSetStr.add("B");
        hashSetStr.add("A");

        System.out.println(hashSetStr);

        for (String str : hashSetStr) {
            System.out.println(str);
        }
    }
}
