package ds;

import java.util.Arrays;

public class Queue {
    private int maxSize;
    private int[] items;
    private int front;
    private int rear;
    private int numItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.items = new int[maxSize];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    public void add(int item) {
        rear = rear + 1;
        items[rear] = item;
        numItems = numItems + 1;
    }

    public int remove() {
        int temp = items[front];
        front++;
        return temp;
    }

    public void view() {
        System.out.print("[ ");
        for (int i = front; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println("]");
    }
}
