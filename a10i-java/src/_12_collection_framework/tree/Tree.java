package _12_collection_framework.tree;

public interface Tree<E> {
    /**
     * Insert element e into the binary search tree.
     * Return true if the element is inserted successfully.
     */
    public boolean insert(E e);
    /**
     * Inorder traversal from the root
     */
    public void inorder();

    public void postorder();

    public void preorder();

    public void breathFirst();
    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
}
