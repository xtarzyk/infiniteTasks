package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class DFS<T> {

    public String readTree(Node<T> root) {
        ArrayList<T> result = new ArrayList<>();
        traverse(root, result);
        return result.toString();
    }

    public void traverse(Node<T> root, List<T> result) {
        if (root == null) {
            return;
        }
        result.add(root.value);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
