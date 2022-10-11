public class Main {
    public static void main(String[] args) {
        Node root = new Node(50);
        // 25, 60, 32, 55, 60
        addLeaf(root, 25);
        addLeaf(root, 60);
        addLeaf(root, 32);
        addLeaf(root, 55);
        addLeaf(root, 65);

    }

    public static void addLeaf(Node root, int value) {
        Node newNode = new Node(value);
        boolean shouldContinue = true;
        Node currentNode = root;

        while (shouldContinue) {
            if (newNode.getValue() < currentNode.getValue()) {
                if (currentNode.getLeft() != null) {
                    currentNode = currentNode.getLeft();
                } else {
                    currentNode.setLeft(newNode);
                    shouldContinue = false;
                }
            } else {
                if (currentNode.getRight() != null) {
                    currentNode = currentNode.getRight();
                } else {
                    currentNode.setRight(newNode);
                    shouldContinue = false;
                }
            }
        }
    }
}
