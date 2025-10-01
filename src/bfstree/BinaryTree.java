package bfstree;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // 전위 순회(Preorder)
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // 중위 순회(Inorder)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    // 후위 순회(Postorder)
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // 트리 생성
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // 트리 탐색
        System.out.println("전위 순회:");
        tree.preorder(tree.root);

        System.out.println("\n중위 순회:");
        tree.inorder(tree.root);

        System.out.println("\n후위 순회:");
        tree.postorder(tree.root);
    }
}

