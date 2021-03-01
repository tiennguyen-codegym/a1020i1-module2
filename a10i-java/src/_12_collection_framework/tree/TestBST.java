package _12_collection_framework.tree;

import java.util.Collections;

public class TestBST {

    public static void main(String[] args) {
        Integer[] arrInt = {60, 55, 100, 45, 57, 67, 107, 59, 101};
        BST<Integer> bst = new BST<>(arrInt);
        bst.inorder();
    }
}
