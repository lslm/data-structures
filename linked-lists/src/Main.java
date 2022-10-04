public class Main {
    public static void main(String[] args) {
//        String[] numeros = new String[3];
//
//        numeros[0] = "Lucas";
//        numeros[1] = "Santos";
//        numeros[2] = "Silva";
//
//        System.out.println(numeros[2]);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);

        traverse(node1);

        Node newList = removeNode(node1, 7);
        System.out.println("Lista com item removido");
        traverse(newList);

    }

    public static void traverse(Node head) {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public static Node addNode(Node head, int newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.hasNext()) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);
        }

        return head;
    }

    public static Node removeNode(Node head, int value) {
        if (head == null) {
            System.out.println("Nada a ser removido");
            return null;
        }

        Node currentNode = head;

        if (currentNode.getValue() == value) {
            return currentNode.getNext();
        } else {
            Node previousNode = currentNode;

            while (currentNode != null) {
                if (currentNode.getValue() == value) {
                    previousNode.setNext(currentNode.getNext());
                    return head;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }

        return head;
    }
}
