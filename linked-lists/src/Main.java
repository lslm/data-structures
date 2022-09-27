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

        node1.setNext(node2);
        node2.setNext(node3);

        // Percorrendo lista ligada
        traverse(node1);

        // Adicionando um novo nó
        Node novaLista = addNode(node1, 4);
        System.out.println("Percorrendo lista adicionada");
        traverse(novaLista);
    }

    public static void traverse(Node head) {
        Node tempNode = head;

        while(tempNode != null) {
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getNext();
        }
    }

    public static Node addNode(Node head, int newValue) {
        Node newNode = new Node(newValue);

        Node currentNode = head;

        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
        return head;
    }
}
