import ds.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.view();

        System.out.println(queue.remove()); // 1
        System.out.println(queue.remove()); // 2

        queue.view();

        queue.add(5);
        queue.add(6);

        queue.view();

        System.out.println(queue.remove()); // 1
        System.out.println(queue.remove()); // 2

        queue.view();
    }
}