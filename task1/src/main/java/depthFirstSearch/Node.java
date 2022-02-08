package depthFirstSearch;

public class Node<T> {

    T value;
    Node left;
    Node right;

    public Node(T value) {
        this.value = value;
        right = null;
        left = null;
    }



}
