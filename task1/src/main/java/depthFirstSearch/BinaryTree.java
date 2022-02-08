package depthFirstSearch;

public class BinaryTree<T>{

    Node<T> root;

    public void traverseRecursionTree(Node node) {
        if (node != null) {
            traverseRecursionTree(node.left);
            System.out.print(" " + node.value);
            traverseRecursionTree(node.right);
        }
    }
}
