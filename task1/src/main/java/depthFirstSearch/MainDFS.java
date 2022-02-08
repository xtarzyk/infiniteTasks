package depthFirstSearch;

public class MainDFS {

    public static void main(String[] args) {

        DFS dfs = new DFS();

        BinaryTree<Object> binaryTree = new BinaryTree<>();

        binaryTree.root = new Node<>(5);
        binaryTree.root.left = new Node<>(3);
        binaryTree.root.right = new Node<>(7);
        binaryTree.root.left.left = new Node<>(2);
        binaryTree.root.left.right = new Node<>(4);
        binaryTree.root.right.left = new Node<>(6);
        binaryTree.root.right.right = new Node<>(8);

        System.out.print("Binary Tree: ");

        binaryTree.traverseRecursionTree(binaryTree.root);

        System.out.println("\nDepth-First Search: " + dfs.readTree(binaryTree.root));
    }
}
